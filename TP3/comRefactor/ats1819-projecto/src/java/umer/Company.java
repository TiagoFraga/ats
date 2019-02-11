package umer;

import java.awt.geom.Point2D;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

/**
 * umer.Company of umer.UMeR
 */

public class Company implements Serializable {
    private String name, password; ///< Nome e Password da conta
    private HashMap<String, Driver> drivers; ///< Condutores que trabalham na empresa
    private HashMap<String, Vehicle> vehicles; ///< Veiculos da empresa
    private ArrayList<Trip> trips; ///< Viagens
    private double moneyGenerated; ///< Dinheiro
    private int points; ///< Pontos

    /**
     * Criar uma nova empresa a partir do nome
     * @param name Nome da empresa
     * @param password Password da empresa
     */
    public Company(String name, String password){
        this.name = name;
        this.password = password;
        this.moneyGenerated = 0;
        this.drivers = new HashMap<>();
        this.vehicles = new HashMap<>();
        this.trips = new ArrayList<>();
        this.points = 0;
    }

    /**
     *Cria uma nova empresa a partir de uma já definida
     * @param c Empresa já definida
     */
    public Company(Company empresa){
        this.name = empresa.getName();
        this.password = empresa.getPassword();
        this.drivers = new HashMap<>(empresa.getDrivers());
        this.vehicles = new HashMap<>(empresa.getVehicles());
        this.moneyGenerated = empresa.getMoneyGenerated();
        this.trips = empresa.getTrips();
        this.points = empresa.getPoints();
    }

    /**
     * Retorna o nome da empresa
     * @return Nome da empresa
     */
    public String getName(){
        return this.name;
    }

    /**
     * Retorna a password da empresa
     * @return Nome da empresa
     */
    public String getPassword(){
        return this.password;
    }

    /**
     * Retorna uma cópia do Map de condutores
     * @return Map de condutores
     */
    public HashMap<String, Driver> getDrivers(){
        HashMap<String, Driver> drivers = new HashMap<>();
        for (Driver d: this.drivers.values())
            drivers.put(d.getEmail(), d.clone());
        return drivers;
    }

    /**
     * Retorna uma cópia do Map de veículos
     * @return Map de veículos
     */
    public HashMap<String, Vehicle> getVehicles(){
        HashMap<String, Vehicle> vehicles = new HashMap<>();
        for (Vehicle v: this.vehicles.values())
            vehicles.put(v.getLicencePlate(), v.clone());
        return vehicles;
    }

    /**
     * Retorna a quantidade de dinehiro gerado
     * @return Dinheiro gerado
     */
    public double getMoneyGenerated(){
        return this.moneyGenerated;
    }

    /**
     * Retorna o número de viagens totais
     * @return Número de viagens
     */
    public int getTotalTrips() {
        return this.trips.size();
    }

    /*
     * Retorna o arraylist de viagens
     * @return Trips
     */
    public ArrayList<Trip> getTrips(){
        ArrayList<Trip> trips = new ArrayList<>();
        for(Trip t: this.trips)
            trips.add(t.clone());
        return trips;
    }

    /**
     * Retonar o número de pontos de um empresa
     * @return Número de pontos
     */
    public int getPoints(){
        return this.points;
    }

    /**
     * Imprime a informação de uma empresa
     * @return String com a informação da empresa
     */

    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("Empresa "); sb.append(this.name); sb.append("\n");
        sb.append("---Condutores "); sb.append("\n"); sb.append(printDrivers()); sb.append("\n");
        sb.append("---Veículos "); sb.append(printVehicles()); sb.append("\n");
        sb.append("Número de viagens : "); sb.append(this.trips.size()); sb.append("\n");
        sb.append("Dinheiro gerado : "); sb.append(this.moneyGenerated);

        return sb.toString();
    }

    /**
     * Verifica se duas empresas são iguais
     * @param c Empresa a comparar
     * @return São iguais (true) ou não (false)
     */
    public boolean equals(Company empresa){
        return empresa.getName().equals(this.getName());
    }

	/**
     * Faz clone de uma empresa
     * @return Cópia da empresa
     */
    public Company clone(){
        return new Company(this);
    }

    /**
     * Imprime o email de todos os condutores da empresa
     * @return String com o email dos condutores
     */
    public String printDrivers(){
        String nome = null;
        for (Driver d: this.drivers.values())
            nome += d.getEmail() + "\n";
        return nome;
    }

    /**
     * Imprime a matrícula de todos os veículos da empresa
     * @return String com a matrícula dos veículos
     */
    public String printVehicles(){
        String nome = null;
        for (Vehicle d: this.vehicles.values())
            nome += d.getLicencePlate() + "\n";
        return nome;
    }

    /**
     * Adiciona um condutor à empresa
     * @param d Condutor a adicionar
     */
    public void addDriver(Driver condutor){
        this.drivers.put(condutor.getEmail(), condutor);
    }

    /**
     * Adiciona um veículo à empresa
     * @param d Veículo a adicionar
     */
    public void addVehicle(Vehicle veiculo){
        this.vehicles.put(veiculo.getLicencePlate(), veiculo);
    }

    /**
     * Indica se existem taxis disponíveis
     * @return Existem taxis disponíveis (true) ou não (false)
     */
    public boolean availiableTaxis(){
        return drivers.values().stream().filter(d -> d.isAvailable() == true).count() > 0;
    }

    /**
     * Seleciona um condutor para conduzir um taxi da empresa
     * @return Email do condutor escolhido ou null se estiverem todos ocupados
     */
    public String pickDriver() {
        List<Driver> drivers = this.drivers.values()
                                           .stream()
                                           .filter(driver -> driver.isAvailable() == true)
                                           .collect(Collectors.toList());

        if (drivers.size() != 0) {
            ThreadLocalRandom rand = ThreadLocalRandom.current();
            return drivers.get(rand.nextInt(0, drivers.size())).getEmail();
        }
        else return null;
    }

    /**
     * Seleciona um veículo para levar o cliente (mais próximo)
     * @param clientPosition Posição do cliente
     * @return Matrícula do veículo escolhido ou null caso não exista nenhum livre
     */
    public String pickVehicle(Point2D.Double clientPosition){
        List<Vehicle> vehicles = this.vehicles.values()
                                              .stream()
                                              .filter(vehicle -> vehicle.isAvailable() == true)
                                              .sorted((v1, v2) ->
                                                      ((Double) v1.getPosition().distance(clientPosition))
                                                      .compareTo(v2.getPosition().distance(clientPosition)))
                                              .collect(Collectors.toList());
        if (vehicles.size() != 0){
            return vehicles.get(0).getLicencePlate();
        }
        else return null;
    }


    /**
     * Adiciona uma viagem a uma empresa
     * @param t Viagem a adicionar
     */
    public void addTrip(Trip viagem){
        this.trips.add(viagem);
        this.moneyGenerated += viagem.getPrice();
        this.points += viagem.getPrice() - viagem.distance();
    }

    /**
     * Retorna as (diferentes) datas das viagens feitas
     * @return Datas das viagens
     */
    public ArrayList<String> getDates(){
        ArrayList<String> dates = new ArrayList<>();
        for (Trip t: this.trips)
            if (!dates.contains(t.getDate().toString()))
                dates.add(t.getDate().toString());
        return dates;
    }

    /**
     * Retorna a quantia de dinheiro gerada entre duas datas
     * @param t1  Data 1
     * @param t2  Data 2
     * @return Dinheiro gerado
     */
    public int moneyGeneratedBetween(LocalDate tempo1, LocalDate tempo2){
        double money = 0;
        for (Trip t: trips){
            if ((t.getDate().isAfter(tempo1) || t.getDate().isEqual(tempo1))
                    && (t.getDate().isBefore(tempo2)) || t.getDate().isEqual(tempo2)) {
                money += t.getPrice();
            }
        }
        return (int) money;
    }
}
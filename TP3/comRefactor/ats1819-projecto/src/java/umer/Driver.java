package umer;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.*;

/**
 * umer.Driver of umer.UMeR.
 */
public class Driver extends User implements Serializable {

    /* Variáveis de Instância */
    private double rating; ///< Classifiacção
    private boolean availability; ///< Disponibilidade
    private double timeCompliance; ///< Fator de cumprimento de hórario
    private int numberOfReviews; ///< Numero de classificaçoes
    private int exp; ///< Experiência
    private String vehicle; ///< Matricula do seu veiculo
    private String company; ///< Empresa a que pertence
    private double deviation; ///< Soma dos desvios totais (dinheiro)


    /**
     * Cria um condutor a partir de todos os parámetros
     * Parametros de um Utilizador
     * @param rating            Classificação
     * @param availability      Disponibilidade
     * @param timeCompliance    Fator de cumprimento de hórario
     * @param numberOfReviews   Número de classificações
     * @param vehicle           Matrícula do seu veículo
     * @param company           Empresa para a qual trabalha
     * @param deviation         Soma dos desvios totais (dinheiro)
     */
    public Driver(String email, String name, String password, String address, LocalDate birthday, double totalDistance, double rating, Boolean availability, double timeCompliance, ArrayList<Trip> trips, int numberOfReviews, double money, double exp, String vehicle, String company, double deviation){
        super(email, name, password, address, birthday, totalDistance, trips, money);
        this.rating = rating;
        this.availability = availability;
        this.timeCompliance = timeCompliance;
        this.numberOfReviews = numberOfReviews;
        this.vehicle = vehicle;
        this.company = company;
        this.deviation = deviation;
    }

    /**
     * Cria um novo condutor a partir de parametros de registo
     * Parametros de um Utilizador
     * @param timeCompliance    Fator de cumprimento de hórario
     * @param company           Empresa para a qual trabalha
     */
    public Driver(String email, String name, String password, String address, LocalDate birthday, double timeCompliance, String company){
        super(email, name, password, address, birthday, 0, null, 0);
        this.rating = 0;
        this.availability = true;
        this.timeCompliance = timeCompliance;
        this.numberOfReviews = 0;
        this.company = company;
        this.deviation = 0;
    }

    /**
    * Constroi um motorista a partir de um já definido
    * @param d Motorista
    */
    public Driver(Driver condutor) {
        super(condutor.getEmail(), condutor.getName(), condutor.getPassword(), condutor.getAddress(), condutor.getBirthday(), condutor.getTotalDistance(), condutor.getTrips(), condutor.getMoney());
        this.rating = condutor.getRating();
        this.availability = condutor.isAvailable();
        this.timeCompliance = condutor.getTimeCompliance();
        this.numberOfReviews = condutor.getNumberOfReviews();
        this.exp = condutor.getExp();
        this.vehicle = condutor.getVehicle();
        this.company = condutor.getCompany();
        this.deviation = condutor.getDeviation();
    }

    /**
     * Constroi um motorista a partir de um construtor vazio
     */
    public Driver(){
        super();
        this.rating = 0;
        this.availability = true;
        this.timeCompliance = 0;
        this.numberOfReviews = 0;
        this.deviation = 0;
    }


    /**
     * Retorna a classificação do motorista
     * @return Classificação
     */
    public Double getRating() {
        return this.rating;
    }

    /**
     * Retorna a disponibilidade do motorista
     * @return Disponibilidade
     */
    public Boolean isAvailable() {
        return this.availability;
    }

    /**
     * Retorna o grau de cumprimento de horário do motorista
     * @return Grau de cumprimento de horário
     */
    public Double getTimeCompliance() {
        return this.timeCompliance;
    }

    /**
     * Retorna o número de classificações deste
     * @return Número de classificações
     */
    public int getNumberOfReviews(){
        return this.numberOfReviews;
    }

    /**
     * Retorna a experiência do condutor
     * @return Experiência
     */
    public int getExp(){
        return this.exp;
    }

    /**
     * Retorna a matrícula do seu veículo (se for condutor privado)
     * @return Matrícula
     */
    public String getVehicle(){
        return this.vehicle;
    }

    /**
     * Retorna o nome da empresa para quem trabalha (null se for condutor privado)
     * @return Nome da empresa
     */
    public String getCompany(){
        return this.company;
    }

    /**
     * Retorna a soma dos deviations realizados pelo condutor
     * @return deviations
     */
    public double getDeviation(){
        return this.deviation;
    }
    
    /**
     * Altera a classificação de um driver
     * @param rating Nova classificação
     */
    public void setRating(double rating){
        this.rating = rating;
    }

    /**
     * Altera a disponibilidade de um driver
     * @param b Nova disponibilidade
     */
    public void setAvailability(Boolean boleano) {
        this.availability = boleano;
    }

    /**
     * Altera o grau de comprimento de um motorista
     * @param timeCompliance Novo grau de cumprimento
     */
    public void setTimeCompliance(double timeCompliance){
        this.timeCompliance = timeCompliance;
    }

    /**
     * Altera o número de classificações de um driver
     * @param numberOfReviews Novo número de classificações
     */
    public void setNumberOfReviews(int numberOfReviews){
        this.numberOfReviews = numberOfReviews;
    }

    /**
     * Altera a quantidade de experiencia
     * @param exp Nova quantia
     */
    public void setExp(int exp){
        this.exp = exp;
    }

    /**
     * Altera a matrícula do veículo do driver
     * @param vehicle Nova matrícula
     */
    public void setVehicle(String vehicle){
        this.vehicle = vehicle;
    }
    
    /**
     * Altera os deviations totais de um condutor
     * @param deviation Novo valor de deviation
     */
    public void setdeviation(double deviation){
        this.deviation = deviation;
    }
    
    /**
     * Retorna uma cópia de um motorista
     * @return Cópia do motorista
     */
    public Driver clone() {
        return new Driver(this);
    }

    /**
     * Imprime a informação de um condutor
     * @return String com a informação
     */

    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("umer.Driver \n"); sb.append(super.toString()); sb.append("\n");
        sb.append("Disponibilidade : "); sb.append(this.availability); sb.append("\n");
        sb.append("Classificação : "); sb.append(this.rating); sb.append("\n");
        sb.append("Grau de cumprimento : "); sb.append(this.timeCompliance); sb.append("\n");
        sb.append("Número de classificações : "); sb.append(this.numberOfReviews); sb.append("\n");
        sb.append("Veículo : "); sb.append(this.vehicle); sb.append("\n");
        sb.append("Desvio total : "); sb.append(this.deviation); sb.append("\n");

        return sb.toString();
    }

    /**
     * Verifica se dois condutores são iguais
     * @param d Condutor a ser comparado
     * @return São iguais (true) ou não (false)
     */
    public boolean equals(Driver condutor){
        return this.getEmail().equals(condutor.getEmail());
    }

    /**
     * Adiciona uma nova viagem a um condutor
     * @param t Viagem a ser adicionada
     */
    public void addTrip(Trip viagem){
        super.addTrip(viagem);
        this.setTotalDistance(this.getTotalDistance() + viagem.getTaxiPos().distance(viagem.getStart()));
        this.exp += (viagem.distance()+1)/2;
        this.deviation += Math.abs(viagem.getPrice() - viagem.getEstimatedPrice());
    }

    /**
     * Adiciona uma classificação ao condutor
     * @param rating Classificação
     */
    public void addRating(int rating){
        this.rating = (this.rating * numberOfReviews + rating * 20) / (numberOfReviews + 1);
        this.numberOfReviews++;
        if (rating > 2)
            this.exp += 3 * (rating/5);
        else this.exp -= 4-rating;
    }
}
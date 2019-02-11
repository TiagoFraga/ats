package umer;

import java.awt.geom.Point2D;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 * umer.Client that uses umer.UMeR.
 */
public class Client extends User implements Serializable {

    /** Variáveis de Instância */
    private Point2D.Double position; ///< Posição do cliente
    private int points; ///< Pontos
    private boolean premium; ///< Se tem conta premium ou não
    private String queue; ///< Veículo onde está em fila de espera


    /**
     * Cria um cliente a partir de todos os parametros
     * Parametros de um Utilizador 
     * @param position          Posição
     * @param trips             Viagens feitas
     * @param numberOfTrips     Número de viagens
     * @param points            Pontos
     * @param money             Dinehiro gasto
     * @param premium           Se tem conta premium
     * @param queue             Veículo onde está em fila de espera
     */
    public Client(String email, String name, String password, String address, LocalDate birthday, Point2D.Double position, double totalDistance, ArrayList<Trip> trips, int points, double money, boolean premium, String queue) {
        super(email, name, password, address, birthday, totalDistance, trips, money);
        this.position = new Point2D.Double(position.getX(), position.getY());
        this.points = points;
        this.position = new Point2D.Double(0,0);
        this.premium = premium;
    }

    /**
     * Cria um cliente a partir de paramtros de registo
     * @param email     Email
     * @param name      Nome
     * @param password  Password
     * @param address   Morada
     * @param birthday  Dia de nascimento
     */
    public Client(String email, String name, String password, String address, LocalDate birthday){
        super(email, name, password, address, birthday, 0, null, 0);
        this.points = 0;
        this.premium = false;
        this.position = new Point2D.Double(0,0);
        this.position = new Point2D.Double(position.getX(), position.getY());
    }

    /**
     * Constroi um cliente a partir de um já definido
     * @param c Cliente
     */
    public Client(Client cliente) {
        super(cliente.getEmail(), cliente.getName(), cliente.getPassword(), cliente.getAddress(), cliente.getBirthday(), cliente.getTotalDistance(), cliente.getTrips(), cliente.getMoney());
        this.points = cliente.getPoints();
        this.position = new Point2D.Double(cliente.getPosition().getX(), cliente.getPosition().getY());
        this.premium = cliente.isPremium();
        this.queue = cliente.getQueue();
    }

    /**
     * Constroi um cliente sem parámetros
     */
    public Client(){
        super();
        this.points = 0;
        this.premium = false;
        this.queue = null;
    }

    /** Metodos de instância */
    
    /**
     * Retorna o número de pontos de um cliente
     * @return Número de pontos
     */
    public int getPoints() {
        return points;
    }

    /**
     * Retorna a posição de um user
     * @return position
     */
    public Point2D.Double getPosition(){
        return new Point2D.Double(this.position.getX(), this.position.getY());
    }
    
    /**
     * Altera o número de pontos de um cliente
     * @param points Novo número de pontos
     */
    public void setPoints(int points) {
        this.points = points;
    }

    /**
     * Verifica se um cliente é premium
     * @return Se é premium (True) ou não (False)
     */
    public boolean isPremium() {
        return this.premium;
    }

    /**
     * Retorna a matrícula do veículo onde está em fila de espera
     * @return Matrícula
     */
    public String getQueue(){
        return this.queue;
    }

    /**
     * Altera a posição de um user
     * @param position Nova posição
     */
    public void setPosition(Point2D.Double position){
        this.position.setLocation(position.getX(), position.getY());
    }

    /**
     * Altera o estado premium de um user
     * @param b Novo estado
     */
    public void setPremium(boolean boleano) {
        this.premium = boleano;
    }

    /**
     * Altera o veículo onde o cliente está em fila de espera
     * @param b Nova matrícula
     */
    public void setQueue(String queue){
        this.queue = queue;
    }

    /**
     * Retorna a cópia de um cliente
     * @return Cópia do cliente
     */
    public Client clone () {
        return new Client (this);
    }

    /**
     * Imprime a informação de um cliente
     * @return String com a informação
     */

    public String toString(){
        StringBuilder sb = new StringBuilder();
        
        sb.append("\n");
        sb.append("Posição : "); sb.append(this.position.getX()); sb.append(","); sb.append(this.position.getY()); sb.append(")\n");
        sb.append("Pontos : "); sb.append(this.points); sb.append("\n");
        sb.append("Premium : "); sb.append(this.premium); sb.append("\n");
        sb.append("Fila de espera : "); sb.append(this.queue);

        return sb.toString();
    }
    

    /**
     * Adiciona uma nova viagem ao cliente
     * @param t Viagem a adicinar
     */
    public void addTrip(Trip viagem){
        super.addTrip(viagem);
        this.position.setLocation(viagem.getEnd());
        this.points += viagem.getPrice() / 2 + viagem.distance() / 4;
    }
}
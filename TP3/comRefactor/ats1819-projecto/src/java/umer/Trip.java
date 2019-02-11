package umer;

import java.awt.geom.Point2D;
import java.io.Serializable;
import java.time.*;

/**
 * umer.Trip.
 */
public class Trip implements Serializable {

    /** Variáveis de Instância */

    private int identificador; ///< ID da Viagem
    private Point2D.Double start; ///< Ponto de inicio
    private Point2D.Double end; ///< Ponto de destino
    private double time; ///< Duração da viagem
    private double price; ///< Preço da viagem
    private LocalDate date; ///< Data
    private String licencePlate; ///< Matricula do veiculo que efetuou a viagem
    private String driver, client; ///< Condutor e umer.Client
    private int rating; ///< Classificação dada ao condutor pelo cliente
    private double estimatedTimeToDest; ///< Duração estimada da viagem
    private Point2D.Double taxiPos; ///< Posiçao do veiculo
    private double estimatedTimeToClient; ///< Tempo esimado a chegar ao cliente
    private double realTimeToClient; ///< Tempo real de chegada ao cliente
    private double estimatedPrice; ///< Preço estimado da viagem


    /** Constructores */
    /**
     * Constroi uma viagem sem parametros
     */
    public Trip () {
        this.identificador = 0;
        this.start = new Point2D.Double(0, 0);
        this.end = new Point2D.Double(0, 0);
        this.time = 0.0;
        this.price = 0.0;
        this.licencePlate = null;
        this.date =  LocalDate.MIN;
        this.driver = null;
        this.client = null;
        this.rating = 0;
        this.estimatedTimeToClient = 0;
        this.estimatedTimeToDest = 0;
        this.realTimeToClient = 0;
        this.estimatedPrice = 0;
    }

    /**
     * Constroi uma viagem a partir de vários parametros
     * @param id                    ID da viagem
     * @param start                 Posição do início da viagem
     * @param end                   Posição do fim da viagem
     * @param time                  Tempo da viagem
     * @param price                 Preço da viagem
     * @param licencePlate          Matrícula do carro
     * @param driver                Condutor
     * @param client                Cliente
     * @param rating                Classificação dada ao condutor pelo cliente
     * @param estimatedTimeToDest   Tempo estimado até ao destino
     * @param taxiPos               Posição incial do taxi
     * @param estimatedTimeToClient Tempo estimado até ao cliente
     * @param realTimeToClient      Tempo real até ao cliente
     * @param estimatedPrice        Preço da estimado da viagem
     */
    public Trip (int identificador, Point2D.Double start, Point2D.Double end, Double time, Double price, LocalDate date, String licencePlate, String driver, String client, int rating, double estimatedTimeToDest, Point2D.Double taxiPos, double estimatedTimeToClient, double realTimeToClient, double estimatedPrice) {
        this.identificador = identificador;
        this.start = new Point2D.Double(start.getX(), start.getY());
        this.end = new Point2D.Double(end.getX(), end.getY());
        this.time = time;
        this.price = price;
        this.licencePlate = licencePlate;
        this.date = LocalDate.of(date.getYear(), date.getMonth(), date.getDayOfMonth());
        this.driver = driver;
        this.client = client;
        this.rating = rating;
        this.estimatedTimeToDest = estimatedTimeToDest;
        this.taxiPos = new Point2D.Double(taxiPos.getX(), taxiPos.getY());
        this.estimatedTimeToClient = estimatedTimeToClient;
        this.realTimeToClient = realTimeToClient;
        this.estimatedPrice = estimatedPrice;
    }

    /**
     * Constroí uma viagem a partir de uma já definida
     * @param t Viagem
     */
    public Trip (Trip viagem) {
        this(viagem.getID(), viagem.getStart(), viagem.getEnd(), viagem.getTime(),
                viagem.getPrice(), viagem.getDate(), viagem.getLicencePlate(),
                viagem.getDriver(), viagem.getClient(), viagem.getRating(),
                viagem.getEstimatedTimeToDest(), viagem.getTaxiPos(),
                viagem.getEstimatedTimeToClient(), viagem.getRealTimeToClient(),
                viagem.getEstimatedPrice());
    }

    /** Metodos de Instância */

    /**
     * Retorna o ID da viagem
     * @return ID
     */
    public int getID(){
        return this.identificador;
    }

    /**
     * Retorna o início da viagem
     * @return Início
     */
    public Point2D.Double getStart() {
        return new Point2D.Double(this.start.getX(), this.start.getY());
    }

    /**
     * Retorna o fim de uma viagem
     * @return Fim
     */
    public Point2D.Double getEnd() {
        return new Point2D.Double(this.end.getX(), this.end.getY());
    }

    /**
     * Retorna a duração de uma viagem
     * @return Tempo
     */
    public Double getTime() {
        return this.time;
    }

    /**
     * Retorna o preço de uma viagem
     * @return Preço
     */
    public Double getPrice() {
        return this.price;
    }

    /**
     * Retorna a data da viagem
     * @return Data da viagem
     */
    public LocalDate getDate(){
        return LocalDate.of(this.date.getYear(), this.date.getMonth(), this.date.getDayOfMonth());
    }

    /**
     * Retorna a matricula do carro onde a viagem foi realizada
     * @return Matrícula
     */
    public String getLicencePlate() {
        return this.licencePlate;
    }

    /**
     * Retorna o condutor da viagem
     * @return Condutor
     */
    public String getDriver() {
        return this.driver;
    }

    /**
     * Retorna o cliente da viagem
     * @return Cliente
     */
    public String getClient(){
        return this.client;
    }

    /**
     * Retorna a classificação dada ao condutor pelo cliente
     * @return Classificação
     */
    public int getRating(){
        return this.rating;
    }

    /**
     * Retorna o tempo incialmente previsto
     * @return Tempo previsto
     */
    public double getEstimatedTimeToDest(){
        return this.estimatedTimeToDest;
    }

    /**
     * Retorna a posição inicial do taxi
     * @return Posição inicial do taxi
     */
    public Point2D.Double getTaxiPos(){
        return new Point2D.Double(this.taxiPos.getX(), this.taxiPos.getY());
    }

    /**
     * Retorna o tempo estimado do taxi ao cliente
     * @return Tempo estimado até ao cliente
     */
    public double getEstimatedTimeToClient(){
        return this.estimatedTimeToClient;
    }

    /**
     * Retorna o tempo que o taxi demorou a chegar ao cliente
     * @return Tempo até ao cliente
     */
    public double getRealTimeToClient(){
        return this.realTimeToClient;
    }

    /**
     * Retorna o tempo estimado da viagem
     * @return
     */
    public double getEstimatedPrice(){
        return this.estimatedPrice;
    }

    /**
     * Altera a classificação de uma viagem
     * @param rating
     */
    public void setRating(int rating){
        this.rating = rating;
    }

    /**
     * Faz uma cópia da viagem
     * @return Cópia da viagem
     */
    public Trip clone () {
        return new Trip (this);
    }

    /**
     * Imprime uma classificação
     * @return String com a classificação
     */

    private String printRating(){
        StringBuilder sb = new StringBuilder();
        
        sb.append(Integer.toString(this.rating)); sb.append("**");
        
        return sb.toString();
    }

    /**
     * Imprime o tempo em h:m:s
     * @param time  Tempo
     * @return  String com o tempo em h:m:s
     */

    private String printTime(double time){
        StringBuilder sb = new StringBuilder();
        
        sb.append((int) time); sb.append("h:"); sb.append(Math.round(time * 60)%60); sb.append("m:"); 
        sb.append(Math.round(time * 3600)%60); sb.append("s");
        
        return sb.toString();
    }

    /**
     * Imprime o dinehiro em €
     * @param money Dinheiro
     * @return String com o dinheiro em €
     */

    private String printMoney(double money){
        StringBuilder sb = new StringBuilder();
        
        sb.append((int) money); sb.append("€");
        
        return sb.toString();
    }

    /**
     * Imprime a distância em km
     * @param distance Distância
     * @return String com a distância em km
     */

    private String printDistance(double distance){
        StringBuilder sb = new StringBuilder();
        
        sb.append((int) distance); sb.append("km");
        
        return sb.toString();
    }

    /**
     * Imprime a informação sobre uma viagem
     * @return String com a informação
     */
    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("Viagem de "); sb.append("\n");
        sb.append("("); sb.append(this.start.getX()); sb.append(","); sb.append(this.start.getY());
        sb.append(") ---> ("); sb.append(this.end.getX()); sb.append(","); sb.append(this.end.getY()); sb.append(")");
        sb.append("\nData : "); sb.append(this.date);
        sb.append("\nDistância : "); sb.append(printDistance(this.distance())); 
        sb.append("\nDuração prevista : "); sb.append(printTime(this.estimatedTimeToDest));
        sb.append("\nDuração real : "); sb.append(printTime(this.time));
        sb.append("\nPreço : "); sb.append(printMoney(this.price)); 
        sb.append("\nEmail condutor : "); sb.append(this.driver);
        sb.append("\nEmail cliente : "); sb.append(this.client); 
        sb.append("\nMatrícula veículo : "); sb.append(this.licencePlate);
        sb.append("\nClassificação : "); sb.append( printRating());
        sb.append("\nPosição inicial do taxi : ["); sb.append(this.taxiPos.getX()); sb.append(","); sb.append(this.taxiPos.getY()); sb.append("]");
        sb.append("\nTempo previsto até ao cliente : "); sb.append(printTime(this.estimatedTimeToClient));
        sb.append("\nTempo real até ao cliente : "); sb.append(printTime(this.realTimeToClient));
        sb.append("\nPreço estimado : "); sb.append(printMoney(this.estimatedPrice));
        sb.append("\numer.Trip id : "); sb.append(this.identificador);

        return sb.toString();
    }


    /**
     * Calcula a distância de uma viagem
     * @return Distância
     */
    public double distance(){
        return start.distance(end);
    }
}
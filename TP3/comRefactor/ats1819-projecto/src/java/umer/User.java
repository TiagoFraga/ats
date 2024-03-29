package umer;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 * umer.User of umer.UMeR.
 */
public abstract class User implements Serializable {

    /** Variáveis de Instância */

    private String email; ///< Email
	private String name; ///< Nome
	private String password; ///< Password
	private String address; ///< Morada
	private LocalDate birthday; ///< Data de nascimento
	private double totalDistance; ///< Distâncita Total
	private ArrayList<Trip> trips; ///< Viagens do utilizador
	private double money; ///< Dinheiro


    /** Construtores */

	/**
	 * Constrói um novo user a partir dos diferentes parametros fornecidos
	 * @param email 		Email
	 * @param name 			Nome
	 * @param pass			Password
	 * @param address 		Morada
	 * @param birthday 		Dia de nascimento
	 * @param totalDistance Distancia Total
	 * @param trip 			Viagens
	 * @param money 		Dinheiro
	 */
	public User(String email, String name, String password, String address, LocalDate birthday, double totalDistance, ArrayList<Trip> trips, double money){
		this.email = email;
		this.name = name;
		this.password = password;
		this.address = address;
		this.birthday = LocalDate.of(birthday.getYear(), birthday.getMonth(), birthday.getDayOfMonth());
		this.totalDistance = totalDistance;
		this.money = money;

		if (trips != null)
			this.trips = new ArrayList<>(trips);
		else this.trips = new ArrayList<>();
	}


	/**
	 * Constroi um user a partir de um já definido
	 * @param p
	 */
	public User(User utilizador){
		this(utilizador.getEmail(), utilizador.getName(), utilizador.getPassword(), utilizador.getAddress(), utilizador.getBirthday(), utilizador.getTotalDistance(), utilizador.getTrips(), utilizador.getMoney());
	}

	/**
	 * Constroi um user sem parametros (tudo a null e 0,0)
	 */
	public User(){
		this.email = null;
		this.name = null;
		this.password = null;
		this.address = null;
		this.birthday = LocalDate.of(0,0,0);
		this.trips = new ArrayList<>();
		this.money = 0;
	}


    /** Metodos de Intância */

	/**
	 * Retorna o email de um user
	 * @return email
	 */
	public String getEmail(){
 		return this.email;
 	}

	/**
	 * Retorna o nome de um user
	 * @return name
	 */
 	public String getName(){
 		return this.name;
 	}

	/**
	 * Retorna o password de um user
	 * @return password
	 */
 	public String getPassword(){
 		return this.password;
 	}

	/**
	 * Retorna a morada de um user
	 * @return address
	 */
 	public String getAddress(){
 		return this.address;
 	}

	/**
	 * Retorna a data de aniversário de um user
	 * @return birthday
	 */
 	public LocalDate getBirthday(){
 		return LocalDate.of(this.birthday.getYear(), this.birthday.getMonth(), this.birthday.getDayOfMonth());
 	}

	/**
	 * Retorna o número de kilometros feitos pelo user
	 * @return Número de kilometros total
	 */
	public double getTotalDistance(){
		return this.totalDistance;
	}

	/**
	 * Retorna uma cópia do ArrayList com as viagens
	 * @return Viagens
	 */
	public ArrayList<Trip> getTrips() {
		ArrayList<Trip> trip = new ArrayList<Trip>();
		System.arraycopy(trips, 0, trip, 0, trips.size());

		return trip;
	}

	/**
	 * Retorna o número de viagens já efetuadas por um user
	 * @return Número de viagens
	 */
	public int getNumberOfTrips(){
		return this.trips.size();
	}

	/**
	 * Retorna a quantia de dinheiro gasta/ganha pelo utilizador
	 * @return
	 */
	public double getMoney(){
		return this.money;
	}

	/**
	 * Altera o email de um user
	 * @param email Novo email
	 */
	public void setEmail(String email){
 		this.email = email;
	}

	/**
	 * Altera o nome de um user
	 * @param name Novo nome
	 */
	public void setName(String name){
 		this.name = name;
	}

	/**
	 * Altera a password de um user
	 * @param password Nova password
	 */
	public void setPassword(String password){
		this.password = password;
	}

	/**
	 * Altera a morada de um user
	 * @param address Novo morada
	 */
	public void setAddress(String address){
		this.address = address;
	}

	/**
	 * Altera o aniversário de um user
	 * @param birthday Novo aniversário
	 */
	public void setBirthday(LocalDate birthday){
		this.birthday = LocalDate.of(birthday.getYear(), birthday.getMonth(), birthday.getDayOfMonth());
	}

	/**
	 * Altera a distância total percorrida
	 * @param totalDistance Nova distância total
	 */
	public void setTotalDistance(double totalDistance){
		this.totalDistance = totalDistance;
	}

	/**
	 * Altera o dinheiro gasto/ganho pelo user
	 * @param money Nova quantia
	 */
	public void setMoney(double money){
		this.money = money;
	}

	/**
	 * Imprime a informação de um utilizador
	 * @return String com a informação
	 */
	public String toString(){
	    StringBuilder sb = new StringBuilder();

	    sb.append("Utilizador - "); sb.append(this.name); sb.append("\n");
	    sb.append("eMail : "); sb.append(this.email); sb.append("\n");
	    sb.append("Password : "); sb.append(this.password); sb.append("\n");
	    sb.append("Morada : "); sb.append(this.address); sb.append("\n");
	    sb.append("Data de nascimento : "); sb.append(this.birthday); sb.append("\n");
	    sb.append("Distância Total : "); sb.append(this.totalDistance); sb.append("\n");
	    sb.append("Dinheiro gasto/ganho : "); sb.append(this.money); sb.append("\n");
	    sb.append("Número de viagens :"); sb.append(this.trips.size()); 

	    return sb.toString();
    }

	/**
	 * Compara dois utilizadores
	 * @param u utilizador
	 * @return É o mesmo utilizador (true) ou não (false)
	 */
	public boolean equals(User user){
		return this.email.equals(user.getEmail());
	}

	/**
	 * Faz a cópia de um user
	 * @return Cópia de umer.User
	 */
	public abstract User clone();

	/**
	 * Adiciona uma viagem a um utilizador
	 * @param trips Viagem a ser adicionada
	 */
	public void addTrip(Trip t){
		this.trips.add(t);
		this.totalDistance += t.distance();
		this.money += t.getPrice();
	}

	/**
	 * Retorna as (diferentes) datas das viagens feitas
	 * @return Datas das viagens
	 */
	public ArrayList<String> getDates(){
		ArrayList<String> dates = new ArrayList<>();
		for (Trip t: this.trips)
			if (!dates.contains(t.getDate().toString())) {
				dates.add(t.getDate().toString());
			}
		return dates;
	}
	
}
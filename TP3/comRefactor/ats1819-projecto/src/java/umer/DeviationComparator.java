package umer;

import java.util.Comparator;

/**
* umer.DeviationComparator
*/ 
public class DeviationComparator implements Comparator<Driver> {

	/**
	* Compara os desvios (de dinheiro) entre dois condutores
	* @param d1 Condutor 1
	* @param d2 Condutor 2
	*/
    public int compare(Driver driver1, Driver driver2){
        if (driver1.getDeviation() > driver2.getDeviation()) return -1;
        if (driver2.getDeviation() < driver2.getDeviation()) return 1;
        return (driver1.getEmail().compareTo(driver2.getEmail()));
    }
}
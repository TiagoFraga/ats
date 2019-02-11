package umer;

import java.util.Comparator;

/**
 * umer.MoneyComparatorD
 */
public class MoneyComparatorD implements Comparator<Driver> {

	/**
	* Compara o dinheiro entre dois condutores
	* @param d1 Condutor 1
	* @param d2 Condutor 2
	*/
    public int compare(Driver driver1, Driver driver2){
        if (driver1.getMoney() > driver2.getMoney()) return -1;
        if (driver1.getMoney() < driver2.getMoney()) return 1;
        return (driver1.getEmail().compareTo(driver2.getEmail()));
    }
}
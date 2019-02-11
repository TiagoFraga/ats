package umer;

import java.util.Comparator;

/**
 * umer.MoneyComparatorC
 */
public class MoneyComparatorC implements Comparator<Client> {

	/**
	* Compara o dinheiro entre dois cliente
	* @param c1 Cliente 1
	* @param c2 Cliente 2
	*/
    public int compare(Client cliente1, Client cliente2){
        if (cliente1.getMoney() > cliente2.getMoney()) return -1;
        if (cliente1.getMoney() < cliente2.getMoney()) return 1;
        return (cliente1.getEmail().compareTo(cliente2.getEmail()));
    }
}
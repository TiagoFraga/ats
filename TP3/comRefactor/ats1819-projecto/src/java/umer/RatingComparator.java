package umer;

import java.util.Comparator;

/**
 * umer.RatingComparator
 */
public class RatingComparator implements Comparator<Driver> {

    /**
     * Compara as classificações entre dois condutores
     * @param d1 Condutor 1
     * @param d2 Condutor 2
     */
    public int compare(Driver driver1, Driver driver2){
        if (driver1.getRating() > driver2.getRating()) return -1;
        if (driver1.getRating() < driver2.getRating()) return 1;
        return (driver1.getEmail().compareTo(driver2.getEmail()));
    }
}
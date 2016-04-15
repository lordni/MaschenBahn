package Model;

import Information.Destination;
import Information.WagonCargoType;
import Information.WagonWeight;

/**
 * Created by Henrik on 10-04-2016.
 */
public class Wagon implements Comparable<Wagon>
{
    private String destination;
    //private String cargoType;
    //private String weight;

    // Creates all of our wagons
    public Wagon(){
        destination = Destination.getDestination();
        //cargoType = WagonCargoType.getCargoType();
        //weight = WagonWeight.getWeight();
    }

    @Override
    public String toString()
    {
        return destination;
    }

    @Override
    public int compareTo(Wagon o) {
        return 0;
    }
}

package Model;

import Information.Destination;

/**
 * Created by Henrik on 10-04-2016.
 */
public class Wagon
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
}

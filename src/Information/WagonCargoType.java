package Information;

import java.util.Random;

/**
 * Created by Henrik on 10-04-2016.
 */
public class WagonCargoType
{
    static String[] cargoTypeList = {"Wood", "Steel", "Oil", "Gasoline", "Food", "Cars", "General goods"};
    private static final int LENGTH = 7;

    public static String getDestination() {
        Random random = new Random();
        int n = random.nextInt(LENGTH);
        String cargoType = cargoTypeList[n];
        return cargoType;
    }
}

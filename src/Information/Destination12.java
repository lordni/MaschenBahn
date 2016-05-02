package Information;

import java.util.Random;

/**
 * Created by Henrik on 10-04-2016.
 */
public class Destination12
{
    static String[] destinationList = {"Duisburg", "Koln", "Hannover", "Kassel", "Frankfurt",
                                       "Berlin", "Leipzig", "Nurnberg", "Stuttgart", "Munich",
                                       "Hamburg Harbour", "Scandinavia"
                                      };

    private static final int LENGTH = destinationList.length;

    public static String getDestination() {
        Random random = new Random();
        int n = random.nextInt(LENGTH);
        String destination = destinationList[n];
        return destination;
    }
}

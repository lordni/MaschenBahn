package Information;

/**
 * Created by lordni on 4/29/16.
 */
public class DestinationDispatcher {
    private static Destination[] dispather = {Destination.DUISBURG, Destination.HANNOVER, Destination.BERLIN, Destination.MUNICH,
                               Destination.STUTTGART, Destination.KOLN, Destination.KASSEL, Destination.FRANKFURT,
                               Destination.LEIPZIG, Destination.NURNBERG, Destination.HAMBURGHABOUR, Destination.SCANDINAVIA
                              };

    public static Destination getADestination() {
        return dispather[(int)(Math.random() * dispather.length)];
    }
}

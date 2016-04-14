package Model;

import Interfaces.TrackList;
import Interfaces.TrackQueueInterface;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Henrik on 10-04-2016.
 */
public class Hamburg
{
    TrackQueueInterface<Wagon> trackArrival1 = new TrackList<>();
    Queue<Wagon> trackArrival = new LinkedList<>();

    // Creates all of our tracks
    public Hamburg(){
        for (int i = 0; i < 100; i++){
            trackArrival.offer(new Wagon());
        }
    }

    public void showDetails() {
        int counter = 0;
        for (Wagon wagon: trackArrival) {
            if (counter%20 != 0 || counter == 0) {
                System.out.print(wagon + ", ");
            } else {
                System.out.println(wagon);
            }
            counter++;
        }
    }
}

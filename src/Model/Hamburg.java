package Model;

import Interfaces.TrackHolderList;
import Interfaces.TrackList;
import Interfaces.TrackQueueInterface;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Henrik on 10-04-2016.
 */
public class Hamburg
{
    TrackQueueInterface<LinkedList<Wagon>> arrivalTrackList = new TrackHolderList<>();
    TrackQueueInterface<TrackList<Wagon>> arraivalTrack1_Temp = new TrackList<>();

    Queue<Wagon> arrivalTrack1 = new LinkedList<>();
    Queue<Wagon> arrivalTrack2 = new LinkedList<>();
    Queue<Wagon> arrivalTrack3 = new LinkedList<>();
    Queue<Wagon> arrivalTrack4 = new LinkedList<>();
    Queue<Wagon> arrivalTrack5 = new LinkedList<>();
    Queue<Wagon> arrivalTrack6 = new LinkedList<>();
    Queue<Wagon> arrivalTrack7 = new LinkedList<>();
    Queue<Wagon> arrivalTrack8 = new LinkedList<>();
    Queue<Wagon> arrivalTrack9 = new LinkedList<>();
    Queue<Wagon> arrivalTrack10 = new LinkedList<>();

    Queue<Wagon> sortingTrack = new LinkedList<>();

    TrackQueueInterface<TrackList<Wagon>> departureTrackList = new TrackHolderList<>();

    Queue<Wagon> departureTrack1 = new LinkedList<>();
    Queue<Wagon> departureTrack2 = new LinkedList<>();
    Queue<Wagon> departureTrack3 = new LinkedList<>();
    Queue<Wagon> departureTrack4 = new LinkedList<>();
    Queue<Wagon> departureTrack5 = new LinkedList<>();
    Queue<Wagon> departureTrack6 = new LinkedList<>();
    Queue<Wagon> departureTrack7 = new LinkedList<>();
    Queue<Wagon> departureTrack8 = new LinkedList<>();

    Queue<Wagon> scratchTrack = new LinkedList<>();

    // Creates all of our wagons on
    public Hamburg(){
        for (int i = 0; i < 10; i++){
            arrivalTrack1.offer(new Wagon());
        }
    }

    public void addWagonToArrivalTrack(int trackId)
    {

    }

    public void showDetails() {
        int counter = 0;
        for (Wagon wagon: arrivalTrack1) {
            if (counter%20 != 0 || counter == 0) {
                System.out.print(wagon + ", ");
            } else {
                System.out.println(wagon);
            }
            counter++;
        }
    }
}

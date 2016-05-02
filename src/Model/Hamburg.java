package Model;

import Controller.TrackController;
import Interfaces.*;

import java.util.List;

/**
 * Created by Henrik on 10-04-2016.
 */
public class Hamburg
{
    private TrackController trackController = new TrackController();
    private TrackHolderInterface<TrackListInterface<Wagon>> trackDepartureHolder; // 8 tracks
    private TrackHolderInterface<TrackListInterface<Wagon>> trackArrivalHolder; // 10 tracks

    // TrackListInterface<Wagon> spawnTrack;
    // Making a spawn class
    TrackListInterface<Wagon> scratchTrack;

    // Creates all of our wagons on
    public Hamburg(){
        trackDepartureHolder = TrackHolder.getTrackHolder(8);
        trackArrivalHolder = TrackHolder.getTrackHolder(10);
        scratchTrack = new TrackList<>();
    }

    public void addWagonsToTracks() {
        trackController.addWagonsTo(trackArrivalHolder);
        //trackArrivalHolder =
        trackController.sortAllWagons(trackArrivalHolder);
        //trackController.addWagonsTo(trackDepartureHolder);
    }

    public void trackDetails() {
        for(TrackListInterface<Wagon> wagonTrack: trackArrivalHolder.getList()) {
            for(Wagon wagon: wagonTrack.getList()){
                System.out.print(wagon.toString() + ", ");
            }
            System.out.println();
        }
    }
}

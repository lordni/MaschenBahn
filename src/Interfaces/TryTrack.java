package Interfaces;

import Model.Wagon;

/**
 * Created by lordni on 4/13/16.
 */
public class TryTrack {

    public static void main(String[] args) {
        TrackQueueInterface<Wagon> list = new TrackList<>();
        TrackQueueInterface<TrackQueueInterface<Wagon>> list2 = new TrackHolderList<>();

        TrackQueueInterface<Wagon> track1 = new TrackList<>();
        track1.add(new Wagon());
        list2.add(list);


    }
}

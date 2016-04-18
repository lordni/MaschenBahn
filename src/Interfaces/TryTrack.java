package Interfaces;

import Model.Wagon;

/**
 * Created by lordni on 4/13/16.
 */
public class TryTrack {

    public static void main(String[] args) {
        TrackListInterface<Wagon> list = new TrackList<>("Duisburg");
        TrackHolderInterface<TrackListInterface<Wagon>> list2 = new TrackHolderList<>();

        TrackInterface<Wagon> track1 = new TrackList<>("Hamburg");
        track1.add(new Wagon());
        list2.add(list);
    }
}

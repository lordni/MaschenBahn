package Model;

import Interfaces.TrackHolderInterface;
import Interfaces.TrackHolderList;
import Interfaces.TrackList;
import Interfaces.TrackListInterface;

/**
 * Created by lordni on 4/26/16.
 */
public class TrackHolder {

    private static TrackHolderInterface<TrackListInterface<Wagon>> assignTracks(int numberOfTracks){
        TrackHolderInterface<TrackListInterface<Wagon>> trackHolder;
        trackHolder = new TrackHolderList<>();
        for(int i = 0; i < numberOfTracks; i++) {
            trackHolder.add(new TrackList<>());
        }
        return trackHolder;
    }

    public static TrackHolderInterface<TrackListInterface<Wagon>> getTrackHolder(int tracks) { return assignTracks(tracks); }
}

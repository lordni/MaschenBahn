package Controller;

import Interfaces.TrackHolderInterface;
import Interfaces.TrackList;
import Interfaces.TrackListInterface;
import Model.Wagon;

import java.util.List;

/**
 * Created by Henrik on 10-04-2016.
 */
public class TrackController
{
    private WagonSpawner spawner = new WagonSpawner();
    // Controls all of our tracks

    public TrackHolderInterface<TrackListInterface<Wagon>> addWagonsTo(TrackHolderInterface<TrackListInterface<Wagon>> tracks) {
        List<TrackListInterface<Wagon>> trackList = tracks.getList();
        for(int i = 0; i < trackList.size(); i++) {
            for(int j = 0; j < trackList.get(i).getMAXSIZE(); j++) {
                trackList.get(i).add(spawner.spawnWagon());
            }
        }

        return tracks;
    }

    public TrackHolderInterface<TrackListInterface<Wagon>> sortAllWagons(TrackHolderInterface<TrackListInterface<Wagon>> tracks) {
        // List sort
        for(TrackListInterface<Wagon> track: tracks.getList()) {
            sortWagonsInTrack(track);
        }
        return tracks;
    }

    private TrackListInterface<Wagon> sortWagonsInTrack(TrackListInterface<Wagon> track) {
        int startPoint = 0;
        Wagon tempWagonHolder = null;
        while(startPoint < track.getList().size()) {
            Wagon currentWagon = track.getList().get(startPoint);
            int count = 0;
            for (int i = startPoint; i < track.getList().size(); i++) {
                Wagon pointWagon = track.getList().get(i);
                if (currentWagon.getInformation().getName() == pointWagon.getInformation().getName()) {
                    tempWagonHolder = track.getList().get(i);
                    track.getList().remove(i);
                    track.getList().add(startPoint, tempWagonHolder);
                    count++;
                }
            }
            startPoint += count;
        }
        return track;
    }
}

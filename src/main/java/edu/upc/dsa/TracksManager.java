package edu.upc.dsa;

import edu.upc.dsa.models.Album;
import edu.upc.dsa.models.Track;

import java.util.List;

public interface TracksManager {


    public Track addTrack(String title, String singer);
    public Track addTrack(Track t);
    public Track getTrack(String id);
    public List<Track> findAll();
    public void deleteTrack(String id);
    public Track updateTrack(Track t);

    public Album addAlbum (String id, String name, String singer, int year);
    public Track addTrackToAlbum(String idTrack, String idAlbum);


    public int size();
}

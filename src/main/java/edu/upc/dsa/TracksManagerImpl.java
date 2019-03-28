package edu.upc.dsa;

import edu.upc.dsa.models.Album;
import edu.upc.dsa.models.Track;

import java.util.HashMap;
import java.util.List;

import org.apache.log4j.Logger;

public class TracksManagerImpl implements TracksManager {

    //Logger
    private final static Logger logger = Logger.getLogger(TracksManagerImpl.class);

    //Facade
    private static TracksManager instance;
    private HashMap<String, Album> albums;
    private HashMap<String, Track> tracks;

    //Private constructor
    private TracksManagerImpl() {
        this.albums = new HashMap<>();
        this.tracks = new HashMap<>();
    }

    //getInstance Method
    public static TracksManager getInstance() {
        if (instance == null) instance = new TracksManagerImpl();
        return instance;
    }

    //Methods
    @Override
    public void addAlbum(String name, String singer, int year) {
        Album album = new Album(name, singer, year);
        this.albums.put(album.getId(), album);
        logger.info("Album added");
    }

    @Override
    public void addTrack(String title, String singer, String idAlbum) throws AlbumNotFoundException {
        Album album = this.albums.get(idAlbum);
        if (album != null) {
            Track track = new Track(title, singer);
            album.addTrack(track);
            this.tracks.put(track.getId(), track);
            logger.info("Track added");
        } else {
            logger.info("Album not found");
            throw new AlbumNotFoundException();
        }
    }

    @Override
    public Track getTrack(String id) throws TrackNotFoundException {
        Track track = this.tracks.get(id);
        if (track != null) return track;
        else throw new TrackNotFoundException();
    }

    @Override
    public Album getAlbum(String id) throws AlbumNotFoundException {
        Album album = this.albums.get(id);
        if (album != null) return album;
        else throw new AlbumNotFoundException();
    }

    @Override
    public HashMap<String, Track> getTracks() {
        return this.tracks;
    }

    @Override
    public HashMap<String, Album> getAlbums() {
        return this.albums;
    }

    @Override
    public void updateTrack(Track track) throws TrackNotFoundException {
        this.getTrack(track.getId());
        this.tracks.put(track.getId(), track);
    }

    @Override
    public void updateAlbum(Album album) throws AlbumNotFoundException {
        this.getAlbum(album.getId());
        this.albums.put(album.getId(), album);
    }

    @Override
    public void deleteTrack(String id) throws TrackNotFoundException {
        this.getTrack(id);
        this.tracks.remove(id);
    }

    @Override
    public void deleteAlbum(String id) throws AlbumNotFoundException {
        this.getAlbum(id);
        this.albums.remove(id);
    }

    @Override
    public int numTracks() {
        return this.tracks.size();
    }

    @Override
    public int numAlbums() {
        return this.albums.size();
    }
}
package edu.upc.dsa;

import edu.upc.dsa.models.Album;
import edu.upc.dsa.models.Track;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
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
    public String addAlbum(String name, String singer, int year) {
        Album album = new Album(name, singer, year);
        this.albums.put(album.getId(), album);
        logger.info("Album added");
        return album.getId();
    }

    @Override
    public void addTrack(String title, String singer, String idAlbum) throws AlbumNotFoundException {
        Album album = this.getAlbum(idAlbum);
        Track track = new Track(title, singer);
        album.addTrack(track);
        this.tracks.put(track.getId(), track);
        logger.info("Track added");
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
    public List<Track> getTracks() {
        return new ArrayList<>(this.tracks.values());
    }

    @Override
    public List<Album> getAlbums() {
        return new ArrayList<>(this.albums.values());
    }

    @Override
    public void updateTrack(Track track) throws TrackNotFoundException {
        this.getTrack(track.getId());
        this.tracks.put(track.getId(), track);
        logger.info("Track updated");
    }

    @Override
    public void updateAlbum(Album album) throws AlbumNotFoundException {
        this.getAlbum(album.getId());
        this.albums.put(album.getId(), album);
        logger.info("Album updated");
    }

    @Override
    public void deleteTrack(String id) throws TrackNotFoundException {
        this.getTrack(id);
        this.tracks.remove(id);
        logger.info("Track deleted");
    }

    @Override
    public void deleteAlbum(String id) throws AlbumNotFoundException {
        this.getAlbum(id);
        this.albums.remove(id);
        logger.info("Album deleted");
    }

    @Override
    public int numTracks() {
        logger.info("Number of tracks: " + this.tracks.size());
        return this.tracks.size();
    }

    @Override
    public int numAlbums() {
        logger.info("Number of albums: " + this.albums.size());
        return this.albums.size();
    }
}
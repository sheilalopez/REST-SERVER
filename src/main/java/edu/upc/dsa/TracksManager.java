package edu.upc.dsa;

import edu.upc.dsa.models.Album;
import edu.upc.dsa.models.Author;
import edu.upc.dsa.models.Track;

import java.util.HashMap;
import java.util.List;

public interface TracksManager {

    /**
     * Add a new edu.upc.dsa.models.Album
     * @param name album name
     * @param singer album singer
     * @param year album year
     */
    void addAlbum(String name, String singer, int year);

    /**
     * Add a new edu.upc.dsa.models.Track
     * @param title track title
     * @param singer track singer
     * @param idAlbum album identifier
     * @throws AlbumNotFoundException if album does not exist
     */
    void addTrack(String title, String singer, String idAlbum) throws AlbumNotFoundException;

    /**
     * Get a track by id
     * @param id track identifier
     * @return track object
     * @throws TrackNotFoundException if track does not exist
     */
    Track getTrack(String id) throws TrackNotFoundException;

    /**
     * Get an album by id
     * @param id album identifier
     * @return album object
     * @throws AlbumNotFoundException if album does not exist
     */
    Album getAlbum(String id) throws AlbumNotFoundException;

    /**
     * Get all tracks
     * @return list of tracks
     */
    HashMap<String, Track> getTracks();

    /**
     * Get all albums
     * @return list of albums
     */
    HashMap<String, Album> getAlbums();

    /**
     * Update a track
     * @param track track object
     * @throws TrackNotFoundException if track does not exist
     */
    void updateTrack(Track track) throws TrackNotFoundException;

    /**
     * Update an album
     * @param album album object
     * @throws AlbumNotFoundException if album does not exist
     */
    void updateAlbum(Album album) throws AlbumNotFoundException;

    /**
     * Delete a track by id
     * @param id track identifier
     * @throws TrackNotFoundException if track does not exist
     */
    void deleteTrack(String id) throws TrackNotFoundException;

    /**
     * Delete an album by id
     * @param id album identifier
     * @throws AlbumNotFoundException if album does not exist
     */
    void deleteAlbum(String id) throws AlbumNotFoundException;

    /**
     * Get the number of tracks
     * @return number of tracks
     */
    int numTracks();

    /**
     * Get the number of albums
     * @return number of albums
     */
    int numAlbums();
}

package edu.upc.dsa.models;

import edu.upc.dsa.util.RandomUtils;

import java.util.HashMap;

public class Album {

    //Attributes
    private String id;
    private String name;
    private String singer;
    private int year;
    private HashMap<String, Track> tracks;

    //Constructors
    public Album() {
        this.id = RandomUtils.getId();
    }

    public Album(String name, String singer, int year) {
        this();
        this.name = name;
        this.singer = singer;
        this.year = year;
        this.tracks = new HashMap<>();
    }

    //Methods
    public void addTrack(Track track) {
        this.tracks.put(track.getId(), track);
    }

    public Track getTrackById(String trackId) {
        return this.tracks.get(trackId);
    }

    //Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public HashMap<String, Track> getTracks() {
        return tracks;
    }

    public void setTracks(HashMap<String, Track> tracks) {
        this.tracks = tracks;
    }
}

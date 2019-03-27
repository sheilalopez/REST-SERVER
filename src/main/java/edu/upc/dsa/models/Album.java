package edu.upc.dsa.models;

import java.util.LinkedList;

public class Album {

    //Attributes
    private String id;
    private String name;
    private String singer;
    private int year;
    private LinkedList<Track> tracks;

    //Constructors
    public Album() {

    }

    public Album(String id, String name, String singer, int year) {
        this.id = id;
        this.name = name;
        this.singer = singer;
        this.year = year;
        this.tracks = new LinkedList<>();
    }

    //Methods
    public void addTrack(Track track) {
        this.tracks.add(track);
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

    public LinkedList<Track> getTracks() {
        return tracks;
    }

    public void setTracks(LinkedList<Track> tracks) {
        this.tracks = tracks;
    }
}


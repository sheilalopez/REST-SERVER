package edu.upc.dsa.models;

import java.util.LinkedList;
import java.util.List;

public class Album {
    //attributes
    String id;
    String name;
    String singer;
    int year;
    List<Track> tracks;

    //constructor
    public Album() {

    }

    public Album(String id, String name, String singer, int year, List<Track> tracks) {
        this.id = id;
        this.name = name;
        this.singer = singer;
        this.year = year;
        this.tracks = tracks;
        this.tracks = new LinkedList<>();
    }

    //methods

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

    public List<Track> getTracks() {
        return tracks;
    }

    public void setTracks(List<Track> tracks) {
        this.tracks = tracks;
    }
}


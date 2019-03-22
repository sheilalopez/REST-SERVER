package edu.upc.dsa.models;

import java.util.List;

public class Author {
    String name;
    List<Track> tracks;
    List<Album> albums;

    public Author() {
    }

    public Author(String name, List<Track> tracks, List<Album> albums) {
        this.name = name;
        this.tracks = tracks;
        this.albums = albums;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Track> getTracks() {
        return tracks;
    }

    public void setTracks(List<Track> tracks) {
        this.tracks = tracks;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }
}

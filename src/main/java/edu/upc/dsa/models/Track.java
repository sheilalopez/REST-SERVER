package edu.upc.dsa.models;

import edu.upc.dsa.util.RandomUtils;

public class Track {

    //Attributes
    private String id;
    private String title;
    private String singer;

    //Constructors
    public Track() {
        this.id = RandomUtils.getId();
    }

    public Track(String title, String singer) {
        this();
        this.setSinger(singer);
        this.setTitle(title);
    }

    //Methods
    @Override
    public String toString() {
        return "Track [id="+id+", title=" + title + ", singer=" + singer +"]";
    }

    //Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }
}
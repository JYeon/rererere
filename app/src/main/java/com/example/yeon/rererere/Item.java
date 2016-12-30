package com.example.yeon.rererere;

/**
 * Created by Yeon on 2016. 12. 28..
 */

public class Item {
    String location;
    String description;
    String photoURL;

    public Item(String location, String description, String photoURL) {
        this.location = location;
        this.description = description;
        this.photoURL = photoURL;
    }

    public String getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }

    public String getPhotoURL() {
        return photoURL;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPhotoURL(String photoURL) {
        this.photoURL = photoURL;
    }
}

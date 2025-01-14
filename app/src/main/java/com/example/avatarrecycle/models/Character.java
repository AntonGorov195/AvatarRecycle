package com.example.avatarrecycle.models;

import android.media.Image;

public class Character {
    public String name;
    public String description;
    public int profilePic;

    public Character(String name, String description, int profilePic) {
        this.name = name;
        this.description = description;
        this.profilePic = profilePic;
    }
}

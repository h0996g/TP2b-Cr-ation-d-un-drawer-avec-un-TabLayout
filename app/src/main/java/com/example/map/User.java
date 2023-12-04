package com.example.map;

/**
 * Created by Nadim on 12/06/2017.
 */

public class User {

    private  String challenge;
    private String mumbers;
    private int image;

    public User(String challenge, String mumbers,int image) {
        this.challenge = challenge;
        this.mumbers = mumbers;
        this.image = image;
    }


    public String getChallenge() {
        return challenge;
    }

    public void setChallenge(String challenge) {
        this.challenge = challenge;
    }

    public String getMumbers() {
        return mumbers;
    }

    public void setMumbers(String mumbers) {
        this.mumbers = mumbers;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}

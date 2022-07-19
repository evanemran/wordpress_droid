package com.example.wp_test.models;

import java.io.Serializable;

public class OgImage implements Serializable {
    public int width;
    public int height;
    public String url;
    public String type;


    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getUrl() {
        return url;
    }

    public String getType() {
        return type;
    }
}

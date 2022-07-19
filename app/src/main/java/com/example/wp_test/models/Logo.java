package com.example.wp_test.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Logo implements Serializable {
    @SerializedName("@type")
    public String type;
    @SerializedName("@id")
    public String id;
    public String inLanguage;
    public String url;
    public String contentUrl;
    public int width;
    public int height;
    public String caption;
}

package com.example.wp_test.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Image implements Serializable {
    @SerializedName("@id")
    public String id;
    @SerializedName("@type")
    public String type;
    public String inLanguage;
    public String url;
    public String contentUrl;
    public String caption;
}

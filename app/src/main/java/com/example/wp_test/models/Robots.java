package com.example.wp_test.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Robots implements Serializable {
    public String index;
    public String follow;
    @SerializedName("max-snippet")
    public String maxSnippet;
    @SerializedName("max-image-preview")
    public String maxImagePreview;
    @SerializedName("max-video-preview")
    public String maxVideoPreview;
}

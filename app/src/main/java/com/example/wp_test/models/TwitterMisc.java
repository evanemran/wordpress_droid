package com.example.wp_test.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class TwitterMisc implements Serializable {
    @SerializedName("Written by")
    public String writtenBy;
    @SerializedName("Est. reading time")
    public String estReadingTime;
}

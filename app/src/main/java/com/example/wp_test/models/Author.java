package com.example.wp_test.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Author implements Serializable {
    @SerializedName("@id")
    public String id;
    public boolean embeddable;
    public String href;
}

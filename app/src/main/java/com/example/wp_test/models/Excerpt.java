package com.example.wp_test.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Excerpt implements Serializable {
    public String rendered;
    @SerializedName("protected")
    public boolean myprotected;
}

package com.example.wp_test.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class PotentialAction implements Serializable {
    @SerializedName("@type")
    public String type;
    public Object target;
    @SerializedName("query-input")
    public String queryInput;
    public String name;
}

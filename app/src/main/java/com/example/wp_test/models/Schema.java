package com.example.wp_test.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Schema implements Serializable {
    @SerializedName("@context")
    public String context;
    @SerializedName("@graph")
    public List<Graph> graph;
}

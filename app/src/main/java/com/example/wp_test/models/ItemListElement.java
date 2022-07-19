package com.example.wp_test.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ItemListElement implements Serializable {
    @SerializedName("@type")
    public String type;
    public int position;
    public String name;
    public String item;
}

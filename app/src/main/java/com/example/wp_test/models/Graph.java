package com.example.wp_test.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Graph implements Serializable {
    @SerializedName("@type")
    public String type;
    @SerializedName("@id")
    public String id;
    public String name;
    public String url;
    public List<String> sameAs;
    public Logo logo;
    public Image image;
    public String description;
    public Publisher publisher;
    public List<PotentialAction> potentialAction;
    public String inLanguage;
    public String contentUrl;
    public int width;
    public int height;
    public IsPartOf isPartOf;
    public PrimaryImageOfPage primaryImageOfPage;
    public String datePublished;
    public String dateModified;
    public Breadcrumb breadcrumb;
    public List<ItemListElement> itemListElement;
    public Author author;
    public String headline;
    public MainEntityOfPage mainEntityOfPage;
    public int wordCount;
    public int commentCount;
    public String thumbnailUrl;
    public List<String> articleSection;
    public String caption;
}

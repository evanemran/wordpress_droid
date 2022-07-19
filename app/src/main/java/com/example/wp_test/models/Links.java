package com.example.wp_test.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Links implements Serializable {
    public List<Self> self;
    public List<Collection> collection;
    public List<About> about;
    public List<Author> author;
    public List<Reply> replies;
    @SerializedName("version-history")
    public List<VersionHistory> versionHistory;
    @SerializedName("predecessor-version")
    public List<PredecessorVersion> predecessorVersion;
    @SerializedName("wp:featuredmedia")
    public List<WpFeaturedmedium> wpFeaturedmedia;
    @SerializedName("wp:attachment")
    public List<WpAttachment> wpAttachment;
    @SerializedName("wp:term")
    public List<WpTerm> wpTerm;
    public List<Cury> curies;
}

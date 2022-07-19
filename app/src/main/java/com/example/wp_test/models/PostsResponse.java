package com.example.wp_test.models;

import java.io.Serializable;
import java.util.List;

public class PostsResponse implements Serializable {
    public int id;
    public String date;
    public String date_gmt;
    public Guid guid;
    public String modified;
    public String modified_gmt;
    public String slug;
    public String status;
    public String type;
    public String link;
    public Title title;
    public Content content;
    public Excerpt excerpt;
    public int author;
    public int featured_media;
    public String comment_status;
    public String ping_status;
    public boolean sticky;
    public String template;
    public String format;
    public List<Object> meta;
    public List<Integer> categories;
    public List<Object> tags;
    public String yoast_head;
    public YoastHeadJson yoast_head_json;
    public Links _links;
}

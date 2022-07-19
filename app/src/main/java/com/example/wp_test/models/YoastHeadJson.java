package com.example.wp_test.models;

import java.io.Serializable;
import java.util.List;

public class YoastHeadJson implements Serializable {
    public String title;
    public String description;
    public Robots robots;
    public String canonical;
    public String og_locale;
    public String og_type;
    public String og_title;
    public String og_description;
    public String og_url;
    public String og_site_name;
    public String article_publisher;
    public String article_published_time;
    public String article_modified_time;
    public List<OgImage> og_image;
    public String twitter_card;
    public String twitter_title;
    public String twitter_description;
    public String twitter_image;
    public String twitter_creator;
    public String twitter_site;
    public TwitterMisc twitter_misc;
    public Schema schema;
}

package com.challenge.backendcodingchallenge.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 *   this Class is used to represent a  repository by its name , language which is written , and linkto the repository
 */
@JsonIgnoreProperties
public class Repository {

    int id ;
    String name ;
    String language ;
    String html_url ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getHtml_url() {
        return html_url;
    }

    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }
}

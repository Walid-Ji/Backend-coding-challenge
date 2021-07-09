package com.challenge.backendcodingchallenge.Models;

import java.util.ArrayList;
import java.util.List ;

/**
 *   this Class is used to store repositories retrieved from the Api
 */
public class LanguagesList {


    private  List<Repository> items = new ArrayList<>();

    public List<Repository> getItems() {
        return items;
    }

    public void setItems(List<Repository> items) {
        this.items = items;
    }
}

package com.challenge.backendcodingchallenge.Models;

import java.util.List;


/**
 *   this Class is used to represent a  language  by its name , number of repositories  , and  list of repositories written by this language
 */
public class Language {

     String name ;
     int Number_repos ;
     List<Repository> Repositories ;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber_repos() {
        return Number_repos;
    }

    public void setNumber_repos(int number_repos) {
        Number_repos = number_repos;
    }

    public List<Repository> getRepositories() {
        return Repositories;
    }

    public void setRepositories(List<Repository> repositories) {
        Repositories = repositories;
    }
}

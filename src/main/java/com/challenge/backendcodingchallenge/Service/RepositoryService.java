package com.challenge.backendcodingchallenge.Service;

import com.challenge.backendcodingchallenge.Models.Repository;
import org.springframework.stereotype.Service;

import java.util.List;


public interface RepositoryService {

    List<Repository> getAllRepositories();

}

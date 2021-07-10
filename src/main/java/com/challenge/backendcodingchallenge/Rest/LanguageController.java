package com.challenge.backendcodingchallenge.Rest;


import com.challenge.backendcodingchallenge.Service.LanguageService;
import com.challenge.backendcodingchallenge.Service.RepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class LanguageController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    RepositoryService repositoryService;

    @Autowired
    LanguageService languageService ;

    /**
     * Endpoint to get all repositories
     * @return list of repositories (100 repositories)
     */
    @RequestMapping(value = "/languages", method = RequestMethod.GET)
    public ResponseEntity getAllRepositories() {
        return ResponseEntity.ok(repositoryService.getAllRepositories());
    }


    /**
     * Endpoint to get language with number of repos using this language , and list of repos
     * @return language object
     */
    @RequestMapping(value = "/languages/lang", method = RequestMethod.GET)
    public ResponseEntity getLanguage(@RequestParam String lang) {
        return ResponseEntity.ok(languageService.getLanguage(lang));
    }
}

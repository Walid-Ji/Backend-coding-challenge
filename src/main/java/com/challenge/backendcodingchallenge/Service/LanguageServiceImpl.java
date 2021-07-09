package com.challenge.backendcodingchallenge.Service;

import com.challenge.backendcodingchallenge.Models.Language;
import com.challenge.backendcodingchallenge.Models.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class LanguageServiceImpl implements LanguageService {

    @Autowired
    RepositoryService repositoryService ;

    /**
     * this function return language with number of repos using this language
     * and  the list of repos using the language (each repository is represented by its name  and its link)
     * @param lang
     * @return language
     */
    @Override
    public Language getLanguage(String lang) {
        Language language = new Language();
        List<Repository> lists = new ArrayList<>();

        // we call external api of github to get list of 100 trending public repos on GitHub.
        List<Repository> Repositories = repositoryService.getAllRepositories();

        /*
          Some repositories are not written in  a specific language , they have the value "null".
         */
        if (lang == null) {
            lists = Repositories.stream().filter(c -> c.getLanguage() == null).collect(Collectors.toList());
            language.setRepositories(lists);
            language.setName(lang);
            language.setNumber_repos(lists.size());
            return language ;

        }

        /*
          filtering the repositories by the language's name
         */
        lists = Repositories.stream().filter(c -> c.getLanguage() != null && c.getLanguage().equals(lang)).collect(Collectors.toList());
        language.setRepositories(lists);
        language.setName(lang);
        language.setNumber_repos(lists.size());
        return language;
    }
}

package com.challenge.backendcodingchallenge.Service;

import com.challenge.backendcodingchallenge.Models.LanguagesList;
import com.challenge.backendcodingchallenge.Models.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class RepositoryServiceImpl implements RepositoryService {

    @Autowired
    RestTemplate restTemplate;

    /**
     * this function retrieve list of 100 trending public repos on GitHub.
     * @return list
     */
    @Override
    public List<Repository> getAllRepositories() {

        // we calculate 30 days from a today
        Date today = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(today);
        cal.add(Calendar.DAY_OF_MONTH, -30);
        Date today30 = cal.getTime();
        SimpleDateFormat DateFor = new SimpleDateFormat("YYYY-MM-dd");
        String stringDate = DateFor.format(today30);

        // we call external api of github to get list of 100 trending public repos on GitHub.
        LanguagesList Repositories = restTemplate.getForObject("https://api.github.com/search/repositories?q=created:>" + stringDate + "&sort=stars&order=desc&per_page=100", LanguagesList.class);
        return Repositories.getItems();
    }
}

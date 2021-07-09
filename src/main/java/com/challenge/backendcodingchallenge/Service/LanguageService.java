package com.challenge.backendcodingchallenge.Service;

import com.challenge.backendcodingchallenge.Models.Language;
import org.springframework.stereotype.Service;

public interface LanguageService {

    Language getLanguage(String name);

}

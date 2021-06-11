package com.maxkorte.springjokes.service;

import org.springframework.stereotype.Service;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImpl implements JokeService{
    private final ChuckNorrisQuotes cnq;

    public JokeServiceImpl() {
        cnq = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return cnq.getRandomQuote();
    }
}

package com.example.restapi.demoRestApi.service;

import com.example.restapi.demoRestApi.domain.MovieService;
import com.example.restapi.demoRestApi.repository.MovieServiceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceIMPL implements MovieMainService {
    MovieServiceRepository movieServiceRepository;
    public MovieServiceIMPL(MovieServiceRepository movieServiceRepository){

        this.movieServiceRepository=movieServiceRepository;
    }

    @Override
    public MovieService addMovies( MovieService movieService){

        return movieServiceRepository.save(movieService);
    }

}

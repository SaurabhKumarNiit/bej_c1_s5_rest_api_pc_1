package com.example.restapi.demoRestApi.controller;

import com.example.restapi.demoRestApi.domain.MovieService;
import com.example.restapi.demoRestApi.service.MovieMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/moviedata/v1/")
public class MovieServiceController {
    MovieMainService movieMainService;

    @Autowired
    public MovieServiceController (MovieMainService movieMainService){
        this.movieMainService=movieMainService;

    }

    @PostMapping("/movie")
    public ResponseEntity<?> saveUser(@RequestBody MovieService movieService ){
        return new ResponseEntity<>(movieMainService.addMovies(movieService), HttpStatus.CREATED);
    }
   
}

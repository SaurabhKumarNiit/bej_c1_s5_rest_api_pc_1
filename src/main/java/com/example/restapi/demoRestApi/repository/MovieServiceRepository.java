package com.example.restapi.demoRestApi.repository;

import com.example.restapi.demoRestApi.domain.MovieService;
import org.springframework.data.repository.CrudRepository;

public interface MovieServiceRepository extends CrudRepository<MovieService,Integer> {
}

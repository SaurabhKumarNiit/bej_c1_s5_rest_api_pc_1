package com.example.restapi.demoRestApi.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MovieService {
    private String actorName;
    private String movieName;
    private String directorName;
    @Id
    private int movieId;

    public MovieService(String actorName, String movieName, String directorName, int movieId) {
        this.actorName = actorName;
        this.movieName = movieName;
        this.directorName = directorName;
        this.movieId = movieId;
    }

    public MovieService() {
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    @Override
    public String toString() {
        return "MovieService{" +
                "actorName='" + actorName + '\'' +
                ", movieName='" + movieName + '\'' +
                ", directorName='" + directorName + '\'' +
                ", movieId=" + movieId +
                '}';
    }
}

package com.Spring.boot.restApi.SpringBootRestApi.MovieRecommendation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class RecommendationController {

    @GetMapping("/movies")
    public List<Movie> getAllMovies(){
        return Arrays.asList(new Movie(1, "Harry Potter", 9.9),
                new Movie(2,"abc", 10),
                new Movie(3,"abc 2", 8)
        );
    }
}

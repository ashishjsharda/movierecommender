package org.ashish.movierecommender.model;
import jakarta.persistence.*;
import lombok.Data;
import java.util.Set;

@Data
@Entity
@TableName("movies")


public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String genre;
    private String director;

    @OneToMany(mappedBy = "movie")
    private Set<Rating> ratings;
}

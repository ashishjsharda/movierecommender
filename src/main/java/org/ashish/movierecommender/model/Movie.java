package org.ashish.movierecommender.model;
import jakarta.persistence.*;
import lombok.Data;
import java.util.Set;

@Data
@Entity
@Table(name = "movies")


public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String genre;
    private Integer releaseYear;
    private String director;

    @OneToMany(mappedBy = "movie")
    private Set<Rating> ratings;
}

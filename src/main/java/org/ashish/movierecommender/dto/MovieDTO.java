package org.ashish.movierecommender.dto;

public class MovieDTO {
    private Long id;
    private String title;
    private Integer releaseYear;
    private String genre;
    private String director;
    private Double averageRating;

    public MovieDTO() {
    }

    public MovieDTO(Long id, String title, String genre, String director) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.director = director;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}

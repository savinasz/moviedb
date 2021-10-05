package com.example.moviedb;

import java.io.Serializable;

public class ModelMovie implements Serializable {
    private String Tittle, Overview, RealeseDate, PosterPath, BackdropPath, Popularity;
    private int Id;
    private double VoteAverage;

    public ModelMovie(){
    }
    public String getTittle() {
        return Tittle;
    }

    public void setTittle(String tittle) {
        Tittle = tittle;
    }

    public String getOverview() {
        return Overview;
    }

    public void setOverview(String overview) {
        Overview = overview;
    }

    public String getRealeseDate() {
        return RealeseDate;
    }

    public void setRealeseDate(String realeseDate) {
        RealeseDate = realeseDate;
    }

    public String getPosterPath() {
        return PosterPath;
    }

    public void setPosterPath(String posterPath) {
        PosterPath = posterPath;
    }

    public String getBackdropPath() {
        return BackdropPath;
    }

    public void setBackdropPath(String backdropPath) {
        BackdropPath = backdropPath;
    }

    public String getPopularity() {
        return Popularity;
    }

    public void setPopularity(String popularity) {
        Popularity = popularity;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public double getVoteAverage() {
        return VoteAverage;
    }

    public void setVoteAverage(double voteAverage) {
        VoteAverage = voteAverage;
    }
}

package com.example.android.moviesapi.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 28-04-2018.
 */

public class Movie {
    @SerializedName("poster_path")
    private String posterPath;
    @SerializedName("adult")
    private boolean adult;
    @SerializedName("overview")
    private  String overview;
    @SerializedName("release_date")
    private  String releaseDate;
    @SerializedName("genre_ids")
    private List<Integer>genreIds=new ArrayList<Integer>();
    @SerializedName("id")
    private Integer id;
    @SerializedName("original_title")
    public  String originalTitle;
    @SerializedName("original_language")
    public  String originalLangauge;
    @SerializedName("title")
    public  String title;
    @SerializedName("backdrop_path")
    public  String backdropPath;
    @SerializedName("popularity")
    public  double popularity;
    @SerializedName("vote_count")
    private Integer voteCount;
    @SerializedName("video")
    private boolean video;
    @SerializedName("vote_average")
    public  double voteAverage;

    public Movie(String posterPath,boolean adult,String overview,String releaseDate,List<Integer>genreIds,Integer id,String originalTitle,String originalLangauge,String title,String backdropPath,Double popularity,Integer voteCount,Boolean video,Double voteAverage){
        this.posterPath = posterPath;
        this.adult = adult;
        this.overview = overview;
        this.releaseDate = releaseDate;
        this.genreIds = genreIds;
        this.id = id;
        this.originalTitle = originalTitle;
        this.originalLangauge = originalLangauge;
        this.title = title;
        this.backdropPath = backdropPath;
        this.popularity = popularity;
        this.voteCount = voteCount;
        this.video = video;
        this.voteAverage=voteAverage;

    }
    public Movie(){

    }
    String baseImageUrl = "http://image.tmdb.org/t/p/w500";

    public String getPosterPath(){
        return "http://image.tmdb.org/t/p/w500" + posterPath;
    }

    public void setPosterPath(String posterPath){
        this.posterPath = posterPath;
    }

    public boolean isAdult(){
        return adult;
    }

    public void setAdult(Boolean adult){
        this.adult = adult;
    }

    public String getOverview(){
        return overview;
    }

    public void setOverview(String overview){
        this.overview = overview;
    }

    public String getReleaseDate(){
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate){
        this.releaseDate = releaseDate;
    }

    public List<Integer> getGenreIds(){
        return genreIds;
    }

    public void setGenreIds(List<Integer>genreIds){
        this.genreIds = genreIds;
    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getOriginalTitle(){
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle){
        this.originalTitle = originalTitle;
    }

    public String getOriginalLangauge(){
        return originalLangauge;
    }

    public void setOriginalLangauge(String originalLangauge){
        this.originalLangauge = originalLangauge;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getBackdropPath(String backdropPath){
        return backdropPath;
    }

    public void setBackdropPath(){
        this.backdropPath = backdropPath;
    }

    public Double getPopularity(){
        return popularity;
    }

    public void setPopularity(Double popularity){
        this.popularity = popularity;
    }

    public Integer getVoteCount(){
        return voteCount;
    }

    public void setVoteCount(Integer voteCount){
        this.voteCount = voteCount;
    }

    public boolean getVideo(){
        return video;
    }

    public void setVideo(Boolean video){
        this.video = video;
    }

    public Double getVoteAverage(){
        return voteAverage;
    }

    public void setVoteAverage(Double voteAverage){
        this.voteAverage = voteAverage;
    }

}

package com.example.android.moviesapi.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by user on 06-05-2018.
 */

public class TrailerResponse {

    @SerializedName("id")
    private int id_trailer;
    @SerializedName("results")
    private List<Trailer> results;

    public int getId_trailer() {
        return id_trailer;
    }

    public void setId_trailer(int id_trailer) {
        this.id_trailer = id_trailer;
    }

    public List<Trailer> getResults() {
        return results;
    }

    public void setResults(List<Trailer> results) {
        this.results = results;
    }
}

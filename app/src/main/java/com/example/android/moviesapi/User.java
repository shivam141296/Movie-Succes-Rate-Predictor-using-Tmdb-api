package com.example.android.moviesapi;

/**
 * Created by user on 10-05-2018.
 */

public class User {

    String Movie_name, User_r1, User_r2, User_r3, User_r4, User_r5, pc, nc, rating;
    public User(){

    }

    // Constructor with two parameters name and password
    public User(String User_r1, String User_r2, String User_r3, String User_r4, String User_r5, String pc, String nc, String rating) {

        this.User_r1 = User_r1;
        this.User_r2 = User_r2;
        this.User_r3 = User_r3;
        this.User_r4 = User_r4;
        this.User_r5 = User_r5;
        this.pc = pc;
        this.nc = nc;
        this.rating = rating;
    }

    //Parameter constructor containing all three parameters
    public User(String Movie_name, String User_r1, String User_r2, String User_r3, String User_r4, String User_r5, String pc, String nc, String rating) {
        this.Movie_name = Movie_name;
        this.User_r1 = User_r1;
        this.User_r2 = User_r2;
        this.User_r3 = User_r3;
        this.User_r4 = User_r4;
        this.User_r5 = User_r5;
        this.pc = pc;
        this.nc = nc;
        this.rating = rating;
    }

    //getting id
    public String getMovie_name() {
        return Movie_name;
    }

    //setting id
    public void setMovie_name(String Movie_name) {
        this.Movie_name = Movie_name;
    }

    public String getUser_r1() {
        return User_r1;
    }

    public void setUser_r1(String User_r1) {
        this.User_r1 = User_r1;
    }

    public String getUser_r2() {
        return User_r2;
    }

    public void setUser_r2(String User_r2) {
        this.User_r2 = User_r2;
    }

    public String getUser_r3() {
        return User_r3;
    }

    public void setUser_r3(String User_r3) {
        this.User_r3 = User_r3;
    }

    public String getUser_r4() {
        return User_r4;
    }

    public void setUser_r4(String User_r4) {
        this.User_r4 = User_r4;
    }

    public String getUser_r5() {
        return User_r5;
    }

    public void setUser_r5(String User_r5) {
        this.User_r5 = User_r5;
    }

    public String getPc() {
        return pc;
    }

    public void setPc(String pc) {
        this.pc = pc;
    }

    public String getNc() {
        return nc;
    }

    public void setNc(String nc) {
        this.nc = nc;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String Rating) {
        this.rating = Rating;
    }
}

package com.example.android.moviesapi;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 10-05-2018.
 */

public class DbHandler extends SQLiteOpenHelper {
    private static final int Db_Version = 1;
    //Db Name
    private static final String Db_Name = "users";
    //table name
    private static final String Table_Name = "user";
    //Creating mycontacts Columns
    private static final String Movie_name = "mname";
    private static final String User_r1 = "review1";
    private static final String User_r2 = "review2";
    private static final String User_r3 = "review3";
    private static final String User_r4 = "review4";
    private static final String User_r5 = "review5";
    private static final String pc = "positive";
    private static final String nc = "negative";
    private static final String rating = "rating";

    //constructor here
    public DbHandler(Context context) {

        super(context, Db_Name, null, Db_Version);
    }

    //creating table
    @Override
    public void onCreate(SQLiteDatabase db) {
        // writing command for sqlite to create table with required columns
        String Create_Table = "CREATE TABLE " + Table_Name + "(" + Movie_name
                + " TEXT PRIMARY KEY," + User_r1 + " TEXT," + User_r2 + " TEXT," + User_r3 + " TEXT,"  + User_r4 + " TEXT," +
                User_r5 + " TEXT," + pc + " TEXT," + nc + " TEXT," + rating + " TEXT" + ")";
        db.execSQL(Create_Table);
    }

    //Upgrading the Db
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //Drop table if exists
        db.execSQL("DROP TABLE IF EXISTS " + Table_Name);
        //create the table again
        onCreate(db);
    }

    //Add new User by calling this method
    public void addUser(User usr) {
        // getting db instance for writing the user
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(Movie_name,usr.getMovie_name());
        cv.put(User_r1, usr.getUser_r1());
        cv.put(User_r2, usr.getUser_r2());
        cv.put(User_r3, usr.getUser_r3());
        cv.put(User_r4, usr.getUser_r4());
        cv.put(User_r5, usr.getUser_r5());
        cv.put(pc, usr.getPc());
        cv.put(nc, usr.getPc());
        cv.put(rating, usr.getRating());
        //inserting row
        db.insert(Table_Name, null, cv);
        //close the database to avoid any leak
        db.close();
    }

    public List<User> getAllReviews() {
        String[] columns = {
                Movie_name,
                User_r1,
                User_r2,
                User_r3,
                User_r4,
                User_r5,
                pc,
                nc,
                rating

        };
        String sortOrder = Movie_name + " ASC";
        List<User> reviewsList = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(Table_Name,
                columns,
                null,
                null,
                null,
                null,
                sortOrder);

        if (cursor.moveToFirst()) {
            do {
                User movie = new User();
                movie.setMovie_name(cursor.getString(cursor.getColumnIndex(Movie_name)));
                movie.setUser_r1(cursor.getString(cursor.getColumnIndex(User_r1)));
                movie.setUser_r2(cursor.getString(cursor.getColumnIndex(User_r2)));
                movie.setUser_r3(cursor.getString(cursor.getColumnIndex(User_r3)));
                movie.setUser_r4(cursor.getString(cursor.getColumnIndex(User_r4)));
                movie.setUser_r5(cursor.getString(cursor.getColumnIndex(User_r5)));
                movie.setPc(cursor.getString(cursor.getColumnIndex(pc)));
                movie.setNc(cursor.getString(cursor.getColumnIndex(nc)));
                movie.setRating(cursor.getString(cursor.getColumnIndex(rating)));

                reviewsList.add(movie);

            } while (cursor.moveToNext());

        }
        cursor.close();
        db.close();
        return reviewsList;
    }


}

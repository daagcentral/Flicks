package me.gtihtina.flicks;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Movie {
    public String title;
    public String overView;
    public String posterPath;


    public Movie(JSONObject object) throws JSONException{

        title = object.getString("title");
        overView = object.getString("overview");
        posterPath = object.getString("poster_path");
    }

    public String getTitle() {
        return title;
    }

    public String getOverView() {
        return overView;
    }

    public String getPosterPath() {
        return posterPath;
    }
}


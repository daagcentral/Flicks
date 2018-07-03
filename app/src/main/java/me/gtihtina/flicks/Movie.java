package me.gtihtina.flicks;

import org.json.JSONException;
import org.json.JSONObject;
import org.parceler.Parcel;

import java.util.ArrayList;

@Parcel
public class Movie {
    public String title;
    public String overView;
    public String posterPath;
    public String backdropPath;
    public Double voteAverage;

    public Movie(){}


    public Movie(JSONObject object) throws JSONException{

        title = object.getString("title");
        overView = object.getString("overview");
        posterPath = object.getString("poster_path");
        backdropPath = object.getString("backdrop_path");
        voteAverage = object.getDouble("vote_average");
    }

    public Double getVoteAverage() { return voteAverage; }

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


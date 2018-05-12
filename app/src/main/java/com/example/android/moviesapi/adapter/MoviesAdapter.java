package com.example.android.moviesapi.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.android.moviesapi.DetailActivity;
import com.example.android.moviesapi.R;
import com.example.android.moviesapi.model.Movie;

import java.util.List;

/**
 * Created by user on 28-04-2018.
 */

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MyViewHolder> {

    private Context mContext;
    private List<Movie>movieList;
   // private RecyclerViewClickListener recyclerViewClickListener;

    public MoviesAdapter(Context mContext, List<Movie> movieList){
        this.mContext =  mContext;
        this.movieList = movieList;
       // this.recyclerViewClickListener = (RecyclerViewClickListener) recyclerViewClickListener;
    }
    @Override
    public MoviesAdapter.MyViewHolder onCreateViewHolder(ViewGroup viewGroup,int i){
        View view = LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.movie_card,viewGroup,false);
        return new MyViewHolder(view);
    }
    @Override
    public void onBindViewHolder(final MoviesAdapter.MyViewHolder viewHolder,int i){
        viewHolder.title.setText(movieList.get(i).getOriginalTitle());
        String vote = Double.toString(movieList.get(i).getVoteAverage());
        viewHolder.userrating.setText(vote);

        Glide.with(mContext)
                .load(movieList.get(i).getPosterPath())
                .placeholder(R.drawable.load)
                .into(viewHolder.thumbnail);
    }
    @Override
    public int getItemCount(){
        return movieList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView title,userrating,Budget;
        public ImageView thumbnail;
        public MyViewHolder(View itemView) {
            super(itemView);
            title = (TextView)itemView.findViewById(R.id.title);
            userrating = (TextView)itemView.findViewById(R.id.userrating);
            thumbnail = (ImageView)itemView.findViewById(R.id.thumbnail);
            Budget =(TextView) itemView.findViewById(R.id.budget);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int pos = getAdapterPosition();
                    //long b = movieList.get(pos).getBudget();
                    if(pos!=RecyclerView.NO_POSITION){
                        Movie clickedDataItem=movieList.get(pos);
                        Intent intent = new Intent(mContext,DetailActivity.class);
                        intent.putExtra("original_title",movieList.get(pos).getOriginalTitle());
                        intent.putExtra("poster_path",movieList.get(pos).getPosterPath());
                        intent.putExtra("overview",movieList.get(pos).getOverview());
                        intent.putExtra("vote_average",Double.toString(movieList.get(pos).getVoteAverage()));
                        intent.putExtra("release_date",movieList.get(pos).getReleaseDate());
                        intent.putExtra("id",movieList.get(pos).getId());
                        intent.putExtra("budget",movieList.get(pos).getBudget());
                        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        mContext.startActivity(intent);
                        Toast.makeText(view.getContext(),"You clicked"+clickedDataItem.getOriginalTitle(),Toast.LENGTH_SHORT);
                    }
                }
            });
        }
    }
}

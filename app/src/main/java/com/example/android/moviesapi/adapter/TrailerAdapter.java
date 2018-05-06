package com.example.android.moviesapi.adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.moviesapi.R;
import com.example.android.moviesapi.model.Trailer;

import java.util.List;

/**
 * Created by user on 06-05-2018.
 */

public class TrailerAdapter extends RecyclerView.Adapter<TrailerAdapter.MyViewHolder> {
    private Context mContext;
    private List<Trailer>trailerList;
    public TrailerAdapter(Context mContext, List<Trailer>trailerList){
        this.mContext = mContext;
        this.trailerList = trailerList;
    }
    @Override
    public TrailerAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.trailer_card,parent,false);
        return new TrailerAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(TrailerAdapter.MyViewHolder holder, int position) {

        holder.title.setText(trailerList.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return trailerList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView title;
        public ImageView thumbnail;
        public MyViewHolder(View itemView) {
            super(itemView);
            title = (TextView)itemView.findViewById(R.id.title);
            thumbnail = (ImageView)itemView.findViewById(R.id.thumbnail);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int pos = getAdapterPosition();
                    if(pos!=RecyclerView.NO_POSITION){
                        Trailer clickedDataItem=trailerList.get(pos);
                        String videoId = trailerList.get(pos).getKey();
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v="+videoId));
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        intent.putExtra("VIDEO_ID",videoId);
                        mContext.startActivity(intent);
                        Toast.makeText(view.getContext(),"You clicked"+clickedDataItem.getName(),Toast.LENGTH_SHORT);
                    }
                }
            });
        }
    }
}

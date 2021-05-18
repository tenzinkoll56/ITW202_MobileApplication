package com.example.todo_18;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

class SportsAdapter extends RecyclerView.Adapter<SportsAdapter.ViewHolder> {

    private ArrayList<Sport> mSportsData;
    private Context mContext;

    SportsAdapter(Context context, ArrayList<Sport> sportsData) {
        this.mSportsData = sportsData;
        this.mContext = context;
    }


    @Override
    public SportsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(mContext).
                inflate(R.layout.list, parent, false));
    }


    @Override
    public void onBindViewHolder(SportsAdapter.ViewHolder holder, int position) {
        Sport currentSport = mSportsData.get(position);

        holder.bindTo(currentSport);
    }


    @Override
    public int getItemCount() {
        return mSportsData.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder {

        private TextView mTitleText;
        private TextView mInfoText;
        private ImageView img;


        ViewHolder(View itemView) {
            super(itemView);


            mTitleText = itemView.findViewById(R.id.title);
            mInfoText = itemView.findViewById(R.id.sub_tittle);
            img = itemView.findViewById(R.id.sportsImage);

        }

        void bindTo(Sport currentSport) {

            mTitleText.setText(currentSport.getTitle());
            mInfoText.setText(currentSport.getInfo());


            Glide.with(mContext).load(currentSport.getImageResourcce()).into(img);


        }

    }
}
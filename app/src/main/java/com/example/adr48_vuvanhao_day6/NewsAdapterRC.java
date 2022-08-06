package com.example.adr48_vuvanhao_day6;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class NewsAdapterRC extends RecyclerView.Adapter<NewsAdapterRC.NewsViewHolder> {

    ArrayList<News> news;
    private Context mContext;
    private INewsActionListener mCallback;

    public NewsAdapterRC(ArrayList<News> news, Context mContext, INewsActionListener mCallback) {
        this.news = news;
        this.mContext = mContext;
        this.mCallback = mCallback;
    }

    @NonNull
    @Override
    public NewsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.custom_news,parent,false);
        return new NewsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsViewHolder holder, int position) {
        News tin = news.get(position);
        Glide.with(mContext).load(tin.getImgAvatar()).into(holder.imgAva);
        Glide.with(mContext).load(tin.getImgContent()).into(holder.imgContent);
        holder.name.setText(tin.getName());
        holder.time.setText(tin.getTime());
        holder.content.setText(tin.getContent());
        holder.tvlike.setText(String.valueOf(tin.getLike()));
        holder.tvcmt.setText(String.valueOf(tin.getCmt()));
        holder.tvshare.setText(String.valueOf(tin.getShare()));
    }

    @Override
    public int getItemCount() {
        return news.size();
    }

    public class NewsViewHolder extends RecyclerView.ViewHolder {
        ImageView imgAva,imgContent;
        TextView name,time,content,tvlike,tvcmt,tvshare;
        CheckBox cblike,cbcmt,cbshare;
        View thisView;
        public NewsViewHolder(@NonNull View itemView) {
            super(itemView);

            imgAva = itemView.findViewById(R.id.imgAvatar);
            imgContent = itemView.findViewById(R.id.imgContent);
            name = itemView.findViewById(R.id.tvNamePost);
            time = itemView.findViewById(R.id.tvTimePost);
            content = itemView.findViewById(R.id.tvContent);
            tvlike = itemView.findViewById(R.id.tvNumberLike);
            tvcmt = itemView.findViewById(R.id.tvNumberCmt);
            tvshare = itemView.findViewById(R.id.tvNumberShare);
            cblike = itemView.findViewById(R.id.cbLike);
            cbcmt = itemView.findViewById(R.id.cbComment);
            cbshare = itemView.findViewById(R.id.cbShare);
        }
    }
}

package com.example.adr48_vuvanhao_day6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity implements INewsActionListener {

    private RecyclerView rvNews;
    NewsAdapterRC newsAdapterRC;
    News[] newsArray = {
            new News(R.drawable.ava1,"Vũ Văn Hảo","T2 lúc 1:11 AM","Hảo đẹp trai siêu cấp vũ trụ",R.drawable.a2,0,0,0),
            new News(R.drawable.ava2,"Hảo Sâu Sắc","T3 lúc 6:11 AM","Đây là news số 2",R.drawable.a3,0,0,0),
            new News(R.drawable.ava3,"Vũ ABCXYZ","T4 lúc 8:11 AM","Chả biết gì hết",R.drawable.a4,0,0,0),
            new News(R.drawable.ava4,"Hảo IT5HaUI","T5 lúc 11:12 AM","Ảnh đồng hồ đẹp đẹp phết",R.drawable.a1,0,0,0)
    };

    ArrayList<News> news = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        rvNews = findViewById(R.id.rvNews);
        Collections.addAll(news,newsArray);
        newsAdapterRC = new NewsAdapterRC(news,this,this);
        rvNews.setAdapter(newsAdapterRC);
    }

    @Override
    public void onItemLikeListener(int i, View view) {

    }

    @Override
    public void onItemCommentListener(int i, View view) {

    }

    @Override
    public void onItemShareListener(int i, View view) {

    }
}
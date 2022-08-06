package com.example.adr48_vuvanhao_day6;

import android.view.View;

public interface INewsActionListener {
    void onItemLikeListener(int i, View view);
    void onItemCommentListener(int i, View view);
    void onItemShareListener(int i, View view);
}

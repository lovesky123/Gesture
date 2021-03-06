package com.example.gesture.customView;

import android.graphics.Canvas;

import androidx.annotation.NonNull;

import com.example.gesture.bean.CellBean;


/**
 */

public interface IHitCellView {
    /**
     * 绘制已设置的每个图案的样式
     *
     * @param canvas
     * @param cellBean
     * @param isError
     */
    void draw(@NonNull Canvas canvas, @NonNull CellBean cellBean, boolean isError);
}

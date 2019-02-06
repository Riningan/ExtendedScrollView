package com.riningan.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.widget.NestedScrollView;
import android.util.AttributeSet;
import android.view.MotionEvent;

import com.riningan.widget.extendedscrollview.R;


/**
 * Created by Vadim Akhmarov on 13.12.2018.
 * Project ExtendedScrollView
 * Classname ExtendedScrollView
 * Version 1.0
 * Copyright All rights reserved.
 */

public class ExtendedScrollView extends NestedScrollView {
    private Boolean mScrollEnabled = true;


    public ExtendedScrollView(@NonNull Context context) {
        super(context);
    }

    public ExtendedScrollView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public ExtendedScrollView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }


    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        if (mScrollEnabled) {
            return super.onInterceptTouchEvent(ev);
        } else {
            return false;
        }
    }

    @SuppressLint("ClickableViewAccessibility")
    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        if (mScrollEnabled) {
            return super.onTouchEvent(ev);
        } else {
            return false;
        }
    }


    public Boolean isScrollEnabled() {
        return mScrollEnabled;
    }

    public void setScrollEnabled(Boolean value) {
        mScrollEnabled = value;
    }


    private void init(AttributeSet attrs) {
        TypedArray typedArray = getContext().getTheme().obtainStyledAttributes(attrs, R.styleable.ExtendedScrollView, 0, 0);
        mScrollEnabled = typedArray.getBoolean(R.styleable.ExtendedScrollView_scroll_enabled, true);
        typedArray.recycle();
    }
}
package com.riningan.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.widget.NestedScrollView;
import android.util.AttributeSet;
import android.view.MotionEvent;


public class ExtendedScrollView extends NestedScrollView {
    private Boolean mEnableScrolling = true;


    public ExtendedScrollView(@NonNull Context context) {
        super(context);
    }

    public ExtendedScrollView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ExtendedScrollView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        if (mEnableScrolling) {
            return super.onInterceptTouchEvent(ev);
        } else {
            return false;
        }
    }

    @SuppressLint("ClickableViewAccessibility")
    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        if (mEnableScrolling) {
            return super.onTouchEvent(ev);
        } else {
            return false;
        }
    }


    public Boolean isScrollEnabled() {
        return mEnableScrolling;
    }

    public void setEnableScrolling(Boolean value) {
        mEnableScrolling = value;
    }
}
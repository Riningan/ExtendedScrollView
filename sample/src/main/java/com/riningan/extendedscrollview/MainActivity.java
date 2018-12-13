package com.riningan.extendedscrollview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.riningan.widget.ExtendedScrollView;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ExtendedScrollView esv = findViewById(R.id.esv);
        final Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (esv.isScrollEnabled()) {
                    esv.setScrollEnabled(false);
                    btn.setText(R.string.unlock);
                } else {
                    esv.setScrollEnabled(true);
                    btn.setText(R.string.lock);
                }
            }
        });
    }
}

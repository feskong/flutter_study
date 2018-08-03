package com.jzhu.flutterstudy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import io.flutter.plugin.common.EventChannel;

public class OneActivity extends Activity implements View.OnClickListener,EventChannel.StreamHandler {

    private Button mGoFlutterBtn;

    private EventChannel.StreamHandler mStreamHandler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_one);

        mGoFlutterBtn = findViewById(R.id.go_flutter);

        mGoFlutterBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.go_flutter:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
        }
    }

    @Override
    public void onListen(Object o, EventChannel.EventSink eventSink) {

    }

    @Override
    public void onCancel(Object o) {

    }
}

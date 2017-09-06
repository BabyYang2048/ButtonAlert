package com.example.babyyang.buttonalert;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bn = (Button) findViewById(R.id.buttonOk);
        bn.setOnClickListener(new MyClickListener());
    }

    // 定义一个单击事件的监听器
    class MyClickListener implements View.OnClickListener{
        // 实现监听器类必须实现的方法，该方法将会作为事件处理器
        public void onClick(View v){
            TextView txt = (TextView) findViewById(R.id.txt);
            txt.setText("bn按钮被单击了！");
        }
    }
}



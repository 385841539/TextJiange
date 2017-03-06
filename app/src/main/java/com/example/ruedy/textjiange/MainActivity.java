package com.example.ruedy.textjiange;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView tv;
    private String s;
    private int length;
    int n = 0;
    private int nn;
    private JiangeUtil jiangeUtil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = ((TextView) findViewById(R.id.tv));
        s = "与我为敌，就到这般生不如死";
        jiangeUtil = new JiangeUtil(tv, s, 1000);//调用构造方法，直接开启

    }

}

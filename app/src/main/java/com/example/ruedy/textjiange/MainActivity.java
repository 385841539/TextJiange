package com.example.ruedy.textjiange;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView tv;
    private String s;
    private int length;
    int n = 0;
    private int nn;
    private JiangeUtil jiangeUtil;
    private View bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = ((TextView) findViewById(R.id.tv));
        bt = findViewById(R.id.bt);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n = 0;

                jiangeUtil.startTv(n);
            }
        });
        s = "与我为敌，就到这般生不如死--周瑜\n从善从良，从五斗米道--张鲁";
        jiangeUtil = new JiangeUtil(tv, s, 100);//调用构造方法，直接开启

    }

}

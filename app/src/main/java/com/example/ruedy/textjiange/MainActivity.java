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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = ((TextView) findViewById(R.id.tv));
        s = "与我为敌，就到这般生不如死";
        length = s.length();
        startTv(n);
    }

    private void startTv(final int n) {

        new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        try {
                            final String stv = s.substring(0, n);

                            tv.post(new Runnable() {
                                @Override
                                public void run() {
                                    tv.setText(stv);
                                }
                            });
                            Thread.sleep(1000);
                            nn = n + 1;
                            if (nn <= length) {
                                startTv(nn);
                            }

                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }


                    }
                }

        ).start();


    }
}

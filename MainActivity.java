package com.example.tcs.font;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    TextView t ;
    Button bfc,bbc,bfs;
    int fc = 1,bc = 1;
    float fs = 1;
    RelativeLayout r1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t = (TextView) findViewById(R.id.editText);
        bfc = (Button) findViewById(R.id.btnFontColor);
        bbc = (Button) findViewById(R.id.btnBgColor);
        bfs = (Button) findViewById(R.id.btnFontSize);
        r1 = (RelativeLayout) findViewById(R.id.r1);

        bfs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setTextSize(fs);
                fs = (fs+5) % 50 ;
            }
        });
        bbc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch(bc%3){
                    case 1:
                        r1.setBackgroundColor(Color.BLUE);
                        break;
                    case 2:
                        r1.setBackgroundColor(Color.GREEN);
                        break;
                    case 3:
                        r1.setBackgroundColor(Color.GRAY);
                        break;

                    case 4:
                        r1.setBackgroundColor(Color.RED);
                        break;
                    default:
                        r1.setBackgroundColor(Color.CYAN);
                        break;

                }
                bc++;

            }
        });
        bfc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch(fc){
                    case 1 :
                        t.setTextColor(Color.RED);
                        break;
                    case 2 :
                        t.setTextColor(Color.BLUE);
                        break;
                    case 3 :
                        t.setTextColor(Color.GREEN);
                        break;
                    case 4 :
                        t.setTextColor(Color.CYAN);
                        break;
                    case 5 :
                        t.setTextColor(Color.MAGENTA);
                        break;
                }
                fc++;

            }
        });


    }
}

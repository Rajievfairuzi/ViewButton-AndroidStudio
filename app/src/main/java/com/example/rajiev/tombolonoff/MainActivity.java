package com.example.rajiev.tombolonoff;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton toggle1, toggle2,toggle3,toggle4,toggle5,toggle6,toggle7,toggle8,toggle9,toggle10;
    TextView txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8,txt9,txt10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toggle1 =(ToggleButton)findViewById(R.id.tgBtn1);
        txt1 = (TextView)findViewById(R.id.textView1);

        toggle1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //ketika melakukan klik pada tombol akan berubah warna
                if(toggle1.isChecked()){
                    txt1.setText("lampu 1 hidup");
                    txt1.setBackgroundDrawable(getResources().getDrawable(R.color.colorPrimaryDark));
                    toggle1.setBackgroundDrawable(getResources().getDrawable(R.color.colorPrimary));
                }else{
                    txt1.setText("lampu 1 mati");
                    txt1.setBackgroundDrawable(getResources().getDrawable(R.color.colorBitterSweet));
                    toggle1.setBackgroundDrawable(getResources().getDrawable(R.color.colorBitterSweetDark));
                }
            }
        });

        toggle2 =(ToggleButton)findViewById(R.id.tgBtn2);
        txt2 = (TextView)findViewById(R.id.textView2);

        toggle2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //ketika melakukan klik pada tombol akan berubah warna
                if(toggle2.isChecked()){
                    txt2.setText("lampu 2 hidup");
                    txt2.setBackgroundDrawable(getResources().getDrawable(R.color.colorPrimaryDark));
                    toggle2.setBackgroundDrawable(getResources().getDrawable(R.color.colorPrimary));
                }else{
                    txt2.setText("lampu 2 mati");
                    txt2.setBackgroundDrawable(getResources().getDrawable(R.color.colorBitterSweet));
                    toggle2.setBackgroundDrawable(getResources().getDrawable(R.color.colorBitterSweetDark));
                }
            }
        });

        toggle3 =(ToggleButton)findViewById(R.id.tgBtn3);
        txt3 = (TextView)findViewById(R.id.textView3);

        toggle3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //ketika melakukan klik pada tombol akan berubah warna
                if(toggle3.isChecked()){
                    txt3.setText("lampu 3 hidup");
                    txt3.setBackgroundDrawable(getResources().getDrawable(R.color.colorPrimaryDark));
                    toggle3.setBackgroundDrawable(getResources().getDrawable(R.color.colorPrimary));
                }else{
                    txt3.setText("lampu 3 mati");
                    txt3.setBackgroundDrawable(getResources().getDrawable(R.color.colorBitterSweet));
                    toggle3.setBackgroundDrawable(getResources().getDrawable(R.color.colorBitterSweetDark));
                }
            }
        });

        toggle4 =(ToggleButton)findViewById(R.id.tgBtn4);
        txt4 = (TextView)findViewById(R.id.textView4);

        toggle4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //ketika melakukan klik pada tombol akan berubah warna
                if(toggle4.isChecked()){
                    txt4.setText("lampu 4 hidup");
                    txt4.setBackgroundDrawable(getResources().getDrawable(R.color.colorPrimaryDark));
                    toggle4.setBackgroundDrawable(getResources().getDrawable(R.color.colorPrimary));
                }else{
                    txt4.setText("lampu 4 mati");
                    txt4.setBackgroundDrawable(getResources().getDrawable(R.color.colorBitterSweet));
                    toggle4.setBackgroundDrawable(getResources().getDrawable(R.color.colorBitterSweetDark));
                }
            }
        });

        toggle5 =(ToggleButton)findViewById(R.id.tgBtn5);
        txt5 = (TextView)findViewById(R.id.textView5);

        toggle5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //ketika melakukan klik pada tombol akan berubah warna
                if(toggle5.isChecked()){
                    txt5.setText("lampu 5 hidup");
                    txt5.setBackgroundDrawable(getResources().getDrawable(R.color.colorPrimaryDark));
                    toggle5.setBackgroundDrawable(getResources().getDrawable(R.color.colorPrimary));
                }else{
                    txt5.setText("lampu 5 mati");
                    txt5.setBackgroundDrawable(getResources().getDrawable(R.color.colorBitterSweet));
                    toggle5.setBackgroundDrawable(getResources().getDrawable(R.color.colorBitterSweetDark));
                }
            }
        });

        toggle6 =(ToggleButton)findViewById(R.id.tgBtn6);
        txt6 = (TextView)findViewById(R.id.textView6);

        toggle6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //ketika melakukan klik pada tombol akan berubah warna
                if(toggle6.isChecked()){
                    txt6.setText("lampu 6 hidup");
                    txt6.setBackgroundDrawable(getResources().getDrawable(R.color.colorPrimaryDark));
                    toggle6.setBackgroundDrawable(getResources().getDrawable(R.color.colorPrimary));
                }else{
                    txt6.setText("lampu 6 mati");
                    txt6.setBackgroundDrawable(getResources().getDrawable(R.color.colorBitterSweet));
                    toggle6.setBackgroundDrawable(getResources().getDrawable(R.color.colorBitterSweetDark));
                }
            }
        });

        toggle7 =(ToggleButton)findViewById(R.id.tgBtn7);
        txt7 = (TextView)findViewById(R.id.textView7);

        toggle7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //ketika melakukan klik pada tombol akan berubah warna
                if(toggle7.isChecked()){
                    txt7.setText("lampu 7 hidup");
                    txt7.setBackgroundDrawable(getResources().getDrawable(R.color.colorPrimaryDark));
                    toggle7.setBackgroundDrawable(getResources().getDrawable(R.color.colorPrimary));
                }else{
                    txt7.setText("lampu 7 mati");
                    txt7.setBackgroundDrawable(getResources().getDrawable(R.color.colorBitterSweet));
                    toggle7.setBackgroundDrawable(getResources().getDrawable(R.color.colorBitterSweetDark));
                }
            }
        });

        toggle8 =(ToggleButton)findViewById(R.id.tgBtn8);
        txt8 = (TextView)findViewById(R.id.textView8);

        toggle8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //ketika melakukan klik pada tombol akan berubah warna
                if(toggle8.isChecked()){
                    txt8.setText("lampu 8 hidup");
                    txt8.setBackgroundDrawable(getResources().getDrawable(R.color.colorPrimaryDark));
                    toggle8.setBackgroundDrawable(getResources().getDrawable(R.color.colorPrimary));
                }else{
                    txt8.setText("lampu 8 mati");
                    txt8.setBackgroundDrawable(getResources().getDrawable(R.color.colorBitterSweet));
                    toggle8.setBackgroundDrawable(getResources().getDrawable(R.color.colorBitterSweetDark));
                }
            }
        });

        toggle9 =(ToggleButton)findViewById(R.id.tgBtn9);
        txt9 = (TextView)findViewById(R.id.textView9);

        toggle9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //ketika melakukan klik pada tombol akan berubah warna
                if(toggle9.isChecked()){
                    txt9.setText("lampu 9 hidup");
                    txt9.setBackgroundDrawable(getResources().getDrawable(R.color.colorPrimaryDark));
                    toggle9.setBackgroundDrawable(getResources().getDrawable(R.color.colorPrimary));
                }else{
                    txt9.setText("lampu 9 mati");
                    txt9.setBackgroundDrawable(getResources().getDrawable(R.color.colorBitterSweet));
                    toggle9.setBackgroundDrawable(getResources().getDrawable(R.color.colorBitterSweetDark));
                }
            }
        });


    }
}

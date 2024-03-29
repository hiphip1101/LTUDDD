package com.example.myapplicationtuan1.tuan1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.myapplicationtuan1.R;

public class Tuan11MainActivity extends AppCompatActivity {
    //khai bao
    EditText txt1,txt2;
    Button Btn1;
    TextView Tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tuan11_main);
        //anh xa
        txt1=findViewById(R.id.demo11txt1);
        txt2=findViewById(R.id.demo11txt2);
        Btn1=findViewById(R.id.demo11Btn1);
        Tv1=findViewById((R.id.demo11Tv1));
        //xu ly
        Btn1.setOnClickListener(v->{
            TinhTong();
        });

    }
    private void TinhTong(){
        //Lay du lieu
        String str1=txt1.getText().toString();
        float so1=Float.parseFloat(str1);
        String str2=txt2.getText().toString();
        float so2=Float.parseFloat(str2);

        float tong=so1+so2;
        //In
        Tv1.setText(String.valueOf(tong));
    }

}

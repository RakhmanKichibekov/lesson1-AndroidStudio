package ru.mirea.kichibekov.lesson1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
//import com.bumptech.glide.Glide;


import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView text, textHello;
    CheckBox checkBox;
    ImageView imageView;
    int k = 0;

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.enter);
        text = findViewById(R.id.textEnter);
        textHello = findViewById(R.id.textHello);
        checkBox = findViewById(R.id.checkbox1);
        imageView = findViewById(R.id.image1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText("Вы нажали войти!");
                //checkBox.getAccessibilityClassName();
            }
        });
        checkBox.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                k += 1;
                if (k % 2 == 1) {
                    textHello.setText("Есть кредит");
                } else {
                    textHello.setText("Нет кредита");

                }
            }
        });
    }

    public void goSecond(View view) {
        Intent intent = new Intent(this, Second.class);
        startActivity(intent);
    }

    public void goBlog(View view) {
        Intent intent = new Intent(this, WebBlog.class);
        startActivity(intent);
    }

}
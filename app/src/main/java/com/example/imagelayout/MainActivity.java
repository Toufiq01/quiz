package com.example.imagelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String[] question = {"Male ??","Female??", "other??","Good Bye"};
    private boolean[] answer = {true,false,false};
    private int index = 0;
    private int score = 0;
    Button yes, no;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes = findViewById(R.id.yes);
        no = findViewById(R.id.no);
        textView = findViewById(R.id.textView);
        textView.setText(question[index]);

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index >= question.length-1){
                    Toast.makeText(MainActivity.this,"your score is "+ score, Toast.LENGTH_SHORT).show();
                }
                else if(answer[index]){
                    score++;
                    textView.setText(question[++index]);
                }
                else textView.setText(question[++index]);

            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index >= question.length-1){
                    Toast.makeText(MainActivity.this,"your score is "+ score, Toast.LENGTH_SHORT).show();
                }
                else if(!answer[index]){
                    score++;
                    textView.setText(question[++index]);
                }
                else textView.setText(question[++index]);

            }
        });
    }
}
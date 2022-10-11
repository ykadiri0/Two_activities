package com.example.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    private Button send;
    private EditText txtMessage;
    private String ex;
    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        String message = intent.getStringExtra("message");
        if(message==null){
           /* TextView textView = findViewById(R.id.text_message);
            textView.setText("no msg");*/
        }
        else{
            TextView textView = findViewById(R.id.text_message);
            textView.setText(message);
        }


        send = findViewById(R.id.button_main);
        txtMessage = findViewById(R.id.editText_main);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                Log.d(LOG_TAG, "Button Clicked !");
                String msg = txtMessage.getText().toString();
                intent.putExtra("message", msg);
                startActivity(intent);
        }
        });
    }

}
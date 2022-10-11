package com.example.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity2.class.getSimpleName();
    private Button send1;
    private EditText txtMessage1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String message = intent.getStringExtra("message");
        TextView textView = findViewById(R.id.text_message);
        textView.setText(message);
        send1 = findViewById(R.id.button_main2);
        txtMessage1 = findViewById(R.id.editText_main2);
        Log.d(LOG_TAG, String.valueOf(txtMessage1));
        send1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(LOG_TAG, "Button Clicked !");
                String msg = txtMessage1.getText().toString();

                Intent intent2 = new Intent(MainActivity2.this, MainActivity.class);
                intent2.putExtra("message", msg);
                startActivity(intent2);
            }
        });
    }
}
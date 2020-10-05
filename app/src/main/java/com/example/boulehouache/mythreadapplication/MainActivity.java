package com.example.boulehouache.mythreadapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String TAG="Service";
    Button btnBoucle;
    Button btnMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnBoucle = (Button) findViewById(R.id.btnBoucle);
        assert btnBoucle != null;
        btnBoucle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnBoucle.setBackgroundColor(Color.BLUE);
                Log.i(TAG, "onClick: Stop Service");
                    try{
                        Thread.sleep(10000);
                    }
                    catch(Exception e){

                    }
                btnBoucle.setBackgroundColor(Color.GREEN);
            }
        });
        btnMessage = (Button) findViewById(R.id.btnMessage);
        assert btnMessage != null;
        btnMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnMessage.setBackgroundColor(Color.BLUE);
                Log.i(TAG, "onClick: message");
                Toast toast = Toast.makeText(MainActivity.this, "I am a message", Toast.LENGTH_LONG);
                toast.show();
                btnMessage.setBackgroundColor(Color.GREEN);
            }
        });
    }
    @Override
    protected void onResume() {
        super.onResume();
    }
}

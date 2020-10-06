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
    Button btnLoop;
    Button btnMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLoop = (Button) findViewById(R.id.btnBoucle);
        assert btnLoop != null;
        btnMessage = (Button) findViewById(R.id.btnMessage);
        assert btnMessage != null;


        btnLoop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnLoop.setBackgroundColor(Color.GREEN);
                Log.i(TAG, "onClick: Stop Service");
                    try{
                        Thread.sleep(10000);
                    }
                    catch(Exception e){
                    }
                btnLoop.setBackgroundColor(Color.GRAY);
            }
        });

        btnMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG, "onClick: message");
                Toast toast = Toast.makeText(MainActivity.this, "I am a message", Toast.LENGTH_LONG);
                toast.show();
            }
        });
    }
    @Override
    protected void onResume() {
        super.onResume();
        try{Thread.sleep(10000);}
        catch(Exception e){     }
    }
}

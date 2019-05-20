package com.vuforia.engine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.vuforia.engine.CoreSamples.R;
import com.vuforia.engine.CoreSamples.app.CloudRecognition.CloudReco;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button mapButton = (Button)findViewById(R.id.map_button);

        mapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu.this, MapActivity.class);
                startActivity(intent);
            }
        });

        Button vuforia_button = (Button)findViewById(R.id.vuforia_button);

        vuforia_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu.this, CloudReco.class);
                startActivity(intent);
            }
        });


    }
}

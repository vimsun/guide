package com.vuforia.engine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.vuforia.engine.CoreSamples.R;
import com.vuforia.engine.CoreSamples.app.CloudRecognition.CloudReco;

public class MapActivity extends AppCompatActivity {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
    }

    public void ShowPic(View view){
        switch(view.getId()){
            case R.id.button10:
                newAct(10);
                break;
            case R.id.button3:
                newAct(3);
                break;
            case R.id.button4:
                newAct(4);
                break;
            case R.id.button5:
                newAct(5);
                break;
            case R.id.button6:
                newAct(6);
                break;
            case R.id.button7:
                newAct(7);
                break;
            case R.id.button8:
                newAct(8);
                break;
            case R.id.button9:
                newAct(9);
                break;
            case R.id.button15:
                newAct(15);
                break;
            case R.id.button20:
                newAct(20);
                break;

            case R.id.button12:
                newAct(12);
                break;

            default:
                break;
        }
    }

    private void newAct(int num){
        intent = new Intent(MapActivity.this, ShowPicture.class);
        intent.putExtra("buttonNumber", num);
        startActivity(intent);
    }

    public void back(View view){
        switch (view.getId()) {
            case R.id.exitButton:
                onBackPressed();
                break;
            default:
                break;
        }
    }

    @Override
    public void onBackPressed(){
        super.onBackPressed();
    }

}

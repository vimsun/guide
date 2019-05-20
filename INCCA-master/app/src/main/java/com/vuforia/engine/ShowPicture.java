package com.vuforia.engine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.vuforia.engine.CoreSamples.R;

public class ShowPicture extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_picture);int buttonNumber = getIntent().getIntExtra("buttonNumber", 3);
        ImageView picture = (ImageView)findViewById(R.id.myImage);
        TextView text = (TextView)findViewById(R.id.textView);
        switch (buttonNumber) {
            case 10:
                picture.setImageResource(R.drawable.photo10);
                text.setText("Административный корпус (Админ)");
                break;
            case 3:
                picture.setImageResource(R.drawable.photo3);
                text.setText("Институт Компьютерных Систем (ИКС)");
                break;
            case 4:
                picture.setImageResource(R.drawable.photo4);
                text.setText("Главный учебный корпус (ГУК)");
                break;
            case 5:
                picture.setImageResource(R.drawable.photo5);
                text.setText("Институт Медицинской Инженерии (ИМИ)");
                break;
            case 6:
                picture.setImageResource(R.drawable.photo6);
                text.setText("Институт информационной безопасности, радиоэлектроники и телекоммуникаций (ИИБРТ)");
                break;
            case 7:
                picture.setImageResource(R.drawable.photo7);
                text.setText("Химический корпус (Х)/ Институт энергетики и компьютерно-интегрированных систем управления (ИЕКСУ)");
                break;
            case 8:
                picture.setImageResource(R.drawable.photo8);
                text.setText("Институт Электромеханики и Энергоменеджмента (ИЕЕ)");
                break;
            case 9:
                picture.setImageResource(R.drawable.photo9);
                text.setText("Машиностроительный корпус");
                break;
            case 12:
                picture.setImageResource(R.drawable.photo12);
                text.setText("Институт автомобильного транспорта");
                break;
            case 15:
                picture.setImageResource(R.drawable.photo15);
                text.setText("Библиотека");
                break;
            case 20:
                picture.setImageResource(R.drawable.photo20);
                text.setText("Гуманитарный корпус (ГК)");
                break;

            default:
                break;
        }}


    public void back(View view){
        switch (view.getId()) {
            case R.id.okButton:
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

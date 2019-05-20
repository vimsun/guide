package com.vuforia.engine;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;

import com.vuforia.engine.CoreSamples.R;
import com.vuforia.engine.CoreSamples.app.CloudRecognition.CloudReco;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Inform extends AppCompatActivity {



    private ExpandableListView listView;
    private ExpandableListAdapter listAdapter;
    private List<String> listDataHeader;
    private HashMap<String, List<String>> listHashMap;
    private List<String> story1List = new ArrayList<>();
    private List<String> story2List = new ArrayList<>();
    private List<String> story3List = new ArrayList<>();
    private List<String> story4List = new ArrayList<>();
    private List<String> story5List = new ArrayList<>();
    private List<String> story6List = new ArrayList<>();
    private List<String> story7List = new ArrayList<>();
    private List<String> story8List = new ArrayList<>();
    private List<String> story9List = new ArrayList<>();
    private List<String> story10List = new ArrayList<>();

    @SuppressLint("ClickableViewAccessibility")
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        Button exitButton = (Button)findViewById(R.id.b_exit_1);

        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        Button menu_button = (Button)findViewById(R.id.to_menu_button);

        menu_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Inform.this, Menu.class);
                CloudReco.getInstance().finish();
                startActivity(intent);
            }
        });

        listView = findViewById(R.id.elv_list);

        int markerID = getIntent().getIntExtra("markerID", 1);
        initData(markerID);
        listAdapter = new ExpandableListAdapter(this,listDataHeader,listHashMap);
        listView.setAdapter(listAdapter);
    }

    private void clearData(){
        listDataHeader.clear();

        story1List.clear();
        story2List.clear();
        story3List.clear();
        story4List.clear();
        story5List.clear();
        story6List.clear();
        story7List.clear();
        story8List.clear();
        story9List.clear();
        story10List.clear();

        listHashMap.clear();
    }

    private void initData(int markerID){
        listDataHeader = new ArrayList<>();
        listHashMap = new HashMap<>();
        TextView header = (TextView)findViewById(R.id.tv_header);
        ImageView map = findViewById(R.id.iv_map);

        switch(markerID){
            case 1: /*Админ корпус*/
                clearData();

                header.setText("Административный корпус");
                map.setImageDrawable(getDrawable(R.drawable.map_admin));

                listDataHeader.add("1 этаж");

                story1List.add("Бухгалтерия");
                story1List.add("Архив");
                story1List.add("Столовая");
                story1List.add("Туалет(М)");

                listDataHeader.add("2 этаж");

                story2List.add("Проректорат");
                story2List.add("Туалет(Ж)");

                listDataHeader.add("3 этаж");

                story3List.add("Деканат УНИ");
                story3List.add("Отдел кадров сотрудников");
                story3List.add("Отдел кадров студентов");
                story3List.add("Научно-методический отдел");

                listDataHeader.add("4 этаж");

                story4List.add("Отдел организационной работы с иностранными студентами");
                story4List.add("Офис DAAD");
                story4List.add("Кафелра немецкого языка");
                story4List.add("Военно-мобилизационный отдел");

                listHashMap.put(listDataHeader.get(0),story1List);
                listHashMap.put(listDataHeader.get(1),story2List);
                listHashMap.put(listDataHeader.get(2),story3List);
                listHashMap.put(listDataHeader.get(3),story4List);
                break;

            case 2: /*ГУК*/
                clearData();

                header.setText("Главный учебный корпус");
                map.setImageDrawable(getDrawable(R.drawable.map_guk));

                listDataHeader.add("1 этаж");

                story1List.add("Приемная комиссия");
                story1List.add("Институт заочного образования");
                story1List.add("Кафедра нефтегазового и химического машиностроения");
                story1List.add("Кафедра прикладной экологии и гидрогазодинамики");
                story1List.add("Консультационный научный центр");
                story1List.add("Кафедра «Металлорезальные станки, метрология, сертификация»");
                story1List.add("Кафедра «Машиноведенье и детали машин»");
                story1List.add("Копи центр");
                story1List.add("Банкомат Альфа Банк");
                story1List.add("Банкомат ПриватБанк");

                listDataHeader.add("2 этаж");

                story2List.add("Институт промышленных технологий, дизайна и менеджмента");
                story2List.add("Деканат подготовительного отдела ОНПУ");
                story2List.add("Кафедра «Динамика, прочность машин и сопротивление материалов»");
                story2List.add("Кафедра высшей математики и моделирования систем");

                listDataHeader.add("3 этаж");

                story3List.add("Деканат УНИ");
                story3List.add("Институт машиностроения");
                story3List.add("Украинско-испанский институт");
                story3List.add("Кафедра менеджмента");
                story3List.add("Кафедра прикладной математики и информационных технологий");
                story3List.add("Кафедра учета, анализа и аудита");
                story3List.add("Кафедра экономической кибернетики и информационных технологий");
                story3List.add("Кафедра предпринимательства и торговли");
                story3List.add("Кафедра экономических систем и управления инновационным развитием");

                listDataHeader.add("4 этаж");

                story4List.add("Кафедра менеджмента, внешней экономики и инновационной деятельности");
                story4List.add("Кафедра маркетинга");
                story4List.add("Кафедра информатики и управления защитой информационных систем");

                listDataHeader.add("5 этаж");

                story5List.add("Кафедра экономики предприятий");
                story5List.add("Кафедра административного менеджмента и проблем рынка");
                story5List.add("Архив ИПТДМ");
                story5List.add("Кафедра информационных технологий проектирования в машиностроении");

                listHashMap.put(listDataHeader.get(0),story1List);
                listHashMap.put(listDataHeader.get(1),story2List);
                listHashMap.put(listDataHeader.get(2),story3List);
                listHashMap.put(listDataHeader.get(3),story4List);
                listHashMap.put(listDataHeader.get(4),story5List);
                break;

            case 3: /*ИЕЕ*/
                clearData();

                header.setText("Институт Электромеханики и Энергоменеджмента");
                map.setImageDrawable(getDrawable(R.drawable.map_iee));

                listDataHeader.add("1 этаж");

                story1List.add("Кафедра электромеханических систем с компьютерным управлением");
                story1List.add("Центр Schneider Elecric");
                story1List.add("Буфет");

                listDataHeader.add("2 этаж");

                story2List.add("-");

                listDataHeader.add("3 этаж");

                story3List.add("Кафедра электрических машин");

                listDataHeader.add("4 этаж");

                story4List.add("Кафедра электрических машин");
                story4List.add("Кафедра энергоменеджмента");
                story4List.add("Кафедра теоретических основ и общей электротехники");

                listHashMap.put(listDataHeader.get(0),story1List);
                listHashMap.put(listDataHeader.get(1),story2List);
                listHashMap.put(listDataHeader.get(2),story3List);
                listHashMap.put(listDataHeader.get(3),story4List);
                break;

            case 4: /*ИМИ*/
                clearData();

                header.setText("Институт Медицинской Инженерии");
                map.setImageDrawable(getDrawable(R.drawable.map_imi));

                listDataHeader.add("1 этаж");

                story1List.add("-");

                listDataHeader.add("2 этаж");

                story2List.add("Кафедра управления системами безопасности жизнедеятельности");
                story2List.add("Отдел технологий дистанционного обучения");
                story2List.add("Деканат ИМИ»");

                listDataHeader.add("3 этаж");

                story3List.add("Отдел технологий дистанционного обучения");

                listDataHeader.add("4 этаж");

                story4List.add("Кафедра физики");

                listDataHeader.add("5 этаж");

                story5List.add("Кафедра физики");

                listHashMap.put(listDataHeader.get(0),story1List);
                listHashMap.put(listDataHeader.get(1),story2List);
                listHashMap.put(listDataHeader.get(2),story3List);
                listHashMap.put(listDataHeader.get(3),story4List);
                listHashMap.put(listDataHeader.get(4),story5List);
                break;

            case 5: /*ИКС*/
                clearData();

                header.setText("Институт Компьютерных Систем");
                map.setImageDrawable(getDrawable(R.drawable.map_iks));

                listDataHeader.add("1 этаж");

                story1List.add("Копи центр");
                story1List.add("Буфет");

                listDataHeader.add("2 этаж");

                story2List.add("Кафедра «Информационный технологии»");

                listDataHeader.add("3 этаж");

                story3List.add("-");

                listDataHeader.add("4 этаж");

                story4List.add("Деканат ИКС");
                story4List.add("Кафедра проектного обучения");
                story4List.add("StartUp School");

                listDataHeader.add("5 этаж");

                story5List.add("Кафедра «Компьютерные системы»");
                story5List.add("Центр партнерства с предприятиями");

                listDataHeader.add("6 этаж");

                story6List.add("Кафедра «Информационные системы»");
                story6List.add("NetCracker");
                story6List.add("INCCA");

                listDataHeader.add("7 этаж");

                story7List.add("Кафедра «Компьютерные системы управления»");

                listDataHeader.add("8 этаж");

                story8List.add("Кафедра системного программного обеспечения");
                story8List.add("Кафедра компьютерных интеллектуальных систем и сетей");

                listDataHeader.add("9 этаж");

                story9List.add("Кафедра компьютерных интеллектуальных систем и сетей");
                story9List.add("GAMELAB");
                story9List.add("Luxsoft");

                listDataHeader.add("10 этаж");

                story10List.add("Кафедра вычислительніх машин");

                listHashMap.put(listDataHeader.get(0),story1List);
                listHashMap.put(listDataHeader.get(1),story2List);
                listHashMap.put(listDataHeader.get(2),story3List);
                listHashMap.put(listDataHeader.get(3),story4List);
                listHashMap.put(listDataHeader.get(4),story5List);
                listHashMap.put(listDataHeader.get(5),story6List);
                listHashMap.put(listDataHeader.get(6),story7List);
                listHashMap.put(listDataHeader.get(7),story8List);
                listHashMap.put(listDataHeader.get(8),story9List);
                listHashMap.put(listDataHeader.get(9),story10List);
                break;

            case 6: /*12 Корпус*/
                clearData();

                header.setText("Институт Автомобильного Транспорта");
                map.setImageDrawable(getDrawable(R.drawable.map_auto));

                listDataHeader.add("1 этаж");

                story1List.add("Автошкола");

                listDataHeader.add("2 этаж");

                story2List.add("Кафедра автомобильного транспорта");

                listDataHeader.add("3 этаж");

                story3List.add("Методический кабинет центра «Надежность»");

                listDataHeader.add("4 этаж");

                story4List.add("Оплата немецкого языка");

                listHashMap.put(listDataHeader.get(0),story1List);
                listHashMap.put(listDataHeader.get(1),story2List);
                listHashMap.put(listDataHeader.get(2),story3List);
                listHashMap.put(listDataHeader.get(3),story4List);
                break;

            case 7: /*Библиотека*/
                clearData();

                header.setText("Библиотека");
                map.setImageDrawable(getDrawable(R.drawable.map_lib));

                listDataHeader.add("1 этаж");

                story1List.add("-");

                listDataHeader.add("2 этаж");

                story2List.add("Компьютерный зал");

                listDataHeader.add("3 этаж");

                story3List.add("Читательский зал общественно-экономической литературы");

                listDataHeader.add("4 этаж");

                story4List.add("Читательский зал технической литературы");
                story4List.add("Отдел хранения фондов");

                listHashMap.put(listDataHeader.get(0),story1List);
                listHashMap.put(listDataHeader.get(1),story2List);
                listHashMap.put(listDataHeader.get(2),story3List);
                listHashMap.put(listDataHeader.get(3),story4List);
                break;

            case 8: /*ИИБРТ*/
                clearData();

                header.setText("Институт информационной безопасности, радиоэлектроники и телекоммуникаций");
                map.setImageDrawable(getDrawable(R.drawable.map_iibrt));

                listDataHeader.add("1 этаж");

                story1List.add("Копи центр");
                story1List.add("Буфет");

                listDataHeader.add("2 этаж");

                story2List.add("Кафедра «Информационные технологии проектирования в электронике и телекоммуникациях»");

                listDataHeader.add("3 этаж");

                story3List.add("Карьера-центр ОНПУ");
                story3List.add("Деканат ИИБРТ");
                story3List.add("Центр интенсивной языковой подготовки иностранных граждан");
                story3List.add("Кафедра радиотехнических систем");

                listDataHeader.add("4 этаж");

                story4List.add("Кафедра электронных средств и информационно-компьютерных технологий");

                listDataHeader.add("5 этаж");

                story5List.add("Кафедра философии и методологии науки");
                story5List.add("Кафедра истории и этнографии Украины");
                story5List.add("Кафедра радиотехнических устройств");

                listHashMap.put(listDataHeader.get(0),story1List);
                listHashMap.put(listDataHeader.get(1),story2List);
                listHashMap.put(listDataHeader.get(2),story3List);
                listHashMap.put(listDataHeader.get(3),story4List);
                listHashMap.put(listDataHeader.get(4),story5List);
                break;

            case 9: /*Х/ИЕКСУ*/
                clearData();

                header.setText("Химический корпус / Институт энергетики и компьютерно-интегрированных систем управления");
                map.setImageDrawable(getDrawable(R.drawable.map_h_ieksu));

                listDataHeader.add("1 этаж");

                story1List.add("Копи центр");
                story1List.add("Буфет");
                story1List.add("Кафедра информационной деятельности и медиакоммуникаций");
                story1List.add("Кафедра культурологии, искусствоведенья и философии культуры");

                listDataHeader.add("2 этаж");

                story2List.add("Кафедра «Подъемно-транспортное и робототехническое оборудование»");
                story2List.add("Кафедра «Материаловеденье и технологии материалов»");

                listDataHeader.add("3 этаж");

                story3List.add("Институт энергетики и компьютерно-интегрированных систем управления");
                story3List.add("Кафедра «Технологии воды и топлива»");
                story3List.add("Кафедра теоретической, общей и нетрадиционной энергетики");

                listHashMap.put(listDataHeader.get(0),story1List);
                listHashMap.put(listDataHeader.get(1),story2List);
                listHashMap.put(listDataHeader.get(2),story3List);
                break;

            case 10: /*9 Корпус*/
                clearData();

                header.setText("Машиностроительный и Литейный корпус");
                map.setImageDrawable(getDrawable(R.drawable.map_machine));

                listDataHeader.add("1 этаж");

                story1List.add("Кафедра технологий и управления литейными процессами");
                story1List.add("Кафедра технологий машиностроения");

                listHashMap.put(listDataHeader.get(0),story1List);
                break;

            case 11: /*ГК*/
                clearData();

                header.setText("Гуманитарный корпус");
                map.setImageDrawable(getDrawable(R.drawable.map_gum));

                listDataHeader.add("1 этаж");

                story1List.add("Кафедра иностранных языков");

                listHashMap.put(listDataHeader.get(0),story1List);
                break;
        }
    }

    @Override
    public void onBackPressed(){
        super.onBackPressed();

    }
    }


package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView textView1, textView2, textView3, textView4, textView5, textView6, textView7, textView9, textView10, textView11, textView8;
    EditText editText, editText1, editText2, editText3, editText4;
    CheckBox checkBox, checkBox2;
    RadioButton radioButton1, radioButton2;
    Button button;
    ArrayList<String> lesson, lesson1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=(EditText)findViewById(R.id.editText);
        editText1=(EditText)findViewById(R.id.editText1);
        editText2=(EditText)findViewById(R.id.editText2);
        editText3=(EditText)findViewById(R.id.editText3);
        editText4=(EditText)findViewById(R.id.editText4);

        button=(Button)findViewById(R.id.button);

        textView1=(TextView)findViewById(R.id.textView1);
        textView2=(TextView)findViewById(R.id.textView2);
        textView3=(TextView)findViewById(R.id.textView3);
        textView4=(TextView)findViewById(R.id.textView4);
        textView5=(TextView)findViewById(R.id.textView5);
        textView6=(TextView)findViewById(R.id.textView6);
        textView7=(TextView)findViewById(R.id.textView7);
        textView8=(TextView)findViewById(R.id.textView8);
        textView9=(TextView)findViewById(R.id.textView9);
        textView10=(TextView)findViewById(R.id.textView10);
        textView11=(TextView)findViewById(R.id.textView11);

        checkBox=(CheckBox)findViewById(R.id.checkBox);
        checkBox2=(CheckBox)findViewById(R.id.checkBox2);

        radioButton1=(RadioButton)findViewById(R.id.radioButton1);
        radioButton2=(RadioButton)findViewById(R.id.radioButton2);

        lesson = new ArrayList<String>();
        lesson1 = new ArrayList<String>();

        radioButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBox.isChecked()) lesson.add("Эрэгтэй");
                else lesson.remove("Эрэгтэй");
            }
        });

        radioButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBox.isChecked()) lesson.add("Эмэгтэй");
                else lesson.remove("Эмэгтэй");
            }
        });

        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBox.isChecked()) lesson.add("IB");
                else lesson1.remove("IB");
            }
        });

        checkBox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBox.isChecked()) lesson.add("IC");
                else lesson1.remove("IC");
            }
        });


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringBuilder sb1 = new StringBuilder();
                for (String txt : lesson);


                StringBuilder sb2 = new StringBuilder();
                for (String txt : lesson);

                textView10.setText("Хүйс:" + sb1.toString());
                textView11.setText("Тэнхим:" +sb2.toString());


                String name0=editText.getText().toString();
                String name1=editText1.getText().toString();
                String name2=editText2.getText().toString();
                String name3=editText3.getText().toString();
                String name4=editText4.getText().toString();


                textView8.setText("Таний мэдээллийг амжилттай бүртгэлээ");
                textView9.setText(" " +name0 +"," +name1 +"," +name2 +","+name3 +"," +name4);


            }
        });
    }
}
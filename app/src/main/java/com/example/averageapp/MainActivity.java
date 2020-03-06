package com.example.averageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private TextView label_approve;


    private EditText field_note1, field_note2, field_note3;

    private double note1, note2, note3, average;

    private String text_approve;

    private Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        label_approve = findViewById(R.id.label_approbe);

        field_note1 = findViewById(R.id.field_note1);
        field_note2 = findViewById(R.id.field_note2);
        field_note3 = findViewById(R.id.field_note3);


        toast = Toast.makeText(this, "Por favor ingrese todas las notas.", 0);
        toast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 580);
    }

    public void calculate(View view){
        if (!String.valueOf(field_note1.getText()).equals("") && !String.valueOf(field_note2.getText()).equals("") && !String.valueOf(field_note3.getText()).equals("")){

            note1 = Double.parseDouble(String.valueOf(field_note1.getText()));
            note2 = Double.parseDouble(String.valueOf(field_note2.getText()));
            note3 = Double.parseDouble(String.valueOf((field_note3.getText())));

            average = (note1 * 0.3) + (note2 * 0.3) + (note3 * 0.4);

            if (average > 3){
                text_approve = "Usted aprobó con una calificación de: " + average;
            }else{
                text_approve = "Usted reprobó con una calificación de: " + average;
            }

            label_approve.setText(text_approve);

        }else{
            toast.show();
        }
    }
}

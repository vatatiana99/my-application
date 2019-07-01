package com.example.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner myspinner1 = (Spinner)findViewById(R.id.spinner1);

        ArrayAdapter<String> myadapter1= new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.States));
        myadapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        myspinner1.setAdapter(myadapter1);

        Spinner myspinner2 = (Spinner)findViewById(R.id.spinner2);

        ArrayAdapter<String> myadapter2= new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.Gender));
        myadapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        myspinner2.setAdapter(myadapter2);

        Spinner myspinner3 = (Spinner)findViewById(R.id.spinner3);

        ArrayAdapter<String> myadapter3= new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.Upholstery));
        myadapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        myspinner2.setAdapter(myadapter2);

        Spinner myspinner4 = (Spinner)findViewById(R.id.spinner4);

        ArrayAdapter<String> myadapter4= new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.Home_Office));
        myadapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        myspinner2.setAdapter(myadapter2);

        Spinner myspinne5 = (Spinner)findViewById(R.id.spinner5);

        ArrayAdapter<String> myadapter5= new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.Room_Packages));
        myadapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        myspinner2.setAdapter(myadapter2);

        Spinner myspinner6 = (Spinner)findViewById(R.id.spinner6);

        ArrayAdapter<String> myadapter6= new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.Matress));
        myadapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        myspinner2.setAdapter(myadapter2);

        Spinner myspinner7 = (Spinner)findViewById(R.id.spinner7);

        ArrayAdapter<String> myadapter7= new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.Bedroom));
        myadapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        myspinner2.setAdapter(myadapter2);

        Spinner myspinner8 = (Spinner)findViewById(R.id.spinner8);

        ArrayAdapter<String> myadapter8= new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.Occasional));
        myadapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        myspinner2.setAdapter(myadapter2);

        Spinner myspinner9 = (Spinner)findViewById(R.id.spinner9);

        ArrayAdapter<String> myadapter9= new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.Dinning));
        myadapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        myspinner2.setAdapter(myadapter2);

        Spinner myspinner10 = (Spinner)findViewById(R.id.spinner10);

        ArrayAdapter<String> myadapter10= new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.Miscelaneous);
        myadapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        myspinner2.setAdapter(myadapter2);
    }
}
    }
    }
}

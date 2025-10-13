package com.example.arrayadapter;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.arrayadapter.Apple;
import com.example.arrayadapter.Banana;
import com.example.arrayadapter.Kiwi;
import com.example.arrayadapter.Orange;

public class MainActivity extends AppCompatActivity {
    String fruitlist []={"Apple","Banana","Kiwi","Orange"};
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView) findViewById(R.id.list);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,R.layout.activity_main2,R.id.list,fruitlist);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
                Log.i("ListView","Item is clicked @position" +position);
                if(position==0)
                {
                    startActivity(new Intent(MainActivity.this, Apple.class));

                }
                else if(position==1)
                {
                    startActivity(new Intent(MainActivity.this, Banana.class));

                }
                else if(position==2)
                {
                    startActivity(new Intent(MainActivity.this, Kiwi.class));

                }
                else if(position==3)
                {
                    startActivity(new Intent(MainActivity.this, Orange.class));

                }

            }
        });
    }
}

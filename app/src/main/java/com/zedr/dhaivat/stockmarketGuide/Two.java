package com.zedr.dhaivat.stockmarketGuide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Two extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        final Context ctx = this;
        String law[] = {"Savings & Investing","Financial Planning",
                "Factors Affecting Share Prices In India",
                "Equity Systematic Investment Plan (Equity SIP)",
                "Foreign Exchange","Risk Management",
                "Portfolio Management","Income Tax on Share Trading"};

        listView = findViewById(R.id.list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.designtwo, R.id.txt, law);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                int poisitonofitem = position;
                String itemvalue = (String) listView.getItemAtPosition(position);

                Toast.makeText(getApplicationContext(), itemvalue , Toast.LENGTH_LONG).show();

                Intent i = new Intent(ctx, detailtwo.class);
                i.putExtra("position", position);
                startActivity(i);
            }
        });

    }
}

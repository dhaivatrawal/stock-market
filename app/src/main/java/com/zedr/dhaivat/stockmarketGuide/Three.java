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

public class Three extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        final Context ctx = this;
        String law[] = {"Equity & Equity Derivative","Option Strategies","Currency Derivative","Interest Rate Futures","Bond Market","Mutual funds","Exchange Traded Funds","Fundamental Analysis","Technical Analysis","Importance of Diwali and investment"};

        listView = findViewById(R.id.list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.designthree, R.id.txt, law);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                int poisitonofitem = position;
                String itemvalue = (String) listView.getItemAtPosition(position);

                Toast.makeText(getApplicationContext(), itemvalue , Toast.LENGTH_LONG).show();

                Intent i = new Intent(ctx, detailthree.class);
                i.putExtra("position", position);
                startActivity(i);
            }
        });

    }
}

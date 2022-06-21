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

public class One extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        final Context ctx = this;
        String law[] = {"Why Should One Invest?","IPO and FPO – Know the Difference Between IPO & FPO","What is preference share & types of preference shares?",
                "Stock Quotations and their meaning","How to read stock charts for beginners?","What is a stock market crash?","How to invest in stock market with little money?",
                "What is Pre market trading?","12 Factors Affecting Gold Prices","What Is Hedging In Stock Market","How to Open Demat Account Online ?",
                "Face Value of Share - What is the face value in share market?","Bonds vs Stocks","Stop Loss","Capital Market and Its Types","Stock Market Index","Sustainable growth",
                "ROC and ROCE","Effect of inflation on investment","Share Market Timings","ROCE","How to Develop a Stock Investor Mindset?","Inflation Meaning","What are Shares and Types of Shares ?",
                "Top Line Vs Bottom Line","How to Trade in Commodities?","Nifty Meaning","Types of Commodity Market",
                "Intraday Trading – Basics of Day Trading","Intraday Trading Tips","What is MCX Trading ?","Difference Between SIP vs Mutual Funds",
                "Call Option and Put Option","IPO Meaning in Share Market"};

        listView = findViewById(R.id.list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.design, R.id.txt, law);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                int poisitonofitem = position;
                String itemvalue = (String) listView.getItemAtPosition(position);

                Toast.makeText(getApplicationContext(), itemvalue , Toast.LENGTH_LONG).show();

                Intent i = new Intent(ctx, detail.class);
                i.putExtra("position", position);
                startActivity(i);
            }
        });

    }
}

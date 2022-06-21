package com.zedr.dhaivat.stockmarketGuide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class detailtwo extends AppCompatActivity {
    TextView txt;
    final Context ctx = this;
    int position = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailtwo);
        txt = findViewById(R.id.txt);

        Intent intent = getIntent();
        position = this.getIntent().getExtras().getInt("position");

        String filecontain = new String();

        if(position == 0 )
            filecontain = Readfilefromapp(R.raw.b1);
        else if(position == 1)
            filecontain = Readfilefromapp(R.raw.b2);
        else if(position == 2)
            filecontain = Readfilefromapp(R.raw.b3);
        else if(position == 3)
            filecontain = Readfilefromapp(R.raw.b4);
        else if(position == 4)
            filecontain = Readfilefromapp(R.raw.b5);
        else if(position == 5)
            filecontain = Readfilefromapp(R.raw.b6);
        else if(position == 6)
            filecontain = Readfilefromapp(R.raw.b7);
        else if(position == 7)
            filecontain = Readfilefromapp(R.raw.b8);

        else
            filecontain = "Data Not Avaliable, Please again try Later !";
        txt.setText(filecontain);


    }
    private String Readfilefromapp(int FieldId)
    {
        Resources r1 = ctx.getResources();
        InputStream is = r1.openRawResource(FieldId);
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        StringBuffer content = new StringBuffer(8192);
        String Line = new String();
        try{

            while ((Line = br.readLine()) != null)
                content.append(Line + "\n");

        }catch (IOException e ){
            content.append("File cannot be read");
            Toast.makeText(ctx, "File Read Error" +
                    e.getMessage(),Toast.LENGTH_LONG).show();

        }
        return content.toString();
    }
}

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

public class detailthree extends AppCompatActivity {
    TextView txt;
    final Context ctx = this;
    int position = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailthree);
        txt = findViewById(R.id.txt);

        Intent intent = getIntent();
        position = this.getIntent().getExtras().getInt("position");

        String filecontain = new String();

        if(position == 0 )
            filecontain = Readfilefromapp(R.raw.c1);
        else if(position == 1)
            filecontain = Readfilefromapp(R.raw.c2);
        else if(position == 2)
            filecontain = Readfilefromapp(R.raw.c3);
        else if(position == 3)
            filecontain = Readfilefromapp(R.raw.c4);
        else if(position == 4)
            filecontain = Readfilefromapp(R.raw.c5);
        else if(position == 5)
            filecontain = Readfilefromapp(R.raw.c6);
        else if(position == 6)
            filecontain = Readfilefromapp(R.raw.c7);
        else if(position == 7)
            filecontain = Readfilefromapp(R.raw.c8);
        else if(position == 8)
            filecontain = Readfilefromapp(R.raw.c9);
        else if(position == 9)
            filecontain = Readfilefromapp(R.raw.c10);



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

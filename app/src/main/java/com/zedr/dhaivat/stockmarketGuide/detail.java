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

public class detail extends AppCompatActivity {
    TextView txt;
    final Context ctx = this;
    int position = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        txt = findViewById(R.id.txt);

        Intent intent = getIntent();
        position = this.getIntent().getExtras().getInt("position");

        String filecontain = new String();

        if(position == 0 )
            filecontain = Readfilefromapp(R.raw.a1);
        else if(position == 1)
            filecontain = Readfilefromapp(R.raw.a2);
        else if(position == 2)
            filecontain = Readfilefromapp(R.raw.a3);
        else if(position == 3)
            filecontain = Readfilefromapp(R.raw.a4);
        else if(position == 4)
            filecontain = Readfilefromapp(R.raw.a5);
        else if(position == 5)
            filecontain = Readfilefromapp(R.raw.a6);
        else if(position == 6)
            filecontain = Readfilefromapp(R.raw.a7);
        else if(position == 7)
            filecontain = Readfilefromapp(R.raw.a8);
        else if(position == 8)
            filecontain = Readfilefromapp(R.raw.a9);
        else if(position == 9)
            filecontain = Readfilefromapp(R.raw.a10);
        else if(position == 10)
            filecontain = Readfilefromapp(R.raw.a11);
        else if(position == 11)
            filecontain = Readfilefromapp(R.raw.a12);
        else if(position == 12)
            filecontain = Readfilefromapp(R.raw.a13);
        else if(position == 13)
            filecontain = Readfilefromapp(R.raw.a14);
        else if(position == 14)
            filecontain = Readfilefromapp(R.raw.a15);
        else if(position == 15)
            filecontain = Readfilefromapp(R.raw.a16);
        else if(position == 16)
            filecontain = Readfilefromapp(R.raw.a17);
        else if(position == 17)
            filecontain = Readfilefromapp(R.raw.a18);
        else if(position == 18)
            filecontain = Readfilefromapp(R.raw.a19);
        else if(position == 19)
            filecontain = Readfilefromapp(R.raw.a20);
        else if(position == 20)
            filecontain = Readfilefromapp(R.raw.a21);
        else if(position == 21)
            filecontain = Readfilefromapp(R.raw.a22);
        else if(position == 22)
            filecontain = Readfilefromapp(R.raw.a23);
        else if(position == 23)
            filecontain = Readfilefromapp(R.raw.a24);
        else if(position == 24)
            filecontain = Readfilefromapp(R.raw.a25);
        else if(position == 25)
            filecontain = Readfilefromapp(R.raw.a26);
        else if(position == 26)
            filecontain = Readfilefromapp(R.raw.a27);
        else if(position == 27)
            filecontain = Readfilefromapp(R.raw.a28);
        else if(position == 28)
            filecontain = Readfilefromapp(R.raw.a29);
        else if(position == 29)
            filecontain = Readfilefromapp(R.raw.a30);
        else if(position == 30)
            filecontain = Readfilefromapp(R.raw.a31);
        else if(position == 31)
            filecontain = Readfilefromapp(R.raw.a32);
        else if(position == 32)
            filecontain = Readfilefromapp(R.raw.a33);
        else if(position == 33)
            filecontain = Readfilefromapp(R.raw.a34);

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

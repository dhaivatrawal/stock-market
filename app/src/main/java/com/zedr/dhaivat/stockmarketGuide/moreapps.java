package com.zedr.dhaivat.stockmarketGuide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class moreapps extends AppCompatActivity {

    LinearLayout developerpage,facebook,instagram,linkedin,apps;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moreapps);

        developerpage=findViewById(R.id.developerpage);
        facebook=findViewById(R.id.facebook);
        instagram=findViewById(R.id.instagram);
        linkedin=findViewById(R.id.linkedin);
        apps=findViewById(R.id.apps);

        developerpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/dev?id=8022783081923446757&hl=en" ));
                startActivity(myIntent);

            }
        });
        linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/dhaivat-rawal-1a8529151zzz" ));
                startActivity(myIntent);

            }
        });
        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/dhaivatrawal" ));
                startActivity(myIntent);

            }
        });
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/dhaivat.rawal.9" ));
                startActivity(myIntent);

            }
        });
        apps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/collection/cluster?clp=igM4ChkKEzgwMjI3ODMwODE5MjM0NDY3NTcQCBgDEhkKEzgwMjI3ODMwODE5MjM0NDY3NTcQCBgDGAA%3D:S:ANO1ljKP1O8&gsr=CjuKAzgKGQoTODAyMjc4MzA4MTkyMzQ0Njc1NxAIGAMSGQoTODAyMjc4MzA4MTkyMzQ0Njc1NxAIGAMYAA%3D%3D:S:ANO1ljLhPUE&hl=en" ));
                startActivity(myIntent);

            }
        });


        //WebView webView = (WebView)findViewById(R.id.webview);
        //webView.loadUrl("https://play.google.com/store/apps/dev?id=8022783081923446757&hl=en");
    }
}

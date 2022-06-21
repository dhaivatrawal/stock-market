package com.zedr.dhaivat.stockmarketGuide;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ScrollingActivity extends AppCompatActivity {
LinearLayout llone,lltwo,llthree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        llone=findViewById(R.id.llone);
        lltwo=findViewById(R.id.lltwo);
        llthree=findViewById(R.id.llthree);

        llone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),One.class);
                startActivity(intent);
            }
        });
        lltwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Two.class);
                startActivity(intent);
            }
        });
        llthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Three.class);
                startActivity(intent);
            }
        });




        if (!isconnected(ScrollingActivity.this)) building(ScrollingActivity.this).show();
        else
        {
            pauseScreen();
        }
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String play = "https://play.google.com/store/apps/collection/cluster?clp=igM4ChkKEzgwMjI3ODMwODE5MjM0NDY3NTcQCBgDEhkKEzgwMjI3ODMwODE5MjM0NDY3NTcQCBgDGAA%3D:S:ANO1ljKP1O8&gsr=CjuKAzgKGQoTODAyMjc4MzA4MTkyMzQ0Njc1NxAIGAMSGQoTODAyMjc4MzA4MTkyMzQ0Njc1NxAIGAMYAA%3D%3D:S:ANO1ljLhPUE&hl=en";
//                Intent isl =new Intent(Intent.ACTION_VIEW,Uri.parse(play));
//                startActivity(isl);
//            }
//        });
    }

    private void pauseScreen() {
    }

    public boolean isconnected(Context context)
    {
        ConnectivityManager cm=(ConnectivityManager) context.getSystemService(context.CONNECTIVITY_SERVICE);
        NetworkInfo netinfo= cm.getActiveNetworkInfo();

        if(netinfo !=null && netinfo.isConnectedOrConnecting())
        {
            android.net.NetworkInfo wifi=cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
            android.net.NetworkInfo mobile=cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);

            if((mobile != null && mobile.isConnectedOrConnecting()) || (wifi != null && wifi.isConnectedOrConnecting()))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else {
            return false;
        }
    }

    public AlertDialog.Builder building(Context c)
    {
        AlertDialog.Builder builder =new AlertDialog.Builder(c);
        builder.setCancelable(false);
        builder.setIcon(R.mipmap.ic_launcher);
        builder.setTitle("No Internet Connection");
        builder.setMessage("You need to have Mobile Data or Wifi to access this. Press OK to exit");

        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        return builder;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scrolling, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {

            final Dialog dialog = new Dialog(this);
            dialog.setContentView(R.layout.custom);

            // set the custom dialog components - text, image and button
            TextView title_law = (TextView) dialog.findViewById(R.id.title_law);
            title_law.setText("Stock Market - Begginer to Advance");
            TextView text = (TextView) dialog.findViewById(R.id.text);
            text.setText("This app is basically on Stock Market and its complete knowledge from Begginer to Intermediate to Advance and Different Strategies and techniques . A complete guide of Stock Market.");
            ImageView image = (ImageView) dialog.findViewById(R.id.image);
            image.setImageResource(R.mipmap.applogo);

            Button dialogButton = (Button) dialog.findViewById(R.id.dialogButtonOK);
            // if button is clicked, close the custom dialog
            dialogButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog.dismiss();
                }
            });

            dialog.show();


        }
        if (id == R.id.action_rate) {
            Intent a = new Intent(Intent.ACTION_SEND);
            final  String appPackageNAm = getApplicationContext().getPackageName();
            String strAppLink ="";
            try {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("market://details?id=" + appPackageNAm)));
            } catch (android.content.ActivityNotFoundException e) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://play.google.com/store/apps/details?id=" + appPackageNAm)));
            }
        }
        if (id == R.id.action_share) {
            Intent a = new Intent(Intent.ACTION_SEND);
            final  String appPackageNAme = getApplicationContext().getPackageName();
            String strAppLink ="";

            try
            {
                strAppLink = "http://play.google.com/store/apps/details?id=" + appPackageNAme;
            }
            catch (android.content.ActivityNotFoundException anfe)
            {
                strAppLink = "https:/play.google.com/store/apps/details?id=" + appPackageNAme;
            }
            a.setType("text/link");
            String sharebody = "This app is basically on Stock Market, Here you will learn Stock Market from Beginner to Intermediate to Advance. How to invest , When to invest, Where to invest, and Why to invest. Everything about the market and its movement and flow ."+ "\n " +
                    " Please Comment and Rate Us.\n " + "Download this Exclusive application and Share it." + "\n\n"+""+strAppLink;
            String sharesub = "APP NAME ";
            a.putExtra(Intent.EXTRA_SUBJECT,sharesub);
            a.putExtra(Intent.EXTRA_TEXT,sharebody);
            startActivity(Intent.createChooser(a,"Share Using"));
        }
        if (id == R.id.action_more) {
            Intent intent= new Intent(getApplicationContext(),moreapps.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onBackPressed() {
        AlertDialog.Builder ab = new AlertDialog.Builder(this);
        ab.setCancelable(false);
        ab.setMessage("Are You Sure Want To Exit ?");
        ab.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                int i = 50;
                System.exit(i);
            }

        });
        ab.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        ab.create();
        ab.show();

    }
}

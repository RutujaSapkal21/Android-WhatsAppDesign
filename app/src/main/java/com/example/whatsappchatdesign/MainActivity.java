package com.example.whatsappchatdesign;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    Toolbar toolbar;
    int[] profiles={R.drawable.dp,R.drawable.naira,R.drawable.ppp,R.drawable.sfds,
            R.drawable.kartik,R.drawable.ghghg,R.drawable.ppp,R.drawable.rashmika};
    String[] name={"Sanika","Naira","Sakshi","Nikita","Kartik","Sayali","Pragati","Shital"};
    String[] email={"Hi","GM","Hello","Hey!!","video","GN","****","photo"};
    int[] deletebtn={R.drawable.ic_baseline_done,R.drawable.ic_baseline_done_24,R.drawable.ic_baseline_done,R.drawable.ic_baseline_done_all_24,
            R.drawable.ic_baseline_videocam_24,R.drawable.ic_baseline_done_24,R.drawable.ic_baseline_done_all_24,R.drawable.ic_baseline_insert_photo_24};
    String[] time={"8:00pm","12:56pm","10:45am","7:29am","6:45am","Yesterday","03/04/2021","10/03/2021"};
    StudentAdaptor studentAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listview);
        studentAdapter=new StudentAdaptor(this,profiles,name,email,deletebtn,time);
        listView.setAdapter(studentAdapter);
        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.whatsappmenu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.newgrp:
                Toast.makeText(getApplicationContext(),"Clicked on New group",Toast.LENGTH_LONG).show();
                break;
            case  R.id.newbroadcast:
                Toast.makeText(getApplicationContext(),"Clicked on New Broadcast",Toast.LENGTH_LONG).show();
                break;
            case  R.id.web:
                Toast.makeText(getApplicationContext(),"Clicked on WhatsApp Web",Toast.LENGTH_LONG).show();
                break;
            case  R.id.payment:
                Toast.makeText(getApplicationContext(),"Clicked on Payments",Toast.LENGTH_LONG).show();
                break;
            case  R.id.search:
                Toast.makeText(getApplicationContext(),"Clicked on Search",Toast.LENGTH_LONG).show();
                break;
            case  R.id.msg:
                Toast.makeText(getApplicationContext(),"Clicked on Starred Message",Toast.LENGTH_LONG).show();
                break;
            case  R.id.setting:
                Toast.makeText(getApplicationContext(),"Clicked on Setting",Toast.LENGTH_LONG).show();
                break;
        }

        return true;
    }
}
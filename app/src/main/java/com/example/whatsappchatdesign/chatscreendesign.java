package com.example.whatsappchatdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class chatscreendesign extends AppCompatActivity {
    LinearLayout linearLayout, linearLayout2,linearLayout3;
    TextView name,msg,timee;
    ImageView arrow,profilee,camera,call,morever,mic,smile,pin;
    EditText type;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatscreendesign);
        linearLayout=findViewById(R.id.linearLayout);
        name=findViewById(R.id.namee);
        msg=findViewById(R.id.msgg);
        timee=findViewById(R.id.timeg);
        arrow=findViewById(R.id.arrow);
        profilee=findViewById(R.id.profilee);
        call=findViewById(R.id.call);
        camera=findViewById(R.id.videoo);
        morever=findViewById(R.id.morever) ;
        linearLayout2=findViewById(R.id.linear2);
        type=findViewById(R.id.typee);
        mic=findViewById(R.id.mic);
        smile=findViewById(R.id.smilee);
        pin=findViewById(R.id.pin);
        type=findViewById(R.id.typee);

        linearLayout3=findViewById(R.id.linear3);
        Intent intent=getIntent();

        String getname=intent.getStringExtra("username");
        String getmsg=intent.getStringExtra("email");
        String gettime=intent.getStringExtra("phone");
        int getprofile=intent.getIntExtra("10",1);

        name.setText(getname);
        msg.setText(getmsg);
        timee.setText(gettime);
        linearLayout2.setBackgroundResource(getprofile);
        profilee.setImageResource(getprofile);
        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(chatscreendesign.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
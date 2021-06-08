package com.example.whatsappchatdesign;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import de.hdodenhof.circleimageview.CircleImageView;

public class StudentAdaptor extends BaseAdapter
{
    Context mcontext;
    int [] profiles;
    String[] name;
    String [] email;
    int [] dltstd;
    String[] time;


    public StudentAdaptor(Context mcontext, int[] profiles, String[] name, String[] email, int[] dltstd, String[] time) {
        this.mcontext = mcontext;
        this.profiles = profiles;
        this.name = name;
        this.email = email;
        this.dltstd = dltstd;
        this.time = time;
    }

    @Override
    public int getCount() {
        return name.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View myview = null;
        if (myview==null){
            LayoutInflater layoutInflater=LayoutInflater.from(mcontext);
            myview=layoutInflater.inflate(R.layout.mycustomdesign,null);
        }
        else {
            myview = convertView;
        }
        CircleImageView circleImageView=myview.findViewById(R.id.profile);
        TextView textname=myview.findViewById(R.id.name);
        TextView textemail=myview.findViewById(R.id.msg);
        ImageView deletebtn=myview.findViewById(R.id.delete);
        TextView tme=myview.findViewById(R.id.time);


        circleImageView.setImageResource(profiles[position]);
        textname.setText(name[position]);
        textemail.setText(email[position]);
        deletebtn.setImageResource(dltstd[position]);
        tme.setText(time[position]);

        textname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mcontext,"You Clicked on "+textname.getText().toString(),Toast.LENGTH_LONG).show();
                Intent intent=new Intent(mcontext,chatscreendesign.class);
                intent.putExtra("username",textname.getText().toString());
                intent.putExtra("email",textemail.getText().toString());
                intent.putExtra("phone",tme.getText().toString());
                intent.putExtra("10",profiles[position]);
                mcontext.startActivity(intent);
            }
        });

        return myview;
    }

}


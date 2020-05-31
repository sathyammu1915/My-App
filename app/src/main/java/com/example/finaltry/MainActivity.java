package com.example.finaltry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity<Final> extends AppCompatActivity implements View.OnClickListener {
    EditText name,mob,addr;
    Button add;
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.name);
        mob=findViewById(R.id.mob);
        addr=findViewById(R.id.addr);
        add = findViewById(R.id.add);
        add.setOnClickListener(this);
        lv=findViewById(R.id.list1);
        // FirebaseDatabase.getInstance().getReference().child("ProgramingKnowledge").child("android").setValue("abcd");
        /*HashMap<String,Object>map=new HashMap<>();
        map.put("Name","Sathya");
        map.put("Age","25");
        map.put("Native","Singampunari");
        FirebaseDatabase.getInstance().getReference().child("ProgramingKnowledge2").child("MultipleValues2").updateChildren(map);*/


        final ArrayList<String> list=new ArrayList<>();
        final ArrayAdapter adapter=new ArrayAdapter<String>(this,R.layout.list_item,list);
       // final ArrayAdapter adapter;
       // adapter=new ArrayAdapter(this,R.layout.list_item);

        lv.setAdapter(adapter);
       // DatabaseReference reference=FirebaseDatabase.getInstance().getReference().child()
    }

    @Override
    public void onClick(View v) {
       /* String na = name.getText().toString();
        String mo=mob.getText().toString();
        String adr=addr.getText().toString();
        if (na.isEmpty()) {
            Toast.makeText(this, "No entered name", Toast.LENGTH_SHORT).show();
        } else {
           // FirebaseDatabase.getInstance().getReference().child("Edittxtdemo").child("First").setValue(na);
            HashMap<String,Object>map=new HashMap<>();
            map.put("Name",na);
            map.put("Mobile",mo);
            map.put("City",adr);
            FirebaseDatabase.getInstance().getReference().child("Details").push().setValue(map);
        }*/

        Intent i=new Intent(this,Examp.class);
        startActivity(i);
    }




}
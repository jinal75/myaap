package com.example.custom_list;

import androidx.annotation.NonNull;


import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView lv;
    private ChatAdapter chadap;
    String a = "Great! Then we'll meet with them...";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.list_1);

        ArrayList<Messages> arrayList = new ArrayList<>();

        arrayList.add(new Messages(R.drawable.p1,"Ashleigh Rodriguz",a, "2 hours ago"));
        arrayList.add(new Messages(R.drawable.p2,"Pricilla Gilligan",a, "9:12 am"));
        arrayList.add(new Messages(R.drawable.p3,"Gladys Haskell",a, "Yesterday"));
        arrayList.add(new Messages(R.drawable.p4,"Lissette Porta",a, "10/12/20"));
        arrayList.add(new Messages(R.drawable.p5,"Suzann Meares",a, "9/12/20"));
        arrayList.add(new Messages(R.drawable.p6,"Trudi Beardsley",a, "5/12/20"));
        arrayList.add(new Messages(R.drawable.p7,"Dana Brookes",a, "5/12/20"));
        arrayList.add(new Messages(R.drawable.p8,"Dustin Weatherby",a, "2/12/20"));
        arrayList.add(new Messages(R.drawable.p9,"Tenisha Milo",a, "29/11/20"));
        arrayList.add(new Messages(R.drawable.p10,"Tawny Jordan",a, "24/11/20"));


        chadap = new ChatAdapter(MainActivity.this,0,arrayList);
        lv.setAdapter(chadap);
    }
}
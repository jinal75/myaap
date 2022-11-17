package com.example.custom_list;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


public class ChatAdapter extends ArrayAdapter<Messages> {
    private Context context;
    private List<Messages> messagesList = new ArrayList<>();

    public ChatAdapter(@NonNull Context context, int resource,@NonNull List<Messages> objects) {
        super(context, 0, objects);
        this.context = context;
        this.messagesList = objects;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listitem = convertView;
        if(listitem==null)
            listitem = LayoutInflater.from(context).inflate(R.layout.custom_row_view,parent,false);

        Messages currentMessage = messagesList.get(position);

        ImageView image = (ImageView)listitem.findViewById(R.id.image_1);
        image.setImageResource(currentMessage.getmImageid());


        TextView name = (TextView) listitem.findViewById(R.id.text_1);
        name.setText(currentMessage.getMname());

        TextView release = (TextView) listitem.findViewById(R.id.text_2);
        release.setText(currentMessage.getmDescription());

        TextView release1 = (TextView) listitem.findViewById(R.id.text_3);
        release1.setText(currentMessage.getmTime());


        return listitem;
    }
}

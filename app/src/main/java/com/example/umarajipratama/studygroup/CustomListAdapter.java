package com.example.umarajipratama.studygroup;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Umar Aji Pratama on 27/11/2016.
 */

public class CustomListAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] itemname;
    private final Integer[] imgid;

    public CustomListAdapter(Activity context, String[] itemname, Integer[] imgid) {
        super(context,R.layout.my_list,itemname);

        this.context = context;
        this.itemname = itemname;
        this.imgid = imgid;
    }

    @NonNull
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.my_list,null,true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.item);
        ImageView imageview = (ImageView) rowView.findViewById(R.id.icon);
        TextView extratxt = (TextView) rowView.findViewById(R.id.textView1);

        txtTitle.setText(itemname[position]);
        imageview.setImageResource(imgid[position]);
        extratxt.setText("Description "  + itemname[position]);
        return rowView;
    }
}

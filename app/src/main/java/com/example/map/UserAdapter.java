package com.example.map;

import static java.security.AccessController.getContext;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;

import java.security.AccessController;
import java.util.ArrayList;
import java.util.List;

class CustomAdapter extends BaseAdapter {
    List<User> items;
//    List<LinearLayout>linearLayoutList;
Context context;
    TextView challenge;

    int resource;
    public CustomAdapter(List<User> items, @LayoutRes int resource) {
        super();
        this.items = items;
        this.resource=resource;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int i) {
        return items.get(i);
    }

    @Override
    public long getItemId(int i) {
        return items.get(i).hashCode();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
//        TextView textView = new TextView(viewGroup.getContext());
        view = LayoutInflater.from(viewGroup.getContext()).inflate(resource, viewGroup, false);
        User currentUser =(User)getItem(i);
        TextView challenge=(TextView) view.findViewById(R.id.challendID);
        TextView mumbers=(TextView) view.findViewById(R.id.mumbersId);
        ImageView image=(ImageView)view.findViewById(R.id.image) ;
image.setImageResource(currentUser.getImage());
challenge.setText(currentUser.getChallenge());
        mumbers.setText(currentUser.getMumbers());



//        textView.setText(items.get(i));
        return view;
    }
}
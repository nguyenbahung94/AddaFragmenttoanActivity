package com.example.adam.addafragmenttoanactivity;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adam on 6/10/2016.
 */
public class Fragment_one extends Fragment {
    ListView listView;
    ArrayAdapter<String>adapter;
    String [] version;
    List newlist=new ArrayList();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_one_layout,container,false);
        listView=(ListView)view.findViewById(R.id.list_view);
        version=getResources().getStringArray(R.array.androidversion);
        for (String items:version){
            newlist.add(items);
        }
        adapter=new ArrayAdapter<String>(getActivity(),R.layout.list_view_layout,R.id.row_item,newlist);
        listView.setAdapter(adapter);
        return view;
    }
}

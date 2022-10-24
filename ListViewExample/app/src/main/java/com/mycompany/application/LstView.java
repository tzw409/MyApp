package com.mycompany.application;

import android.app.Activity;
import android.os.Bundle;
import android.widget.SimpleAdapter;
import java.util.ArrayList;
import java.util.HashMap;

public class LstView extends Activity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
    }
    
    /*
    private void loadData(){


        ArrayList<HashMap<String,String>> arrayList = new ArrayList<>();

        for(int i = 0; i < titles.length; i++){

            HashMap<String,String> data = new HashMap<>();
            data.put("t",titles[i]);
            data.put("subt",subtitles[i]);
            arrayList.add(data);
        }

        String[] from = {"t","subt"};
        int[] to = {R.id.activity_list_itemTextView,R.id.activity_list_itemTextView1};

        SimpleAdapter adapter = new SimpleAdapter(this,arrayList,R.layout.activity_list_item,from,to);

        listview.setAdapter(adapter);

    }
    */
}

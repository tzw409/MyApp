package com.mycompany.application;
 
import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import android.widget.SimpleAdapter;

import android.widget.Toast;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity { 
     

    private String[] titles = {"Title","Title 1","Title 2"};
    private String[] subtitles = {"Sub Title","Sub Title 1","Sub Title 2"};
    private ListView listview;
    
    private TextView tv; 

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview = (ListView) findViewById(R.id.activity_mainListView);
        tv = (TextView) findViewById(R.id.activity_mainTextView);
        
    loadData();
        }
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
        
        }
/*don't forget to subscribe my YouTube channel for more Tutorial*/
/*

*/


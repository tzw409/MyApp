package com.mycompany.application;

import android.app.Activity;
import android.os.Bundle;
import android.widget.SimpleAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import android.widget.Toast;
import android.content.Context;

public class LstView extends Activity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        if (CheckInternet.isInternetOn(this)) {
            ShowMsg(this, "Connected Internet");
        }
        else {
            ShowMsg(this, "Not Connected Internet"); 
        }
    }
    
    private void ShowMsg(Context context, String msg){
        
        Toast.makeText(context.getApplicationContext(),msg,Toast.LENGTH_SHORT).show();
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

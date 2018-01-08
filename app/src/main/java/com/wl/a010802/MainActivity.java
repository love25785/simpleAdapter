package com.wl.a010802;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity
{

    ArrayList<Map<String,Object>> mylist=new ArrayList<>();
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv=(ListView)findViewById(R.id.ListView);
        HashMap<String,Object> m1=new HashMap<>(); //第二個引數改為Object ，因為可放String 可放int
        m1.put("city","台北");
        m1.put("code","02");
        m1.put("img",R.drawable.taipei);
        mylist.add(m1);

        HashMap<String,Object> m2=new HashMap<>();
        m2.put("city","台中");
        m2.put("code","04");
        m2.put("img",R.drawable.taichung);
        mylist.add(m2);

        HashMap<String,Object> m3=new HashMap<>();
        m3.put("city","台南");
        m3.put("code","06");
        m3.put("img",R.drawable.tainan);
        mylist.add(m3);

        HashMap<String,Object> m4=new HashMap<>();
        m4.put("city","高雄");
        m4.put("code","07");
        m4.put("img",R.drawable.kaoh);
        mylist.add(m4);

        //SimpleAdapter adapter=new SimpleAdapter(MainActivity.this,mylist,android.R.layout.simple_expandable_list_item_2,new String[]{"city","code"},new int[]{android.R.id.text1,android.R.id.text2});
        //SimpleAdapter要五個引數，第二個引數放 ArrayList data，第四個放字串陣列  放key的字串陣列，第五個放R的資源 是int 所以放int陣列
        //當然第二個引數和第五個引數可以放自己的layout和R資源↓  ex.先自建layout名稱取為myitem 裡面放兩個textview 取名為textView textView2 及一個imageView
        SimpleAdapter adapter=new SimpleAdapter(MainActivity.this,mylist,R.layout.myitem,new String[]{"city","code","img"},new int[]{R.id.textView,R.id.textView2,R.id.imageView});
        lv.setAdapter(adapter);
    }

}

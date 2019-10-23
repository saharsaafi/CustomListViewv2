package com.example.customlistview;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final ListView malisteviawperso;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        malisteviawperso=findViewById(R.id.listviewperso);
        ArrayList<HashMap<String,String>> listItem=new ArrayList<>();
HashMap<String, String>map;

        // word
map=new HashMap<>();
map.put("titre","word");
map.put("description","editeur de text");
map.put("img",String.valueOf(R.drawable.word));
listItem.add(map);
        SimpleAdapter adapter =new SimpleAdapter(this.getBaseContext(),listItem,
                R.layout.activity_list_item,new String[] {"img", "titre", "description"},
                new int[] {R.id.img, R.id.titre, R.id.description});
        malisteviawperso.setAdapter(adapter);
        //éxcle
        map=new HashMap<>();
        map.put("titre","excle");
        map.put("description","editeur de text");
        map.put("img",String.valueOf(R.drawable.excel));
        listItem.add(map);
        SimpleAdapter adapter2 =new SimpleAdapter(this.getBaseContext(),listItem,
                R.layout.activity_list_item,new String[] {"img", "titre", "description"},
                new int[] {R.id.img, R.id.titre, R.id.description});
        malisteviawperso.setAdapter(adapter2);

        map=new HashMap<>();
        map.put("titre","powerpoint");
        map.put("description","editeur de text");
        map.put("img",String.valueOf(R.drawable.powerpoint));
        listItem.add(map);
        SimpleAdapter adapter3 =new SimpleAdapter(this.getBaseContext(),listItem,
                R.layout.activity_list_item,new String[] {"img", "titre", "description"},
                new int[] {R.id.img, R.id.titre, R.id.description});
        malisteviawperso.setAdapter(adapter3);


        map=new HashMap<>();
        map.put("titre","outlook");
        map.put("description","editeur de text");
        map.put("img",String.valueOf(R.drawable.outlook));
        listItem.add(map);
        SimpleAdapter adapter4 =new SimpleAdapter(this.getBaseContext(),listItem,
                R.layout.activity_list_item,new String[] {"img", "titre", "description"},
                new int[] {R.id.img, R.id.titre, R.id.description});
        malisteviawperso.setAdapter(adapter4);

        malisteviawperso.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                HashMap<String, String> map = (HashMap<String, String>) malisteviawperso.getItemAtPosition(position);
                Toast.makeText(MainActivity.this, map.get("titre"), Toast.LENGTH_SHORT).show();
            }
        });

        malisteviawperso.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id)
            {
                HashMap<String, String> map =(HashMap)malisteviawperso.getItemAtPosition(position);
                AlertDialog.Builder add=new AlertDialog.Builder(MainActivity.this);
                add.setTitle("selection item");
                add.setMessage("votre choix: "+ map.get(position)+ add.setPositiveButton("12",null));
                add.show();
                return true;
            }
        });
}
}

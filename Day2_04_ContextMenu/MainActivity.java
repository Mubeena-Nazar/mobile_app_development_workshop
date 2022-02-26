package com.example.day2_missvannappol;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btnshow);
        registerForContextMenu(btn);
    }

    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){
        super.onCreateContextMenu(menu,v,menuInfo);
        menu.setHeaderTitle("Context Menu");
        menu.add(0,v.getId(),0,"upload");
        menu.add(0,v.getId(),0,"search");
        menu.add(0,v.getId(),0,"share");
        menu.add(0,v.getId(),0,"bookmark");
        menu.add(0,v.getId(),0,"print");

        }
        public boolean onContextItemSelected(MenuItem item) {
            Toast.makeText(this, "Selected Item " + item.getTitle(), Toast.LENGTH_SHORT).show();
            return true;

        }
}
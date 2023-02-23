package com.example.menu;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txt =findViewById(R.id.contextmenu);
        registerForContextMenu(txt);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.contextmenu,menu);

    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        Intent intent = new Intent(MainActivity.this,OptionMenu.class);
        if(item.getItemId() == R.id.context1)
        {
            intent.putExtra("optionmenu","Con ga con");
            startActivity(intent);
        }else {
            intent.putExtra("optionmenu","Context Menu item 2");
            startActivity(intent);
        }
        return super.onContextItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent intent = new Intent(MainActivity.this,OptionMenu.class);
        if(item.getItemId() == R.id.item1)
        {
            intent.putExtra("optionmenu","Option Menu item 1");
            startActivity(intent);
        }else {
            intent.putExtra("optionmenu","Option Menu item 2");
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
    public void ShowPopup(View view)
    {
        PopupMenu popup = new PopupMenu(this, view);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup);
        popup.show();
    }


    @Override
    public boolean onMenuItemClick(@NonNull MenuItem menuItem) {
        Intent intent = new Intent(this,Popupmenu.class);
        if(menuItem.getItemId()==R.id.popup_item1)
        {
            intent.putExtra("popup","item 1");
            startActivity(intent);
        }
        else {
            intent.putExtra("popup","item 2");
            startActivity(intent);
        }
        return true;
    }
}
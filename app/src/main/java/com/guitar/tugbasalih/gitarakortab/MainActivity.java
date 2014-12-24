package com.guitar.tugbasalih.gitarakortab;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {

    String value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button  tabAraButton    =   (Button)    findViewById(R.id.tabSearchButton);
        Button  akorAraButton   =   (Button)    findViewById(R.id.chordSearchButton);
        EditText searchBox      =   (EditText)  findViewById(R.id.searchValue);
    }


    public void tabAra(View v){

        Intent myIntent = new Intent(MainActivity.this, ListActivity.class);
        //myIntent.putExtra("key", value); //Optional parameters
        MainActivity.this.startActivity(myIntent);
    }

    public void akorAra(View v){
        Intent myIntent = new Intent(MainActivity.this, ListActivity.class);
        //myIntent.putExtra("key", value); //Optional parameters
        MainActivity.this.startActivity(myIntent);

    }


}

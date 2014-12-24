package com.guitar.tugbasalih.gitarakortab;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by salih on 12/23/14.
 */
public class ListActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_list);
        Intent intent = getIntent();
        ListView songList   =   (ListView)  findViewById(R.id.songList);
        //String value = intent.getStringExtra("key");
        Toast.makeText(getApplicationContext()," hi ",Toast.LENGTH_LONG).show();
    }
}

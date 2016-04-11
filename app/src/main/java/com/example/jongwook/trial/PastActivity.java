package com.example.jongwook.trial;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PastActivity extends ListActivity {
    public static final String[] pasts = {"3/29 at Home", "4/02 at Gangnam", "4/04 at Home", "4/06 at Gangnam"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView listPast = getListView();
        ArrayAdapter<String> listAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, pasts);
        listPast.setAdapter(listAdapter);
    }


}

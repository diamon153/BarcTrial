package com.example.jongwook.trial;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.roomorama.caldroid.CaldroidFragment;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    private CaldroidFragment caldroidFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CaldroidFragment caldroidFragment = new CaldroidFragment();
        Bundle args = new Bundle();
        Calendar cal = Calendar.getInstance();
        args.putInt(CaldroidFragment.MONTH, cal.get(Calendar.MONTH) + 1);
        args.putInt(CaldroidFragment.YEAR, cal.get(Calendar.YEAR));
        caldroidFragment.setArguments(args);

        // Set background colors for the calendar
        Date date1 = new Date(116, 3, 8);
        Date date2 = new Date(116, 3, 9);
        ColorDrawable green = new ColorDrawable(Color.GREEN);
        ColorDrawable red = new ColorDrawable(Color.RED);
        caldroidFragment.setBackgroundDrawableForDate(green, date1);
        caldroidFragment.setBackgroundDrawableForDate(green, date2);
        date1 = new Date(116, 3, 5);
        date2 = new Date(116, 3, 6);
        caldroidFragment.setBackgroundDrawableForDate(green, date1);
        caldroidFragment.setBackgroundDrawableForDate(red, date2);

        FragmentTransaction t = getSupportFragmentManager().beginTransaction();
        t.replace(R.id.calendar1, caldroidFragment);
        t.commit();
    }

    public void changeToCal(View view) {
        Intent intent = new Intent(MainActivity.this, CalendarActivity.class);
        startActivity(intent);
    }

    public void pastReservation(View view) {
        Intent intent = new Intent(MainActivity.this, PastActivity.class);
        startActivity(intent);
    }
}

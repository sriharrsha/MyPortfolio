package com.orange.sriharrsha.myportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }


    @OnClick(R.id.popular_movies1_app_button)
    public void popular1Clicked(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch Popular Movies I", Toast.LENGTH_SHORT).show();
    }


    @OnClick(R.id.popular_movies2_app_button)
    public void popular2Clicked(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch Popular Movies II", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.super_duo_app_button)
    public void superDuoClicked(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch Super Duo App", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.build_it_bigger_app_button)
    public void buildItClicked(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch Build it Bigger App", Toast.LENGTH_SHORT).show();
    }


    @OnClick(R.id.material_app_button)
    public void materialClicked(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch Make it Material App", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.ubiquitous_app_button)
    public void ubiquitousClicked(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch Go Ubiquitous App", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.capstone1_app_button)
    public void capstone1Clicked(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch my Capstone I App", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.capstone2_app_button)
    public void capstone2Clicked(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch my Capstone II App", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}

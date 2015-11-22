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


    @OnClick(R.id.spotify_app_button)
    public void spotifyClicked(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch Spotify Streamer", Toast.LENGTH_SHORT).show();
    }


    @OnClick(R.id.scores_app_button)
    public void scoresClicked(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch Scores App", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.library_app_button)
    public void libraryClicked(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch Library App", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.build_it_bigger_app_button)
    public void buildItClicked(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch Build it Bigger App", Toast.LENGTH_SHORT).show();
    }


    @OnClick(R.id.xyz_reader_button)
    public void xyzClicked(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch XYZ Reader", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.capstone_app_button)
    public void capstoneClicked(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch my capstone App", Toast.LENGTH_SHORT).show();
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

package android.example.spotifyclone;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class LikedSongs extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liked_songs);

        BottomNavigationView buttonNavHome = findViewById(R.id.home_menu);

        BottomAppBar bottomBar = findViewById(R.id.bottom_nav_bar);

        bottomBar.setBackground(null);

        buttonNavHome.setOnItemSelectedListener(this::onNavigationItemSelected);

        final ArrayList<Songs> songs = new ArrayList<Songs>();
        songs.add(new Songs("With Me", "Marc Benjamin, Daecolm", R.drawable.marc));
        songs.add(new Songs("No Regrets", "Nea, SHY Martin", R.drawable.nea));
        songs.add(new Songs("Still Dancing", "Reve", R.drawable.reve));
        songs.add(new Songs("Hero", "Mike Perry", R.drawable.mike));
        songs.add(new Songs("Shadows", "Frank Walker, Sophie Simmons..", R.drawable.frank));
        songs.add(new Songs("Drive (feat. Wes Nelson)", "Clean Bandit, Topic, Wes Nelson", R.drawable.clean));
        songs.add(new Songs("STAY", "The Kid LAROI, Justin Bieber", R.drawable.kid));
        songs.add(new Songs("If I Get To Meet You", "BENEE", R.drawable.benee));
        songs.add(new Songs("Distorted Light Beam", "Bastille", R.drawable.bastille));
        songs.add(new Songs("Say It With Your Eyes", "Eyelar", R.drawable.eyelar));

        LikedSongsAdapter adapter = new LikedSongsAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.home_button) {

            Intent likedSongsIntent = new Intent(LikedSongs.this, MainActivity.class);
            startActivity(likedSongsIntent);

        }

        return false;
    }
}
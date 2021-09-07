package android.example.spotifyclone;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView buttonNavHome = findViewById(R.id.home_menu);

        Button likedSongs = findViewById(R.id.liked_songs);

        likedSongs.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent likedSongsIntent = new Intent(MainActivity.this, LikedSongs.class);
                startActivity(likedSongsIntent);
            }
        });

        buttonNavHome.setOnItemSelectedListener(this::onNavigationItemSelected);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.home_button) {

            Intent likedSongsIntent = new Intent(MainActivity.this, LikedSongs.class);
            startActivity(likedSongsIntent);

        }


        return false;
    }
}
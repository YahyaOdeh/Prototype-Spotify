package android.example.spotifyclone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class LikedSongs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liked_songs);

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
}
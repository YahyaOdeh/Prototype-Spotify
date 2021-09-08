package android.example.spotifyclone;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;
import java.util.List;

public class LikedSongsAdapter extends ArrayAdapter<Songs> {

    public LikedSongsAdapter(@NonNull Context context, @NonNull List<Songs> songs) {
        super(context, 0, songs);
    }

    @NonNull
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.songs_list, parent, false);
        }

        Songs currentSong = getItem(position);

        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist_text_view);

        artistTextView.setText(currentSong.getArtistName());

        TextView songTextView = (TextView) listItemView.findViewById(R.id.song_text_view);

        songTextView.setText(currentSong.getSongName());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image);

        iconView.setImageResource(currentSong.getImageRecourseID());

        iconView.setVisibility(View.VISIBLE);

        return listItemView;
    }
}
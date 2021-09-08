package android.example.spotifyclone;

public class Songs {

    private String mSongName;

    private String mArtistName;

    private int mImageResourceId;

    public Songs(String songName, String artistName, int imageResourceId) {
        mSongName = songName;
        mArtistName = artistName;
        mImageResourceId = imageResourceId;
    }

    public String getSongName() {
        return mSongName;
    }

    public String getArtistName() {
        return mArtistName;
    }

    public int getImageRecourseID() {
        return mImageResourceId;
    }

}
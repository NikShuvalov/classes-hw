package NikitaS;

import java.util.ArrayList;

/**
 * Created by NikitaShuvalov on 10/11/16.
 */
public class Playlist {
    String mName;
    ArrayList<Song> mSongs;
    public Playlist(String name){
        mSongs=new ArrayList<>();
    }
    public void addSong(Song song){
        mSongs.add(song);
    }
    public String getName(){
        return mName;
    }
    public void playAll(){
        for (Song song:mSongs) {
            song.play();
        }
    }
}

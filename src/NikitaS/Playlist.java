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
        mName=name;
    }
    public void addSong(Song song){
        mSongs.add(song);
    }
    public String getName(){
        return mName;
    }
    public void playAll(){
        for (Song song: mSongs) {
            song.play();
        }
    }
    public int getSize(){
        return mSongs.size();
    }
    public Song getAtIndex(int index){
        return mSongs.get(index);
    }
    public void appendPlaylist(Playlist playlist){
        for (int i = 0; i<playlist.getSize();i++){
            mSongs.add(playlist.getAtIndex(i));
        }
    }
}

package NikitaS;

/**
 * Created by NikitaShuvalov on 10/11/16.
 */
public class Song {
    String mSongName;
    String mArtistName;
    String mAlbumName;
    public Song(String songName, String artistName, String albumName){
        mSongName=songName;
        mArtistName=artistName;
        mAlbumName=albumName;
    }
    public void play(){
        System.out.println("Now playing: "+mSongName+" By: "+ mArtistName+ " From album: "+ mAlbumName);
    }
}

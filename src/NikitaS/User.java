package NikitaS;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by NikitaShuvalov on 10/11/16.
 */
public class User {
    String mName;
    HashMap<String, Playlist> mPlayLists;

    public User(String name){
        mName= name;
        mPlayLists=new HashMap<>();
    }
    public void addPlayList(Playlist playlist){
        mPlayLists.put(playlist.getName(),playlist);
    }
    public ArrayList<String> getAllPlaylistNames(){
        ArrayList<String> playListNames = new ArrayList<>();
        for (String key:mPlayLists.keySet()) {
            playListNames.add(key);
        }
        return playListNames;
    }

    public Playlist getPlaylistByName(String name) {
        if (mPlayLists.containsKey(name)) {
            return mPlayLists.get(name);
        }
        return null;
    }
    public void removePlaylistByName(String name){
        if ((mPlayLists.containsKey(name))){
            mPlayLists.remove(name);
            System.out.println("Removed playlist: \""+name+"\" from user: \""+mName+"\"");
        }
    }
}

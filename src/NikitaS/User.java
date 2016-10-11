package NikitaS;

/**
 * Created by NikitaShuvalov on 10/11/16.
 */
public class User {
    String mName;

}

//        User class requirements
//
//Define 2 member variables: mName and mPlaylists, where the latter is a HashMap that uses playlist names as keys
// and the corresponding Playlist objects as values
//        Define a constructor method that does the following:
//        Takes user name as an input and assigns it to the corresponding member variable
//        Instantiates mPlaylists as a new, empty HashMap
//        Define a method addPlaylist(Playlist playlist) that takes a Playlist object as an input and adds it to the mPlaylists map (hint: use the getName() method from the Playlist object to get the key to use for your map)
//        Define a method getAllPlaylistNames() that returns a collection of all the user's playlist names
//        Define a method getPlaylistByName(String name) that returns the Playlist from the collection that matches the name parameter. If nothing in the collection matches that input, return null.

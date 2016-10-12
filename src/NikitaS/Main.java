package NikitaS;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    User me = new User("Nikita");

        Song myGodIsTheSun = new Song("My God Is The Sun", "Queens of the Stone Age", "...Like Clockwork");
        Song elRodeo = new Song("El Rodeo", "Kyuss", "...And The Circus Leaves Town");
        Song newFang = new Song("New Fang", "Them Crooked Vultures", "Them Crooked Vultures");

        Song iceMonster = new Song("Ice Monster", "Minus The Bear", "Planet of Ice");
        Song coughSyrup = new Song("Cough Syrup", "Young the Giant", "Young the Giant");
        Song wonderBoy = new Song("WonderBoy", "Tenacious D", "Tenacious D");


        Song myOnlySwerving = new Song("My Only Swerving", "El Ten Eleven", "El Ten Eleven");
        Song firstBreathAfterComa = new Song("First Breath after Coma", "Explosions in the Sky", "The Earth Is Not a Cold Dead Place");
        Song theSunSmellsTooLoud = new Song ("The sun smells too loud", "Mogwai", "The hawk is howling");

        Song liteBake = new Song("Lite Bake", "GreyBoy", "Freestylin'");

        Playlist joshHomme = new Playlist("Josh Homme");
        Playlist postRock = new Playlist("Post-rock");
        Playlist instrumental = new Playlist("Instrumental music");
        Playlist other = new Playlist("Others");

        joshHomme.addSong(myGodIsTheSun);
        joshHomme.addSong(elRodeo);
        joshHomme.addSong(newFang);

        postRock.addSong(myOnlySwerving);
        postRock.addSong(firstBreathAfterComa);
        postRock.addSong(theSunSmellsTooLoud);

        instrumental.appendPlaylist(postRock);
        instrumental.addSong(liteBake);

        other.addSong(iceMonster);
        other.addSong(coughSyrup);
        other.addSong(wonderBoy);




        me.addPlayList(other);
        me.addPlayList(joshHomme);
        me.addPlayList(instrumental);
        me.addPlayList(postRock);

        me.removePlaylistByName(postRock.getName());

        ArrayList<String> plNames= me.getAllPlaylistNames();
        for (String name:plNames) {
            System.out.println("\nCurrent playlist is: "+me.getPlaylistByName(name).getName()+"\n");
            me.getPlaylistByName(name).playAll();
        }


    }
}

package NikitaS;

public class Main {

    public static void main(String[] args) {
	    User me = new User("Nikita");

        Song myGodIsTheSun = new Song("My God Is The Sun", "Queens of the Stone Age", "...Like Clockwork");
        Song elRodeo = new Song("El Rodeo", "Kyuss", "...And The Circus Leaves Town");
        Song newFang = new Song("New Fang", "Them Crooked Vultures", "Them Crooked Vultures");

        Song iceMonster = new Song("Ice Monster", "Minus The Bear", "Planet of Ice");


        Song myOnlySwerving = new Song("My Only Swerving", "El Ten Eleven", "El Ten Eleven");
        Song firstBreathAfterComa = new Song("First Breath after Coma", "Explosions in the Sky", "The Earth Is Not a Cold Dead Place");
        Song theSunSmellsTooLoud = new Song ("The sun smells too loud", "Mogwai", "The hawk is howling");

        Song liteBake = new Song("Lite Bake", "GreyBoy", "Freestylin'");

        Playlist joshHomme = new Playlist("Josh Homme");
        Playlist postRock = new Playlist("Post-rock");
        Playlist instrumental = new Playlist("Instrumental music");

        joshHomme.addSong(myGodIsTheSun);
        joshHomme.addSong(elRodeo);
        joshHomme.addSong(newFang);

        postRock.addSong(myOnlySwerving);
        postRock.addSong(firstBreathAfterComa);
        postRock.addSong(theSunSmellsTooLoud);

        instrumental.appendPlaylist(postRock);
        instrumental.addSong(liteBake);



    }
}

//        Main class requirements
//
//Create your main() method here - this is where you create and manipulate instances of the other classes; do the following steps inside main()
//        Create a new instance of User
//        Create at least 5 new instances of Song and assign each to a variable (You can come up with creative values or just use "song1", "artist1", etc.)
//        Create at least 2 instances of Playlist, add multiple Song objects to each, then add those Playlist objects to your User object
//        Use the methods you defined and print out the names of your user's playlists, then "play" each song in each playlist so the songs print out as well


//        Bonus:
//
//        Add methods to each class which can be used to edit the values of the member variables
//        Add a method to User to remove a Playlist by name
//        Call your bonus methods from main() to make sure they work properly (hint: if you change a playlist's name, you'll need to first remove it from User by specifying the old name as a key, then re-add it using the new name as the new key)

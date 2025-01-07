
package MusicPlayer;

public class Main {
    public static void main(String[] args){
        //create a MusicList
        MusicList musicList=new MusicList();

        //Add Songs
        Song[] songs = new Song[10];
        songs[0]=new Song("Drake", "Passionfruit");
        songs[1]=new Song("Lil Mosey", "Blueberry Faygo");
        songs[2]=new Song("Eminem", "Mockingbird");
        songs[3]=new Song("Dave", "Thiago Silva");
        songs[4]=new Song("Oasis", "Wonderwall");
        songs[5]=new Song("Lil Tecca", "Ransom");
        songs[6]=new Song("AJ Tracey", "Ladbroke Grove");
        songs[7]=new Song("Fleetwood Mac", "Dreams");
        songs[8]=new Song("Joy Division", "Love Will Tear Us Apart");
        songs[9]=new Song("Courteeners", "No You Didn't, No You Don't");

        for (Song song:songs){
            musicList.addSong(song);
        }
        musicList.printMusicList();
        System.out.println(musicList.getMusicListSize());
        musicList.findByArtist("Genesis");
        musicList.getRandomSong();
        musicList.removeSong("Firth of Fifth");
        System.out.println("==================");
        musicList.printMusicList();
    }
}

package TrabalhoAutonomo;

import java.sql.Time;

public class Playlist {

    private int size;
    private Time duration;
    private Music[] listMusic;

    public Playlist(int size, Time duration){
        this.size = size;
        this.duration = duration;
        listMusic = new Music[size];
    }

    public void listMusic()
    {
        listMusic = new Music[size];
        for (int i = 0; i < listMusic.length; i++)
            System.out.println("Element at " + i + " : " +
                    listMusic[i].getTitle() +" "+ listMusic[i].getDuration());
    }
}

/*
    public void listMusic(){
        for(int i = 0; i <= listMusic.length; i++){
            System.out.println(listMusic[i]);
        }
    }

    public void addMusic(int m){
        int[] add = new int[m];
        for(int i = 0; i < listMusic.length; i++)
        }
*/


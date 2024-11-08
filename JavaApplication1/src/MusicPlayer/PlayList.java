/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MusicPlayer;
import java.util.ArrayList;
/**
 *
 * @author dmellor
 */
public class PlayList {
    private ArrayList<Song> playList;
  
    
    
    
    /**
     * 
     */
    public PlayList(){
        
    }
    
    public void addSong(Song song){
        this.playList.add(song);
        
        
    }

    public int getPlayListSize(){
        return this.playList.size();
        
    }
    
    public void clearPlayList(){
        this.playList.clear();
    }
    
}
    


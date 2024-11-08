/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MusicPlayer;

/**
 *
 * @author dmellor
 * @version 1.0
 * Purpose: The purpose of the class is to manage a song
 */
public class Song {
    private String artistName;
    private String songTitle;
    private int playBack;
    
    /**
     * Constructor: this constructor is used to build a blank song
     */
    public Song(){}
    
     /**
     * Constructor: this constructor is used to a song with 
     * the data which is required; artistName, songTitle, playBack
     */
    public Song(String artistName, String songTitle, int playBack){
        this.artistName = artistName;
        this.songTitle = songTitle;
        this.playBack = playBack;
        
  
                }
    
    /** 
     * Method: this method will get the artists name 
     */
    
    public String getArtistName(){
        return this.artistName; 
    
    
    }
    
    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }
    
     /** 
     * Method: this method will get the songs name 
     * @return 
     */
    public String getsongTitle(){
        return this.songTitle; 
    
    
    }
    
    public void setsongTitle(String songTitle) {
        this.songTitle = songTitle;
    }
    
     /** 
     * Method: this method will get the total number of plays
     */
    
    
    public int getplayBack(){
        return this.playBack; 
    
    
    }
    
    public void setplayBack(int playBack) {
        this.playBack = playBack;
    }
    
}

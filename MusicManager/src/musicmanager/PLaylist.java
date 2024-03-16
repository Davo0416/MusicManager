/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musicmanager;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author davog
 */
public class PLaylist {
    //Class variables
    public Queue<Song> queue;
    public ArrayList<String> songNames;
    public String name;
    
    //Class Initializers
    public PLaylist(){
        queue = new LinkedList<>();
        songNames = new ArrayList<String>();
        name = " ";
    }
    
    public PLaylist(String name){
        queue = new LinkedList<>();
        songNames = new ArrayList<String>();
        this.name = name;
    }
    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    //Function to check if the stack is empty
    public boolean isEmpty(){
        return queue.isEmpty();
    }
    
    //Returns the size of the queue
    public int size(){
        return queue.size();
    }
    
    //Adds a song at the end of the queue
    public void add(Song song){
        queue.add(song);
        songNames.add(song.getName());
    }
    
    //Removes the song in the front of the queue and returns it
    public Song remove(Song song){
        
        songNames.remove(queue.size());
        return queue.remove();
    }
    
    //Removes the song at the index and returns it
    public Song removeAt(int id){
        
        Song removedSong = new Song();
        ArrayList<Song> songs = new ArrayList(queue);
        removedSong = songs.remove(id);
        
        songNames.remove(id);
        
        queue = new LinkedList<>(songs);
        return removedSong;
    }
    
    //Adds a song at the index 
    public void AddAt(Song song, int id){
        ArrayList<Song> songs = new ArrayList(queue);
        songs.add(id,song);
        songNames.add(id,song.getName());
        
        queue = new LinkedList<>(songs);
        
    }
    
    //Search function used for searching for an element with a specific name in the queue
    //Returns the id of the matching element
    public int Search(String name){
        for(int i=0;i<songNames.size();i++){
            if(songNames.get(i).equalsIgnoreCase(name))
                return i;
        }
        
        return -1;
    }
    
    //Prints the elements of the queue in order, simulating the songs being played
    public String Play(){
        String res = "";
        for(int i=0;i<songNames.size();i++)
        {
            res+="Playing...   " + songNames.get(i) + "\n";
            queue.add(queue.remove());
        }
        
        return res;
    }
    
    //Returns the song at the index
    public Song get(int id){
        Song requestedSong = new Song();
        for(int i=0;i<queue.size();i++)
        {
            Song topSong = queue.remove();
            queue.add(topSong);
            if(i == id)
            requestedSong = topSong;
        }
        
        return requestedSong;
    }
    
    //toString() Override
    @Override
    public String toString() {
        
        String res = "";
        for(int i=0;i<queue.size();i++)
        {
            Song topSong = queue.remove();
            queue.add(topSong);
            res+= (i+1)+ ") " +topSong.toString() + '\n';
        }
        return res;
    }
}

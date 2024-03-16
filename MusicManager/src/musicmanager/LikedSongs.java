/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musicmanager;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author davog
 */
public class LikedSongs {
    //Class variables
    public Stack<Song> likedStack;
    public ArrayList<String> songNames;
    
    //Class Initializers
    public LikedSongs(){
        likedStack = new Stack<Song>();
        songNames = new ArrayList<String>();
    }
    //getters and setters
    public Stack<Song> getLikedStack() {
        return likedStack;
    }

    public void setLikedStack(Stack<Song> likedStack) {
        this.likedStack = likedStack;
    }
    
    public ArrayList<String> getSongNames() {
        return songNames;
    }

    public void setSongNames(ArrayList<String> songNames) {
        this.songNames = songNames;
    }
    
    //Function to check if the stack is empty
    public boolean IsEmpty(){
        return likedStack.empty();
    }

    //Function used to remove element at index
    public Song removeAt(int id){
        songNames.remove(id);
        return likedStack.remove(id);
    }
    
    //Function used to remove element at index
    public void AddAt(Song song,int id){
        songNames.add(id,song.getName());
        likedStack.insertElementAt(song,id);
    }
    
    //Push function for the stack
    public void push(Song newSong){
        likedStack.push(newSong);
        songNames.add(newSong.getName());
    }
    
    //Pop function for the stack
    public Song pop(){
        Song song = likedStack.pop();
        songNames.remove(songNames.size() - 1);
        
        return song;
    }
    
    //Peek function for the stack
    public Song peek(){
        Song lastSong = likedStack.peek();
        
        return lastSong;
    }
    
    //Search function used for searching for an element with a specific name in the stack
    //Returns the id of the matching element
    public int Search(String name){
        for(int i=0;i<songNames.size();i++){
            if(songNames.get(i).equalsIgnoreCase(name))
                return i;
        }
        
        return -1;
    }
    
    //Returns the size of the stack
    public int size(){
        return likedStack.size();
    }
    
    //toString() Override
    @Override
    public String toString() {
        
        String res = "";
        for(int i=0;i<likedStack.size();i++)
        res+= (i+1)+ ") " +likedStack.get(i).toString() + '\n';
        
        return res;
    }
}

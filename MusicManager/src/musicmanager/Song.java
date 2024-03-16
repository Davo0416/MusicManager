/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musicmanager;

/**
 *
 * @author davog
 */
public class Song {
    //Class variables
    private String name;
    private String genre;
    
    //Class Initializers
    public Song(){
        name = " ";
        genre = " ";
    }

    public Song(String name,String genre) {
        this.name = name;
        this.genre = genre;
    }
    
    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    //toString() Override
    @Override
    public String toString() {
        return " Name:"+ this.name + " Genre:" + genre;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package musicmanager;

import java.awt.event.ItemEvent;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author davog
 */
public class MusicManagerGUI extends javax.swing.JFrame {

    //Class variables
    LikedSongs likedStack;
    ArrayList<String> genres;
    ArrayList<PLaylist> genrePlaylists;
    
    //The function initiating the GUI
    public MusicManagerGUI() {
        initComponents();
        likedStack = new LikedSongs();
        genres = new ArrayList<>();
        genrePlaylists = new ArrayList<>();
        
        genres.add("liked");
        
        PlaylistCB.addItemListener((ItemEvent e) -> {
            UpdateSongs();
            UpdateMoveCB();
            UpdateGenres(false);
        });
        
        SongCB.addItemListener((ItemEvent e) -> {
            UpdateMoveCB();
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TiltleLbl = new javax.swing.JLabel();
        PlaylistCB = new javax.swing.JComboBox<>();
        PlaylistLbl = new javax.swing.JLabel();
        AddLbl = new javax.swing.JLabel();
        NameLbl = new javax.swing.JLabel();
        GenreLbl = new javax.swing.JLabel();
        NameField = new javax.swing.JTextField();
        GenreField = new javax.swing.JTextField();
        AddBtn = new javax.swing.JButton();
        SongCB = new javax.swing.JComboBox<>();
        SongLbl = new javax.swing.JLabel();
        DeleteBtn = new javax.swing.JButton();
        ConsolePane = new javax.swing.JScrollPane();
        Console = new javax.swing.JTextArea();
        PrintBtn = new javax.swing.JButton();
        AutoSortCBX = new javax.swing.JCheckBox();
        AddToPlaylist = new javax.swing.JButton();
        AddAllToPlaylist = new javax.swing.JButton();
        SearchSongLbl = new javax.swing.JLabel();
        RepeatAmountField = new javax.swing.JTextField();
        SearchBtn = new javax.swing.JButton();
        PlayStopBtn = new javax.swing.JButton();
        RepeatAmountLbl = new javax.swing.JLabel();
        SearchField1 = new javax.swing.JTextField();
        MoveCB = new javax.swing.JComboBox<>();
        MoveLbl = new javax.swing.JLabel();
        MoveBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TiltleLbl.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TiltleLbl.setText("Music Manager");

        PlaylistCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "liked" }));

        PlaylistLbl.setText("Current Playlist");

        AddLbl.setText("Add new Song");

        NameLbl.setText("Name");

        GenreLbl.setText("Genre");

        AddBtn.setText("Add");
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        SongLbl.setText("Current Song");

        DeleteBtn.setText("Delete");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        Console.setColumns(20);
        Console.setRows(5);
        ConsolePane.setViewportView(Console);

        PrintBtn.setText("Print");
        PrintBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintBtnActionPerformed(evt);
            }
        });

        AutoSortCBX.setText("AutoMove to Playlist");

        AddToPlaylist.setText("Add to playlist");
        AddToPlaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddToPlaylistActionPerformed(evt);
            }
        });

        AddAllToPlaylist.setText("Add all to playlists");
        AddAllToPlaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddAllToPlaylistActionPerformed(evt);
            }
        });

        SearchSongLbl.setText("Search for song");

        RepeatAmountField.setText("1");

        SearchBtn.setText("Search");
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });

        PlayStopBtn.setText("Play Current Playlist");
        PlayStopBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayStopBtnActionPerformed(evt);
            }
        });

        RepeatAmountLbl.setText("Repeat Amount");

        MoveLbl.setText("Move to ");

        MoveBtn.setText("Move");
        MoveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoveBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PlaylistLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SongLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MoveLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SearchSongLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(SongCB, 0, 93, Short.MAX_VALUE)
                                    .addComponent(PlaylistCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PrintBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 28, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(MoveCB, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(MoveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(SearchField1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(GenreLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(GenreField, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(NameLbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(AddLbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(AddToPlaylist))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(AddAllToPlaylist))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(AutoSortCBX)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PlayStopBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(RepeatAmountLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RepeatAmountField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(TiltleLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(ConsolePane, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ConsolePane, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(TiltleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PlaylistLbl)
                            .addComponent(PlaylistCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PrintBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SongLbl)
                            .addComponent(SongCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(MoveLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(SearchSongLbl)
                                    .addComponent(SearchField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(AddLbl)
                                            .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(NameLbl)
                                            .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(GenreLbl)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(GenreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(AutoSortCBX))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(AddToPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(AddAllToPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(PlayStopBtn)
                                    .addComponent(RepeatAmountLbl)
                                    .addComponent(RepeatAmountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(MoveCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(MoveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //The function executing on the Delete button press. Deletes the selected song from the playlist
    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        
        Song removedSong = new Song();
        int removeID = PlaylistCB.getSelectedIndex();
         
        if(removeID != 0)
        {
            
            PLaylist currentPlaylist = genrePlaylists.get(removeID-1);
            
            removedSong = currentPlaylist.removeAt(SongCB.getSelectedIndex());
            
            if(currentPlaylist.isEmpty())
            {
                Console.setText(Console.getText() +"empty" +'\n');
                genrePlaylists.remove(removeID-1);
                Console.setText(Console.getText() +"The playlist by name " + genres.get(removeID) + " has been deleted as it is empty" + '\n');
                genres.remove(removeID);
                UpdateGenres(true);
            }
        }
        else{
            if(likedStack.size()>0)
            {
                removedSong = likedStack.removeAt(SongCB.getSelectedIndex());
                UpdateSongs();
                UpdateMoveCB();
                Console.setText(Console.getText() +"The song with " + removedSong.toString()+ " has been removed from the playlist" + '\n');
            }
            else
                Console.setText(Console.getText() +"Please select a valid song" +'\n');       
        }
        
        
    }//GEN-LAST:event_DeleteBtnActionPerformed
    //The function executing on the Add button press. 
    //Adds a new song based on the name and genre inputted by the user and adds it to the selected platlist.
    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        boolean valid = true;
        String name = NameField.getText();
        String genre = GenreField.getText();
        
        NameField.setText("");
        GenreField.setText("");
        
        if("".equals(name.replaceAll("\\s+","")))
        {
            Console.setText(Console.getText() +"Please enter a name for the new song" + '\n');
            valid = false;
        }
        
        if("".equals(genre.replaceAll("\\s+","")))
        {
            Console.setText(Console.getText() +"Please enter a genre for the new song" + '\n');
            valid = false;
        }
        if(valid)
        {
            Song song = new Song(name, genre);
            likedStack.push(song);

            if(AutoSortCBX.isSelected())
            {
                MoveToPlaylist(likedStack.pop());
            }

            UpdateSongs();
            UpdateMoveCB();
            Console.setText(Console.getText() +"The song with " + song.toString()+ " has been added to the playlist" + '\n');
        }
    }//GEN-LAST:event_AddBtnActionPerformed
    //A helper functione used to move a song to the corresponding playlist
    private void MoveToPlaylist(Song song){
        String genre = song.getGenre();
        boolean genreFound = false;
        int genreID = -1;
        
        for(int i=0;i<genres.size();i++){
            if(genre.equalsIgnoreCase(genres.get(i)))
            {
                genreID = i-1;
                genreFound = true;
                break;
            }
        }
        
        if(!genreFound){
            genres.add(genre);
            PLaylist newPlaylist = new PLaylist(genre);
            newPlaylist.add(song);
            
            genrePlaylists.add(newPlaylist);
            
            Console.setText(Console.getText() +"A new playlist by name " + genre + " was created" + '\n');
            UpdateGenres(true);
           
        }
        else genrePlaylists.get(genreID).add(song);
    }
    //The function executing on the Print button press. 
    //Prints the selected playlist
    private void PrintBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintBtnActionPerformed
        if(PlaylistCB.getSelectedIndex() != 0){
            PLaylist currentPlaylist = genrePlaylists.get(PlaylistCB.getSelectedIndex()-1);
            Console.setText(Console.getText() +"The playlist " + currentPlaylist.getName() + " contains" + currentPlaylist.size() + " songs" + '\n' + currentPlaylist.toString()+'\n');
        }
        else  Console.setText(Console.getText() + "The playlist liked contains " + likedStack.size() + " songs" + '\n' + likedStack.toString()+'\n');
    }//GEN-LAST:event_PrintBtnActionPerformed

    private void AddToPlaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddToPlaylistActionPerformed
        
        if(likedStack.size()>0)
        {
            Song lastSong = likedStack.pop();
            MoveToPlaylist(lastSong);
    
        }
        else Console.setText(Console.getText() + "All the songs have been moved to their playlists" + '\n');
        UpdateSongs();
        UpdateMoveCB();
    }//GEN-LAST:event_AddToPlaylistActionPerformed
    //The function executing on the AddAll button press
    //Adds all the songs currently in the liked playlist to their playlists
    private void AddAllToPlaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddAllToPlaylistActionPerformed
       while(likedStack.size()>0){
           Song lastSong = likedStack.pop();
           MoveToPlaylist(lastSong);
       }
       
       UpdateSongs();
       UpdateMoveCB();
       Console.setText(Console.getText() + "All the songs have been moved to their playlists" + '\n');
    }//GEN-LAST:event_AddAllToPlaylistActionPerformed
    //The function executing on the Search button press
    //Searches and selects a song based on the users inputted song name
    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
        String searchTerm = RepeatAmountField.getText();
        int res=-1;
        if(PlaylistCB.getSelectedIndex() == 0){
            res = likedStack.Search(searchTerm);
        }
        else res = genrePlaylists.get(PlaylistCB.getSelectedIndex()-1).Search(searchTerm);
        
        if(res != -1)
        {
            SongCB.setSelectedIndex(res);
            Console.setText(Console.getText() + "The requested song has been found and selected for you" + '\n');
        }
        else  Console.setText(Console.getText() + "Could not find the requested song" + '\n');
    }//GEN-LAST:event_SearchBtnActionPerformed
    //The function executing on the Play button press. 
    //Prints the current playlist repeatedly based on the number of repeats requested by the user effectively simulating song playlist being played
    private void PlayStopBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayStopBtnActionPerformed
        try {
            int selected = PlaylistCB.getSelectedIndex()-1;
            if(selected>=0)
            {
                PLaylist currentPlaylist = genrePlaylists.get(selected);
                if(currentPlaylist.size()>0)
                {
                    int iterationsLeft = Integer.parseInt(RepeatAmountField.getText());
                    Console.setText(Console.getText() + "Playing the playlist " + currentPlaylist.getName() + '\n');
                    while(iterationsLeft>0){
                        Console.setText(Console.getText() + currentPlaylist.Play()+ '\n');
                        iterationsLeft--;
                    }
                }
                else Console.setText(Console.getText() + "The selected playlist is empty" +'\n');
            }
            else  Console.setText(Console.getText() + "Cannot play the liked playlist " +'\n');
        }
        catch (NumberFormatException e) {
            Console.setText(Console.getText() + "Enter a number please" +'\n');
        }
        
    }//GEN-LAST:event_PlayStopBtnActionPerformed
    //The function executing on the Move button press
    //Moves the selected song to the selected position in the playlist
    private void MoveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoveBtnActionPerformed
        try{
            int moveFrom = SongCB.getSelectedIndex();
            int moveTo = Integer.parseInt(MoveCB.getSelectedItem().toString())-1;
            int selectedID = PlaylistCB.getSelectedIndex();

            Song song = new Song();

            if(selectedID != 0)
            {
                PLaylist currentPlaylist = genrePlaylists.get(selectedID-1);
                song = currentPlaylist.removeAt(moveFrom);
                currentPlaylist.AddAt(song, moveTo);
            }
            else{
                song = likedStack.removeAt(moveFrom);
                likedStack.AddAt(song,moveTo);
            }

            Console.setText(Console.getText() + "Moving " + song.getName() + " to position " + (moveTo+1) + " in the playlist" + '\n');

            UpdateSongs();
            UpdateMoveCB();
        }
        catch (Exception e) {
               Console.setText(Console.getText() + "Invalid move request " + '\n');
            }
        
    }//GEN-LAST:event_MoveBtnActionPerformed
    //A helper function updating the genres comboBox to show changes made to the playlists
    public void UpdateGenres(boolean updatePlaylists){
        DefaultComboBoxModel<String> model;
        if(updatePlaylists)
        {
            model = new DefaultComboBoxModel<>(genres.toArray(String[]::new));
            PlaylistCB.setModel(model);
        } 

    }
    //A helper function updating the songs comboBox to show changes made to the songs in the current playlist
    public void UpdateSongs(){
        ArrayList<String> playlistSongs = new ArrayList<>();
        //String selectedGenre = PlaylistCB.getSelectedItem().toString();
        int selectedID = PlaylistCB.getSelectedIndex();
        
        if(selectedID != 0)
        {
            PLaylist currentPlaylist = genrePlaylists.get(selectedID-1);
            for(int i=0; i< currentPlaylist.size();i++){
                playlistSongs.add(currentPlaylist.get(i).getName());
            }
        }
        else 
        {
            playlistSongs = new ArrayList<>(likedStack.songNames);
        }
        
        
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(playlistSongs.toArray(String[]::new));
        SongCB.setModel(model);
        
    }
    //A helper function updating the move to postions comboBox to show changes made to the songs current posistion in the playlist
    public void UpdateMoveCB(){
        int length = -1;
        ArrayList<String> movePositions = new ArrayList<>();
        
        int selectedID = PlaylistCB.getSelectedIndex();
        
        if(selectedID != 0)
        {
            PLaylist currentPlaylist = genrePlaylists.get(selectedID-1);
            length = currentPlaylist.size();
        }
        else 
            length = likedStack.size();
        
        for(int i=0;i<length;i++){
            if(i != SongCB.getSelectedIndex())
            {
                //Console.setText(Console.getText() + i +'\n');
                movePositions.add(String.valueOf(i+1));
            }
        }
        
         DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(movePositions.toArray(String[]::new));
        MoveCB.setModel(model);
    }
    
    //PSVM
    //Creates a new GUI instance and sets it to active
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MusicManagerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MusicManagerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MusicManagerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MusicManagerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MusicManagerGUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddAllToPlaylist;
    private javax.swing.JButton AddBtn;
    private javax.swing.JLabel AddLbl;
    private javax.swing.JButton AddToPlaylist;
    private javax.swing.JCheckBox AutoSortCBX;
    private javax.swing.JTextArea Console;
    private javax.swing.JScrollPane ConsolePane;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JTextField GenreField;
    private javax.swing.JLabel GenreLbl;
    private javax.swing.JButton MoveBtn;
    private javax.swing.JComboBox<String> MoveCB;
    private javax.swing.JLabel MoveLbl;
    private javax.swing.JTextField NameField;
    private javax.swing.JLabel NameLbl;
    private javax.swing.JButton PlayStopBtn;
    private javax.swing.JComboBox<String> PlaylistCB;
    private javax.swing.JLabel PlaylistLbl;
    private javax.swing.JButton PrintBtn;
    private javax.swing.JTextField RepeatAmountField;
    private javax.swing.JLabel RepeatAmountLbl;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JTextField SearchField1;
    private javax.swing.JLabel SearchSongLbl;
    private javax.swing.JComboBox<String> SongCB;
    private javax.swing.JLabel SongLbl;
    private javax.swing.JLabel TiltleLbl;
    // End of variables declaration//GEN-END:variables
}

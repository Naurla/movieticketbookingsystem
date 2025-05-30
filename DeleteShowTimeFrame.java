/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.movieticketbookingsystem;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Noltan
 */
public class DeleteShowTimeFrame extends javax.swing.JFrame {

    /**
     * Creates new form DeleteShowTimeFrame
     */
     private Database database;
    private ArrayList<Movie> movies;
    private ArrayList<Show> shows;

    public DeleteShowTimeFrame(Database db) {
        initComponents();
      this.database = db;
        loadMovies();
    }
    private void loadMovies() {
        movies = MoviesDatabase.getAllMovies(database);
        movieComboBox.removeAllItems();
        for (Movie m : movies) {
            movieComboBox.addItem(m.getID() + " - " + m.getName());
        }
    }
    
    private void loadShowTimes(int movieID){
        shows = MoviesDatabase.getAllMovieShows(database, movieID);
        showComboBox.removeAllItems();
        
        for(Show s : shows){
            showComboBox.addItem("Show ID: " + s.getID());
        }
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        movieComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        showComboBox = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        showDetailsArea = new javax.swing.JTextArea();
        deleteButton = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Select Movie ID:");

        movieComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        movieComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movieComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setText("Select Show to Delete");

        showComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        showComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showComboBoxActionPerformed(evt);
            }
        });

        showDetailsArea.setEditable(false);
        showDetailsArea.setColumns(20);
        showDetailsArea.setLineWrap(true);
        showDetailsArea.setRows(5);
        showDetailsArea.setWrapStyleWord(true);
        jScrollPane1.setViewportView(showDetailsArea);

        jScrollPane2.setViewportView(jScrollPane1);

        deleteButton.setText("Delete Show");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1)
                            .addComponent(showComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(movieComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(movieComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addComponent(showComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deleteButton)
                .addGap(28, 28, 28)
                .addComponent(btnBack)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void movieComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movieComboBoxActionPerformed
      int selectedIndex = movieComboBox.getSelectedIndex();
      if(selectedIndex >=0){
          int movieID = movies.get(selectedIndex).getID();
          loadShowTimes(movieID);
      }
    }//GEN-LAST:event_movieComboBoxActionPerformed

    private void showComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showComboBoxActionPerformed
     int showIndex = showComboBox.getSelectedIndex();
     
     if(showIndex >= 0){
         Show show = shows.get(showIndex);
         StringBuilder sb = new StringBuilder();
         sb.append("Show ID: ").append(show.getID()).append("\n");
         sb.append("Date: ").append(show.getDate()).append("\n");
         sb.append("Time: ").append(show.getTime()).append("\n");
         sb.append("Capacity").append(show.getCapacity()).append("\n");
         sb.append("Available Seats: ").append(show.getAvailableSeats()).append("\n");
         sb.append("Place: ").append(show.getPlace()).append("\n");
         
         showDetailsArea.setText(sb.toString());
                 
     }
           
       
    }//GEN-LAST:event_showComboBoxActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int movieIndex = movieComboBox.getSelectedIndex();
        int showIndex = showComboBox.getSelectedIndex();
        
        if(movieIndex >= 0 && showIndex >= 0){
            Movie movie = movies.get(movieIndex);
            Show show = shows.get(showIndex);
            
            if(show.getAvailableSeats() < show.getCapacity()){
                JOptionPane.showMessageDialog(this, "This show has bookings. Cannot delete.");
                return;
            }
            int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this show ID: " + show.getID() + "?",
                    "Confirm Deletion",
            JOptionPane.YES_NO_OPTION);
            
            if(confirm == JOptionPane.YES_OPTION){
                String delete = "DELETE FROM `movie " + movie.getID() + " - shows` WHERE ID = " + show.getID() + ";";
                try{
                    database.getStatement().execute(delete);
                    JOptionPane.showMessageDialog(this, "Show deleted sucessfully");
                    loadShowTimes(movie.getID());
                }catch (SQLException e){
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Error Deleting show.");
                }
            }
        }
        
        
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(DeleteShowTimeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(DeleteShowTimeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(DeleteShowTimeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(DeleteShowTimeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new DeleteShowTimeFrame().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> movieComboBox;
    private javax.swing.JComboBox<String> showComboBox;
    private javax.swing.JTextArea showDetailsArea;
    // End of variables declaration//GEN-END:variables
}

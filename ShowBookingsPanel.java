/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.movieticketbookingsystem;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Noltan
 */
public class ShowBookingsPanel extends javax.swing.JPanel {

    /**
     * Creates new form ShowBookingsPanel
     */
  private Database database;
    public ShowBookingsPanel(Database db) {
        initComponents();
        this.database = db;
        populateMovies();
    }
    
    private void populateMovies(){
        movieComboBox.removeAllItems();
        ArrayList<Movie> movies = MoviesDatabase.getAllMovies(database);
        for(Movie m : movies){
            movieComboBox.addItem(m.getID()+ " - "+m.getName());
        }
        populateShowTimes();
    }
    
    private void populateShowTimes(){
        showComboBox.removeAllItems();
        if(movieComboBox.getSelectedItem()==null)return;
        int movieID = Integer.parseInt(movieComboBox.getSelectedItem().toString().split(" - ")[0]);
        ArrayList<Show> shows = MoviesDatabase.getAllMovieShows(database, movieID);
        for(Show s : shows){
            showComboBox.addItem(s.getID()+ " - "+s.getDate()+" "+s.getTime());
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

        lblMovie = new javax.swing.JLabel();
        movieComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        showComboBox = new javax.swing.JComboBox<>();
        showBookingsBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookingsTable = new javax.swing.JTable();
        statusLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(33, 37, 41));

        lblMovie.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblMovie.setForeground(new java.awt.Color(255, 255, 255));
        lblMovie.setText("Select Movie:");

        movieComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Movie IDs" }));
        movieComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movieComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Select Show:");

        showComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Show IDs" }));

        showBookingsBtn.setBackground(new java.awt.Color(255, 193, 7));
        showBookingsBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        showBookingsBtn.setText("Show Bookings");
        showBookingsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showBookingsBtnActionPerformed(evt);
            }
        });

        bookingsTable.setBackground(new java.awt.Color(255, 193, 7));
        bookingsTable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bookingsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "User", "Seats"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(bookingsTable);

        statusLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        statusLabel.setForeground(new java.awt.Color(255, 193, 7));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMovie))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(showComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(109, 109, 109))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(movieComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(statusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(showBookingsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(315, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMovie)
                    .addComponent(movieComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(showComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(showBookingsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(statusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(275, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void movieComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movieComboBoxActionPerformed
        populateShowTimes();
    }//GEN-LAST:event_movieComboBoxActionPerformed

    private void showBookingsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showBookingsBtnActionPerformed
       
    DefaultTableModel model = (DefaultTableModel) bookingsTable.getModel();
    model.setRowCount(0);
    statusLabel.setText(""); // Clear previous status

    if (movieComboBox.getSelectedItem() == null || showComboBox.getSelectedItem() == null) {
        statusLabel.setText("Please select a movie and a show.");
        return;
    }

    int movieID = Integer.parseInt(movieComboBox.getSelectedItem().toString().split(" - ")[0]);
    int showID = Integer.parseInt(showComboBox.getSelectedItem().toString().split(" - ")[0]);

    ArrayList<Booking> bookings = new ArrayList<>();
    ArrayList<Visitor> users = new ArrayList<>();

    for (Visitor visitor : UsersDatabase.getAllVisitors(database)) {
        ArrayList<Booking> userBookings = BookingsDatabase.getUserBookings(database, visitor.getID());
        for (Booking b : userBookings) {
            if (b.getMovie().getID() == movieID && b.getShow().getID() == showID) {
                bookings.add(b);
                users.add(visitor);
            }
        }
    }

    if (bookings.isEmpty()) {
        statusLabel.setText("No bookings found for this movie and show.");
    } else {
        for (int i = 0; i < bookings.size(); i++) {
            Visitor v = users.get(i);
            Booking b = bookings.get(i);
            model.addRow(new Object[]{v.getFirstName() + " " + v.getLastName(), b.getSeats()});
        }
        statusLabel.setText("Bookings loaded successfully.");
    }
    }//GEN-LAST:event_showBookingsBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bookingsTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMovie;
    private javax.swing.JComboBox<String> movieComboBox;
    private javax.swing.JButton showBookingsBtn;
    private javax.swing.JComboBox<String> showComboBox;
    private javax.swing.JLabel statusLabel;
    // End of variables declaration//GEN-END:variables
}

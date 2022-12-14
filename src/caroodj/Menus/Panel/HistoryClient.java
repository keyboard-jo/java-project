package Menus.Panel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

import java.util.ArrayList;


import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import Objects.Booking;
import Objects.BookingDataFile;

/**
 *
 * @author William
 */
public class HistoryClient extends javax.swing.JPanel {

    /**
     * Creates new form HistoryClient
     */
    public HistoryClient(String clientID) {
        initComponents();
        HistoryTable.getColumnModel().getColumn(0).setPreferredWidth(200);
        DefaultTableModel model = (DefaultTableModel) HistoryTable.getModel();
        model.setRowCount(0);

        BookingDataFile bdf = new BookingDataFile("src\\caroodj\\Data\\Booking.txt");
        String[] bookingQuery = {"*", "*", "*", "*", "*", "*",clientID, "*"};

        ArrayList<Booking> bookingList = bdf.queryDatabase(bdf.createQuery(bookingQuery)).all();

        for (Booking booking : bookingList) {
            model.addRow(new Object[] {booking.getId(), booking.getCar().getManufacture(), booking.getCar().getModel(), 
                booking.getCar().getYear(), booking.getCar().getRentalCost(), booking.getStartDate(), booking.getEndDate(), booking.getIsConfirmed(), booking.calculateTotalCost()});
        }
    }

/**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        TitlePanel = new javax.swing.JPanel();
        HistoryTitle = new javax.swing.JLabel();
        TablePanel = new javax.swing.JPanel();
        HistoryTableScroll = new javax.swing.JScrollPane();
        HistoryTable = new javax.swing.JTable();

        setMaximumSize(new java.awt.Dimension(1298, 1012));
        setMinimumSize(new java.awt.Dimension(1298, 1012));
        setPreferredSize(new java.awt.Dimension(1298, 1012));

        HistoryTitle.setBackground(new java.awt.Color(0, 0, 0));
        HistoryTitle.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        HistoryTitle.setText("History Booking");
        TitlePanel.add(HistoryTitle);

        TablePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("History Booking"));
        TablePanel.setAutoscrolls(true);

        HistoryTable.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        HistoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Booking ID", "Car Manufacture", "Car Model", "Production Year", "Cost", "Start Date", "End Date", "Confirmation Status", "Total Amount"
            }
        ));
        HistoryTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        HistoryTable.setMaximumSize(null);
        HistoryTable.setMinimumSize(new java.awt.Dimension(525, 500));
        HistoryTable.setPreferredSize(null);
        HistoryTableScroll.setViewportView(HistoryTable);

        javax.swing.GroupLayout TablePanelLayout = new javax.swing.GroupLayout(TablePanel);
        TablePanel.setLayout(TablePanelLayout);
        TablePanelLayout.setHorizontalGroup(
            TablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HistoryTableScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 1264, Short.MAX_VALUE)
                .addContainerGap())
        );
        TablePanelLayout.setVerticalGroup(
            TablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HistoryTableScroll, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 907, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TitlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>                        


    // Variables declaration - do not modify                     
    private javax.swing.JTable HistoryTable;
    private javax.swing.JScrollPane HistoryTableScroll;
    private javax.swing.JLabel HistoryTitle;
    private javax.swing.JPanel TablePanel;
    private javax.swing.JPanel TitlePanel;
    // End of variables declaration                   
}

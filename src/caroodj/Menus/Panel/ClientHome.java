package Menus.Panel;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import Objects.Booking;
import Objects.BookingDataFile;
import Objects.Car;
import Objects.CarDataFile;
import Objects.Client;
import Objects.DataFile;
import Objects.PersonDataFile;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author William
 */
public class ClientHome extends javax.swing.JPanel {

    /**
     * Creates new form HomeClient
     */
    public ClientHome(String ClientID) {
        this.clientID = ClientID;

        initComponents();
        TableOngoingBooking.getColumnModel().getColumn(0).setPreferredWidth(200);
        TableOngoingBooking.getColumnModel().getColumn(1).setPreferredWidth(200);
        getOngoingBooking();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        MottoPanel = new javax.swing.JPanel();
        MottoText = new javax.swing.JLabel();
        BaseTitlePanel = new javax.swing.JPanel();
        TitlePanel = new javax.swing.JPanel();
        TitleHome = new javax.swing.JLabel();
        TablePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableOngoingBooking = new javax.swing.JTable();
        CancelBookingPanel = new javax.swing.JPanel();
        BookingIDText = new javax.swing.JLabel();
        BookingIDField = new javax.swing.JTextField();
        CancelBookingButton = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1670, 1008));
        setMinimumSize(new java.awt.Dimension(1670, 1008));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1670, 1008));

        MottoPanel.setBackground(new java.awt.Color(15, 129, 185));

        MottoText.setFont(new java.awt.Font("Segoe UI", 1, 64)); // NOI18N
        MottoText.setForeground(new java.awt.Color(255, 255, 255));
        MottoText.setText("Rental Car - Pick, Choose, Drive");

        javax.swing.GroupLayout MottoPanelLayout = new javax.swing.GroupLayout(MottoPanel);
        MottoPanel.setLayout(MottoPanelLayout);
        MottoPanelLayout.setHorizontalGroup(
            MottoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MottoPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(MottoText)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MottoPanelLayout.setVerticalGroup(
            MottoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MottoPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(MottoText)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        TitlePanel.setBackground(new java.awt.Color(0, 51, 102));

        TitleHome.setFont(new java.awt.Font("Rockwell", 0, 36)); // NOI18N
        TitleHome.setForeground(new java.awt.Color(255, 255, 255));
        TitleHome.setText("Ongoing Car Booking");

        javax.swing.GroupLayout TitlePanelLayout = new javax.swing.GroupLayout(TitlePanel);
        TitlePanel.setLayout(TitlePanelLayout);
        TitlePanelLayout.setHorizontalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TitlePanelLayout.createSequentialGroup()
                .addContainerGap(364, Short.MAX_VALUE)
                .addComponent(TitleHome)
                .addGap(356, 356, 356))
        );
        TitlePanelLayout.setVerticalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitlePanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(TitleHome)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        BaseTitlePanel.add(TitlePanel);

        TableOngoingBooking.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Booking ID", "Car ID", "Car Manufacture", "Car Model", "Production Year", "Rental Cost", "Start Date", "End Date", "Payment Method"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableOngoingBooking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                historyTableMouseClicked(evt);
            }
        });
        TableOngoingBooking.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(TableOngoingBooking);
        if (TableOngoingBooking.getColumnModel().getColumnCount() > 0) {
            TableOngoingBooking.getColumnModel().getColumn(0).setResizable(false);
            TableOngoingBooking.getColumnModel().getColumn(1).setResizable(false);
            TableOngoingBooking.getColumnModel().getColumn(2).setResizable(false);
            TableOngoingBooking.getColumnModel().getColumn(3).setResizable(false);
            TableOngoingBooking.getColumnModel().getColumn(4).setResizable(false);
            TableOngoingBooking.getColumnModel().getColumn(5).setResizable(false);
            TableOngoingBooking.getColumnModel().getColumn(6).setResizable(false);
            TableOngoingBooking.getColumnModel().getColumn(7).setResizable(false);
            TableOngoingBooking.getColumnModel().getColumn(8).setResizable(false);
        }

        javax.swing.GroupLayout TablePanelLayout = new javax.swing.GroupLayout(TablePanel);
        TablePanel.setLayout(TablePanelLayout);
        TablePanelLayout.setHorizontalGroup(
            TablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(TablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1670, Short.MAX_VALUE))
        );
        TablePanelLayout.setVerticalGroup(
            TablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 439, Short.MAX_VALUE)
            .addGroup(TablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(TablePanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        CancelBookingPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Enter Booking ID to Cancel Order"));

        BookingIDText.setText("Enter Booking ID :");

        CancelBookingButton.setText("Cancel Booking");
        CancelBookingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBookingButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CancelBookingPanelLayout = new javax.swing.GroupLayout(CancelBookingPanel);
        CancelBookingPanel.setLayout(CancelBookingPanelLayout);
        CancelBookingPanelLayout.setHorizontalGroup(
            CancelBookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CancelBookingPanelLayout.createSequentialGroup()
                .addGroup(CancelBookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CancelBookingPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(BookingIDText)
                        .addGap(18, 18, 18)
                        .addComponent(BookingIDField, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CancelBookingPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CancelBookingButton)))
                .addContainerGap())
        );
        CancelBookingPanelLayout.setVerticalGroup(
            CancelBookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CancelBookingPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(CancelBookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BookingIDText)
                    .addComponent(BookingIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CancelBookingButton)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MottoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(TablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BaseTitlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1664, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CancelBookingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MottoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BaseTitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CancelBookingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );
    }// </editor-fold>

    private void CancelBookingButtonActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            String bookingID = BookingIDField.getText();

            BookingDataFile bdf = new BookingDataFile("src\\caroodj\\Data\\Booking.txt");

            String[] bookingQuery = {bookingID, "*", "*", "*", "*", "*", "*", "*"};

            Booking booking = bdf.queryDatabase(bdf.createQuery(bookingQuery)).first();

            HashMap<String, String> updateMap = new HashMap<String, String>();

            updateMap.put("Confirmed", false+"");

            if (booking.update(updateMap)) {
                JOptionPane.showMessageDialog(null, "Booking is Cancelled");
            } else {
                JOptionPane.showMessageDialog(null, "An Error Occured");
            }   
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Booking ID not found");
        }
    }                                          
    private void historyTableMouseClicked(java.awt.event.MouseEvent evt) {
        Integer row = TableOngoingBooking.getSelectedRow();
        BookingIDField.setText((String)TableOngoingBooking.getValueAt(row, 0));
    }

    public void getOngoingBooking() {
        DefaultTableModel model = (DefaultTableModel) TableOngoingBooking.getModel();
        model.setRowCount(0);
        LocalDate now = LocalDate.now(); 
        BookingDataFile bdf = new BookingDataFile("src\\caroodj\\Data\\Booking.txt");
        String[] bookingQuery = {"*", "*", "*", "*", "false", "*",this.clientID, "*"};

        for (String i : bookingQuery) {
            System.out.println(i);
        }
        
        ArrayList<Booking> bookingList = bdf.queryDatabase(bdf.createQuery(bookingQuery)).all();

        for (Booking booking : bookingList) {
            if (DataFile.isHigher(booking.startDate, now)){
                model.addRow(new Object[] {booking.getId(),booking.car.getId(), booking.car.manufacture, booking.car.model, 
                booking.car.year, booking.car.rentalCost, booking.startDate, booking.endDate, booking.paymentMethod});
            }
        }
    }

    private String clientID;

    // Variables declaration - do not modify                     
    private javax.swing.JPanel BaseTitlePanel;
    private javax.swing.JTextField BookingIDField;
    private javax.swing.JLabel BookingIDText;
    private javax.swing.JButton CancelBookingButton;
    private javax.swing.JPanel CancelBookingPanel;
    private javax.swing.JPanel MottoPanel;
    private javax.swing.JLabel MottoText;
    private javax.swing.JTable TableOngoingBooking;
    private javax.swing.JPanel TablePanel;
    private javax.swing.JLabel TitleHome;
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration                   
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Menus.Panel;

import java.awt.CardLayout;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JOptionPane;

import Objects.BookingDataFile;

/**
 *
 * @author JUSTIN
 */
public class BookingQuery extends javax.swing.JPanel {

    /**
     * Creates new form BookingQuery
     */
    public BookingQuery() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        bookingIDLabel = new javax.swing.JLabel();
        carIDLabel = new javax.swing.JLabel();
        clientIDLabel = new javax.swing.JLabel();
        bookingIDField = new javax.swing.JTextField();
        carIDField = new javax.swing.JTextField();
        clientIDField = new javax.swing.JTextField();
        seperatorLine = new javax.swing.JSeparator();
        queryLabel = new javax.swing.JLabel();
        startDatePanel = new javax.swing.JPanel();
        startDateLabel1 = new javax.swing.JLabel();
        datePickerStart1 = new com.toedter.calendar.JDateChooser();
        startDateButton = new javax.swing.JButton();
        endDatePanel = new javax.swing.JPanel();
        endDateLabel1 = new javax.swing.JLabel();
        datePickerEnd1 = new com.toedter.calendar.JDateChooser();
        endDateButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setMinimumSize(new java.awt.Dimension(1276, 200));
        setPreferredSize(new java.awt.Dimension(1276, 200));

        bookingIDLabel.setText("Booking ID:");

        carIDLabel.setText("Car ID:");

        clientIDLabel.setText("Client ID:");

        queryLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        queryLabel.setText("Query 1");

        startDateLabel1.setText("Start Date:");
        startDatePanel.add(startDateLabel1);

        datePickerStart1.setPreferredSize(new java.awt.Dimension(150, 22));
        startDatePanel.add(datePickerStart1);

        startDateButton.setText("<");
        startDateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startDateButtonActionPerformed(evt);
            }
        });
        startDatePanel.add(startDateButton);

        endDateLabel1.setText("End Date:");
        endDatePanel.add(endDateLabel1);

        datePickerEnd1.setPreferredSize(new java.awt.Dimension(150, 22));
        endDatePanel.add(datePickerEnd1);

        endDateButton.setText("<");
        endDateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endDateButtonActionPerformed(evt);
            }
        });
        endDatePanel.add(endDateButton);

        jLabel1.setText("Payment:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "cash", "card", "*"}));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(240, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(queryLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bookingIDLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(clientIDLabel)
                                    .addComponent(carIDLabel))
                                .addGap(13, 13, 13)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bookingIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(startDatePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(carIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(clientIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(endDatePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addComponent(seperatorLine, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(489, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 35, Short.MAX_VALUE)
                .addComponent(queryLabel)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bookingIDLabel)
                        .addComponent(bookingIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(startDatePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(carIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carIDLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clientIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clientIDLabel)
                            .addComponent(jLabel1)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(endDatePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(seperatorLine, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>                        

    private void startDateButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                
        if (!comparisonSymbolStartIterator.hasNext()) {
            comparisonSymbolStartIterator = comparisonSymbol.iterator();
        }                                     
        startDateButton.setText(comparisonSymbolStartIterator.next());
        if (startDateButton.getText().equals("~")) {
            startDatePanel.add(datePickerStart2);
        } else {
            startDatePanel.remove(datePickerStart2);
        }
    }                                               

    private void endDateButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (!comparisonSymbolEndIterator.hasNext()) {
            comparisonSymbolEndIterator = comparisonSymbol.iterator();
        }                                     
        endDateButton.setText(comparisonSymbolEndIterator.next());
        if (endDateButton.getText().equals("~")) {
            endDatePanel.add(datePickerEnd2);
        } else {
            endDatePanel.remove(datePickerEnd2);
        }
    }

    public void setQueryLabel(String label) {
        this.queryLabel.setText(label);
    }

    public HashMap<String, String> getQueryData() {
        BookingDataFile bdf = new BookingDataFile("src\\caroodj\\Data\\Booking.txt");
        
        try {
            String startDateSymbol = startDateButton.getText();
            String endDateSymbol = endDateButton.getText();

            String startDateQuery = null;
            String endDateQuery = null;

            if (datePickerStart1.getDate() != null) {
                LocalDate dps1 = datePickerStart1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                switch (startDateSymbol) {
                    case "<":
                    startDateQuery = "* " + dps1;
                        break;
                    case "=":
                    startDateQuery = dps1+"";
                        break;
                    case ">":
                    startDateQuery = dps1+ " *";
                        break;
                    case "~":
                    if (datePickerEnd2.getDate() != null) {
                        LocalDate dps2 = datePickerStart2.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                        startDateQuery = dps1 + " " + dps2;
                    } else {
                        startDateQuery = dps1 + " *";
                    }
                        break;
                    case "*":
                    startDateQuery = "*";
                        break;
                    default:
                        break;
                }
            } else {
                startDateQuery = "*";
            }

            if (datePickerEnd1.getDate() != null) {
                LocalDate dpe1 = datePickerEnd1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                switch (endDateSymbol) {
                    case "<":
                    endDateQuery = "* " + dpe1;
                        break;
                    case "=":
                    endDateQuery = dpe1+"";
                        break;
                    case ">":
                    endDateQuery = dpe1 + " *";
                        break;
                    case "~":
                    if (datePickerEnd2.getDate() != null) {
                        LocalDate dpe2 = datePickerEnd2.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                        endDateQuery = dpe1 + " " + dpe2;
                    } else {
                        endDateQuery = dpe1 + " *";
                    }
                        break;
                    case "*":
                    endDateQuery = "*";
                        break;
                    default:
                        break;
                }
            } else {
                endDateQuery = "*";
            }
            
            String bookingIDQuery = (bookingIDField.getText().equals("") ? "*" : bookingIDField.getText());

            String carIDQuery = (carIDField.getText().equals("") ? "*" : carIDField.getText());

            String clientIDQuery =  (clientIDField.getText().equals("") ? "*" : clientIDField.getText());

            String paymentMethodQuery =  (String)jComboBox1.getSelectedItem();
            
            String[] bookingQuery = {bookingIDQuery, startDateQuery, endDateQuery, "*", "*", carIDQuery, clientIDQuery, paymentMethodQuery};

            return bdf.createQuery(bookingQuery);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please use the correct format for each field");
        }
        return null;
    }
    
    private com.toedter.calendar.JDateChooser datePickerStart2;
    private com.toedter.calendar.JDateChooser datePickerEnd2;

    private ArrayList<String> comparisonSymbol;
    private Iterator<String> comparisonSymbolStartIterator;
    private Iterator<String> comparisonSymbolEndIterator;

    // Variables declaration - do not modify                     
    private javax.swing.JTextField bookingIDField;
    private javax.swing.JLabel bookingIDLabel;
    private javax.swing.JTextField carIDField;
    private javax.swing.JLabel carIDLabel;
    private javax.swing.JTextField clientIDField;
    private javax.swing.JLabel clientIDLabel;
    private com.toedter.calendar.JDateChooser datePickerEnd1;
    private com.toedter.calendar.JDateChooser datePickerStart1;
    private javax.swing.JButton endDateButton;
    private javax.swing.JLabel endDateLabel1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel startDatePanel;
    private javax.swing.JPanel endDatePanel;
    private javax.swing.JLabel queryLabel;
    private javax.swing.JSeparator seperatorLine;
    private javax.swing.JButton startDateButton;
    private javax.swing.JLabel startDateLabel1;
    // End of variables declaration                   
}

package Menus.Panel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import Objects.Booking;
import Objects.Person;
import Objects.PersonDataFile;

import Objects.Client;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author William
 */
public class ClientAccountDetail extends javax.swing.JPanel {

    /**
     * Creates new form AccountClient
     */
    private String usernameDefault;
    private String passwordDefault;
    private String nameDefault;
    private String emailDefault;
    private LocalDate DOBDefault;

    private Client client;
    
    private String clientID;
    public ClientAccountDetail(String clientID) {
        this.clientID = clientID;
        PersonDataFile pdf = new PersonDataFile("src\\caroodj\\Data\\Person.txt");

        String query[] = {clientID, "*", "*", "*", "*", "*", "*"};

        this.client = Client.convertToClient(pdf.queryDatabase(pdf.createQuery(query)).first());

        this.usernameDefault = this.client.username;

        this.passwordDefault = this.client.getPassword();

        this.nameDefault = this.client.getName();

        this.emailDefault = this.client.getEmail();

        this.DOBDefault = this.client.getDateOfBirth();

        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        TitlePanel = new javax.swing.JPanel();
        TitleAccount = new javax.swing.JLabel();
        TablePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AccountTable = new javax.swing.JTable();
        buttonPanel = new javax.swing.JPanel();
        ResetButton = new javax.swing.JButton();
        SaveButton = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1298, 1012));
        setMinimumSize(new java.awt.Dimension(1298, 1012));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1298, 1012));
        setRequestFocusEnabled(false);

        TitleAccount.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TitleAccount.setText("Account Detail");
        TitlePanel.add(TitleAccount);

        AccountTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Username", null},
                {"Password", null},
                {"Name", null},
                {"Email", null},
                {"Date of Birth", null}
            },
            new String [] {
                "Key", "Value"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(AccountTable);
        if (AccountTable.getColumnModel().getColumnCount() > 0) {
            AccountTable.getColumnModel().getColumn(0).setResizable(false);
            AccountTable.getColumnModel().getColumn(1).setResizable(false);
        }

        TablePanel.add(jScrollPane1);

        ResetButton.setText("Reset to Default");
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(ResetButton);

        SaveButton.setText("Save");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(SaveButton);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1529, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(TablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(756, Short.MAX_VALUE))
        );
    }// </editor-fold>    

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) AccountTable.getModel();
        
        String username = (String)model.getValueAt(0, 1);
        String password = (String)model.getValueAt(1, 1);
        String name = (String)model.getValueAt(2, 1);
        String email = (String)model.getValueAt(3, 1);
        String dateOfBirth = (String)model.getValueAt(4, 1);

        HashMap<String, String> updateMap = new HashMap<String, String>();

        System.out.println(username);
        System.out.println(password);
        System.out.println(name);
        System.out.println(email);
        System.out.println(dateOfBirth);
        System.out.println(client.getId());

        updateMap.put("Username", username);
        updateMap.put("Name", name);
        updateMap.put("Password", password);
        updateMap.put("Email", email);
        updateMap.put("DOB", dateOfBirth+"");

        if (this.client.update(updateMap)) {
            JOptionPane.showMessageDialog(null, "Admin is Updated!");
            this.usernameDefault = username;
            this.nameDefault = name;
            this.passwordDefault = password;
            this.emailDefault = email;
            this.DOBDefault = LocalDate.parse(dateOfBirth);
        } else {
            JOptionPane.showMessageDialog(null, "An Error Occurred!");
        }
    }
                                        

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) AccountTable.getModel();

        model.setValueAt(this.usernameDefault, 0, 1);
        model.setValueAt(this.passwordDefault, 1, 1);
        model.setValueAt(this.nameDefault, 2, 1);
        model.setValueAt(this.emailDefault, 3, 1);
        model.setValueAt(this.DOBDefault, 4, 1);


        System.out.println("HIT");
        System.out.println(this.nameDefault);
    }                                          
                                              

    // Variables declaration - do not modify                     
    private javax.swing.JTable AccountTable;
    private javax.swing.JButton ResetButton;
    private javax.swing.JButton SaveButton;
    private javax.swing.JPanel TablePanel;
    private javax.swing.JLabel TitleAccount;
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration                   
}

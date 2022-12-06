package Menus.Panel;

import java.time.LocalDate;
import java.util.HashMap;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import Objects.Admin;
import Objects.PersonDataFile;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author Justin
 */
public class AdminAccountDetail extends javax.swing.JPanel {

    /**
     * Creates new form AccountClient
     */
    private String usernameDefault;
    private String passwordDefault;
    private String nameDefault;
    private String emailDefault;
    private LocalDate DOBDefault;

    private Admin admin;

    private String adminID;
    public AdminAccountDetail(String adminID) {
        this.adminID = adminID;
        PersonDataFile pdf = new PersonDataFile("src\\caroodj\\Data\\Person.txt");

        String query[] = {adminID, "*", "*", "*", "*", "*", "*"};

        this.admin = Admin.convertToAdmin(pdf.queryDatabase(pdf.createQuery(query)).first());

        this.usernameDefault = this.admin.username;

        this.passwordDefault = this.admin.getPassword();

        this.nameDefault = this.admin.getName();

        this.emailDefault = this.admin.getEmail();

        this.DOBDefault = this.admin.getDateOfBirth();

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

        TitlePanel = new javax.swing.JPanel();
        TitleAccount = new javax.swing.JLabel();
        TablePanel = new javax.swing.JPanel();
        AccountScroll = new javax.swing.JScrollPane();
        AccountTable = new javax.swing.JTable();
        SaveButton = new javax.swing.JButton();
        ResetButton = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1928, 1012));
        setMinimumSize(new java.awt.Dimension(1298, 1012));
        setPreferredSize(new java.awt.Dimension(1928, 1012));
        setVerifyInputWhenFocusTarget(false);

        TitlePanel.setToolTipText("");

        TitleAccount.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TitleAccount.setForeground(new java.awt.Color(51, 51, 51));
        TitleAccount.setText("ACCOUNT");
        TitlePanel.add(TitleAccount);

        TablePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Edit Profile"));

        AccountTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Username", this.usernameDefault},
                {"Password", this.passwordDefault},
                {"Name", this.nameDefault},
                {"Email", this.emailDefault},
                {"Date of Birth", this.DOBDefault+""}
            },
            new String [] {
                "Key", "Value"
            }
        ));
        AccountTable.setName(""); // NOI18N
        AccountTable.setPreferredSize(new java.awt.Dimension(50, 100));
        AccountScroll.setViewportView(AccountTable);
        if (AccountTable.getColumnModel().getColumnCount() > 0) {
            AccountTable.getColumnModel().getColumn(0).setResizable(false);
            AccountTable.getColumnModel().getColumn(1).setResizable(false);
        }

        TablePanel.add(AccountScroll);

        SaveButton.setText("Save");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        ResetButton.setText("Reset to Default");
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TitlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TablePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(681, Short.MAX_VALUE)
                .addComponent(SaveButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ResetButton)
                .addGap(425, 425, 425))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveButton)
                    .addComponent(ResetButton))
                .addGap(0, 881, Short.MAX_VALUE))
        );
    }// </editor-fold>                        

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {
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
        System.out.println(admin.getId());

        updateMap.put("Username", username);
        updateMap.put("Name", name);
        updateMap.put("Password", password);
        updateMap.put("Email", email);
        updateMap.put("DOB", dateOfBirth+"");

        if (this.admin.update(updateMap)) {
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
    private javax.swing.JScrollPane AccountScroll;
    private javax.swing.JButton ResetButton;
    private javax.swing.JButton SaveButton;
    private javax.swing.JPanel TablePanel;
    private javax.swing.JLabel TitleAccount;
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JTable AccountTable;
    // End of variables declaration                   
}

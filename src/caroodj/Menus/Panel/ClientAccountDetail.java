package Menus.Panel;

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
    private String nameDefault;
    //make ini klo di reset
    private String clientID;
    public ClientAccountDetail(String clientID) {
        this.clientID = clientID;
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
        AccountTable = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        ));
        jTable1.setName(""); // NOI18N
        jTable1.setPreferredSize(new java.awt.Dimension(50, 100));
        AccountTable.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
        }

        TablePanel.add(AccountTable);

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
        // TODO add your handling code here:
    }                                          

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           


    // Variables declaration - do not modify                     
    private javax.swing.JScrollPane AccountTable;
    private javax.swing.JButton ResetButton;
    private javax.swing.JButton SaveButton;
    private javax.swing.JPanel TablePanel;
    private javax.swing.JLabel TitleAccount;
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JTable jTable1;
    // End of variables declaration                   
}

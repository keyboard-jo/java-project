/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Menus.Panel;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.function.Function;

import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import Objects.Client;
import Objects.EntityId;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author JUSTIN
 */
public class RegisterPanel extends javax.swing.JPanel {

    /**
     * Creates new form Register
     */
    public RegisterPanel(Function <java.awt.event.MouseEvent, Void> mouseEventFunction) {
        this.mouseEventFunction = mouseEventFunction;
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
        java.awt.GridBagConstraints gridBagConstraints;

        setPreferredSize(new java.awt.Dimension(1000, 600));

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Username");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(jLabel1, gridBagConstraints);

        jTextField1.setPreferredSize(new java.awt.Dimension(128, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(jTextField1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setText("REGISTER");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Password");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(jLabel3, gridBagConstraints);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(jButton1, gridBagConstraints);

        jPasswordField1.setPreferredSize(new java.awt.Dimension(128, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(jPasswordField1, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        jLabel4.setText("Already have an account login here");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouseEventFunction.apply(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        add(jLabel4, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Email");
        jLabel5.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(jLabel5, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Name");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(jLabel6, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Date of Birth");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(jLabel7, gridBagConstraints);

        jTextField2.setPreferredSize(new java.awt.Dimension(128, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(jTextField2, gridBagConstraints);

        jTextField3.setPreferredSize(new java.awt.Dimension(128, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(jTextField3, gridBagConstraints);

        jDateChooser1.setPreferredSize(new java.awt.Dimension(128, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(jDateChooser1, gridBagConstraints);
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        if ((jTextField1.getText().equals("")) || (String.valueOf(jPasswordField1.getPassword()).equals("")) || (jDateChooser1.getDate() == null)) {
            JOptionPane.showMessageDialog(null, "Please fill all compulsary fields");
        } else {
            String username = jTextField1.getText();
            String password = String.valueOf(jPasswordField1.getPassword());
            String email = jTextField2.getText();
            String name = jTextField3.getText();
            LocalDate dateOfBirth = jDateChooser1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            Client client = new Client(username, password, dateOfBirth);
            client.setEmail(email);
            client.setName(name);
            client.setId("CL:" + EntityId.generateId());
            if (client.register()) {
                JOptionPane.showMessageDialog(null, "Succesful Registration");
            } else {
                JOptionPane.showMessageDialog(null, "Registration Error! Duplicate Username");
            }
        }
        
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private Function <java.awt.event.MouseEvent, Void> mouseEventFunction;
    // End of variables declaration                   
}

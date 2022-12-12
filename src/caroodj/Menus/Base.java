/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Menus;

import java.awt.Container;
import java.awt.event.MouseEvent;
import java.util.function.Function;

import javax.swing.JOptionPane;

import Menus.Panel.LoginPanel;
import Menus.Panel.RegisterPanel;
import Menus.Panel.SidePanel;

/**
 *
 * @author JUSTIN
 */
public class Base extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Base() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    
    // 1920 x 992
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Car Rental Service");

        setPreferredSize(new java.awt.Dimension(1920, 1012));

        cPane = getContentPane();
        card = new java.awt.CardLayout();
        cPane.setLayout(card);

        cPane.add("Login", new LoginPanel(this.goToRegisterMenu, this.goToHomeMenu));
        cPane.add("Register", new RegisterPanel(this.goToLoginMenu));

        pack();


    }// </editor-fold>

    java.awt.CardLayout card;
    Container cPane;

    private Function<MouseEvent, Void> goToLoginMenu = e -> {
        this.card.show(this.cPane, "Login");
        return null;
    };

    private Function<java.awt.event.ActionEvent, Void> goToLoginMenuButton = e -> {
        this.card.show(this.cPane, "Login");
        JOptionPane.showMessageDialog(null, "Logout successful!");
        return null;
    };

    private Function<MouseEvent, Void> goToRegisterMenu = e -> {
        this.card.show(this.cPane, "Register");
        return null;
    };

    public Function<String, Void> addPersonHomeMenu = p -> {
        this.cPane.add("Home", new SidePanel(p, goToLoginMenuButton));
        return null;
    };

    private Function<String, Void> goToHomeMenu = p -> {
        this.addPersonHomeMenu.apply(p);
        this.card.show(this.cPane, "Home");
        JOptionPane.showMessageDialog(null, "Login successful!");
        return null;
    };
}

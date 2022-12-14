/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Menus.Panel;

import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.BoxLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

import Objects.Car;
import Objects.CarDataFile;
import Objects.EntityId;

/**
 *
 * @author JUSTIN
 */
public class ManageCarInformationMenu extends javax.swing.JPanel {

    /**
     * Creates new form ManageCarInformation
     */
    public ManageCarInformationMenu() {
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

        queryFull = new JPanel();

        queryFull.setLayout(new BoxLayout(queryFull, BoxLayout.Y_AXIS));

        carQueries.add(new CarQuery());

        queryFull.add(carQueries.get(0));

        queryScroll = new javax.swing.JScrollPane(queryFull);

        titlePanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        crudPanel = new javax.swing.JPanel();
        crudMenuPanel = new javax.swing.JPanel();
        addMenu = new javax.swing.JPanel();
        manufactureLabel = new javax.swing.JLabel();
        manufactureField = new javax.swing.JTextField();
        modelLabel = new javax.swing.JLabel();
        modelField = new javax.swing.JTextField();
        yopLabel = new javax.swing.JLabel();
        rentLabel = new javax.swing.JLabel();
        yopField = new com.toedter.calendar.JDateChooser();
        rentField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        addMenuLabel = new javax.swing.JLabel();
        updateMenu = new javax.swing.JPanel();
        manufactureLabel2 = new javax.swing.JLabel();
        manufactureField1 = new javax.swing.JTextField();
        modelLabel1 = new javax.swing.JLabel();
        modelField1 = new javax.swing.JTextField();
        yopLabel1 = new javax.swing.JLabel();
        rentLabel1 = new javax.swing.JLabel();
        yopField1 = new com.toedter.calendar.JDateChooser();
        rentField1 = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        updateMenuLabel = new javax.swing.JLabel();
        rentedLabel = new javax.swing.JLabel();
        rentedCarBox = new javax.swing.JCheckBox();
        carIDLabel = new javax.swing.JLabel();
        carID = new javax.swing.JLabel();
        removeMenu = new javax.swing.JPanel();
        removeMenuLabel = new javax.swing.JLabel();
        manufactureLabel1 = new javax.swing.JLabel();
        carIDField = new javax.swing.JTextField();
        removeButton = new javax.swing.JButton();
        crudButtonPanel = new javax.swing.JPanel();
        previousButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        carQueryPanel = new javax.swing.JPanel();
        addQueryButton = new javax.swing.JButton();
        removeQueryButton = new javax.swing.JButton();
        clearQueryButton = new javax.swing.JButton();
        searchButtton = new javax.swing.JButton();
        
        tableScroll = new javax.swing.JScrollPane();
        carTable = new javax.swing.JTable();

        setMinimumSize(new java.awt.Dimension(1298, 1012));
        setPreferredSize(new java.awt.Dimension(1298, 1012));

        titleLabel.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        titleLabel.setText("MANAGE CAR INFORMATION");
        titlePanel.add(titleLabel);

        crudPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Add, Remove, Update Car"));

        crudMenuPanel.setLayout(new java.awt.CardLayout());

        addMenu.setMinimumSize(new java.awt.Dimension(1276, 200));
        addMenu.setPreferredSize(new java.awt.Dimension(1276, 200));

        manufactureLabel.setText("Manufacture:");

        manufactureField.setMinimumSize(new java.awt.Dimension(178, 22));
        manufactureField.setPreferredSize(new java.awt.Dimension(178, 22));

        modelLabel.setText("Model:");

        modelField.setMinimumSize(new java.awt.Dimension(178, 22));
        modelField.setPreferredSize(new java.awt.Dimension(178, 22));

        yopLabel.setText("Year of Production:");

        rentLabel.setText("Rental Cost:");

        yopField.setMinimumSize(new java.awt.Dimension(178, 22));
        yopField.setPreferredSize(new java.awt.Dimension(178, 22));

        rentField.setMinimumSize(new java.awt.Dimension(178, 22));
        rentField.setPreferredSize(new java.awt.Dimension(178, 22));

        addButton.setText("ADD");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        addMenuLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addMenuLabel.setText("Add Car Menu");

        javax.swing.GroupLayout addMenuLayout = new javax.swing.GroupLayout(addMenu);
        addMenu.setLayout(addMenuLayout);
        addMenuLayout.setHorizontalGroup(
            addMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addMenuLayout.createSequentialGroup()
                .addGap(389, 389, 389)
                .addGroup(addMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addButton)
                    .addGroup(addMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(addMenuLabel)
                        .addGroup(addMenuLayout.createSequentialGroup()
                            .addGroup(addMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(modelLabel)
                                .addComponent(manufactureLabel))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(addMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(addMenuLayout.createSequentialGroup()
                                    .addComponent(manufactureField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(yopLabel))
                                .addGroup(addMenuLayout.createSequentialGroup()
                                    .addComponent(modelField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rentLabel)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(addMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(yopField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rentField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(328, Short.MAX_VALUE))
        );
        addMenuLayout.setVerticalGroup(
            addMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addMenuLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(addMenuLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manufactureLabel)
                    .addComponent(manufactureField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yopLabel)
                    .addComponent(yopField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(addMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modelLabel)
                    .addComponent(modelField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rentLabel)
                    .addComponent(rentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addButton)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        crudMenuPanel.add(addMenu, "addMenu");

        manufactureLabel2.setText("Manufacture:");

        manufactureField1.setMinimumSize(new java.awt.Dimension(178, 22));
        manufactureField1.setPreferredSize(new java.awt.Dimension(178, 22));

        modelLabel1.setText("Model:");

        modelField1.setMinimumSize(new java.awt.Dimension(178, 22));
        modelField1.setPreferredSize(new java.awt.Dimension(178, 22));

        yopLabel1.setText("Year of Production:");

        rentLabel1.setText("Rental Cost:");

        yopField1.setMinimumSize(new java.awt.Dimension(178, 22));
        yopField1.setPreferredSize(new java.awt.Dimension(178, 22));

        rentField1.setMinimumSize(new java.awt.Dimension(178, 22));
        rentField1.setPreferredSize(new java.awt.Dimension(178, 22));

        updateButton.setText("UPDATE");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        updateMenuLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        updateMenuLabel.setText("Update Car Menu");

        rentedLabel.setText("Rented:");

        rentedCarBox.setText("isRented");

        carIDLabel.setText("Car ID:");

        carID.setText("XXXXXXXXXXXXXXXXXXXXXXXXX");

        javax.swing.GroupLayout updateMenuLayout = new javax.swing.GroupLayout(updateMenu);
        updateMenu.setLayout(updateMenuLayout);
        updateMenuLayout.setHorizontalGroup(
            updateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateMenuLayout.createSequentialGroup()
                .addGap(389, 389, 389)
                .addGroup(updateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updateMenuLabel)
                    .addGroup(updateMenuLayout.createSequentialGroup()
                        .addGroup(updateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(carIDLabel)
                            .addComponent(modelLabel1)
                            .addComponent(manufactureLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(updateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(manufactureField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modelField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(updateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(updateMenuLayout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(rentedLabel))
                            .addGroup(updateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(yopLabel1)
                                .addComponent(rentLabel1, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGroup(updateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateMenuLayout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(updateButton))
                            .addGroup(updateMenuLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(updateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rentedCarBox)
                                    .addGroup(updateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(yopField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rentField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(333, Short.MAX_VALUE))
        );
        updateMenuLayout.setVerticalGroup(
            updateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateMenuLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(updateMenuLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(updateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yopLabel1)
                    .addComponent(yopField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carIDLabel)
                    .addComponent(carID))
                .addGap(32, 32, 32)
                .addGroup(updateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updateMenuLayout.createSequentialGroup()
                        .addGroup(updateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rentLabel1)
                            .addComponent(rentField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(updateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rentedLabel)
                            .addComponent(rentedCarBox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(updateButton))
                    .addGroup(updateMenuLayout.createSequentialGroup()
                        .addGroup(updateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(manufactureLabel2)
                            .addComponent(manufactureField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(updateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(modelLabel1)
                            .addComponent(modelField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        crudMenuPanel.add(updateMenu, "updateMenu");

        removeMenuLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        removeMenuLabel.setText("Remove Car Menu");

        manufactureLabel1.setText("Car ID:");

        carIDField.setMinimumSize(new java.awt.Dimension(178, 22));
        carIDField.setPreferredSize(new java.awt.Dimension(178, 22));

        removeButton.setText("REMOVE");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout removeMenuLayout = new javax.swing.GroupLayout(removeMenu);
        removeMenu.setLayout(removeMenuLayout);
        removeMenuLayout.setHorizontalGroup(
            removeMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removeMenuLayout.createSequentialGroup()
                .addGap(389, 389, 389)
                .addGroup(removeMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(removeButton)
                    .addGroup(removeMenuLayout.createSequentialGroup()
                        .addComponent(manufactureLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(carIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(removeMenuLabel))
                .addContainerGap(656, Short.MAX_VALUE))
        );
        removeMenuLayout.setVerticalGroup(
            removeMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removeMenuLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(removeMenuLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(removeMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manufactureLabel1)
                    .addComponent(carIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(removeButton)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        crudMenuPanel.add(removeMenu, "removeMenu");

        previousButton.setText("PREVIOUS");
        previousButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousButtonActionPerformed(evt);
            }
        });
        crudButtonPanel.add(previousButton);

        nextButton.setText("NEXT");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });
        crudButtonPanel.add(nextButton);

        javax.swing.GroupLayout crudPanelLayout = new javax.swing.GroupLayout(crudPanel);
        crudPanel.setLayout(crudPanelLayout);
        crudPanelLayout.setHorizontalGroup(
            crudPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crudPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(crudPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(crudMenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(crudButtonPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        crudPanelLayout.setVerticalGroup(
            crudPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crudPanelLayout.createSequentialGroup()
                .addComponent(crudMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(crudButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        carQueryPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Search Car"));
        carQueryPanel.setMinimumSize(new java.awt.Dimension(1276, 250));
        carQueryPanel.setPreferredSize(new java.awt.Dimension(1276, 500));

        addQueryButton.setText("ADD QUERY");
        addQueryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addQueryButtonActionPerformed(evt);
            }
        });

        removeQueryButton.setText("REMOVE QUERY");
        removeQueryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeQueryButtonActionPerformed(evt);
            }
        });

        clearQueryButton.setText("CLEAR QUERY");
        clearQueryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearQueryButtonActionPerformed(evt);
            }
        });

        searchButtton.setText("SEARCH");
        searchButtton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButttonActionPerformed(evt);
            }
        });

        queryScroll.setMinimumSize(new java.awt.Dimension(1276, 200));
        queryScroll.setPreferredSize(new java.awt.Dimension(1276, 200));

        javax.swing.GroupLayout bookingQueryPanelLayout = new javax.swing.GroupLayout(carQueryPanel);
        carQueryPanel.setLayout(bookingQueryPanelLayout);
        bookingQueryPanelLayout.setHorizontalGroup(
            bookingQueryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookingQueryPanelLayout.createSequentialGroup()
                .addComponent(addQueryButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(removeQueryButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clearQueryButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchButtton)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(bookingQueryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookingQueryPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(queryScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 1270, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        bookingQueryPanelLayout.setVerticalGroup(
            bookingQueryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookingQueryPanelLayout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addGroup(bookingQueryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addQueryButton)
                    .addComponent(removeQueryButton)
                    .addComponent(clearQueryButton)
                    .addComponent(searchButtton))
                .addContainerGap(3, Short.MAX_VALUE))
            .addGroup(bookingQueryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bookingQueryPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(queryScroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(32, Short.MAX_VALUE)))
        );

        carTable.setModel(new javax.swing.table.DefaultTableModel(
            null,
            new String [] {
                "Car ID", "Manufacture", "Model", "Year of Production", "Rental Cost", "Is Rented"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        carTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carTableMouseClicked(evt);
            }
        });
        tableScroll.setViewportView(carTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(crudPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(carQueryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1298, Short.MAX_VALUE)
                    .addComponent(tableScroll))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(crudPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(carQueryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tableScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>                        

    private void addQueryButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        carQueries.add(new CarQuery());

        CarQuery lastCarQuery = carQueries.get(carQueries.size() - 1);

        this.queryCount += 1;

        lastCarQuery.setQueryLabel("Query " + this.queryCount);

        queryFull.add(lastCarQuery);
        queryFull.revalidate();
    }
    
    private void removeQueryButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        if (this.queryCount == 1) {
            JOptionPane.showMessageDialog(null, "Cannot Remove Anymore Query");
        } else {
            queryFull.remove(carQueries.get(carQueries.size() - 1));
    
            carQueries.remove(carQueries.size() - 1);
    
            this.queryCount -= 1;
    
            queryFull.revalidate();
        }
    }

    private void clearQueryButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        for (Integer i = (carQueries.size() - 1); i >= 1; i--) {
            queryFull.remove(carQueries.size() - 1);
            carQueries.remove(carQueries.size() - 1);
            this.queryCount -= 1;
        }

        queryFull.revalidate();
    } 

    private void searchButttonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        DefaultTableModel model = (DefaultTableModel) carTable.getModel();
        model.setRowCount(0);

        for (CarQuery carQuery :carQueries) {
            CarDataFile cdf = new CarDataFile("src\\caroodj\\Data\\Car.txt");

            HashMap<String, String> query = carQuery.getQueryData();

            ArrayList<Car> carList = cdf.queryDatabase(query).all();

            for (Car car : carList) {
                model.addRow(new Object[] {car.getId(), car.getManufacture(), car.getModel(), car.getYear(), car.getRentalCost(), car.getIsRented()});
            }
        }

    }                                       

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {   
        try {
            String carId = carID.getText();
            String manufacture = manufactureField1.getText();
            String model = modelField1.getText();
            LocalDate yop = yopField1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            Double rent = Double.parseDouble(rentField1.getText());
            Boolean isRented = rentedCarBox.isSelected();
    
            CarDataFile cdf = new CarDataFile("src\\caroodj\\Data\\Car.txt");
    
            String[] query = {carId, "*", "*", "*", "*", "*"};
    
            Car car = cdf.queryDatabase(cdf.createQuery(query)).first();
    
            HashMap<String, String> updateMap = new HashMap<String, String>();
    
            updateMap.put("Manufacture", manufacture);
            updateMap.put("Model", model);
            updateMap.put("Year", yop+"");
            updateMap.put("Rent", rent+"");
            updateMap.put("isRented", isRented+"");
    
            if (car.update(updateMap)) {
                JOptionPane.showMessageDialog(null, "Car is Updated!");
            } else {
                JOptionPane.showMessageDialog(null, "An Error is Occurred!");
            }    
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please use the correct format for each field");
        }                                        
        
    }                                          

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {      
        try {
            String manufacture = manufactureField.getText();
            String model = modelField.getText();
            LocalDate yop = yopField.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            Double rent = Double.parseDouble(rentField.getText());

            Car car = new Car(manufacture, model, yop, rent, false);
            car.setId("CA:" + EntityId.generateId());

            try {
                if (car.record()) {
                    JOptionPane.showMessageDialog(null, "Car Successfully Added!");    
                } else {
                    JOptionPane.showMessageDialog(null, "An Error Occured!");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "An Error Occured!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please use the correct format for each field");
        }                                    
    }                                         

    private void previousButtonActionPerformed(java.awt.event.ActionEvent evt) {
        this.menuCode -= 1;

        if (this.menuCode == 0) {
            this.menuCode = 3;
        }

        java.awt.CardLayout card = (java.awt.CardLayout)crudMenuPanel.getLayout();
        card.previous(crudMenuPanel);
    }                                              

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        this.menuCode += 1;

        if (this.menuCode == 4) {
            this.menuCode = 1;
        }

        java.awt.CardLayout card = (java.awt.CardLayout)crudMenuPanel.getLayout();
        card.next(crudMenuPanel);
    }                                          

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        if (carIDField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Input The Car ID");
        } else {
            String carId = carIDField.getText();
            CarDataFile cdf = new CarDataFile("src\\caroodj\\Data\\Car.txt");
            try {
                cdf.removeEntry(carId);
                JOptionPane.showMessageDialog(null, "Car Successfully Removed!");
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "No Car With That ID!");
            }
        }
    }

    private void carTableMouseClicked(java.awt.event.MouseEvent evt) {
        Integer row = carTable.getSelectedRow();

        if (this.menuCode == 2) {
            carID.setText((String)carTable.getValueAt(row, 0));
            manufactureField1.setText((String)carTable.getValueAt(row, 1));
            modelField1.setText((String)carTable.getValueAt(row, 2));
            yopField1.setDate(Date.valueOf((LocalDate)carTable.getValueAt(row, 3)));
            rentField1.setText(carTable.getValueAt(row, 4)+"");
            rentedCarBox.setSelected((Boolean)carTable.getValueAt(row, 5));

        } else if (this.menuCode == 3) {
            carIDField.setText((String)carTable.getValueAt(row, 0));
        }
    }        
    
    private ArrayList<CarQuery> carQueries = new ArrayList<CarQuery>();

    private Integer queryCount = 1;

    private JPanel queryFull; 

    private Integer menuCode = 1;


    // Variables declaration - do not modify                     
    private javax.swing.JButton addButton;
    private javax.swing.JButton updateButton;
    private javax.swing.JPanel addMenu;
    private javax.swing.JLabel addMenuLabel;
    private javax.swing.JButton addQueryButton;
    private javax.swing.JButton removeQueryButton;
    private javax.swing.JButton clearQueryButton;
    private javax.swing.JPanel carQueryPanel;
    private javax.swing.JLabel carID;
    private javax.swing.JTextField carIDField;
    private javax.swing.JLabel carIDLabel;
    private javax.swing.JTable carTable;
    private javax.swing.JPanel crudButtonPanel;
    private javax.swing.JPanel crudMenuPanel;
    private javax.swing.JPanel crudPanel;
    private javax.swing.JTextField manufactureField;
    private javax.swing.JTextField manufactureField1;
    private javax.swing.JLabel manufactureLabel;
    private javax.swing.JLabel manufactureLabel1;
    private javax.swing.JLabel manufactureLabel2;
    private javax.swing.JTextField modelField;
    private javax.swing.JTextField modelField1;
    private javax.swing.JLabel modelLabel;
    private javax.swing.JLabel modelLabel1;
    private javax.swing.JButton nextButton;
    private javax.swing.JButton previousButton;
    private javax.swing.JScrollPane queryScroll;
    private javax.swing.JButton removeButton;
    private javax.swing.JPanel removeMenu;
    private javax.swing.JLabel removeMenuLabel;
    private javax.swing.JTextField rentField;
    private javax.swing.JTextField rentField1;
    private javax.swing.JLabel rentLabel;
    private javax.swing.JLabel rentLabel1;
    private javax.swing.JCheckBox rentedCarBox;
    private javax.swing.JLabel rentedLabel;
    private javax.swing.JButton searchButtton;
    private javax.swing.JScrollPane tableScroll;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JPanel updateMenu;
    private javax.swing.JLabel updateMenuLabel;
    private com.toedter.calendar.JDateChooser yopField;
    private com.toedter.calendar.JDateChooser yopField1;
    private javax.swing.JLabel yopLabel;
    private javax.swing.JLabel yopLabel1;
    // End of variables declaration                   
}

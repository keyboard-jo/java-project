/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Menus.Panel;

import java.time.LocalDate;

import javax.swing.table.DefaultTableModel;

import Objects.Car;
import Objects.Client;
import Objects.Report;

/**
 *
 * @author JUSTIN
 */
public class CreateReport extends javax.swing.JPanel {

    /**
     * Creates new form CreateReport
     */
    public CreateReport() {
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

        titlePanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        reportPanel = new javax.swing.JPanel();
        startDateLabel = new javax.swing.JLabel();
        endDateLabel = new javax.swing.JLabel();
        createButton = new javax.swing.JButton();
        endDateMonth = new com.toedter.calendar.JMonthChooser();
        startDateMonth = new com.toedter.calendar.JMonthChooser();
        yearPicker = new com.toedter.calendar.JYearChooser();
        yearLabel = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        mapPanel = new javax.swing.JPanel();
        clientScroll = new javax.swing.JScrollPane();
        clientTable = new javax.swing.JTable();
        carScroll = new javax.swing.JScrollPane();
        carTable = new javax.swing.JTable();
        topPanel = new javax.swing.JPanel();
        topClientPanel = new javax.swing.JPanel();
        topCarPanel = new javax.swing.JPanel();
        statisticsPanel = new javax.swing.JPanel();
        statisticsScroll = new javax.swing.JScrollPane();
        statisticsTable = new javax.swing.JTable();

        setMinimumSize(new java.awt.Dimension(1298, 1012));
        setPreferredSize(new java.awt.Dimension(1298, 1012));

        titleLabel.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        titleLabel.setText("CREATE REPORT");
        titlePanel.add(titleLabel);

        reportPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Create Report"));

        startDateLabel.setText("Start Date:");

        endDateLabel.setText("End Date:");

        createButton.setText("CREATE");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        yearLabel.setText("Year:");

        searchButton.setText("SEARCH");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout reportPanelLayout = new javax.swing.GroupLayout(reportPanel);
        reportPanel.setLayout(reportPanelLayout);
        reportPanelLayout.setHorizontalGroup(
            reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportPanelLayout.createSequentialGroup()
                .addGap(489, 489, 489)
                .addGroup(reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(reportPanelLayout.createSequentialGroup()
                        .addGroup(reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(startDateLabel)
                            .addComponent(yearLabel))
                        .addGap(65, 65, 65)
                        .addGroup(reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(yearPicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(startDateMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(reportPanelLayout.createSequentialGroup()
                            .addComponent(searchButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(createButton))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reportPanelLayout.createSequentialGroup()
                            .addComponent(endDateLabel)
                            .addGap(65, 65, 65)
                            .addComponent(endDateMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        reportPanelLayout.setVerticalGroup(
            reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reportPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(yearPicker, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(reportPanelLayout.createSequentialGroup()
                        .addComponent(startDateMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(reportPanelLayout.createSequentialGroup()
                                .addComponent(endDateLabel)
                                .addGap(30, 30, 30)
                                .addGroup(reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(createButton)
                                    .addComponent(searchButton)))
                            .addComponent(endDateMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(startDateLabel))
                .addGap(34, 34, 34))
        );

        mapPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Client and Rental Cost & Car and Count"));

        clientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Client Id", "Total Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        clientScroll.setViewportView(clientTable);

        mapPanel.add(clientScroll);

        carTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Car Id", "Car Count"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        carScroll.setViewportView(carTable);

        mapPanel.add(carScroll);

        topPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Top Client & Car"));

        topClientPanel.setMinimumSize(new java.awt.Dimension(1286, 50));
        topClientPanel.setPreferredSize(new java.awt.Dimension(1286, 50));

        topCarPanel.setMinimumSize(new java.awt.Dimension(1286, 50));
        topCarPanel.setPreferredSize(new java.awt.Dimension(1286, 50));

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topClientPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addComponent(topCarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addComponent(topClientPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(topCarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        statisticsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Statistics"));

        statisticsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Key", "Value"
            }
        ));
        statisticsScroll.setViewportView(statisticsTable);

        javax.swing.GroupLayout statisticsPanelLayout = new javax.swing.GroupLayout(statisticsPanel);
        statisticsPanel.setLayout(statisticsPanelLayout);
        statisticsPanelLayout.setHorizontalGroup(
            statisticsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(statisticsScroll)
                .addContainerGap())
        );
        statisticsPanelLayout.setVerticalGroup(
            statisticsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticsPanelLayout.createSequentialGroup()
                .addComponent(statisticsScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reportPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mapPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(statisticsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(topPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(reportPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mapPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(statisticsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>                        

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        Integer year = yearPicker.getYear();

        LocalDate starDateBoundry = LocalDate.of(year, startDateMonth.getMonth() + 1, 1);

        LocalDate endDate = LocalDate.of((startDateMonth.getMonth() > endDateMonth.getMonth()) ? year + 1: year, endDateMonth.getMonth() + 1, 1);

        LocalDate endDateBoundry = endDate.withDayOfMonth(endDate.getMonth().length(endDate.isLeapYear()));

        Report report = new Report(starDateBoundry, endDateBoundry);

        DefaultTableModel modelClientTable = (DefaultTableModel) clientTable.getModel();
        modelClientTable.setRowCount(0);

        for (String key : report.getClientToRent().keySet()) {
            modelClientTable.addRow(new Object[] {key, report.getClientToRent().get(key)});
        }

        DefaultTableModel modelCarTable = (DefaultTableModel) carTable.getModel();
        modelCarTable.setRowCount(0);

        for (String key : report.getCarToCount().keySet()) {
            modelCarTable.addRow(new Object[] {key, report.getCarToCount().get(key)});
        }

        topClientPanel.removeAll();

        for (Client client : report.getTopClient()) {
            topClientPanel.add(new javax.swing.JLabel(client.getId()));
        }
        topClientPanel.revalidate();

        topCarPanel.removeAll();

        for (Car car: report.getTopCar()) {
            topCarPanel.add(new javax.swing.JLabel(car.getId()));
        }
        topCarPanel.revalidate();

        DefaultTableModel modelStatisticsTable = (DefaultTableModel) statisticsTable.getModel();
        modelStatisticsTable.setRowCount(0);

        modelStatisticsTable.addRow(new Object[] {"Total Sales", report.getTotalSales()});
        modelStatisticsTable.addRow(new Object[] {"Number of Bookings", report.getnSales()});
        modelStatisticsTable.addRow(new Object[] {"Unique Number of Clients", report.getnClient()});
        modelStatisticsTable.addRow(new Object[] {"Unique Number of Car", report.getnCar()});

    }                                            

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            


    // Variables declaration - do not modify                     
    private javax.swing.JScrollPane carScroll;
    private javax.swing.JTable carTable;
    private javax.swing.JScrollPane clientScroll;
    private javax.swing.JTable clientTable;
    private javax.swing.JButton createButton;
    private javax.swing.JLabel endDateLabel;
    private com.toedter.calendar.JMonthChooser endDateMonth;
    private javax.swing.JPanel mapPanel;
    private javax.swing.JPanel reportPanel;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel startDateLabel;
    private com.toedter.calendar.JMonthChooser startDateMonth;
    private javax.swing.JPanel statisticsPanel;
    private javax.swing.JScrollPane statisticsScroll;
    private javax.swing.JTable statisticsTable;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JPanel topCarPanel;
    private javax.swing.JPanel topClientPanel;
    private javax.swing.JPanel topPanel;
    private javax.swing.JLabel yearLabel;
    private com.toedter.calendar.JYearChooser yearPicker;
    // End of variables declaration                   
}
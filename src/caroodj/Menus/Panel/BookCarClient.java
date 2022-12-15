package Menus.Panel;

import java.io.IOException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.BoxLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.html.parser.Entity;

import Objects.Booking;
import Objects.BookingDataFile;
import Objects.Car;
import Objects.CarDataFile;
import Objects.Client;
import Objects.DataFile;
import Objects.EntityId;
import Objects.PersonDataFile;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author William
 */
public class BookCarClient extends javax.swing.JPanel {

    /**
     * Creates new form BookCarClient
     */
    private String clientID;
    public BookCarClient(String clientID) {
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
        
        queryFull = new JPanel();

        queryFull.setLayout(new BoxLayout(queryFull, BoxLayout.Y_AXIS));

        carQueries.add(new CarQuery());

        queryFull.add(carQueries.get(0));

        queryScroll = new javax.swing.JScrollPane(queryFull);

        TitlePanel = new javax.swing.JPanel();
        BookCarTitle = new javax.swing.JLabel();
        QueryPanel = new javax.swing.JPanel();
        AddQueryButton = new javax.swing.JButton();
        RemoveQueryButton = new javax.swing.JButton();
        ClearQueryButton = new javax.swing.JButton();
        SearchButton = new javax.swing.JButton();
        TablePanel = new javax.swing.JPanel();
        BookCarTableScroll = new javax.swing.JScrollPane();
        BookCarTable = new javax.swing.JTable();
        BookFieldPanel = new javax.swing.JPanel();
        CarIDField = new javax.swing.JTextField();
        BookCarButton = new javax.swing.JButton();
        CarIDText = new javax.swing.JLabel();
        StartDateText = new javax.swing.JLabel();
        StartDateField = new com.toedter.calendar.JDateChooser();
        EndDateText = new javax.swing.JLabel();
        EndDateField = new com.toedter.calendar.JDateChooser();
        paymentMethod = new PaymentMethod();

        setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        setMaximumSize(new java.awt.Dimension(1298, 1012));
        setMinimumSize(new java.awt.Dimension(1298, 1012));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1298, 1012));

        BookCarTitle.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        BookCarTitle.setText("Car Booking");
        TitlePanel.add(BookCarTitle);

        QueryPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Search Car"));

        AddQueryButton.setText("Add Query");
        AddQueryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        RemoveQueryButton.setText("Remove Query");
        RemoveQueryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        ClearQueryButton.setText("Clear Query");
        ClearQueryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        SearchButton.setText("Search");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        queryScroll.setMinimumSize(new java.awt.Dimension(1276, 200));
        queryScroll.setPreferredSize(new java.awt.Dimension(1276, 200));
        
        javax.swing.GroupLayout QueryPanelLayout = new javax.swing.GroupLayout(QueryPanel);
        QueryPanel.setLayout(QueryPanelLayout);
        QueryPanelLayout.setHorizontalGroup(
            QueryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QueryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AddQueryButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RemoveQueryButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ClearQueryButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SearchButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(QueryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, QueryPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(queryScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 1270, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        QueryPanelLayout.setVerticalGroup(
            QueryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, QueryPanelLayout.createSequentialGroup()
                .addContainerGap(150, Short.MAX_VALUE)
                .addGroup(QueryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddQueryButton)
                    .addComponent(RemoveQueryButton)
                    .addComponent(ClearQueryButton)
                    .addComponent(SearchButton))
                .addContainerGap())
            .addGroup(QueryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(QueryPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(queryScroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(32, Short.MAX_VALUE)))
        );

        TablePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Car Table"));

        BookCarTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Car ID", "Car Manufacture", "Car Model", "Production Year", "Rental Cost"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        BookCarTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        BookCarTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carTableMouseClicked(evt);
            }
        });
        BookCarTableScroll.setViewportView(BookCarTable);
        if (BookCarTable.getColumnModel().getColumnCount() > 0) {
            BookCarTable.getColumnModel().getColumn(0).setResizable(false);
            BookCarTable.getColumnModel().getColumn(1).setResizable(false);
            BookCarTable.getColumnModel().getColumn(2).setResizable(false);
            BookCarTable.getColumnModel().getColumn(3).setResizable(false);
            BookCarTable.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout TablePanelLayout = new javax.swing.GroupLayout(TablePanel);
        TablePanel.setLayout(TablePanelLayout);
        TablePanelLayout.setHorizontalGroup(
            TablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TablePanelLayout.createSequentialGroup()
                .addComponent(BookCarTableScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 1262, Short.MAX_VALUE)
                .addContainerGap())
        );
        TablePanelLayout.setVerticalGroup(
            TablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TablePanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(BookCarTableScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                .addContainerGap())
        );

        BookFieldPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Enter Information to Book Car"));

        BookCarButton.setText("Book Car");
        BookCarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookCarButtonActionPerformed(evt);
            }
        });

        CarIDText.setText("Enter Car ID");

        StartDateText.setText("Enter Start Date");

        EndDateText.setText("Enter End Date");

        javax.swing.GroupLayout BookFieldPanelLayout = new javax.swing.GroupLayout(BookFieldPanel);
        BookFieldPanel.setLayout(BookFieldPanelLayout);
        BookFieldPanelLayout.setHorizontalGroup(
            BookFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BookFieldPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(BookFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BookCarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BookFieldPanelLayout.createSequentialGroup()
                        .addGroup(BookFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(StartDateText)
                            .addComponent(CarIDText)
                            .addComponent(EndDateText))
                        .addGap(18, 18, 18)
                        .addGroup(BookFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(StartDateField)
                            .addComponent(CarIDField)
                            .addComponent(EndDateField, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        BookFieldPanelLayout.setVerticalGroup(
            BookFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BookFieldPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BookFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CarIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CarIDText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BookFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StartDateText)
                    .addComponent(StartDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BookFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EndDateText)
                    .addComponent(EndDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BookCarButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TitlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(QueryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(BookFieldPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(QueryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BookFieldPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
    }// </editor-fold>

    private void BookCarButtonActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            String carID = CarIDField.getText();
            LocalDate StartDate = StartDateField.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate EndDate = EndDateField.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            if (DataFile.isHigher(StartDate, EndDate)) {
                JOptionPane.showMessageDialog(null, "End date is earlier than start date!");
            } else {
                CarDataFile cdf = new CarDataFile("src\\caroodj\\Data\\Car.txt");
                PersonDataFile pdf = new PersonDataFile("src\\caroodj\\Data\\Person.txt");
                Client client = Client.convertToClient(pdf.queryDatabase(pdf.createQuery(new String[] {clientID, "*", "*", "*", "*", "*", "*"})).first());
                Car car = cdf.queryDatabase(cdf.createQuery(new String[]{carID, "*", "*", "*", "*", "*"})).first();
                Double totalRent = car.getRentalCost() * (ChronoUnit.DAYS.between(StartDate, EndDate));
                paymentMethod.setData(StartDate, EndDate, false, false, car, client, null, totalRent);
        
                JOptionPane.showMessageDialog(null, paymentMethod, "Information", JOptionPane.INFORMATION_MESSAGE);
            }    
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Wrong Format! or Car Id not Found!");
        }
        
    }                                             

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        carQueries.add(new CarQuery());

        CarQuery lastCarQuery = carQueries.get(carQueries.size() - 1);

        this.queryCount += 1;

        lastCarQuery.setQueryLabel("Query " + this.queryCount);

        queryFull.add(lastCarQuery);
        queryFull.revalidate();
    }                                   

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        if (this.queryCount == 1) {
            JOptionPane.showMessageDialog(null, "Cannot Remove Anymore Query");
        } else {
            queryFull.remove(carQueries.get(carQueries.size() - 1));
    
            carQueries.remove(carQueries.size() - 1);
    
            this.queryCount -= 1;
    
            queryFull.revalidate();
        }
    }                                    

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        for (Integer i = (carQueries.size() - 1); i >= 1; i--) {
            queryFull.remove(carQueries.size() - 1);
            carQueries.remove(carQueries.size() - 1);
            this.queryCount -= 1;
        }

        queryFull.revalidate();
    }                                     

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        DefaultTableModel model = (DefaultTableModel) BookCarTable.getModel();
        model.setRowCount(0);

        for (CarQuery carQuery :carQueries) {
            CarDataFile cdf = new CarDataFile("src\\caroodj\\Data\\Car.txt");

            HashMap<String, String> query = carQuery.getQueryData();

            ArrayList<Car> carList = cdf.queryDatabase(query).all();

            for (Car car : carList) {
                model.addRow(new Object[] {car.getId(), car.getManufacture(), car.getModel(), car.getYear(), car.getRentalCost()});
            }
        }

    }
    private void carTableMouseClicked(java.awt.event.MouseEvent evt) {
        Integer row = BookCarTable.getSelectedRow();
        CarIDField.setText((String)BookCarTable.getValueAt(row, 0));
    }                                  

    private ArrayList<CarQuery> carQueries = new ArrayList<CarQuery>();

    private Integer queryCount = 1;

    private JPanel queryFull;

    private PaymentMethod paymentMethod;

    // Variables declaration - do not modify                     
    private javax.swing.JButton BookCarButton;
    private javax.swing.JTable BookCarTable;
    private javax.swing.JScrollPane BookCarTableScroll;
    private javax.swing.JLabel BookCarTitle;
    private javax.swing.JPanel BookFieldPanel;
    private javax.swing.JTextField CarIDField;
    private javax.swing.JLabel CarIDText;
    private com.toedter.calendar.JDateChooser EndDateField;
    private javax.swing.JLabel EndDateText;
    private javax.swing.JPanel QueryPanel;
    private com.toedter.calendar.JDateChooser StartDateField;
    private javax.swing.JLabel StartDateText;
    private javax.swing.JPanel TablePanel;
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JButton AddQueryButton;
    private javax.swing.JButton RemoveQueryButton;
    private javax.swing.JButton ClearQueryButton;
    private javax.swing.JButton SearchButton;
    private javax.swing.JScrollPane queryScroll;
    // End of variables declaration                   
}

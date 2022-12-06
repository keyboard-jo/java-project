package Menus.Panel;
import java.awt.CardLayout;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

import Objects.PersonDataFile;

/**
 *
 * @author William
 */
public class SidePanel extends javax.swing.JPanel {

    /**
     * Creates new form SidePanel
     */
    private CardLayout cardLayout;
    private HistoryClient historyClient;
    private ClientAccountDetail clientAccountDetail;
    private ClientHome clientHome;

    private CreateReport createReport;
    private ManageCarInformationMenu manageCarInformationMenu;
    private ManageClientInformation manageClientInformation;
    private ConfirmBookingMenu confirmBookingMenu;
    private AdminAccountDetail adminAccountDetail;

    private String personId;
    private Boolean isAdmin;
    private String username;
    public SidePanel(String personID) {
        initPerson(personID);
        initComponents();
        cardLayout = (CardLayout)(MainPanel.getLayout());
    }

    private void initPerson(String personId) {
        this.personId = personId;
        PersonDataFile pdf = new PersonDataFile("src\\caroodj\\Data\\Person.txt");

        String[] query = {this.personId, "*", "*", "*", "*", "*", "*"};

        String [] person = pdf.queryDatabase(pdf.createQuery(query)).first();

        for (String i: person) {
            System.out.println(i);
        }

        this.isAdmin = person[1].equals("admin") ? true : false;

        System.out.println(this.isAdmin);

        this.username = person[4];
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        SidePanel = new javax.swing.JPanel();
        LogoText = new javax.swing.JLabel();
        jSeparatorSide = new javax.swing.JSeparator();
        AccountButton = new javax.swing.JButton();
        BookCarButton = new javax.swing.JButton();
        HomeButton = new javax.swing.JButton();
        HistoryButton = new javax.swing.JButton();
        GreetingText = new javax.swing.JLabel();
        MainPanel = new javax.swing.JPanel();
        extraAdminButton = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1298, 1012));
        setMinimumSize(new java.awt.Dimension(1298, 1012));
        setPreferredSize(new java.awt.Dimension(1298, 1012));

        SidePanel.setBackground(new java.awt.Color(49, 74, 86));
        SidePanel.setPreferredSize(new java.awt.Dimension(239, 554));

        LogoText.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 60)); // NOI18N
        LogoText.setForeground(new java.awt.Color(255, 255, 255));
        LogoText.setIcon(new javax.swing.ImageIcon(getClass().getResource("zs.png"))); // NOI18N

        jSeparatorSide.setBackground(new java.awt.Color(255, 255, 255));

        AccountButton.setBackground(new java.awt.Color(49, 74, 86));
        AccountButton.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        AccountButton.setForeground(new java.awt.Color(255, 255, 255));

        BookCarButton.setBackground(new java.awt.Color(49, 74, 86));
        BookCarButton.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        BookCarButton.setForeground(new java.awt.Color(255, 255, 255));

        HomeButton.setBackground(new java.awt.Color(49, 74, 86));
        HomeButton.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        HomeButton.setForeground(new java.awt.Color(255, 255, 255));
        
        HistoryButton.setBackground(new java.awt.Color(49, 74, 86));
        HistoryButton.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        HistoryButton.setForeground(new java.awt.Color(255, 255, 255));

        extraAdminButton.setBackground(new java.awt.Color(49, 74, 86));
        extraAdminButton.setFont(new java.awt.Font("Yu Gothic UI", 1, 24));
        extraAdminButton.setForeground(new java.awt.Color(255, 255, 255));

        GreetingText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        GreetingText.setForeground(new java.awt.Color(255, 255, 255));
        GreetingText.setText("Hello, " + this.username);

        javax.swing.GroupLayout SidePanelLayout = new javax.swing.GroupLayout(SidePanel);
        SidePanel.setLayout(SidePanelLayout);

        MainPanel.setMinimumSize(new java.awt.Dimension(1298, 1012));
        MainPanel.setPreferredSize(new java.awt.Dimension(1298, 1012));
        MainPanel.setLayout(new java.awt.CardLayout());

        if (this.isAdmin) {
            AccountButton.setText("Create Report");
            BookCarButton.setText("Car Information");
            HomeButton.setText("Client Information");
            HistoryButton.setText("Confirm Booking");
            extraAdminButton.setText("Home");

            createReport = new CreateReport();
            manageCarInformationMenu = new ManageCarInformationMenu();
            manageClientInformation = new ManageClientInformation();
            confirmBookingMenu = new ConfirmBookingMenu();
            adminAccountDetail = new AdminAccountDetail(this.personId);

            MainPanel.add(createReport, "createReport");
            MainPanel.add(manageCarInformationMenu, "manageCarInformationMenu");
            MainPanel.add(manageClientInformation, "manageClientInformation");
            MainPanel.add(confirmBookingMenu, "confirmBookingMenu");
            MainPanel.add(adminAccountDetail, "adminAccountDetail");

            SidePanelLayout.setHorizontalGroup(
                SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(SidePanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(SidePanelLayout.createSequentialGroup()
                            .addGroup(SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(HomeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BookCarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(HistoryButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AccountButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(extraAdminButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SidePanelLayout.createSequentialGroup()
                            .addGap(0, 11, Short.MAX_VALUE)
                            .addGroup(SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LogoText)
                                .addGroup(SidePanelLayout.createSequentialGroup()
                                    .addGap(23, 23, 23)
                                    .addGroup(SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(GreetingText)
                                        .addComponent(jSeparatorSide, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(22, 22, 22)))));
                            
            SidePanelLayout.setVerticalGroup(
                SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(SidePanelLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(LogoText)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jSeparatorSide, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(GreetingText, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(HomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(BookCarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(AccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(HistoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(extraAdminButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        } else {
            AccountButton.setText("Account");
            BookCarButton.setText("Book Car");
            HomeButton.setText("Home");
            HistoryButton.setText("History");

            clientAccountDetail = new ClientAccountDetail(this.personId);
            historyClient = new HistoryClient(this.personId);
            clientHome = new ClientHome(this.personId);
            
            MainPanel.add(clientHome,"clientHome");
            MainPanel.add(clientAccountDetail,"clientAccountDetail");
            MainPanel.add(historyClient,"historyClient");
            
            SidePanelLayout.setHorizontalGroup(
                SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(SidePanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(SidePanelLayout.createSequentialGroup()
                            .addGroup(SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(HomeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BookCarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(HistoryButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AccountButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SidePanelLayout.createSequentialGroup()
                            .addGap(0, 11, Short.MAX_VALUE)
                            .addGroup(SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LogoText)
                                .addGroup(SidePanelLayout.createSequentialGroup()
                                    .addGap(23, 23, 23)
                                    .addGroup(SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(GreetingText)
                                        .addComponent(jSeparatorSide, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(22, 22, 22)))));

            SidePanelLayout.setVerticalGroup(
                SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(SidePanelLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(LogoText)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jSeparatorSide, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(GreetingText, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(HomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(BookCarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(AccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(HistoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(SidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1012, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        AccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccountButtonActionPerformed(evt);
            }
        });

        BookCarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookCarButtonActionPerformed(evt);
            }
        });

        HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });

        HistoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistoryButtonActionPerformed(evt);
            }
        });

        extraAdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extraAdminButtonActionPerformed(evt);
            }
        });
    }// </editor-fold>                        

    private void AccountButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (this.isAdmin) {
            this.cardLayout.show(MainPanel,"createReport");
        } else {
            this.cardLayout.show(MainPanel,"clientAccountDetail");
        }
    }                                             

    private void BookCarButtonActionPerformed(java.awt.event.ActionEvent evt) {   
        if (this.isAdmin) {
            this.cardLayout.show(MainPanel,"manageCarInformationMenu");
        } else {

        }
    }                                             

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (isAdmin) {
            this.cardLayout.show(MainPanel,"manageClientInformation");
        } else {
            this.cardLayout.show(MainPanel,"clientHome");
        }
    }                                          

    private void HistoryButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (isAdmin) {
            this.cardLayout.show(MainPanel,"confirmBookingMenu");
        } else {
            this.cardLayout.show(MainPanel,"historyClient");
        }
    }
    
    private void extraAdminButtonActionPerformed(java.awt.event.ActionEvent evt) {
        this.cardLayout.show(MainPanel, "adminAccountDetail");

    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton AccountButton;
    private javax.swing.JButton BookCarButton;
    private javax.swing.JButton HistoryButton;
    private javax.swing.JButton HomeButton;
    
    private javax.swing.JButton extraAdminButton;
    
    private javax.swing.JLabel GreetingText;
    private javax.swing.JLabel LogoText;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel SidePanel;
    private javax.swing.JSeparator jSeparatorSide;
    // End of variables declaration                   
}

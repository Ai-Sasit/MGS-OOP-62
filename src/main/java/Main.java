import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Main extends javax.swing.JFrame {

    static DefaultListModel<String> Lis1 = new DefaultListModel<>();
    Cal C = new Cal();
    Saings S = new Saings();
    static Tools T = new Tools();
    static History H = new History();
    static Information I, I2, I3;
    private static final long serialVersionUID = 1L;
    List<String> size , Wsize, WS, DS;

    public Main() {
        initComponents();
        Show.getColumnModel().getColumn(0).setPreferredWidth(8);
        Show.getColumnModel().getColumn(1).setPreferredWidth(100);
        Show.getColumnModel().getColumn(3).setPreferredWidth(90);

        List<String> DS = H.LoadHistory();
        for (String i : DS) {
            String Arr[] = i.split(",");
            Arr[1] = String.format("%,.1f", Double.valueOf(Arr[1]));
            AddRow(Arr);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Show = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Update = new javax.swing.JRadioButton();
        Balance = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Interest = new javax.swing.JTextField();
        PDokbia = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        DA = new javax.swing.JButton();
        Dep = new javax.swing.JTextField();
        WA = new javax.swing.JButton();
        With = new javax.swing.JTextField();
        Savings = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        AVG = new javax.swing.JButton();
        AVGShow = new javax.swing.JTextField();
        BahtIn = new javax.swing.JTextField();
        CShow = new javax.swing.JTextField();
        CA = new javax.swing.JButton();
        Currency = new javax.swing.JComboBox<>();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.RIGHT );
        Show.setDefaultRenderer(String.class, centerRenderer);

        jCheckBox1.setText("jCheckBox1");
        I2 = new Information(0);
        I2.reMoney();
        String IStr = I2.getInterest();
        String TStr = T.getBalance();
        Interest.setText(IStr);
        Balance.setText(TStr);
        PDokbia.setText("0");

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("Savings");

        jButton7.setText("TH > US");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Money Management Service");
        setLocation(new java.awt.Point(500, 250));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Money History"));

        Show.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {}, new String[] { "No.", "Amount", "Status", "Date" }) {

                private static final long serialVersionUID = 1L;

                @SuppressWarnings("rawtypes")
                Class[] types = new Class[] { java.lang.String.class, java.lang.String.class,java.lang.String.class,java.lang.String.class };
                boolean[] canEdit = new boolean[] { false, false, false, false };

                @SuppressWarnings("rawtypes")
                public Class getColumnClass(int columnIndex) {
                        return types[columnIndex];
                }

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit[columnIndex];
                }
        });
        Show.setToolTipText("");
        Show.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Show);
        if (Show.getColumnModel().getColumnCount() > 0) {
            Show.getColumnModel().getColumn(0).setResizable(false);
            Show.getColumnModel().getColumn(1).setResizable(false);
            Show.getColumnModel().getColumn(2).setResizable(false);
            Show.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap()));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Information"));
        jPanel2.setToolTipText("");

        Balance.setEditable(false);
        Balance.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel4.setText("Interest :");

        Interest.setEditable(false);
        Interest.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowActionPerformed(evt);
            }
        });

        PDokbia.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel2.setText("Balance :");
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout
                .setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup().addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4).addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(Interest, javax.swing.GroupLayout.DEFAULT_SIZE, 179,
                                                Short.MAX_VALUE)
                                        .addComponent(Balance))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup().addGap(112, 112, 112)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel2Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(Update).addComponent(PDokbia,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 61,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, 0)))
                                .addContainerGap()));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel1).addGroup(jPanel2Layout
                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Balance, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Update)).addGap(4, 4, 4)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Interest, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4).addComponent(PDokbia,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createSequentialGroup().addGap(36, 36, 36).addComponent(jLabel3)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Tools"));

        DA.setText("Deposit");
        DA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DAActionPerformed(evt);
            }
        });

        Dep.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        WA.setText("Withdraw");
        WA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WAActionPerformed(evt);
            }
        });

        With.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        Savings.setText("Savings");
        Savings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SavingsActionPerformed(evt);
            }
        });

        jButton5.setText("Calculator");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        AVG.setText("AVG");
        AVG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AVGActionPerformed(evt);
            }
        });

        AVGShow.setEditable(false);
        AVGShow.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        BahtIn.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        CShow.setEditable(false);
        CShow.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        CA.setText("Currency");
        CA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAActionPerformed(evt);
            }
        });

        Currency.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "> USD", "> EUR", "> GBP", "> JPY", "> SGD" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup().addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(Dep, javax.swing.GroupLayout.DEFAULT_SIZE, 225,
                                                        Short.MAX_VALUE)
                                                .addComponent(With))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel3Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addComponent(DA, javax.swing.GroupLayout.PREFERRED_SIZE, 87,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, Short.MAX_VALUE))
                                                .addComponent(WA, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel3Layout.createSequentialGroup().addGroup(jPanel3Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel3Layout.createSequentialGroup().addGroup(jPanel3Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(Savings, javax.swing.GroupLayout.DEFAULT_SIZE, 106,
                                                        Short.MAX_VALUE)
                                                .addComponent(BahtIn))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel3Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addComponent(Currency, 0, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                Short.MAX_VALUE)
                                                        .addComponent(
                                                                CA, javax.swing.GroupLayout.DEFAULT_SIZE, 93,
                                                                Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel3Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addComponent(CShow).addComponent(jButton5,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, 101,
                                                                Short.MAX_VALUE)))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(AVG, javax.swing.GroupLayout.PREFERRED_SIZE, 68,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(AVGShow)))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(6, 6, 6)));
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(DA).addComponent(Dep, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(With, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(WA))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(AVG).addComponent(AVGShow, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(BahtIn, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CShow, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Currency, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Savings, javax.swing.GroupLayout.PREFERRED_SIZE, 51,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 51,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CA, javax.swing.GroupLayout.PREFERRED_SIZE, 51,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap()));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup().addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 349, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
                .createSequentialGroup().addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap()));

        pack();
    }// </editor-fold>
    
    private void SavingsActionPerformed(java.awt.event.ActionEvent evt) {
        T.setInter(PDokbia.getText());
        S.Savings();
    }// ! Savings Windows Popup

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        C.Calculator();
    }// ! Mini Calculator Windows Popup

    private void AVGActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            AVGShow.setText(T.getAVG());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "*** Not Number Input ***", "Error Detected!",
                    JOptionPane.ERROR_MESSAGE);
        }
    }// ! Average Withdraw Amount ActionEvent

    private void CAActionPerformed(java.awt.event.ActionEvent evt) {
        String action = Currency.getItemAt(Currency.getSelectedIndex());
        try {
            double value = Double.valueOf(BahtIn.getText());
            CShow.setText(T.getCurrency(action, value));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "*** Not Number Input ***", "Error Detected!",
                    JOptionPane.ERROR_MESSAGE);
        }
    }// ! Currency Convertor ActionEvent

    private void ShowActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            double Vat = Double.valueOf(PDokbia.getText());
            I3 = new Information(Vat);
            Interest.setText(I3.getInterest());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "*** Not Number Input ***", "Error Detected!",
                    JOptionPane.ERROR_MESSAGE);
        }
    }// ! Update Interest ActionEvent

    private void WAActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            double W = Double.valueOf(With.getText());
            if (Double.parseDouble(T.getBalance()) < W) {
                JOptionPane.showMessageDialog(null, "* $ * Insufficient Funds * $ *", "Error Detected!",JOptionPane.ERROR_MESSAGE);
            } else if (W <= 0) {
                JOptionPane.showMessageDialog(null, "* $ * Invalid Number * $ *", "Error Detected!",JOptionPane.ERROR_MESSAGE);
            } else {
                DefaultTableModel TRows = (DefaultTableModel) Show.getModel();
                I = new Information(Double.valueOf(PDokbia.getText()));
                H.SaveHistory(H.LoadHistory().size() + 1, 'W', W);
                WS = H.LoadHistory();
                TRows.setRowCount(0);
                for (String i : WS) {
                    String Arr[] = i.split(",");
                    Arr[1] = String.format("%,.1f", Double.valueOf(Arr[1]));
                    AddRow(Arr);
                }
                T.setBalance('W', W);
                Interest.setText(I.getInterest());
                Balance.setText(String.format("%,.2f",Double.valueOf(T.getBalance())));
                With.setText("");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "*** Not Number Input ***", "Error Detected!",
                    JOptionPane.ERROR_MESSAGE);
        }
    }// ! Withdraw ActionEvent

    private void DAActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            DefaultTableModel TRows = (DefaultTableModel) Show.getModel();
            double D = Double.valueOf(Dep.getText());
            if (D <= 0) {
                JOptionPane.showMessageDialog(null, "* $ * Invalid Number * $ *", "Error Detected!",JOptionPane.ERROR_MESSAGE);
            }else{
                I = new Information(Double.valueOf(PDokbia.getText()));
                H.SaveHistory(H.LoadHistory().size() + 1, 'D', D);
                DS = H.LoadHistory();
                TRows.setRowCount(0);
                for (String i : DS) {
                    String Arr[] = i.split(",");
                    Arr[1] = String.format("%,.1f", Double.valueOf(Arr[1]));
                    AddRow(Arr);
                }
                T.setBalance('D', D);
                Interest.setText(I.getInterest());
                Balance.setText(String.format("%,.2f",Double.valueOf(T.getBalance())));
                Dep.setText("");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "*** Not Number Input ***", "Error Detected!",
                    JOptionPane.ERROR_MESSAGE);
        }
    }// ! Deposit ActionEvent

    public static void AddRow(String[] rows) {
        DefaultTableModel M = (DefaultTableModel) Show.getModel();
        M.addRow(rows);
    }

    public static void main(String args[]) {
  
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton AVG;
    private javax.swing.JTextField AVGShow;
    private javax.swing.JTextField BahtIn;
    private javax.swing.JTextField Balance;
    private javax.swing.JButton CA;
    private javax.swing.JTextField CShow;
    private javax.swing.JComboBox<String> Currency;
    private javax.swing.JButton DA;
    private javax.swing.JTextField Dep;
    private javax.swing.JTextField Interest;
    private javax.swing.JRadioButton Update;
    private javax.swing.JTextField PDokbia;
    private javax.swing.JButton Savings;
    private static javax.swing.JTable Show;
    private javax.swing.JButton WA;
    private javax.swing.JTextField With;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration                   
}

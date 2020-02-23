public class Cal extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;
    double num,ans;
    int Symbol;

    public Cal() {
        initComponents();
    }

    public void Mathematically(){
        switch(Symbol){
            case 1:
                ans = num + Double.parseDouble(SNumberic.getText());
                SNumberic.setText(Double.toString(ans));
                break;
            case 2:
                ans = num - Double.parseDouble(SNumberic.getText());
                SNumberic.setText(Double.toString(ans));
                break;
            case 3:
                ans = num * Double.parseDouble(SNumberic.getText());
                SNumberic.setText(Double.toString(ans));
                break;
            case 4:
                ans = num / Double.parseDouble(SNumberic.getText());
                SNumberic.setText(Double.toString(ans));
                break;
            case 5:
                ans = num % Double.parseDouble(SNumberic.getText());
                SNumberic.setText(Double.toString(ans));
                break;
        }
    }

    //@SuppressWarnings("unchecked")                   
    private void initComponents() {

        button1 = new java.awt.Button();
        jPanel1 = new javax.swing.JPanel();
        SNumberic = new javax.swing.JTextField();
        Lang = new javax.swing.JButton();
        Mod = new javax.swing.JButton();
        Del = new javax.swing.JButton();
        Num7 = new javax.swing.JButton();
        Num8 = new javax.swing.JButton();
        Num9 = new javax.swing.JButton();
        Han = new javax.swing.JButton();
        Num4 = new javax.swing.JButton();
        Num5 = new javax.swing.JButton();
        Num6 = new javax.swing.JButton();
        Koon = new javax.swing.JButton();
        Num1 = new javax.swing.JButton();
        Num2 = new javax.swing.JButton();
        Num3 = new javax.swing.JButton();
        Lop = new javax.swing.JButton();
        Num0 = new javax.swing.JButton();
        Period = new javax.swing.JButton();
        Equalsymbol = new javax.swing.JButton();
        Bok = new javax.swing.JButton();
        LogTemp = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        button1.setLabel("button1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cal");
        setLocation(new java.awt.Point(500, 250));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        SNumberic.setEditable(false);
        SNumberic.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SNumberic.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        SNumberic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SNumbericActionPerformed(evt);
            }
        });

        Lang.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Lang.setText("CE");
        Lang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LangActionPerformed(evt);
            }
        });

        Mod.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Mod.setText("%");
        Mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModActionPerformed(evt);
            }
        });

        Del.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Del.setText("AC");
        Del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelActionPerformed(evt);
            }
        });

        Num7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Num7.setText("7");
        Num7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num7ActionPerformed(evt);
            }
        });

        Num8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Num8.setText("8");
        Num8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num8ActionPerformed(evt);
            }
        });

        Num9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Num9.setText("9");
        Num9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num9ActionPerformed(evt);
            }
        });

        Han.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Han.setText("÷");
        Han.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HanActionPerformed(evt);
            }
        });

        Num4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Num4.setText("4");
        Num4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num4ActionPerformed(evt);
            }
        });

        Num5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Num5.setText("5");
        Num5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num5ActionPerformed(evt);
            }
        });

        Num6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Num6.setText("6");
        Num6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num6ActionPerformed(evt);
            }
        });

        Koon.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Koon.setText("*");
        Koon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KoonActionPerformed(evt);
            }
        });

        Num1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Num1.setText("1");
        Num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num1ActionPerformed(evt);
            }
        });

        Num2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Num2.setText("2");
        Num2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num2ActionPerformed(evt);
            }
        });

        Num3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Num3.setText("3");
        Num3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num3ActionPerformed(evt);
            }
        });

        Lop.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Lop.setText("-");
        Lop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LopActionPerformed(evt);
            }
        });

        Num0.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Num0.setText("0");
        Num0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num0ActionPerformed(evt);
            }
        });

        Period.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Period.setText(".");
        Period.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PeriodActionPerformed(evt);
            }
        });

        Equalsymbol.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Equalsymbol.setText("=");
        Equalsymbol.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        Equalsymbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EqualsymbolActionPerformed(evt);
            }
        });

        Bok.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Bok.setText("+");
        Bok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BokActionPerformed(evt);
            }
        });

        LogTemp.setEditable(false);
        LogTemp.setBackground(new java.awt.Color(51, 51, 51));
        LogTemp.setForeground(new java.awt.Color(255, 255, 255));
        LogTemp.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        LogTemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogTempActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        jLabel1.setText("Mini Calculator");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SNumberic, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(Num1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Num2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Num3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Bok, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(Num0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Period, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Equalsymbol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(Num4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Num5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Num6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Lop, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(Del, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Lang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(Num7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Num8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(Mod, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Han, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(Num9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Koon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(11, 11, 11)
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(LogTemp))))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Bok, Del, Han, Koon, Lang, Lop, Mod, Num0, Num1, Num2, Num3, Num4, Num5, Num6, Num7, Num8, Num9, Period});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LogTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SNumberic, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lang, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Del, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mod, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Han, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Num7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Num8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Num9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Koon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Num4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Num5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Num6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lop, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Num3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Num1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Num2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bok, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Num0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Period, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Equalsymbol, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void LogTempActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void SNumbericActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void DelActionPerformed(java.awt.event.ActionEvent evt) {
        SNumberic.setText("");                                   
    }                                   

    private void LangActionPerformed(java.awt.event.ActionEvent evt) { 
        int L = SNumberic.getText().length();
        int N = SNumberic.getText().length()-1;
        String store;
        if (L > 0) {
            StringBuilder sb = new StringBuilder(SNumberic.getText());
            sb.deleteCharAt(N);
            store = sb.toString();
            SNumberic.setText(store);
        }                                 
    }                                    

    private void ModActionPerformed(java.awt.event.ActionEvent evt) {  
        try{                                  
        num = Double.parseDouble(SNumberic.getText());
        Symbol = 5;
        SNumberic.setText("");
        LogTemp.setText(num+"%");
        } catch (NumberFormatException E){}
    }                                   

    private void HanActionPerformed(java.awt.event.ActionEvent evt) {  
        try{                                  
        num = Double.parseDouble(SNumberic.getText());
        Symbol = 4;
        SNumberic.setText("");
        LogTemp.setText(num+"÷");
        }catch (NumberFormatException E){}
    }                    
    
    private void BokActionPerformed(java.awt.event.ActionEvent evt) {
        try{                                    
            num = Double.parseDouble(SNumberic.getText());
            Symbol = 1;
            SNumberic.setText("");
            LogTemp.setText(num+"+");
        } catch (NumberFormatException E){}
    }                                   

    private void LopActionPerformed(java.awt.event.ActionEvent evt) {   
        try{                                 
            num = Double.parseDouble(SNumberic.getText());
            Symbol = 2;
            SNumberic.setText("");
            LogTemp.setText(num+"-");
       } catch (NumberFormatException E){}                                
    }

    private void KoonActionPerformed(java.awt.event.ActionEvent evt) {    
        try{                                 
        num = Double.parseDouble(SNumberic.getText());
        Symbol = 3;
        SNumberic.setText("");
        LogTemp.setText(num+"*");
        }catch(NumberFormatException E){}
    }

    private void Num7ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        SNumberic.setText(SNumberic.getText()+"7");
    }                                    

    private void Num8ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        SNumberic.setText(SNumberic.getText()+"8");
    }                                    

    private void Num9ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        SNumberic.setText(SNumberic.getText()+"9");
    }                                                                        

    private void Num4ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        SNumberic.setText(SNumberic.getText()+"4");
    }                                    

    private void Num5ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        SNumberic.setText(SNumberic.getText()+"5");
    }                                    

    private void Num6ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        SNumberic.setText(SNumberic.getText()+"6");
    }                                    

    private void Num1ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        SNumberic.setText(SNumberic.getText()+"1");
    }                                    

    private void Num2ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        SNumberic.setText(SNumberic.getText()+"2");
    }                                    

    private void Num3ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        SNumberic.setText(SNumberic.getText()+"3");
    }                                    

    private void Num0ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        SNumberic.setText(SNumberic.getText()+"0");
    }                                    

    private void PeriodActionPerformed(java.awt.event.ActionEvent evt) {
        boolean Dot = SNumberic.getText().contains(".");
        if(Dot) {
        }else{SNumberic.setText(SNumberic.getText()+".");}     
        
    }                                      

    private void EqualsymbolActionPerformed(java.awt.event.ActionEvent evt) {                                            
        Mathematically();
        LogTemp.setText("");
    }                                           

    public void Calculator() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton Bok;
    private javax.swing.JButton Del;
    private javax.swing.JButton Equalsymbol;
    private javax.swing.JButton Han;
    private javax.swing.JButton Koon;
    private javax.swing.JButton Lang;
    private javax.swing.JTextField LogTemp;
    private javax.swing.JButton Lop;
    private javax.swing.JButton Mod;
    private javax.swing.JButton Num0;
    private javax.swing.JButton Num1;
    private javax.swing.JButton Num2;
    private javax.swing.JButton Num3;
    private javax.swing.JButton Num4;
    private javax.swing.JButton Num5;
    private javax.swing.JButton Num6;
    private javax.swing.JButton Num7;
    private javax.swing.JButton Num8;
    private javax.swing.JButton Num9;
    private javax.swing.JButton Period;
    private javax.swing.JTextField SNumberic;
    private java.awt.Button button1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration                   
}

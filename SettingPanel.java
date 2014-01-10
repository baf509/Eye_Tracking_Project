/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EyeTracking;

/**
 *
 * @author XXX
 */
public class SettingPanel extends javax.swing.JFrame {

    private int glintBlockSize = 60;
    private int glintDif = -50;
    private int glintDylate = 1;
    private int glintSmooth = 2;
    private int pupilErode = 2;
    private int pupilSmooth = 2;
    private int pupilBlockSize = 67;
    private int pupilDif = 13;
    private int pupilMaxSize = 67;
    private int pupilMinSize = 45;
    private int inpaintSize = 5;
    private int brightPupil = 0;
    private SettingsCameraCapture sCamCapture = new SettingsCameraCapture();

    /**
     * Creates new form propertiesSetting
     */
    public SettingPanel() {
        initComponents();
        setSliders();
        sCamCapture.start();
    }

    public void setSliders() {

        jSlider1.setPaintTicks(true);
        jSlider1.setMajorTickSpacing(15);
        jSlider1.setPaintTicks(true);
        //jSlider1.setSnapToTicks(true);
        jSlider1.setPaintTrack(true);
        jSlider1.setPaintLabels(true);
        jSlider1.setValue(60);

        jSlider2.setPaintTicks(true);
        jSlider2.setMajorTickSpacing(10);
        jSlider2.setPaintTicks(true);
//        jSlider2.setSnapToTicks(true);
        jSlider2.setPaintTrack(true);
        jSlider2.setPaintLabels(true);
        jSlider2.setValue(-50);

        jSlider3.setPaintTicks(true);
        jSlider3.setMajorTickSpacing(1);
        jSlider3.setPaintTicks(true);
//        jSlider2.setSnapToTicks(true);
        jSlider3.setPaintTrack(true);
        jSlider3.setPaintLabels(true);
        jSlider3.setValue(1);

        jSlider4.setPaintTicks(true);
        jSlider4.setMajorTickSpacing(1);
        jSlider4.setPaintTicks(true);
//        jSlider2.setSnapToTicks(true);
        jSlider4.setPaintTrack(true);
        jSlider4.setPaintLabels(true);
        jSlider4.setValue(2);

        jSlider5.setPaintTicks(true);
        jSlider5.setMajorTickSpacing(1);
        jSlider5.setPaintTicks(true);
//        jSlider2.setSnapToTicks(true);
        jSlider5.setPaintTrack(true);
        jSlider5.setPaintLabels(true);
        jSlider5.setValue(2);

        jSlider6.setPaintTicks(true);
        jSlider6.setMajorTickSpacing(1);
        jSlider6.setPaintTicks(true);
//        jSlider2.setSnapToTicks(true);
        jSlider6.setPaintTrack(true);
        jSlider6.setPaintLabels(true);
        jSlider6.setValue(2);

        jSlider7.setPaintTicks(true);
        jSlider7.setMajorTickSpacing(25);
        jSlider7.setPaintTicks(true);
//        jSlider2.setSnapToTicks(true);
        jSlider7.setPaintTrack(true);
        jSlider7.setPaintLabels(true);
        jSlider7.setValue(67);

        jSlider8.setPaintTicks(true);
        jSlider8.setMajorTickSpacing(10);
        jSlider8.setPaintTicks(true);
//        jSlider2.setSnapToTicks(true);
        jSlider8.setPaintTrack(true);
        jSlider8.setPaintLabels(true);
        jSlider8.setValue(17);

        jSlider9.setPaintTicks(true);
        jSlider9.setMajorTickSpacing(20);
        jSlider9.setPaintTicks(true);
//        jSlider2.setSnapToTicks(true);
        jSlider9.setPaintTrack(true);
        jSlider9.setPaintLabels(true);
        jSlider9.setValue(68);

        jSlider10.setPaintTicks(true);
        jSlider10.setMajorTickSpacing(20);
        jSlider10.setPaintTicks(true);
        jSlider10.setPaintTrack(true);
        jSlider10.setPaintLabels(true);
        jSlider10.setValue(45);

        jSlider11.setPaintTicks(true);
        jSlider11.setMajorTickSpacing(3);
        jSlider11.setPaintTicks(true);
        jSlider11.setPaintTrack(true);
        jSlider11.setPaintLabels(true);
        jSlider11.setValue(5);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSlider1 = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSlider2 = new javax.swing.JSlider();
        jSlider3 = new javax.swing.JSlider();
        jSlider4 = new javax.swing.JSlider();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSlider5 = new javax.swing.JSlider();
        jSlider6 = new javax.swing.JSlider();
        jSlider7 = new javax.swing.JSlider();
        jSlider8 = new javax.swing.JSlider();
        jSlider9 = new javax.swing.JSlider();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSlider10 = new javax.swing.JSlider();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSlider11 = new javax.swing.JSlider();
        jLabel15 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Glint ");

        jSlider1.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jSlider1.setMaximum(151);
        jSlider1.setMinimum(3);
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel2.setText("Block size:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel3.setText("Diference:");

        jSlider2.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jSlider2.setMaximum(40);
        jSlider2.setMinimum(-60);
        jSlider2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider2StateChanged(evt);
            }
        });

        jSlider3.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jSlider3.setMaximum(6);
        jSlider3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider3StateChanged(evt);
            }
        });

        jSlider4.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jSlider4.setMaximum(6);
        jSlider4.setMinimum(1);
        jSlider4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider4StateChanged(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel4.setText("Erode");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel5.setText("Smooth:");

        jLabel6.setText("Pupil");

        jSlider5.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jSlider5.setMaximum(6);
        jSlider5.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider5StateChanged(evt);
            }
        });

        jSlider6.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jSlider6.setMaximum(6);
        jSlider6.setMinimum(1);
        jSlider6.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider6StateChanged(evt);
            }
        });

        jSlider7.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jSlider7.setMaximum(160);
        jSlider7.setMinimum(3);
        jSlider7.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider7StateChanged(evt);
            }
        });

        jSlider8.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jSlider8.setMaximum(40);
        jSlider8.setMinimum(-60);
        jSlider8.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider8StateChanged(evt);
            }
        });

        jSlider9.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jSlider9.setMaximum(160);
        jSlider9.setMinimum(20);
        jSlider9.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider9StateChanged(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel7.setText("Erode:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel8.setText("Smooth:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel9.setText("Block size:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel10.setText("Diference:");

        jLabel11.setText("Size");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel12.setText("max:");

        jSlider10.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jSlider10.setMaximum(141);
        jSlider10.setMinimum(1);
        jSlider10.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider10StateChanged(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel13.setText("min:");

        jButton1.setText("Save settings");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Load settings");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel14.setText("Glint removal");

        jSlider11.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jSlider11.setMaximum(30);
        jSlider11.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider11StateChanged(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel15.setText("inpaint size:");

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCheckBox1.setText("( bright )");
        jCheckBox1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox1StateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(29, 29, 29)
                        .addComponent(jSeparator2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSlider9, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                            .addComponent(jSlider10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 42, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSlider11, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSlider6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                                    .addComponent(jSlider5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSlider7, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSlider8, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSlider4, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                                    .addComponent(jSlider1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSlider2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSlider3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSlider3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSlider4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSlider5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSlider6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSlider7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSlider8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSlider9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSlider10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSlider11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(246, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        SettingModel sm = new SettingModel();

        System.out.println("###### Saving #######");
        System.out.println("   ## Glint ##");
        sm.setGlintBlockSize(glintBlockSize);
        System.out.println("Glint block size: " + glintBlockSize);
        sm.setGlintDif(glintDif);
        System.out.println("Glint diference weight: " + glintDif);
        sm.setGlintDylate(glintDylate);
        System.out.println("Glint dylate: " + glintDylate);
        sm.setGlintSmooth(glintSmooth);
        System.out.println("Glint smooth: " + glintSmooth);

        System.out.println("   ## Pupil ##");
        sm.setPupilBlockSize(pupilBlockSize);
        System.out.println("Pupil block size: " + pupilBlockSize);
        sm.setPupilDif(pupilDif);
        System.out.println("Pupil diference weight: " + pupilDif);
        sm.setPupilErode(pupilErode);
        System.out.println("Pupil erode: " + pupilErode);
        sm.setPupilSmooth(pupilSmooth);
        System.out.println("Pupil smooth:" + pupilSmooth);
        sm.setPupilMaxSize(pupilMaxSize);
        System.out.println("Pupil max size: " + pupilMaxSize);
        sm.setPupilMinSize(pupilMinSize);
        System.out.println("Pupil min size: " + pupilMinSize);
        sm.setInpaintSize(inpaintSize);
        System.out.println("Inpaint size: " + inpaintSize);
        sm.setBrightPupil(brightPupil);
        System.out.println("Bright pupil: " + brightPupil);
        System.out.println("#####################");


        SettingsSaveAndLoad.saveEyESettings(sm, "Eye");
        System.out.println(" Settings saved");
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        int tmp = jSlider1.getValue();

        if (tmp % 2 == 0) {
            glintBlockSize = tmp + 1;
        } else {
            glintBlockSize = tmp;
        }
        sCamCapture.setGlintBlockSize(glintBlockSize);
        // TODO add your handling code here:
    }//GEN-LAST:event_jSlider1StateChanged

    private void jSlider2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider2StateChanged

        glintDif = jSlider2.getValue();
        sCamCapture.setGlintDif(glintDif);
        // TODO add your handling code here:
    }//GEN-LAST:event_jSlider2StateChanged

    private void jSlider3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider3StateChanged

        glintDylate = jSlider3.getValue();
        sCamCapture.setGlintDylate(glintDylate);
        // TODO add your handling code here:
    }//GEN-LAST:event_jSlider3StateChanged

    private void jSlider4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider4StateChanged

        glintSmooth = jSlider4.getValue();
        sCamCapture.setGlintSmooth(glintSmooth);
        // TODO add your handling code here:
    }//GEN-LAST:event_jSlider4StateChanged

    private void jSlider5StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider5StateChanged

        pupilErode = jSlider5.getValue();
        sCamCapture.setPupilErode(pupilErode);
        // TODO add your handling code here:
    }//GEN-LAST:event_jSlider5StateChanged

    private void jSlider6StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider6StateChanged

        pupilSmooth = jSlider6.getValue();
        sCamCapture.setPupilSmooth(pupilSmooth);
        // TODO add your handling code here:
    }//GEN-LAST:event_jSlider6StateChanged

    private void jSlider7StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider7StateChanged
        int tmp = jSlider7.getValue();

        if (tmp % 2 == 0) {
            pupilBlockSize = tmp + 1;
        } else {
            pupilBlockSize = tmp;
        }
        // pupilBlockSize = jSlider7.getValue();
        System.out.println("Pupil block size: " + pupilBlockSize);
        sCamCapture.setPupilBlockSize(pupilBlockSize);
        // TODO add your handling code here:
    }//GEN-LAST:event_jSlider7StateChanged

    private void jSlider8StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider8StateChanged

        pupilDif = jSlider8.getValue();
        sCamCapture.setPupilDif(pupilDif);
        // TODO add your handling code here:
    }//GEN-LAST:event_jSlider8StateChanged

    private void jSlider9StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider9StateChanged

        pupilMaxSize = jSlider9.getValue();
        sCamCapture.setPupilMaxSize(pupilMaxSize);
        // TODO add your handling code here:
    }//GEN-LAST:event_jSlider9StateChanged

    private void jSlider10StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider10StateChanged

        pupilMinSize = jSlider10.getValue();
        sCamCapture.setPupilMinSize(pupilMinSize);
        // TODO add your handling code here:
    }//GEN-LAST:event_jSlider10StateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        SettingModel sm;

        try {
            sm = SettingsSaveAndLoad.loadEyeSettings("Eye");
            System.out.println("Settings file loaded");

            glintBlockSize = sm.getGlintBlockSize();
            jSlider1.setValue(glintBlockSize);
            System.out.println("glintBlockSize " + glintBlockSize);

            glintDif = sm.getGlintDif();
            jSlider2.setValue(glintDif);
            System.out.println("glintDif " + glintDif);

            glintDylate = sm.getGlintDylate();
            jSlider3.setValue(glintDylate);
            System.out.println("glintDylate " + glintDylate);

            glintSmooth = sm.getGlintSmooth();
            jSlider4.setValue(glintSmooth);
            System.out.println("glintSmooth " + glintSmooth);

            pupilErode = sm.getPupilErode();
            jSlider5.setValue(pupilErode);
            System.out.println("pupilErode " + pupilErode);

            pupilSmooth = sm.getPupilSmooth();
            jSlider6.setValue(pupilSmooth);
            System.out.println("pupilSmooth " + pupilSmooth);

            pupilBlockSize = sm.getPupilBlockSize();
            jSlider7.setValue(pupilBlockSize);
            System.out.println("pupilBlockSize " + pupilBlockSize);

            pupilDif = sm.getPupilDif();
            jSlider8.setValue(pupilDif);
            System.out.println("pupilDif " + pupilDif);

            pupilMaxSize = sm.getPupilMaxSize();
            jSlider9.setValue(pupilMaxSize);
            System.out.println("pupilMaxSize " + pupilMaxSize);

            pupilMinSize = sm.getPupilMinSize();
            jSlider10.setValue(pupilMinSize);
            System.out.println("pupilMinSize " + pupilMinSize);

            inpaintSize = sm.getInpaintSize();
            jSlider11.setValue(inpaintSize);
            System.out.println("inpaintSize " + inpaintSize);

            brightPupil = sm.getBrightPupil();
            if (brightPupil == 0) {
                jCheckBox1.setSelected(true);
            } else {
                jCheckBox1.setSelected(false);
            }


        } catch (Exception e) {
            System.out.println(" Fille settings error");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jSlider11StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider11StateChanged

        inpaintSize = jSlider11.getValue();
        sCamCapture.setInpaintSize(inpaintSize);
        // TODO add your handling code here:
    }//GEN-LAST:event_jSlider11StateChanged

    private void jCheckBox1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBox1StateChanged

        if (jCheckBox1.isSelected()) {
            brightPupil = 0;
        } else {
            brightPupil = 1;
        }

        sCamCapture.setBrightPupil(brightPupil);
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1StateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SettingPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SettingPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SettingPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SettingPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SettingPanel().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSlider jSlider10;
    private javax.swing.JSlider jSlider11;
    private javax.swing.JSlider jSlider2;
    private javax.swing.JSlider jSlider3;
    private javax.swing.JSlider jSlider4;
    private javax.swing.JSlider jSlider5;
    private javax.swing.JSlider jSlider6;
    private javax.swing.JSlider jSlider7;
    private javax.swing.JSlider jSlider8;
    private javax.swing.JSlider jSlider9;
    // End of variables declaration//GEN-END:variables
}

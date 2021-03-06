/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gardner.fastpackbuilder;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FastpackBuilderGUI extends javax.swing.JFrame {

    private FastPackBuilder m_oFastpackBuilder;
    /**
     * Creates new form FastpackBuilderGUI
     */
    public FastpackBuilderGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_usage_instructions_text = new javax.swing.JLabel();
        label_usage_instructions_title = new javax.swing.JLabel();
        button_build_fastpack = new javax.swing.JButton();
        label_fastpack_name = new javax.swing.JLabel();
        textfield_fastpack_name = new javax.swing.JTextField();
        label_fastpack_version = new javax.swing.JLabel();
        textfield_fastpack_version = new javax.swing.JTextField();
        panel_about_info = new javax.swing.JPanel();
        label_about_info = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fastpack Builder v1.2");

        label_usage_instructions_text.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        label_usage_instructions_text.setText("<html>Place all files in a single folder on your hard drive before using this tool.<br /><br />Your fastpack will be built and placed in the input directory as <i>{FASTPACKNAME}_{VERSION}.jar</i></html>");

        label_usage_instructions_title.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        label_usage_instructions_title.setText("Usage Instructions");

        button_build_fastpack.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        button_build_fastpack.setText("Set Input Directory & Build Fastpack");
        button_build_fastpack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_build_fastpackActionPerformed(evt);
            }
        });

        label_fastpack_name.setText("Fastpack Name");

        textfield_fastpack_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_fastpack_nameActionPerformed(evt);
            }
        });

        label_fastpack_version.setText("Fastpack Version");

        textfield_fastpack_version.setText("1.0");

        label_about_info.setText("Fastpack Builder v1.2 by Adam Gardner (adam.gardner@dynatrace.com)");
        label_about_info.setEnabled(false);

        javax.swing.GroupLayout panel_about_infoLayout = new javax.swing.GroupLayout(panel_about_info);
        panel_about_info.setLayout(panel_about_infoLayout);
        panel_about_infoLayout.setHorizontalGroup(
            panel_about_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_about_infoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_about_info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_about_infoLayout.setVerticalGroup(
            panel_about_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_about_infoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_about_info)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button_build_fastpack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_usage_instructions_text, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_usage_instructions_title)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_fastpack_name, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_fastpack_version, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textfield_fastpack_version)
                            .addComponent(textfield_fastpack_name)))
                    .addComponent(panel_about_info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_usage_instructions_title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_usage_instructions_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_fastpack_name)
                    .addComponent(textfield_fastpack_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_fastpack_version)
                    .addComponent(textfield_fastpack_version, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button_build_fastpack, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_about_info, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_build_fastpackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_build_fastpackActionPerformed
        // Fastpack name
        // Fastpack version
        String strFastpackName = textfield_fastpack_name.getText().trim();
        String strFastpackVersion = textfield_fastpack_version.getText().trim();
        
        if (strFastpackName.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Fastpack name is empty. Please provide a name.", "Mandatory Option Missing", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (strFastpackVersion.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Fastpack version is empty. Please provide a version.", "Mandatory Option Missing", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        JFileChooser oFileChooser = new JFileChooser();
        oFileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        oFileChooser.showOpenDialog(this);
        
        File oFile = oFileChooser.getSelectedFile();
        
        m_oFastpackBuilder = new FastPackBuilder(oFile);
        
        boolean bSuccess = m_oFastpackBuilder.processFastpack(strFastpackName, strFastpackVersion);
        
        if (bSuccess) JOptionPane.showMessageDialog(null, "FastPack created successfully. Look in the original directory for the {FASTPACKNAME}_{VERSION}.jar file", "FastPack Processing Complete", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_button_build_fastpackActionPerformed

    private void textfield_fastpack_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_fastpack_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_fastpack_nameActionPerformed

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
            java.util.logging.Logger.getLogger(FastpackBuilderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FastpackBuilderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FastpackBuilderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FastpackBuilderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FastpackBuilderGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_build_fastpack;
    private javax.swing.JLabel label_about_info;
    private javax.swing.JLabel label_fastpack_name;
    private javax.swing.JLabel label_fastpack_version;
    private javax.swing.JLabel label_usage_instructions_text;
    private javax.swing.JLabel label_usage_instructions_title;
    private javax.swing.JPanel panel_about_info;
    private javax.swing.JTextField textfield_fastpack_name;
    private javax.swing.JTextField textfield_fastpack_version;
    // End of variables declaration//GEN-END:variables
}

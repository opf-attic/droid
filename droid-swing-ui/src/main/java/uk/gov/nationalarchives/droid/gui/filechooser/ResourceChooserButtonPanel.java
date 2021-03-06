/**
 * <p>Copyright (c) The National Archives 2005-2010.  All rights reserved.
 * See Licence.txt for full licence details.
 * <p/>
 *
 * <p>DROID DCS Profile Tool
 * <p/>
 */
package uk.gov.nationalarchives.droid.gui.filechooser;

import javax.swing.JFileChooser;

/**
 *
 * @author rflitcroft
 */
public class ResourceChooserButtonPanel extends javax.swing.JPanel {

    private static final long serialVersionUID = -5648700755756888947L;

    private JFileChooser chooser;

    /** 
     * Creates new form ResourceChooserButtonPanel. 
     * @param parent the panel's parent 
     */
    public ResourceChooserButtonPanel(JFileChooser parent) {
        chooser = parent;
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cancelButton = new javax.swing.JButton();
        openButton = new javax.swing.JButton();
        subFolders = new javax.swing.JCheckBox();

        cancelButton.setText(org.openide.util.NbBundle.getMessage(ResourceChooserButtonPanel.class, "ResourceChooserButtonPanel.cancelButton.text")); // NOI18N
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        openButton.setText(org.openide.util.NbBundle.getMessage(ResourceChooserButtonPanel.class, "ResourceChooserButtonPanel.openButton.text")); // NOI18N
        openButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openButtonActionPerformed(evt);
            }
        });

        subFolders.setSelected(true);
        subFolders.setText(org.openide.util.NbBundle.getMessage(ResourceChooserButtonPanel.class, "ResourceChooserButtonPanel.subFolders.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addComponent(subFolders)
                .addGap(35, 35, 35)
                .addComponent(openButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancelButton)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cancelButton, openButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subFolders)
                    .addComponent(cancelButton)
                    .addComponent(openButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cancelButton, openButton});

    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        chooser.cancelSelection();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void openButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openButtonActionPerformed
        chooser.approveSelection();
    }//GEN-LAST:event_openButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton openButton;
    private javax.swing.JCheckBox subFolders;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the subFolders
     */
    public javax.swing.JCheckBox getSubFolders() {
        return subFolders;
    }
}


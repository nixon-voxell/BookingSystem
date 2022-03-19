/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package nix.bookingsystem;

/**
 *
 * @author cheng
 */
public class HotelsForm extends javax.swing.JFrame
{

  /**
   * Creates new form HotelsForm
   */
  public HotelsForm()
  {
    initComponents();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents()
  {

    _accountsTitle = new javax.swing.JLabel();
    _splitPane = new javax.swing.JSplitPane();
    _junglePanel = new javax.swing.JPanel();
    _jungleTitlePanel = new javax.swing.JPanel();
    _jungleTitle = new javax.swing.JLabel();
    _jungleContentScroll = new javax.swing.JScrollPane();
    _jungleContentPanel = new javax.swing.JPanel();
    _seaPanel = new javax.swing.JPanel();
    _seaTitlePanel = new javax.swing.JPanel();
    _seaTitle = new javax.swing.JLabel();
    _seaContentScroll = new javax.swing.JScrollPane();
    _seaContentPanel = new javax.swing.JPanel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setPreferredSize(new java.awt.Dimension(1000, 600));

    _accountsTitle.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
    _accountsTitle.setText("Hotel Rooms");

    _splitPane.setDividerLocation(500);
    _splitPane.setResizeWeight(0.5);

    _jungleTitle.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
    _jungleTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    _jungleTitle.setText("Jungle View");

    javax.swing.GroupLayout _jungleTitlePanelLayout = new javax.swing.GroupLayout(_jungleTitlePanel);
    _jungleTitlePanel.setLayout(_jungleTitlePanelLayout);
    _jungleTitlePanelLayout.setHorizontalGroup(
      _jungleTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(_jungleTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    _jungleTitlePanelLayout.setVerticalGroup(
      _jungleTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(_jungleTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
    );

    javax.swing.GroupLayout _jungleContentPanelLayout = new javax.swing.GroupLayout(_jungleContentPanel);
    _jungleContentPanel.setLayout(_jungleContentPanelLayout);
    _jungleContentPanelLayout.setHorizontalGroup(
      _jungleContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 498, Short.MAX_VALUE)
    );
    _jungleContentPanelLayout.setVerticalGroup(
      _jungleContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 466, Short.MAX_VALUE)
    );

    _jungleContentScroll.setViewportView(_jungleContentPanel);

    javax.swing.GroupLayout _junglePanelLayout = new javax.swing.GroupLayout(_junglePanel);
    _junglePanel.setLayout(_junglePanelLayout);
    _junglePanelLayout.setHorizontalGroup(
      _junglePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(_jungleTitlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(_jungleContentScroll)
    );
    _junglePanelLayout.setVerticalGroup(
      _junglePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(_junglePanelLayout.createSequentialGroup()
        .addComponent(_jungleTitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(_jungleContentScroll))
    );

    _splitPane.setLeftComponent(_junglePanel);

    _seaTitle.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
    _seaTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    _seaTitle.setText("Sea View");

    javax.swing.GroupLayout _seaTitlePanelLayout = new javax.swing.GroupLayout(_seaTitlePanel);
    _seaTitlePanel.setLayout(_seaTitlePanelLayout);
    _seaTitlePanelLayout.setHorizontalGroup(
      _seaTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(_seaTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
    );
    _seaTitlePanelLayout.setVerticalGroup(
      _seaTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(_seaTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
    );

    javax.swing.GroupLayout _seaContentPanelLayout = new javax.swing.GroupLayout(_seaContentPanel);
    _seaContentPanel.setLayout(_seaContentPanelLayout);
    _seaContentPanelLayout.setHorizontalGroup(
      _seaContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 481, Short.MAX_VALUE)
    );
    _seaContentPanelLayout.setVerticalGroup(
      _seaContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 466, Short.MAX_VALUE)
    );

    _seaContentScroll.setViewportView(_seaContentPanel);

    javax.swing.GroupLayout _seaPanelLayout = new javax.swing.GroupLayout(_seaPanel);
    _seaPanel.setLayout(_seaPanelLayout);
    _seaPanelLayout.setHorizontalGroup(
      _seaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(_seaTitlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(_seaContentScroll)
    );
    _seaPanelLayout.setVerticalGroup(
      _seaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(_seaPanelLayout.createSequentialGroup()
        .addComponent(_seaTitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(_seaContentScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE))
    );

    _splitPane.setRightComponent(_seaPanel);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(50, 50, 50)
        .addComponent(_accountsTitle)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(_splitPane)
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addGap(27, 27, 27)
        .addComponent(_accountsTitle)
        .addGap(18, 18, 18)
        .addComponent(_splitPane))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  /**
   * @param args the command line arguments
   */
  public static void main(String args[])
  {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    try
    {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
      {
        if ("Nimbus".equals(info.getName()))
        {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex)
    {
      java.util.logging.Logger.getLogger(HotelsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex)
    {
      java.util.logging.Logger.getLogger(HotelsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex)
    {
      java.util.logging.Logger.getLogger(HotelsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex)
    {
      java.util.logging.Logger.getLogger(HotelsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable()
    {
      public void run()
      {
        new HotelsForm().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel _accountsTitle;
  private javax.swing.JPanel _jungleContentPanel;
  private javax.swing.JScrollPane _jungleContentScroll;
  private javax.swing.JPanel _junglePanel;
  private javax.swing.JLabel _jungleTitle;
  private javax.swing.JPanel _jungleTitlePanel;
  private javax.swing.JPanel _seaContentPanel;
  private javax.swing.JScrollPane _seaContentScroll;
  private javax.swing.JPanel _seaPanel;
  private javax.swing.JLabel _seaTitle;
  private javax.swing.JPanel _seaTitlePanel;
  private javax.swing.JSplitPane _splitPane;
  // End of variables declaration//GEN-END:variables
}

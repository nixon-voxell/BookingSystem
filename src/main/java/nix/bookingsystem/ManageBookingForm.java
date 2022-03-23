/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package nix.bookingsystem;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cheng
 */
public class ManageBookingForm extends javax.swing.JFrame
{

  /**
   * Creates new form ManageBookingForm
   */
  public ManageBookingForm()
  {
    initComponents();
    Action deleteAction = new AbstractAction()
    {
      public void actionPerformed(ActionEvent e)
      {
        int confirm = JOptionPane.showConfirmDialog(_bookingsTable, "Are you sure you want to delete?");
        if (confirm != 0) return;
        JTable table = (JTable)e.getSource();
        int modelRow = Integer.valueOf( e.getActionCommand() );
        ((DefaultTableModel)table.getModel()).removeRow(modelRow);
      }
    };

    Action checkoutAction = new AbstractAction()
    {
      public void actionPerformed(ActionEvent e)
      {
        int confirm = JOptionPane.showConfirmDialog(_bookingsTable, "Are you sure you want to checkout?");
        if (confirm != 0) return;
        JTable table = (JTable)e.getSource();
        int modelRow = Integer.valueOf( e.getActionCommand() );
        table.setValueAt(true, modelRow, 8);
      }
    };

    Action viewReceiptAction = new AbstractAction()
    {
      public void actionPerformed(ActionEvent e)
      {
        int r = Integer.valueOf( e.getActionCommand() );
        try
        {
          String name = (String) _bookingsTable.getValueAt(r, 0);
          String IC = (String) _bookingsTable.getValueAt(r, 1);
          String phone = (String) _bookingsTable.getValueAt(r, 2);
          String email = (String) _bookingsTable.getValueAt(r, 3);
          Date startDate = BookingManager.DATE_FORMATTER.parse((String) _bookingsTable.getValueAt(r, 4));
          Date endDate = BookingManager.DATE_FORMATTER.parse((String) _bookingsTable.getValueAt(r, 5));
          int roomIdx = BookingSystem.roomManager.NameToIdx((String) _bookingsTable.getValueAt(r, 6));
          String bookedBy = (String) _bookingsTable.getValueAt(r, 7);
          boolean checkout = (boolean) _bookingsTable.getValueAt(r, 8);
          Booking booking = new Booking(name, IC, phone, email, startDate, endDate, roomIdx, bookedBy, checkout);

          String validation = booking.ValidateBookingDetails();
          if (validation != null)
          {
            JOptionPane.showMessageDialog(rootPane, validation);
            return;
          }
          
          BookingSystem.receiptForm.InitializeReceipt(booking);
          BookingSystem.SwitchForm(BookingSystem.receiptForm);
        } catch (ParseException ex)
        {
          JOptionPane.showMessageDialog(rootPane, "An error occured while reading values from the table...");
          Logger.getLogger(ManageBookingForm.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
    };

    ButtonColumn deleteColumn = new ButtonColumn(_bookingsTable, deleteAction, 9);
    ButtonColumn checkoutColumn = new ButtonColumn(_bookingsTable, checkoutAction, 10);
    ButtonColumn viewReceiptColumn = new ButtonColumn(_bookingsTable, viewReceiptAction, 11);
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

    _saveButton = new javax.swing.JButton();
    cancelButton = new javax.swing.JButton();
    _manageBookingTitle = new javax.swing.JLabel();
    _bookingsPanel = new javax.swing.JPanel();
    _bookingsScrollPane = new javax.swing.JScrollPane();
    _bookingsTable = new javax.swing.JTable();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setPreferredSize(new java.awt.Dimension(1500, 600));

    _saveButton.setBackground(new java.awt.Color(59, 112, 114));
    _saveButton.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
    _saveButton.setText("SAVE");
    _saveButton.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        _saveButtonActionPerformed(evt);
      }
    });

    cancelButton.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
    cancelButton.setText("CANCEL");
    cancelButton.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        cancelButtonActionPerformed(evt);
      }
    });

    _manageBookingTitle.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
    _manageBookingTitle.setText("Manage Bookings");

    _bookingsTable.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][]
      {

      },
      new String []
      {
        "Name", "IC Number", "Phone Number", "Email", "StartingDate", "EndingDate", "Room", "Booked By", "Checkout", "", "", ""
      }
    )
    {
      Class[] types = new Class []
      {
        java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
      };
      boolean[] canEdit = new boolean []
      {
        true, true, true, true, false, false, false, false, false, true, true, true
      };

      public Class getColumnClass(int columnIndex)
      {
        return types [columnIndex];
      }

      public boolean isCellEditable(int rowIndex, int columnIndex)
      {
        return canEdit [columnIndex];
      }
    });
    _bookingsTable.setShowGrid(true);
    _bookingsTable.setSurrendersFocusOnKeystroke(true);
    _bookingsScrollPane.setViewportView(_bookingsTable);

    javax.swing.GroupLayout _bookingsPanelLayout = new javax.swing.GroupLayout(_bookingsPanel);
    _bookingsPanel.setLayout(_bookingsPanelLayout);
    _bookingsPanelLayout.setHorizontalGroup(
      _bookingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(_bookingsPanelLayout.createSequentialGroup()
        .addGap(31, 31, 31)
        .addComponent(_bookingsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 924, Short.MAX_VALUE)
        .addGap(33, 33, 33))
    );
    _bookingsPanelLayout.setVerticalGroup(
      _bookingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(_bookingsPanelLayout.createSequentialGroup()
        .addGap(20, 20, 20)
        .addComponent(_bookingsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
        .addContainerGap())
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(38, 38, 38)
        .addComponent(_manageBookingTitle)
        .addGap(0, 0, Short.MAX_VALUE))
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(_saveButton)
            .addGap(18, 18, 18)
            .addComponent(cancelButton)
            .addGap(36, 36, 36))
          .addComponent(_bookingsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(17, 17, 17)
        .addComponent(_manageBookingTitle)
        .addGap(18, 18, 18)
        .addComponent(_bookingsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(cancelButton)
          .addComponent(_saveButton))
        .addGap(46, 46, 46))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void _saveButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event__saveButtonActionPerformed
  {//GEN-HEADEREND:event__saveButtonActionPerformed
    ArrayList<Booking> newBookings = new ArrayList<Booking>();
    
    int rowCount = _bookingsTable.getRowCount();
    for (int r=0; r < rowCount; r++)
    {
      try
      {
        String name = (String) _bookingsTable.getValueAt(r, 0);
        String IC = (String) _bookingsTable.getValueAt(r, 1);
        String phone = (String) _bookingsTable.getValueAt(r, 2);
        String email = (String) _bookingsTable.getValueAt(r, 3);
        Date startDate = BookingManager.DATE_FORMATTER.parse((String) _bookingsTable.getValueAt(r, 4));
        Date endDate = BookingManager.DATE_FORMATTER.parse((String) _bookingsTable.getValueAt(r, 5));
        int roomIdx = BookingSystem.roomManager.NameToIdx((String) _bookingsTable.getValueAt(r, 6));
        String bookedBy = (String) _bookingsTable.getValueAt(r, 7);
        boolean checkout = (boolean) _bookingsTable.getValueAt(r, 8);
        Booking booking = new Booking(name, IC, phone, email, startDate, endDate, roomIdx, bookedBy, checkout);
        
        String validation = booking.ValidateBookingDetails();
        if (validation != null)
        {
          JOptionPane.showMessageDialog(this, validation);
          return;
        }
        
        newBookings.add(booking);
      } catch (ParseException ex)
      {
        JOptionPane.showMessageDialog(this, "An error occured while reading values from the table...");
        Logger.getLogger(ManageBookingForm.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
    BookingSystem.bookingManager.setBookings(newBookings);
    try
    {
      BookingSystem.bookingManager.SaveBookings();
    } catch (IOException ex)
    {
      JOptionPane.showMessageDialog(this, "An error occured while saving the booking data...");
      Logger.getLogger(ManageBookingForm.class.getName()).log(Level.SEVERE, null, ex);
    }
    BookingSystem.roomsForm.FilterRooms();
    BookingSystem.SwitchForm(BookingSystem.roomsForm);
  }//GEN-LAST:event__saveButtonActionPerformed

  private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cancelButtonActionPerformed
  {//GEN-HEADEREND:event_cancelButtonActionPerformed
    BookingSystem.SwitchForm(BookingSystem.roomsForm);
  }//GEN-LAST:event_cancelButtonActionPerformed

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
      java.util.logging.Logger.getLogger(ManageBookingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex)
    {
      java.util.logging.Logger.getLogger(ManageBookingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex)
    {
      java.util.logging.Logger.getLogger(ManageBookingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex)
    {
      java.util.logging.Logger.getLogger(ManageBookingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable()
    {
      public void run()
      {
        new ManageBookingForm().setVisible(true);
      }
    });
  }
  
  public void InitializeBookings()
  {
    DefaultTableModel model = (DefaultTableModel) _bookingsTable.getModel();
    model.setRowCount(0);
    
    ArrayList<Booking> _bookings = BookingSystem.bookingManager.getBookings();
    ArrayList<Room> _rooms = BookingSystem.roomManager.getRooms();
    for (Booking booking : _bookings)
      model.addRow(new Object[]{
        booking.customerName,
        booking.IC,
        booking.phoneNumber,
        booking.email,
        BookingManager.DATE_FORMATTER.format(booking.startDate),
        BookingManager.DATE_FORMATTER.format(booking.endDate),
        _rooms.get(booking.roomIdx).name,
        booking.bookedBy,
        booking.checkout,
        "Delete",
        "Checkout",
        "Receipt"
      });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel _bookingsPanel;
  private javax.swing.JScrollPane _bookingsScrollPane;
  private javax.swing.JTable _bookingsTable;
  private javax.swing.JLabel _manageBookingTitle;
  private javax.swing.JButton _saveButton;
  private javax.swing.JButton cancelButton;
  // End of variables declaration//GEN-END:variables
}

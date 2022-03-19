package nix.bookingsystem;

/*
Specifications:
---
room booking in a week for a small resort

2 views: jungle / sea
10 rooms (each view)
RM 350.00 per night per room

system used by resort staff

Things needed to be done:
---
sign in
book room for customer (choose room based on day, show available rooms)
manage booking details (edit, delete, search view)
view receipt (details of customer, booked room, total charges including taxes)

onced book, room will not be able to be booked again
*/

import com.formdev.flatlaf.FlatDarkLaf;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class BookingSystem
{
  private static LoginForm _loginForm;

  public static void main(String[] args) throws Exception
  {
//    try {
//      UIManager.setLookAndFeel(new FlatDarkLaf());
//    } catch (UnsupportedLookAndFeelException ex) {
//      Logger.getLogger(BookingSystem.class.getName()).log(Level.SEVERE, null, ex);
//    }
//    _loginForm = new LoginForm();
//    _loginForm.setVisible(true);
//    _loginForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    AccountManager accountManager = new AccountManager("accounts");
    accountManager.ReadFile();
  }
}

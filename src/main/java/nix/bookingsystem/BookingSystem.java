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
import javax.swing.*;

public class BookingSystem
{
  public static LoginForm loginForm;
  public static AccountsForm accountsForm;
  public static HotelsForm hotelsForm;
  
  public static AccountManager accountManager;
  public static HotelManager hotelManager;
  
  private static JFrame _currForm;

  public static void main(String[] args) throws Exception
  {
    UIManager.setLookAndFeel(new FlatDarkLaf());
    loginForm = new LoginForm();
    accountsForm = new AccountsForm();
    hotelsForm = new HotelsForm();
    loginForm.setVisible(true);
    _currForm = loginForm;
    
    // initialize accounts    
    accountManager = new AccountManager("accounts");
    accountManager.LoadAccounts();
    // initialize hotels
    hotelManager = new HotelManager("hotels");
    hotelManager.LoadHotels();
  }
  
  public static void SwitchForm(JFrame form)
  {
    _currForm.setVisible(false);
    form.setVisible(true);
    _currForm = form;
  }
}

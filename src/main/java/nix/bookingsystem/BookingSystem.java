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
import javax.swing.JFrame;
import javax.swing.UIManager;

public class BookingSystem
{
  public static String currUser;
  public static LoginForm loginForm;
  public static AccountsForm accountsForm;
  public static RoomsForm roomsForm;
  public static BookingForm bookingForm;
  public static ManageBookingForm manageBookingForm;
  public static ReceiptForm receiptForm;

  public static AccountManager accountManager;
  public static RoomManager roomManager;
  public static BookingManager bookingManager;

  private static JFrame _currForm;

  private static final int SPAWN_X = 700, SPAWN_Y = 500;

  public static void main(String[] args) throws Exception
  {
    UIManager.setLookAndFeel(new FlatDarkLaf());

    // initialize forms
    loginForm = new LoginForm();
    accountsForm = new AccountsForm();
    roomsForm = new RoomsForm();
    bookingForm = new BookingForm();
    manageBookingForm = new ManageBookingForm();
    receiptForm = new ReceiptForm();
    loginForm.setVisible(true);
    _currForm = loginForm;
    _currForm.setLocation(SPAWN_X, SPAWN_Y);
    
    // initialize accounts    
    accountManager = new AccountManager("accounts");
    accountManager.LoadData();
    // initialize hotels
    roomManager = new RoomManager("rooms");
    roomManager.LoadData();
    // initialize bookings
    bookingManager = new BookingManager("bookings");
    bookingManager.LoadData();
  }
  
  public static void SwitchForm(JFrame form)
  {
    _currForm.setVisible(false);
    form.setVisible(true);
    _currForm = form;
    _currForm.setLocation(SPAWN_X, SPAWN_Y);
  }
}

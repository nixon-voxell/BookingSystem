/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nix.bookingsystem;

import java.io.IOException;
import java.util.ArrayList;
import java.text.SimpleDateFormat;

/**
 *
 * @author cheng
 */
public class BookingManager extends AbstractFileManager
{
  public static final SimpleDateFormat DATE_FORMATTER = new SimpleDateFormat("yyyy/MM/dd");
  private ArrayList<Booking> _bookings;

  public BookingManager(String filename)
  {
    super(filename);
  }

  @Override
  public void LoadData() throws Exception
  {
    ReadFile();
    int contentLength = ContentLength();
    
    if (_bookings == null)
      _bookings = new ArrayList<Booking>(contentLength);
 
    _bookings.clear();
    for (int c=0; c < contentLength; c++)
    {
      String[] lineContent = ReadLine(c);
      if (lineContent.length == 9)
        _bookings.add(new Booking(
          lineContent[0], lineContent[1], lineContent[2], lineContent[3],
          DATE_FORMATTER.parse(lineContent[4]), DATE_FORMATTER.parse(lineContent[5]),
          Integer.parseInt(lineContent[6]), lineContent[7], lineContent[8].equals("true")
        ));
    }
  }

  public void AddBooking(Booking newBooking)
  {
    _bookings.add(newBooking);
  }

  public void SaveBookings() throws IOException
  {
    int bookingSize = _bookings.size();
    String data = "";

    for (int b=0; b < bookingSize; b++)
    {
      Booking booking = _bookings.get(b);
      data += booking.customerName + ", ";
      data += booking.IC + ", ";
      data += booking.phoneNumber + ", ";
      data += booking.email + ", ";
      data += DATE_FORMATTER.format(booking.startDate) + ", ";
      data += DATE_FORMATTER.format(booking.endDate) + ", ";
      data += booking.roomIdx + ", ";
      data += booking.bookedBy + ", ";
      data += booking.checkout == true ? "true" : "false";
      data += "\n";
    }

    WriteFile(data);
  }
  
  public ArrayList<Booking> getBookings()
  {
    return _bookings;
  }
  
  public void setBookings(ArrayList<Booking> newBookings)
  {
    _bookings = newBookings;
  }
}

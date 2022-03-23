/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nix.bookingsystem;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author cheng
 */
public class Booking
{
  public String customerName;
  public String IC;
  public String phoneNumber;
  public String email;
  public Date startDate;
  public Date endDate;
  public int roomIdx;
  public String bookedBy;
  public boolean checkout;
  
  public Booking(Date startDate, Date endDate, int roomIdx)
  {
    this.startDate = startDate;
    this.endDate = endDate;
    this.roomIdx = roomIdx;
  }
  
  public Booking(
    String customerName,
    String IC,
    String phoneNumber,
    String email,
    Date startDate,
    Date endDate,
    int roomIdx,
    String bookedBy,
    boolean checkout
  )
  {
    this(startDate, endDate, roomIdx);
    this.customerName = customerName;
    this.IC = IC;
    this.phoneNumber = phoneNumber;
    this.email = email;
    this.bookedBy = bookedBy;
    this.checkout = checkout;
  }
  
  public void SetBookDetail(
    String customerName,
    String IC,
    String phoneNumber,
    String email,
    String bookedBy
  )
  {
    this.customerName = customerName;
    this.IC = IC;
    this.phoneNumber = phoneNumber;
    this.email = email;
    this.bookedBy = bookedBy;
  }
  
  public String ValidateBookingDetails()
  {
    if (customerName.isBlank() || IC.isBlank() || phoneNumber.isBlank() || email.isBlank())
    {
      return "Input fields cannot be blank";
    } else if (IC.length() != 12)
    {
      return "IC number incorrect. (e.g. 000505213344)";
    } else if (phoneNumber.length() <= 7)
    {
      return "Phone number is too short. (e.g. 0123334444)";
    } else if (!email.contains("@") || !email.contains(".com"))
    {
      return "Email format is incorrect. (e.g. name@gmail.com)";
    }
    return null;
  }
  
  public boolean CheckConflict(Date start, Date end)
  {
    return DateInBetween(
      LocalDate.of(start.getYear(), start.getMonth(), start.getDay()),
      LocalDate.of(this.startDate.getYear(), this.startDate.getMonth(), this.startDate.getDay()),
      LocalDate.of(this.endDate.getYear(), this.endDate.getMonth(), this.endDate.getDay())
    ) || DateInBetween(
      LocalDate.of(end.getYear(), end.getMonth(), end.getDay()),
      LocalDate.of(this.startDate.getYear(), this.startDate.getMonth(), this.startDate.getDay()),
      LocalDate.of(this.endDate.getYear(), this.endDate.getMonth(), this.endDate.getDay())
    );
  }
  
  private boolean DateInBetween(LocalDate d, LocalDate start, LocalDate end)
  {
    return (d.isAfter(start) || d.isEqual(start)) && (d.isBefore(end) || d.isEqual(end));
  }
}

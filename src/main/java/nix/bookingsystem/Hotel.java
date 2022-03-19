/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nix.bookingsystem;

import java.util.Date;

/**
 *
 * @author cheng
 */
public class Hotel
{
  private static final String PIC_FOLDER = "D:/VoxellDevelopment/JavaProjs/BookingSystem/pics/";

  public int idx;
  public String name;
  public String imageName;

  // customer details
  public String customerName;
  public String IC;
  public String phoneNumber;
  public String email;
  public Date startingDate;
  public int days;
  
  public Hotel(int idx, String name, String imageName)
  {
    this.idx = idx;
    this.name = name;
    this.imageName = PIC_FOLDER + imageName + ".jpg";
  }
  
  public Hotel(
    int idx, String name, String imageName,
    String customerName,
    String IC,
    String phoneNumber,
    String email,
    Date startingDate,
    int days
  )
  {
    this(idx, name, imageName);
    this.customerName = customerName;
    this.IC = IC;
    this.phoneNumber = phoneNumber;
    this.email = email;
    this.startingDate = startingDate;
    this.days = days;
  }
  
  public boolean IsBooked(Date currDate)
  {
    int diff = currDate.compareTo(startingDate);
    return diff - days > 0;
  }
}

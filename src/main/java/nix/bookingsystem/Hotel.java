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
  
  public boolean IsBooked(Date currDate)
  {
    int diff = currDate.compareTo(startingDate);
    return diff - days > 0;
  }
}

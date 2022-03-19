/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nix.bookingsystem;

/**
 *
 * @author cheng
 */
public class Account
{
  public String username;
  public String password;

  public Account(String username, String password)
  {
    this.username = username;
    this.password = password;
  }
  
  public boolean equals(Account other)
  {
    return this.username.equals(other.username) && this.password.equals(other.password);
  }
}
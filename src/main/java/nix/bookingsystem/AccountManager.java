/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nix.bookingsystem;

import java.io.File;

/**
 *
 * @author cheng
 */
public class AccountManager extends AbstractFileManager
{
  private Account[] _accounts;
  public AccountManager(String filename)
  {
    super(filename);
  }
}

public class Account
{
  public String name;
  public String password;
}

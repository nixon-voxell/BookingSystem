/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nix.bookingsystem;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author cheng
 */
public class AccountManager extends AbstractFileManager
{
  private ArrayList<Account> _accounts;

  public AccountManager(String filename)
  {
    super(filename);
  }

  @Override
  public void LoadData() throws Exception
  {
    ReadFile();
    int contentLength = ContentLength();
    
    if (_accounts == null)
      _accounts = new ArrayList<Account>(contentLength);
    
    _accounts.clear();
    for (int c=0; c < contentLength; c++)
    {
      String[] lineContent = ReadLine(c);
      if (lineContent.length == 2)
        _accounts.add(new Account(lineContent[0], lineContent[1]));
      else if (lineContent.length == 1)
        _accounts.add(new Account(lineContent[0], ""));
    }
  }

  public void SaveAccounts() throws IOException
  {
    int accountSize = _accounts.size();
    String data = "";

    for (int a=0; a < accountSize; a++)
    {
      Account acc = _accounts.get(a);
      data += acc.username + ", ";
      data += acc.password + "\n";
    }
    
    WriteFile(data);
  }

  public void CreateAccount(String username, String password)
  {
    Account newAccount = new Account(username, password);
    _accounts.add(newAccount);
  }
  
  public void DeleteAccount(int accountIdx)
  {
    _accounts.remove(accountIdx);
  }
  
  public void DeleteAllAccounts()
  {
    _accounts.clear();
  }

  public int HasAccount(Account checkAccount)
  {
    int count = 0;
    for (Account account : _accounts)
    {
      if (checkAccount.equals(account)) return count;
      count++;
    }
    return -1;
  }

  public int HasAccountByUsername(String username)
  {
    int count = 0;
    for (Account account : _accounts)
    {
      if (username.equals(account.username)) return count;
      count++;
    }
    return -1;
  }
  
  public ArrayList<Account> getAccounts()
  {
    return _accounts;
  }
}

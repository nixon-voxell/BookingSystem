/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nix.bookingsystem;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author cheng
 */
public class HotelManager extends AbstractFileManager
{
  private ArrayList<Hotel> _hotels;

  public HotelManager(String filename)
  {
    super(filename);
  }
  
  public void LoadHotels() throws Exception
  {
    ReadFile();
    int contentLength = ContentLength();
    
    if (_hotels == null)
      _hotels = new ArrayList<Hotel>(contentLength);
    
    _hotels.clear();
    for (int c=0; c < contentLength; c++)
    {
      String[] lineContent = ReadLine(c);
      if (lineContent.length == 2)
        _hotels.add(new Hotel(c, lineContent[0], lineContent[1]));
      else if (lineContent.length == 8)
        _hotels.add(new Hotel(
                c, lineContent[0], lineContent[1],
                lineContent[2],
                lineContent[3],
                lineContent[4],
                lineContent[5],
                new Date(lineContent[6]),
                Integer.parseInt(lineContent[7])
        ));
    }
  }
  
  public ArrayList<Hotel> getHotels()
  {
    return _hotels;
  }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nix.bookingsystem;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author cheng
 */
public class RoomManager extends AbstractFileManager
{
  private ArrayList<Room> _rooms;
  private HashMap<String, Integer> _nameToIdx;

  public RoomManager(String filename)
  {
    super(filename);
  }

  @Override
  public void LoadData() throws Exception
  {
    ReadFile();
    int contentLength = ContentLength();
    
    if (_rooms == null)
    {
      _rooms = new ArrayList<Room>(contentLength);
      _nameToIdx = new HashMap<String, Integer>();
    }

    _rooms.clear();
    for (int c=0; c < contentLength; c++)
    {
      String[] lineContent = ReadLine(c);
      if (lineContent.length == 2)
      {
        _rooms.add(new Room(c, lineContent[0], lineContent[1]));
        _nameToIdx.put(lineContent[0], c);
      }
    }
  }

  public int NameToIdx(String roomName)
  {
    return _nameToIdx.get(roomName);
  }

  public ArrayList<Room> getRooms()
  {
    return _rooms;
  }
}

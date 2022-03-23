/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nix.bookingsystem;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author cheng
 */
public abstract class AbstractFileManager
{
  private static final String ROOT_FOLDER = "D:/VoxellDevelopment/JavaProjs/BookingSystem/data/";
  private static final String SEPARATOR = ", ";

  private String _filepath;
  private String[] _contents;

  public AbstractFileManager(String filename)
  {
    this._filepath = ROOT_FOLDER + filename + ".txt";
    _contents = new String[0];
  }

  public void ReadFile() throws Exception
  {
    String rawData = "";

    File file = new File(_filepath);
    Scanner scanner = new Scanner(file);
    while (scanner.hasNextLine())
      rawData += scanner.nextLine() + "\n";

    scanner.close();
    _contents = rawData.split("\n");
  }

  protected String[] ReadLine(int lineNumber)
  {
    return _contents[lineNumber].split(SEPARATOR);
  }

  protected void WriteFile(String data) throws IOException
  {
    FileWriter fileWriter = new FileWriter(_filepath);
    fileWriter.write(data);
    fileWriter.close();
  }

  public int ContentLength()
  {
    if (_contents == null) return 0;
    return _contents.length;
  }
  
  public abstract void LoadData() throws Exception;
}

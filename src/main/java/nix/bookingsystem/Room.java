/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nix.bookingsystem;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author cheng
 */
public class Room
{
  private static final String PIC_FOLDER = "D:/VoxellDevelopment/JavaProjs/BookingSystem/pics/";
  private final float ICON_WIDTH = 300.0f;

  public int idx;
  public String name;
  public String imageName;
  public ImageIcon icon;
  
  public Room(int idx, String name, String imageName)
  {
    this.idx = idx;
    this.name = name;
    this.imageName = PIC_FOLDER + imageName + ".jpg";
    
    icon = new ImageIcon(this.imageName);
    float width = icon.getIconWidth();
    float height = icon.getIconHeight();
    Image image = icon.getImage();
    image = image.getScaledInstance(
      (int)ICON_WIDTH, (int)(ICON_WIDTH/width*height), Image.SCALE_SMOOTH
    );
    icon.setImage(image);
  }
}

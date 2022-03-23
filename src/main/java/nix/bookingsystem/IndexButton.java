/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nix.bookingsystem;

import javax.swing.JButton;

/**
 *
 * @author cheng
 */
public class IndexButton extends JButton
{
  public final int index;
  
  public IndexButton(String text, int index)
  {
    super(text);
    this.index = index;
  }
}

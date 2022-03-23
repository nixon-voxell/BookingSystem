/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nix.bookingsystem;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;

/**
 *
 * @author cheng
 */

// Reference from https://stackoverflow.com/questions/11093326/restricting-jtextfield-input-to-integers
class IntFilter extends DocumentFilter
{
  @Override
  public void insertString(FilterBypass fb, int offset, String string,
    AttributeSet attr) throws BadLocationException {

    Document doc = fb.getDocument();
    StringBuilder sb = new StringBuilder();
    sb.append(doc.getText(0, doc.getLength()));
    sb.insert(offset, string);

    if (test(sb.toString())) {
       super.insertString(fb, offset, string, attr);
    } else {
       // warn the user and don't allow the insert
    }
  }

  private boolean test(String text)
  {
    if (text.isEmpty()) return true;
    char[] characters = text.toCharArray();
    for (char c : characters)
    {
      try
      {
        Integer.parseInt(String.valueOf(c));
      }
      catch (NumberFormatException e)
      {
        return false;
      }
    }

    return true;
  }

  @Override
  public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs)
  throws BadLocationException
  {
    Document doc = fb.getDocument();
    StringBuilder sb = new StringBuilder();
    sb.append(doc.getText(0, doc.getLength()));
    sb.replace(offset, offset + length, text);

    if (test(sb.toString())) {
      super.replace(fb, offset, length, text, attrs);
    } else {
      // warn the user and don't allow the insert
    }
  }

  @Override
  public void remove(FilterBypass fb, int offset, int length) throws BadLocationException
  {
    Document doc = fb.getDocument();
    StringBuilder sb = new StringBuilder();
    sb.append(doc.getText(0, doc.getLength()));
    sb.delete(offset, offset + length);

    if (test(sb.toString()))
    {
      super.remove(fb, offset, length);
    } else
    {
      // warn the user and don't allow the insert
    }
  }
}
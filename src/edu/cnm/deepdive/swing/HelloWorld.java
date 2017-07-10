/**
 * 
 */
package edu.cnm.deepdive.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 * @author Kelly Escobar
 *
 */
public class HelloWorld {

  private JFrame frame;

  /**
   * @param args
   */
  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
      new HelloWorld().createAndShowGui();
    });

  }

  private void createAndShowGui() {
    frame = new JFrame("Hello World in Swing");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JButton button = new JButton("Say Hello");
    button.addActionListener(
        evt -> JOptionPane.showMessageDialog(frame, "Hello from an anonymous class!"));
    frame.getContentPane().add(button);
    frame.pack();
    frame.setVisible(true);
  }


}

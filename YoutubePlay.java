
import java.awt.Color;
import java.awt.Container;
import java.awt.Desktop;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.*;

public class YoutubePlay 
{
public static void main(String[] args) throws URISyntaxException {
final URI uri = new URI("https://www.youtube.com/watch?v=Cfd9DOnuF9w");
class OpenUrlAction implements ActionListener 
{
  @Override public void actionPerformed(ActionEvent e) {
    open(uri);
  }
  
  

        
    }
JFrame frame = new JFrame("Java online Help");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(400, 400);
Container container = frame.getContentPane();
container.setLayout(new GridBagLayout());
JButton button = new JButton();
button.setText("<HTML>Click the <FONT color=\"#000099\"><U>link</U></FONT>");
button.setHorizontalAlignment(SwingConstants.LEFT);
button.setBorderPainted(false);
button.setOpaque(false);
button.setBackground(Color.WHITE);
button.setToolTipText(uri.toString());
button.addActionListener(new OpenUrlAction());
container.add(button);
frame.setVisible(true);
}
private static void open(URI uri) 
{
    if (Desktop.isDesktopSupported()) 
    {
      try 
      {
        Desktop.getDesktop().browse(uri);
      }
      catch (IOException e) 
      { /* TODO: error handling */ }
    }
    else
    { /* TODO: error handling */ }
  }

    static void main(String args) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  }
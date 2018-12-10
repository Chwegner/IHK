package ihk;

import java.applet.Applet;
import javax.swing.JFrame;
import java.awt.*;

/**
 *
 * @author cwegner
 */
public class IHK extends Applet
{

    public static void main(String[] args)
    {
        // Gui Start

        Gui gui = new Gui();

        // Gui Ende
        Gui.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Gui.frame.setVisible(true);
    }

}

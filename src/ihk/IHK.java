package ihk;

import javax.swing.JFrame;

/**
 *
 * @author cwegner
 */
public class IHK
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

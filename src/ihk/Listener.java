package ihk;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author cwegner
 */
public class Listener implements ActionListener
{

    @Override
    public void actionPerformed(ActionEvent e)
    {
        // Variablen //

        String vorname = Gui.textVorname.getText();
        String nachname = Gui.textNachname.getText();
        String datum = Gui.textGeb.getText();
        String ort = Gui.textOrt.getText();
        String beruf = Gui.textBeruf.getText();

        double fach = Double.parseDouble(Gui.textFach.getText());
        double kern = Double.parseDouble(Gui.textKern.getText());
        double wiso = Double.parseDouble(Gui.textWiso.getText());
        double arbeit = Double.parseDouble(Gui.textArbeit.getText());
        double doku = Double.parseDouble(Gui.textDoku.getText());
        double praes = Double.parseDouble(Gui.textPrae.getText());
        double gespr = Double.parseDouble(Gui.textGespr.getText());

        // Button 1 Event //
        if (e.getSource() == Gui.button)
        {

            Gui.panelPerson.setVisible(false);
            Gui.panelTheorie.setVisible(false);
            Gui.panelProjekt.setVisible(false);
            Gui.button.setVisible(false);
            Gui.panelHeader.setVisible(false);
            Gui.panelAusw.setVisible(true);
            Gui.button2.setVisible(true);

            Gui.ausgabeBorder.setTitle("IHK Abschlussprüfung " + beruf
                    + " " + vorname + " " + nachname);

            Ausgabe ausgabe = new Ausgabe();
            String ausgabeString = ausgabe.TextAusgabe(fach, kern, wiso, arbeit, doku, praes, gespr);
            Gui.test.setText(ausgabeString);
            Gui.panelAusw.add(Gui.test);
        }

        // Button 2 Event //
        if (e.getSource() == Gui.button2)
        {
            Gui.panelPerson.setVisible(true);
            Gui.panelTheorie.setVisible(true);
            Gui.panelProjekt.setVisible(true);
            Gui.button.setVisible(true);
            Gui.panelHeader.setVisible(true);
            Gui.panelAusw.setVisible(false);
            Gui.button2.setVisible(false);
        }
    }
}

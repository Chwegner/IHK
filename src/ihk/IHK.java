package ihk;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author cwegner
 */
public class IHK
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // Frame
        JFrame frame = new JFrame("IHK Prüfungsauswertung");
        frame.setSize(800, 750);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);

        // Frame Platzierung Bildschirmmitte
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int w = frame.getSize().width;
        int h = frame.getSize().height;
        int x = (dimension.width - w) / 2;
        int y = (dimension.height - h) / 2;
        frame.setLocation(x, y);

        // Panel Header
        JPanel panelHeader = new JPanel();
        panelHeader.setLayout(new GridBagLayout());
        panelHeader.setBounds(100, 30, 600, 70);
        frame.add(panelHeader);

        // Panel Persönliche Daten
        JPanel panelPerson = new JPanel();
        panelPerson.setLayout(new GridLayout(5, 2));
        panelPerson.setBounds(100, 110, 600, 190);
        frame.add(panelPerson);

        // Panel Punkte Theorie
        JPanel panelTheorie = new JPanel();
        panelTheorie.setLayout(new GridLayout(5, 2));
        panelTheorie.setBounds(100, 310, 295, 290);
        frame.add(panelTheorie);

        // Panel Punkte Projekt
        JPanel panelProjekt = new JPanel();
        panelProjekt.setLayout(new GridLayout(5, 2));
        panelProjekt.setBounds(405, 310, 295, 290);
        frame.add(panelProjekt);

        //Panel Button
        JPanel panelButton = new JPanel();
        panelButton.setLayout(new GridBagLayout());
        panelButton.setBounds(100, 610, 600, 70);
        frame.add(panelButton);

        // Panel Auswertung
        JPanel panelAusw = new JPanel();
        panelAusw.setLayout(new GridBagLayout());
        panelAusw.setBounds(100, 110, 600, 490);
        panelAusw.setVisible(false);
        frame.add(panelAusw);

        // Objekte PanelHeader
        JLabel headerLabel = new JLabel();
        headerLabel.setText("IHK Prüfungsauswertung");
        panelHeader.add(headerLabel);

        // Objekte PanelPerson
        JLabel labelVorname = new JLabel();
        labelVorname.setText("Vorname");
        labelVorname.setHorizontalAlignment(JLabel.CENTER);
        panelPerson.add(labelVorname);

        JTextField textVorname = new JTextField(5);
        textVorname.setHorizontalAlignment(JTextField.LEFT);
        panelPerson.add(textVorname);

        JLabel labelNachname = new JLabel();
        labelNachname.setText("Nachname");
        labelNachname.setHorizontalAlignment(JLabel.CENTER);
        panelPerson.add(labelNachname);

        JTextField textNachname = new JTextField(5);
        textNachname.setHorizontalAlignment(JTextField.LEFT);
        panelPerson.add(textNachname);

        JLabel labelGeb = new JLabel();
        labelGeb.setText("Geburtsdatum");
        labelGeb.setHorizontalAlignment(JLabel.CENTER);
        panelPerson.add(labelGeb);

        JTextField textGeb = new JTextField(5);
        textGeb.setHorizontalAlignment(JTextField.LEFT);
        panelPerson.add(textGeb);

        JLabel labelOrt = new JLabel();
        labelOrt.setText("Wohnort");
        labelOrt.setHorizontalAlignment(JLabel.CENTER);
        panelPerson.add(labelOrt);

        JTextField textOrt = new JTextField(5);
        textOrt.setHorizontalAlignment(JTextField.LEFT);
        panelPerson.add(textOrt);

        JLabel labelBeruf = new JLabel();
        labelBeruf.setText("Beruf");
        labelBeruf.setHorizontalAlignment(JLabel.CENTER);
        panelPerson.add(labelBeruf);

        JTextField textBeruf = new JTextField(5);
        textBeruf.setHorizontalAlignment(JTextField.LEFT);
        panelPerson.add(textBeruf);

        // Objekte PanelTheorie
        JLabel labelFach = new JLabel();
        labelFach.setText("Fachqualifikation");
        labelFach.setHorizontalAlignment(JLabel.CENTER);
        panelTheorie.add(labelFach);

        JTextField textFach = new JTextField(5);
        textFach.setHorizontalAlignment(JTextField.LEFT);
        panelTheorie.add(textFach);

        JLabel labelKern = new JLabel();
        labelKern.setText("Kernqualifikation");
        labelKern.setHorizontalAlignment(JLabel.CENTER);
        panelTheorie.add(labelKern);

        JTextField textKern = new JTextField(5);
        textKern.setHorizontalAlignment(JTextField.LEFT);
        panelTheorie.add(textKern);

        JLabel labelWiso = new JLabel();
        labelWiso.setText("WISO");
        labelWiso.setHorizontalAlignment(JLabel.CENTER);
        panelTheorie.add(labelWiso);

        JTextField textWiso = new JTextField(5);
        textWiso.setHorizontalAlignment(JTextField.LEFT);
        panelTheorie.add(textWiso);

        //Objekte PanelProjekt
        JLabel labelArbeit = new JLabel();
        labelArbeit.setText("Projektarbeit");
        labelArbeit.setHorizontalAlignment(JLabel.CENTER);
        panelProjekt.add(labelArbeit);

        JTextField textArbeit = new JTextField(5);
        textArbeit.setHorizontalAlignment(JTextField.LEFT);
        panelProjekt.add(textArbeit);

        JLabel labelDoku = new JLabel();
        labelDoku.setText("Projektdokumentation");
        labelDoku.setHorizontalAlignment(JLabel.CENTER);
        panelProjekt.add(labelDoku);

        JTextField textDoku = new JTextField(5);
        textDoku.setHorizontalAlignment(JTextField.LEFT);
        panelProjekt.add(textDoku);

        JLabel labelPrae = new JLabel();
        labelPrae.setText("Präsentation");
        labelPrae.setHorizontalAlignment(JLabel.CENTER);
        panelProjekt.add(labelPrae);

        JTextField textPrae = new JTextField(5);
        textPrae.setHorizontalAlignment(JTextField.LEFT);
        panelProjekt.add(textPrae);

        JLabel labelGespr = new JLabel();
        labelGespr.setText("Gespräch");
        labelGespr.setHorizontalAlignment(JLabel.CENTER);
        panelProjekt.add(labelGespr);

        JTextField textGespr = new JTextField();
        textGespr.setHorizontalAlignment(JTextField.LEFT);
        panelProjekt.add(textGespr);

        // Objekte ButtonPanel
        JButton button = new JButton("Berechnen");
        panelButton.add(button);

        JButton button2 = new JButton("Zurück");
        panelButton.add(button2);
        button2.setVisible(false);

        // Action Listener
        button.addActionListener((ActionEvent e) ->
        {
            if (e.getSource() == button)
            {
                
                String vorname = textVorname.getText();
                String nachname = textNachname.getText();
                String datum = textGeb.getText();
                String ort = textOrt.getText();
                String beruf = textBeruf.getText();
                
                double fach = Double.parseDouble(textFach.getText());
                double kern = Double.parseDouble(textKern.getText());
                double wiso = Double.parseDouble(textWiso.getText());
                double arbeit = Double.parseDouble(textArbeit.getText());
                double doku = Double.parseDouble(textDoku.getText());
                double praes = Double.parseDouble(textPrae.getText());
                double gespr = Double.parseDouble(textGespr.getText());
                
                panelPerson.setVisible(false);
                panelTheorie.setVisible(false);
                panelProjekt.setVisible(false);
                button.setVisible(false);
                panelAusw.setVisible(true);
                button2.setVisible(true);
                
                Ausgabe ausgabe = new Ausgabe();
                ausgabe.Text(vorname, nachname, datum, ort, beruf, fach, kern, wiso, arbeit, doku, praes, gespr);
                
            }
        });

        button2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                panelPerson.setVisible(true);
                panelTheorie.setVisible(true);
                panelProjekt.setVisible(true);
                button.setVisible(true);
                panelAusw.setVisible(false);
                button2.setVisible(false);

            }
        });

        // Frame Abschluss
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}

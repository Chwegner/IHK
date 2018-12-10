package ihk;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class Gui
{

    // Klassen-Variablen
    public static JLabel headerLabel;
    public static JPanel panelHeader, panelPerson, panelTheorie;
    public static JPanel panelProjekt, panelButton, panelAusw;
    public static JTextField textVorname, textNachname, textGeb, textOrt, textBeruf;
    public static JTextField textFach, textKern, textWiso;
    public static JTextField textArbeit, textDoku, textPrae, textGespr;
    public static JButton button, button2;
    public static TitledBorder persBorder, theorieBorder, projektBorder, ausgabeBorder;
    public static JLabel test;
    public static JFrame frame;

    public Gui()
    {
        //<editor-fold defaultstate="collapsed" desc="Gerüst">
        Color frameColor = new Color(75, 101, 132);
        Color fieldColor = new Color(209, 216, 224);
        Color textColor = new Color(223, 249, 251);

        // Fonts
        Font headerFont = new Font("Verdana", Font.BOLD, 30);
        Font labelFont = new Font("Verdana", 0, 18);
        Font borderFont = new Font("Century Gothic", Font.BOLD, 14);
        Font ausgabeFont = new Font("Verdana", 0, 14);

        // Borders
        persBorder = new TitledBorder("Personendaten");
        persBorder.setTitleFont(borderFont);
        persBorder.setTitleColor(fieldColor);
        theorieBorder = new TitledBorder("Punkte Theorie");
        theorieBorder.setTitleFont(borderFont);
        theorieBorder.setTitleColor(fieldColor);
        projektBorder = new TitledBorder("Punkte Projekt");
        projektBorder.setTitleFont(borderFont);
        projektBorder.setTitleColor(fieldColor);
        ausgabeBorder = new TitledBorder("");
        ausgabeBorder.setTitleFont(borderFont);
        ausgabeBorder.setTitleColor(fieldColor);

        // Frame
        frame = new JFrame("IHK Prüfungsauswertung");
        frame.setSize(800, 750);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.getContentPane().setBackground(frameColor);

        // Frame Platzierung Bildschirmmitte
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int w = frame.getSize().width;
        int h = frame.getSize().height;
        int x = (dimension.width - w) / 2;
        int y = (dimension.height - h) / 2;
        frame.setLocation(x, y);

        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc="Panels">
        // Panel Header
        panelHeader = new JPanel();
        panelHeader.setLayout(new GridBagLayout());
        panelHeader.setBounds(100, 30, 600, 70);
        panelHeader.setBackground(frameColor);
        frame.add(panelHeader);

        // Panel Persönliche Daten
        panelPerson = new JPanel();
        panelPerson.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(1, 1, 1, 1);
        panelPerson.setBounds(100, 110, 600, 190);
        panelPerson.setBackground(frameColor);
        panelPerson.setBorder(persBorder);
        frame.add(panelPerson);

        // Panel Punkte Theorie
        panelTheorie = new JPanel();
        panelTheorie.setLayout(new GridBagLayout());
        GridBagConstraints constraints1 = new GridBagConstraints();
        panelTheorie.setBounds(100, 310, 295, 290);
        panelTheorie.setBackground(frameColor);
        panelTheorie.setBorder(theorieBorder);
        frame.add(panelTheorie);

        // Panel Punkte Projekt
        panelProjekt = new JPanel();
        panelProjekt.setLayout(new GridBagLayout());
        GridBagConstraints constraints2 = new GridBagConstraints();
        panelProjekt.setBounds(405, 310, 295, 290);
        panelProjekt.setBackground(frameColor);
        panelProjekt.setBorder(projektBorder);
        frame.add(panelProjekt);

        //Panel Button
        panelButton = new JPanel();
        panelButton.setLayout(new GridBagLayout());
        panelButton.setBounds(100, 610, 600, 70);
        panelButton.setBackground(frameColor);
        frame.add(panelButton);

        // Panel Auswertung
        panelAusw = new JPanel();
        panelAusw.setLayout(new FlowLayout());
        panelAusw.setBounds(100, 30, 600, 570);
        panelAusw.setBackground(frameColor);
        panelAusw.setBorder(ausgabeBorder);
        panelAusw.setVisible(false);
        test = new JLabel();
        test.setFont(ausgabeFont);
        test.setForeground(textColor);
        frame.add(panelAusw);

        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc="Objekte PanelHeader">
        // Objekte PanelHeader
        headerLabel = new JLabel();
        headerLabel.setText("IHK Prüfungsauswertung");
        headerLabel.setFont(headerFont);
        headerLabel.setForeground(textColor);
        panelHeader.add(headerLabel);

        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc="Objekte PanelPerson">
        // Objekte PanelPerson
        JLabel labelVorname = new JLabel();
        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.anchor = GridBagConstraints.CENTER;
        labelVorname.setText("Vorname");
        labelVorname.setFont(labelFont);
        labelVorname.setForeground(textColor);
        panelPerson.add(labelVorname, constraints);

        textVorname = new JTextField(15);
        constraints.gridx = 2;
        constraints.gridy = 1;
        constraints.weightx = 0.5;
        constraints.anchor = GridBagConstraints.WEST;
        textVorname.setBackground(fieldColor);
        textVorname.setForeground(frameColor);
        textVorname.setFont(labelFont);
        panelPerson.add(textVorname, constraints);

        JLabel labelNachname = new JLabel();
        labelNachname.setText("Nachname");
        constraints.anchor = GridBagConstraints.CENTER;
        constraints.gridx = 1;
        constraints.gridy = 2;
        labelNachname.setFont(labelFont);
        labelNachname.setForeground(textColor);
        panelPerson.add(labelNachname, constraints);

        textNachname = new JTextField(15);
        constraints.anchor = GridBagConstraints.WEST;
        constraints.gridx = 2;
        constraints.gridy = 2;
        textNachname.setBackground(fieldColor);
        textNachname.setForeground(frameColor);
        textNachname.setFont(labelFont);
        panelPerson.add(textNachname, constraints);

        JLabel labelGeb = new JLabel();
        labelGeb.setText("Geburtsdatum");
        constraints.anchor = GridBagConstraints.CENTER;
        constraints.gridx = 1;
        constraints.gridy = 3;
        labelGeb.setFont(labelFont);
        labelGeb.setForeground(textColor);
        panelPerson.add(labelGeb, constraints);

        textGeb = new JTextField(15);
        constraints.anchor = GridBagConstraints.WEST;
        constraints.gridx = 2;
        constraints.gridy = 3;
        textGeb.setBackground(fieldColor);
        textGeb.setForeground(frameColor);
        textGeb.setFont(labelFont);
        panelPerson.add(textGeb, constraints);

        JLabel labelOrt = new JLabel();
        labelOrt.setText("Wohnort");
        constraints.anchor = GridBagConstraints.CENTER;
        constraints.gridx = 1;
        constraints.gridy = 4;
        labelOrt.setFont(labelFont);
        labelOrt.setForeground(textColor);
        panelPerson.add(labelOrt, constraints);

        textOrt = new JTextField(15);
        constraints.anchor = GridBagConstraints.WEST;
        constraints.gridx = 2;
        constraints.gridy = 4;
        textOrt.setBackground(fieldColor);
        textOrt.setForeground(frameColor);
        textOrt.setFont(labelFont);
        panelPerson.add(textOrt, constraints);

        JLabel labelBeruf = new JLabel();
        labelBeruf.setText("Beruf");
        constraints.anchor = GridBagConstraints.CENTER;
        constraints.gridx = 1;
        constraints.gridy = 5;
        labelBeruf.setFont(labelFont);
        labelBeruf.setForeground(textColor);
        panelPerson.add(labelBeruf, constraints);

        textBeruf = new JTextField(15);
        constraints.anchor = GridBagConstraints.WEST;
        constraints.gridx = 2;
        constraints.gridy = 5;
        textBeruf.setBackground(fieldColor);
        textBeruf.setForeground(frameColor);
        textBeruf.setFont(labelFont);
        panelPerson.add(textBeruf, constraints);

        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc="Objekte PanelTheorie">
        // Objekte PanelTheorie
        JLabel labelFach = new JLabel();
        labelFach.setText("Fachqualifikation");
        constraints1.gridx = 1;
        constraints1.gridy = 1;
        constraints1.weighty = 0.9;
        constraints1.ipadx = 10;
        labelFach.setFont(labelFont);
        labelFach.setForeground(textColor);
        panelTheorie.add(labelFach, constraints1);

        textFach = new JTextField(3);
        constraints1.gridx = 2;
        constraints1.gridy = 1;
        textFach.setBackground(fieldColor);
        textFach.setForeground(frameColor);
        textFach.setFont(labelFont);
        panelTheorie.add(textFach, constraints1);

        JLabel labelKern = new JLabel();
        labelKern.setText("Kernqualifikation");
        constraints1.anchor = GridBagConstraints.WEST;
        constraints1.gridx = 1;
        constraints1.gridy = 2;
        labelKern.setFont(labelFont);
        labelKern.setForeground(textColor);
        panelTheorie.add(labelKern, constraints1);

        textKern = new JTextField(3);
        constraints1.gridx = 2;
        constraints1.gridy = 2;
        textKern.setBackground(fieldColor);
        textKern.setForeground(frameColor);
        textKern.setFont(labelFont);
        panelTheorie.add(textKern, constraints1);

        JLabel labelWiso = new JLabel();
        labelWiso.setText("WISO");
        constraints1.anchor = GridBagConstraints.WEST;
        constraints1.gridx = 1;
        constraints1.gridy = 3;
        labelWiso.setFont(labelFont);
        labelWiso.setForeground(textColor);
        panelTheorie.add(labelWiso, constraints1);

        textWiso = new JTextField(3);
        constraints1.gridx = 2;
        constraints1.gridy = 3;
        textWiso.setBackground(fieldColor);
        textWiso.setForeground(frameColor);
        textWiso.setFont(labelFont);
        panelTheorie.add(textWiso, constraints1);

        JLabel p1 = new JLabel();
        p1.setText("Platzhalter");
        p1.setForeground(frameColor);
        constraints1.gridx = 1;
        constraints1.gridy = 4;
        p1.setVisible(true);
        panelTheorie.add(p1, constraints1);

        JLabel p2 = new JLabel("Platzhalter");
        constraints1.gridx = 1;
        constraints1.gridy = 5;
        p2.setForeground(frameColor);
        p2.setVisible(true);
        panelTheorie.add(p2, constraints1);

        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc="Objekte PanelProjekt">
        //Objekte PanelProjekt
        JLabel labelArbeit = new JLabel();
        labelArbeit.setText("Projektarbeit");
        constraints2.gridx = 1;
        constraints2.gridy = 1;
        constraints2.weighty = 0.9;
        constraints2.ipadx = 10;
        constraints2.anchor = GridBagConstraints.WEST;
        labelArbeit.setFont(labelFont);
        labelArbeit.setForeground(textColor);
        panelProjekt.add(labelArbeit, constraints2);

        textArbeit = new JTextField(3);
        constraints2.gridx = 2;
        constraints2.gridy = 1;
        textArbeit.setBackground(fieldColor);
        textArbeit.setForeground(frameColor);
        textArbeit.setFont(labelFont);
        panelProjekt.add(textArbeit, constraints2);

        JLabel labelDoku = new JLabel();
        labelDoku.setText("Dokumentation");
        constraints1.anchor = GridBagConstraints.WEST;
        constraints2.gridx = 1;
        constraints2.gridy = 2;
        constraints2.weighty = 0.9;
        constraints2.ipadx = 10;
        labelDoku.setFont(labelFont);
        labelDoku.setForeground(textColor);
        panelProjekt.add(labelDoku, constraints2);

        textDoku = new JTextField(3);
        constraints2.gridx = 2;
        constraints2.gridy = 2;
        textDoku.setBackground(fieldColor);
        textDoku.setForeground(frameColor);
        textDoku.setFont(labelFont);
        panelProjekt.add(textDoku, constraints2);

        JLabel labelPrae = new JLabel();
        labelPrae.setText("Präsentation");
        constraints1.anchor = GridBagConstraints.WEST;
        constraints2.gridx = 1;
        constraints2.gridy = 3;
        constraints2.weighty = 0.9;
        constraints2.ipadx = 10;
        labelPrae.setFont(labelFont);
        labelPrae.setForeground(textColor);
        panelProjekt.add(labelPrae, constraints2);

        textPrae = new JTextField(3);
        constraints2.gridx = 2;
        constraints2.gridy = 3;
        textPrae.setBackground(fieldColor);
        textPrae.setForeground(frameColor);
        textPrae.setFont(labelFont);
        panelProjekt.add(textPrae, constraints2);

        JLabel labelGespr = new JLabel();
        labelGespr.setText("Gespräch");
        constraints1.anchor = GridBagConstraints.WEST;
        constraints2.gridx = 1;
        constraints2.gridy = 4;
        constraints2.weighty = 0.9;
        constraints2.ipadx = 10;
        labelGespr.setFont(labelFont);
        labelGespr.setForeground(textColor);
        panelProjekt.add(labelGespr, constraints2);

        textGespr = new JTextField(3);
        constraints2.gridx = 2;
        constraints2.gridy = 4;
        textGespr.setBackground(fieldColor);
        textGespr.setForeground(frameColor);
        textGespr.setFont(labelFont);
        panelProjekt.add(textGespr, constraints2);

        JLabel p3 = new JLabel();
        p3.setText("Platzhalter");
        constraints2.gridx = 1;
        constraints2.gridy = 5;
        constraints2.weighty = 0.9;
        constraints2.ipadx = 10;
        p3.setFont(labelFont);
        p3.setForeground(frameColor);
        panelProjekt.add(p3, constraints2);

        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc="Objekte PanelButtons">
        // Objekte ButtonPanel
        button = new JButton("Berechnen");
        panelButton.add(button);
        button.addActionListener(new Listener());

        button2 = new JButton("Zurück");
        panelButton.add(button2);
        button2.addActionListener(new Listener());
        button2.setVisible(false);

        //</editor-fold>
    }

}

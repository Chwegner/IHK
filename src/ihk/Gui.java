package ihk;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
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
    public static JPanel panelProjekt,panelButton, panelAusw;
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
        Font headerFont = new Font("Arial", Font.BOLD, 30);
        Font labelFont = new Font("Arial", 0, 18);
        Font borderFont = new Font("Arial", Font.BOLD, 14);
        Font ausgabeFont = new Font("Arial", 0, 12);

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
        panelPerson.setLayout(new GridLayout(5, 3));
        panelPerson.setBounds(100, 110, 600, 190);
        panelPerson.setBackground(frameColor);
        panelPerson.setBorder(persBorder);
        frame.add(panelPerson);

        // Panel Punkte Theorie
        panelTheorie = new JPanel();
        panelTheorie.setLayout(new GridLayout(5, 2));
        panelTheorie.setBounds(100, 310, 295, 290);
        panelTheorie.setBackground(frameColor);
        panelTheorie.setBorder(theorieBorder);
        frame.add(panelTheorie);

        // Panel Punkte Projekt
        panelProjekt = new JPanel();
        panelProjekt.setLayout(new GridLayout(5, 2));
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
        panelAusw.setBounds(100, 110, 600, 490);
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
        labelVorname.setText("Vorname");
        labelVorname.setHorizontalAlignment(JLabel.CENTER);
        labelVorname.setFont(labelFont);
        labelVorname.setForeground(textColor);
        panelPerson.add(labelVorname);

        textVorname = new JTextField(5);
        textVorname.setHorizontalAlignment(JTextField.LEFT);
        textVorname.setBackground(fieldColor);
        textVorname.setForeground(frameColor);
        textVorname.setFont(labelFont);
        panelPerson.add(textVorname);

        JLabel labelNachname = new JLabel();
        labelNachname.setText("Nachname");
        labelNachname.setHorizontalAlignment(JLabel.CENTER);
        labelNachname.setFont(labelFont);
        labelNachname.setForeground(textColor);
        panelPerson.add(labelNachname);

        textNachname = new JTextField(5);
        textNachname.setHorizontalAlignment(JTextField.LEFT);
        textNachname.setBackground(fieldColor);
        textNachname.setForeground(frameColor);
        textNachname.setFont(labelFont);
        panelPerson.add(textNachname);

        JLabel labelGeb = new JLabel();
        labelGeb.setText("Geburtsdatum");
        labelGeb.setHorizontalAlignment(JLabel.CENTER);
        labelGeb.setFont(labelFont);
        labelGeb.setForeground(textColor);
        panelPerson.add(labelGeb);

        textGeb = new JTextField(5);
        textGeb.setHorizontalAlignment(JTextField.LEFT);
        textGeb.setBackground(fieldColor);
        textGeb.setForeground(frameColor);
        textGeb.setFont(labelFont);
        panelPerson.add(textGeb);

        JLabel labelOrt = new JLabel();
        labelOrt.setText("Wohnort");
        labelOrt.setHorizontalAlignment(JLabel.CENTER);
        labelOrt.setFont(labelFont);
        labelOrt.setForeground(textColor);
        panelPerson.add(labelOrt);

        textOrt = new JTextField(5);
        textOrt.setHorizontalAlignment(JTextField.LEFT);
        textOrt.setBackground(fieldColor);
        textOrt.setForeground(frameColor);
        textOrt.setFont(labelFont);
        panelPerson.add(textOrt);

        JLabel labelBeruf = new JLabel();
        labelBeruf.setText("Beruf");
        labelBeruf.setHorizontalAlignment(JLabel.CENTER);
        labelBeruf.setFont(labelFont);
        labelBeruf.setForeground(textColor);
        panelPerson.add(labelBeruf);

        textBeruf = new JTextField(5);
        textBeruf.setHorizontalAlignment(JTextField.LEFT);
        textBeruf.setBackground(fieldColor);
        textBeruf.setForeground(frameColor);
        textBeruf.setFont(labelFont);
        panelPerson.add(textBeruf);

        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc="Objekte PanelTheorie">
        // Objekte PanelTheorie
        JLabel labelFach = new JLabel();
        labelFach.setText("Fachqualifikation");
        labelFach.setHorizontalAlignment(JLabel.CENTER);
        labelFach.setFont(labelFont);
        labelFach.setForeground(textColor);
        panelTheorie.add(labelFach);

        textFach = new JTextField(5);
        textFach.setHorizontalAlignment(JTextField.LEFT);
        textFach.setBackground(fieldColor);
        textFach.setForeground(frameColor);
        textFach.setFont(labelFont);
        panelTheorie.add(textFach);

        JLabel labelKern = new JLabel();
        labelKern.setText("Kernqualifikation");
        labelKern.setHorizontalAlignment(JLabel.CENTER);
        labelKern.setFont(labelFont);
        labelKern.setForeground(textColor);
        panelTheorie.add(labelKern);

        textKern = new JTextField(5);
        textKern.setHorizontalAlignment(JTextField.LEFT);
        textKern.setBackground(fieldColor);
        textKern.setForeground(frameColor);
        textKern.setFont(labelFont);
        panelTheorie.add(textKern);

        JLabel labelWiso = new JLabel();
        labelWiso.setText("WISO");
        labelWiso.setHorizontalAlignment(JLabel.CENTER);
        labelWiso.setFont(labelFont);
        labelWiso.setForeground(textColor);
        panelTheorie.add(labelWiso);

        textWiso = new JTextField(5);
        textWiso.setHorizontalAlignment(JTextField.LEFT);
        textWiso.setBackground(fieldColor);
        textWiso.setForeground(frameColor);
        textWiso.setFont(labelFont);
        panelTheorie.add(textWiso);

        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc="Objekte PanelProjekt">
        //Objekte PanelProjekt
        JLabel labelArbeit = new JLabel();
        labelArbeit.setText("Projektarbeit");
        labelArbeit.setHorizontalAlignment(JLabel.CENTER);
        labelArbeit.setFont(labelFont);
        labelArbeit.setForeground(textColor);
        panelProjekt.add(labelArbeit);

        textArbeit = new JTextField(5);
        textArbeit.setHorizontalAlignment(JTextField.LEFT);
        textArbeit.setBackground(fieldColor);
        textArbeit.setForeground(frameColor);
        textArbeit.setFont(labelFont);
        panelProjekt.add(textArbeit);

        JLabel labelDoku = new JLabel();
        labelDoku.setText("Dokumentation");
        labelDoku.setHorizontalAlignment(JLabel.CENTER);
        labelDoku.setFont(labelFont);
        labelDoku.setForeground(textColor);
        panelProjekt.add(labelDoku);

        textDoku = new JTextField(5);
        textDoku.setHorizontalAlignment(JTextField.LEFT);
        textDoku.setBackground(fieldColor);
        textDoku.setForeground(frameColor);
        textDoku.setFont(labelFont);
        panelProjekt.add(textDoku);

        JLabel labelPrae = new JLabel();
        labelPrae.setText("Präsentation");
        labelPrae.setHorizontalAlignment(JLabel.CENTER);
        labelPrae.setFont(labelFont);
        labelPrae.setForeground(textColor);
        panelProjekt.add(labelPrae);

        textPrae = new JTextField(5);
        textPrae.setHorizontalAlignment(JTextField.LEFT);
        textPrae.setBackground(fieldColor);
        textPrae.setForeground(frameColor);
        textPrae.setFont(labelFont);
        panelProjekt.add(textPrae);

        JLabel labelGespr = new JLabel();
        labelGespr.setText("Gespräch");
        labelGespr.setHorizontalAlignment(JLabel.CENTER);
        labelGespr.setFont(labelFont);
        labelGespr.setForeground(textColor);
        panelProjekt.add(labelGespr);

        textGespr = new JTextField();
        textGespr.setHorizontalAlignment(JTextField.LEFT);
        textGespr.setBackground(fieldColor);
        textGespr.setForeground(frameColor);
        textGespr.setFont(labelFont);
        panelProjekt.add(textGespr);

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

package ihk;

/**
 *
 * @author cwegner
 */
public class Ausgabe
{

    public String TextAusgabe(double fach, double kern, double wiso, double arbeit, double doku,
            double prae, double gespr)
    {

        String ausgabe;

//<editor-fold defaultstate="collapsed" desc="Berechnung">
        // Rechnung Theorie //
        double theoGesamt = fach + kern + wiso;
        double fachQ = Math.round(fach / 100 * 40);
        double kernQ = Math.round(kern / 100 * 40);
        double wisoQ = Math.round(wiso / 100 * 20);
        double theorie = fachQ + kernQ + wisoQ;

        // Rechnung Projekt //
        double projGesamt = arbeit + doku + prae + gespr;
        double arbeitQ = Math.round(arbeit / 100 * 25);
        double dokuQ = Math.round(doku / 100 * 25);
        double praesQ = Math.round(prae / 100 * 25);
        double gesprQ = Math.round(gespr / 100 * 25);
        double projekt = arbeitQ + dokuQ + praesQ + gesprQ;

        // Rechnung Gesamtnote
        double gesamtNote = Math.round((theorie / 100 * 50) + (projekt / 100 * 50));

        // Rechnung Noten-Ausgleich
        String bestanden;
        double pufferFQ = fach - 50;
        double pufferKQ = kern - 50;

        // Zuordnung der Ergebnisse zu Noten //
        Noten notenString = new Noten();
        String note = notenString.NotenString(theorie);
        String noteProjekt = notenString.NotenString(projekt);
        String noteGesamt = notenString.NotenString(gesamtNote);
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Bestanden Theorie">
        // Berechnung Theorie //
        if (fach < 31 || kern < 31 || wiso < 31)
        {
            bestanden = "Die Prüfung gilt als nicht bestanden.<br>"
                    + "Min. 31 Punkte pro Prüfungsteil sind zu erreichen.";
        } else if (wiso < 50)
        {
            if (pufferFQ + pufferKQ + wiso > 50)
            {
                bestanden = "Die Prüfung gilt als bestanden.<br>"
                        + "WISO-Punkte wurden ausgeglichen.";
            } else
            {
                bestanden = "Die Prüfung gilt als nicht bestanden.<br>"
                        + "WISO-Punkte konnten nicht ausgeglichen werden.";

            }
        } else if (fach < 50)
        {
            if (pufferKQ + fach > 50)
            {
                bestanden = "Die Prüfung gilt als bestanden.<br>"
                        + "FachQuali-Punkte wurden ausgeglichen.";
            } else
            {
                bestanden = "Die Prüfung gilt als nicht bestanden.<br>"
                        + "FachQuali-Punkte konnten nicht ausgeglichen werden.";
            }

        } else if (kern < 50)
        {
            if (pufferFQ + kern > 50)
            {
                bestanden = "Die Prüfung gilt als bestanden.<br>"
                        + "KernQuali-Punkte wurden ausgeglichen.";
            } else
            {
                bestanden = "Die Prüfung gilt als nicht bestanden.<br>"
                        + "KernQuali-Punkte konnten nicht ausgeglichen werden.";

            }
        } else
        {
            bestanden = "Die Prüfung gilt als bestanden.<br>"
                    + "Die Punkte der Teilbereiche sind ausreichend.";

        }

        //</editor-fold>


//<editor-fold defaultstate="collapsed" desc="Ausgabe">
        ausgabe = "<html><body>"
                + "<left>"
                + "<br>"
                + "<b><u>Punkte Theorie ohne Gewichtung: </u></b>"
                + "<br><br>"
                + "Fachqualifikation: " + fach + " von 100"
                + "<br>"
                + "Kernqualifikation: " + kern + " von 100"
                + "<br>"
                + "WISO: " + wiso + " von 100"
                + "<br>"
                + "Gesamt: " + theoGesamt + " von 300"
                + "<br>"
                + "<b><font color = 'rgb(43, 203, 186)'>"
                + bestanden
                + "</font></b>"
                + "<br><br>"
                + "<b><u>Punkte Theorie nach Gewichtung: </u></b>"
                + "<br><br>"
                + "Fachqualifikation (40%): " + fachQ
                + "<br>"
                + "Kernqualifikation (40%): " + kernQ
                + "<br>"
                + "WISO (20%): " + wisoQ
                + "<br>"
                + "Gesamt: " + theorie
                + "<br>"
                + "<b><b><font color = 'rgb(43, 203, 186)'>"
                + "Teilnote A: <u>" + note + "</u></b></font>"
                + "<br><br>"
                + "<b><u>Punkte Projekt (Gewichtung je 25%): </u></b>"
                + "<br><br>"
                + "Projektarbeit: " + arbeit
                + " (Gewichtet " + arbeitQ + ")"
                + "<br>"
                + "Dokumentation: " + doku
                + " (Gewichtet " + dokuQ + ")"
                + "<br>"
                + "Präsentation: " + prae
                + " (Gewichtet " + praesQ + ")"
                + "<br>"
                + "Gespräch: " + gespr
                + " (Gewichtet " + gesprQ + ")"
                + "<br>"
                + "Gesamt: " + projGesamt
                + " (Gewichtet " + projekt + ")"
                + "<br>"
                + "<b><b><font color = 'rgb(43, 203, 186)'>"
                + "Teilnote B: <u>" + noteProjekt
                + "</u></font></b><br><br>"
                + "<font size='4'>"
                + "Abschlussprüfung Punkte Gesamt (je 50% Gewichtung): " + gesamtNote
                + "<br>"
                + "Daraus ergibt sich folgende Abschlussnote: <u>" + noteGesamt
                + "</u></font></b><br><br>"
                + "</left>"
                + "</body></html>";
//</editor-fold>

        return ausgabe;

    }

}

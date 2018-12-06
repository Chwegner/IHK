package ihk;

/**
 *
 * @author cwegner
 */
public class Ausgabe
{

    public void Text(String vorname, String nachname, String datum, String ort,
            String beruf, double fach, double kern, double wiso, double arbeit, double doku,
            double prae, double gespr)
    {
        String ausgabe;
        
        double fachQ = fach / 100 * 40;
        double kernQ = kern / 100 * 40;
        double wisoQ = wiso / 100 * 20;        
        double theorie = fachQ + kernQ + wisoQ;
        System.out.println(theorie);
        
        double arbeitQ = arbeit / 100 * 25;
        double dokuQ = doku / 100 * 25;
        double praesQ = prae / 100 * 25;
        double gesprQ = gespr / 100 * 25;
        double projekt = arbeitQ + dokuQ + praesQ + gesprQ;
        System.out.println(projekt);
        
        double gewichtetP = (theorie / 100 * 50) + (projekt / 100 * 50);
        
        
        System.out.println(gewichtetP);
    }

}

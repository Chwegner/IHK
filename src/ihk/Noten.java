package ihk;

/**
 *
 * @author Chef
 */
public class Noten
{

    public String NotenString(double punkte)
    {
        String note;

        if (punkte >= 92)
        {
            note = "Sehr Gut";
        }
        else if (punkte < 92 && punkte >= 81)
        {
            note = "Gut";
        }
        else if (punkte < 81 && punkte >= 67)
        {
            note = "Befriedigend";
        }
        else if (punkte < 67 && punkte >= 50)
        {
            note = "Ausreichend";
        }
        else if (punkte < 50 && punkte >= 30)
        {
            note = "Mangelhaft";
        }
        else
        {
            note = "Ungenügend";
        }

        return note;
    }
}

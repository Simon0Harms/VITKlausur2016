package Ticketsystem;

public class Ticket
{
private int nummer=1;
private Veranstaltung veranstaltung;

public Ticket(int nummer, Veranstaltung veranstaltung)
{
	nummer++;
}

public void drucke()
{
	//TODO Designer beauftragen
	System.out.println(veranstaltung.getName());
	System.out.println("Ort: "+veranstaltung.getOrt());
	//System.out.println("Band: "+veranstaltung.getHauptact().getName());
	System.out.println("Ticketnummer: "+nummer);
}

public int getNummer()
{
	return nummer;
}

}

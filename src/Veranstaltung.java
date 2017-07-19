
import java.time.LocalDate;

public abstract class Veranstaltung
{
private String name;
private LocalDate datum;
private String ort;
private int maximaleAnzahlTickets;


public int gibAnzahlVerfuegbarerTickets()
{
	return 0; //TODO
}

public Ticket gibNaechstesTicket()
{
	return new Ticket();
}
}

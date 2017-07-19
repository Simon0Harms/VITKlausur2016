package Ticketsystem;

import java.time.LocalDate;

public class Rockkonzert extends Veranstaltung
{
	private Band hauptact;
	public Rockkonzert(String name, LocalDate datum, String ort, int maximaleAnzahlVerfuegbarerTickets )
	{
		
	}
	public Rockkonzert(String name, LocalDate datum, String ort, int maximaleAnzahlVerfuegbarerTickets, Band band )
	{
		
	}
	public String gibInfo()
	{
		return super.gibInfo()+" Band: "+hauptact; //TODO
	}
	public Band getHauptact()
	{
		return hauptact;
	}
	
}

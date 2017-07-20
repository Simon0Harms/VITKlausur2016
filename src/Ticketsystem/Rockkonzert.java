package Ticketsystem;

import java.time.LocalDate;

public class Rockkonzert extends Veranstaltung
{
	private Band hauptact;
	public Rockkonzert(String name, LocalDate datum, String ort, int maximaleAnzahlVerfuegbarerTickets )
	{
		this.setOrt(ort);
		this.setDatum(datum);
		this.setName(name);
		this.setMaximaleAnzahlTickets(maximaleAnzahlVerfuegbarerTickets);
	}
	public Rockkonzert(String name, LocalDate datum, String ort, int maximaleAnzahlVerfuegbarerTickets, Band band )
	{
		this(name,datum,ort,maximaleAnzahlVerfuegbarerTickets);
		this.hauptact=band;
		this.hauptact.fuegeKonzertHinzu(this);	
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

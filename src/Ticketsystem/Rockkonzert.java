package Ticketsystem;

import java.time.LocalDate;

public class Rockkonzert extends Veranstaltung
{
	private Band hauptact;
	public Rockkonzert(String name, LocalDate datum, String ort, int maximaleAnzahlVerfuegbarerTickets )
	{
		this(name,datum,ort,maximaleAnzahlVerfuegbarerTickets,null);
	}
	public Rockkonzert(String name, LocalDate datum, String ort, int maximaleAnzahlVerfuegbarerTickets, Band band )
	{
		this.setOrt(ort);
		this.setDatum(datum);
		this.setName(name);
		this.setMaximaleAnzahlTickets(maximaleAnzahlVerfuegbarerTickets);
		if (band != null)
		{	
			this.hauptact=band;
			this.hauptact.fuegeKonzertHinzu(this);
		}	
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

package Ticketsystem;

import java.time.LocalDate;

public abstract class Veranstaltung
{
private String name;
private LocalDate datum;
private String ort;
private int maximaleAnzahlTickets;
private Ticket verkaufteTickets;


public int gibAnzahlVerfuegbarerTickets()
{
	return maximaleAnzahlTickets-verkaufteTickets.getNummer(); 
}

public Ticket gibNaechstesTicket()
{
	if(maximaleAnzahlTickets==verkaufteTickets.getNummer())
	{
		return null;
	}
	else
	{
		return new Ticket(verkaufteTickets.getNummer(), this);
	}	
}

public String gibInfo()
{
	return "Name: "+name+" Datum: "+datum+" Ort: "+ort; 
}

public String getName()
{
	return name;
}

public LocalDate getDatum()
{
	return datum;
}

public int getMaximaleAnzahlTickets()
{
	return maximaleAnzahlTickets;
}

public Ticket getVerkaufteTickets()
{
	return verkaufteTickets;
}

public String getOrt()
{
	return ort;
}
}

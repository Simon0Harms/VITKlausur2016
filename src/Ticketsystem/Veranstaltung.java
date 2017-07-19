package Ticketsystem;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Veranstaltung
{
private String name;
private LocalDate datum;
private String ort;
private int maximaleAnzahlTickets;
private ArrayList<Ticket> verkaufteTickets = new ArrayList<>();
//protected Band hauptact;


/*public Band getHauptact()
{
	return hauptact;
}*/

public int gibAnzahlVerfuegbarerTickets()
{
	return maximaleAnzahlTickets-verkaufteTickets.size();
}

public Ticket gibNaechstesTicket()
{
	if(maximaleAnzahlTickets==verkaufteTickets.size())
	{
		return null;
	}
	else
	{
		this.verkaufteTickets.add(new Ticket(verkaufteTickets.size()+1, this));
		return this.verkaufteTickets.get(this.verkaufteTickets.size()-1);
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

public String getOrt()
{
	return ort;
}

public void setVerkaufteTickets(Ticket neuesTicket)
{
	this.verkaufteTickets.add(neuesTicket);
}

public void setMaximaleAnzahlTickets(int maximaleAnzahlTickets)
{
	this.maximaleAnzahlTickets = maximaleAnzahlTickets;
}

public void setName(String name)
{
	this.name = name;
}

public void setDatum(LocalDate datum)
{
	this.datum = datum;
}

public void setOrt(String ort)
{
	this.ort = ort;
}
}

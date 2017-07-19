package Ticketsystem;

import java.time.LocalDate;

public class Vorverkaufsstelle
{

	public static void main(String[] args)
	{
		Rockkonzert rockDieWelt = new Rockkonzert("Wir rocken die Welt", LocalDate.of(2017, 07, 22),"Münster",5000,new Band("Die zwei lustigen Drei"));
	
		
		
	for(int i = 0; i < rockDieWelt.getMaximaleAnzahlTickets()-1 ; i++)
	{
		rockDieWelt.gibNaechstesTicket();
		if (i == 4998)
		{
			System.out.println(rockDieWelt.gibAnzahlVerfuegbarerTickets());
		}
	}
	rockDieWelt.gibNaechstesTicket().drucke();
	System.out.println(rockDieWelt.gibNaechstesTicket());
	//rockDieWelt.
	/*
	rockDieWelt.gettickets[4999].drucke();
	System.out.println(new Ticket(5001,rockDieWelt));
	*/
	}
}

package Ticketsystem;

import java.time.LocalDate;

public class Vorverkaufsstelle
{

	public static void main(String[] args)
	{
		Rockkonzert rockDieWelt = new Rockkonzert("Wir rocken die Welt", LocalDate.of(2017, 07, 22),"Münster",5000,new Band("Die zwei lustigen Drei"));
	
	for(int i = 1; i < 4999 ; i++)
	{
		rockDieWelt.gibNaechstesTicket();
	}
	rockDieWelt.gibAnzahlVerfuegbarerTickets();
	Ticket letztesTicket = new Ticket(5000,rockDieWelt);
	letztesTicket.drucke();
	System.out.println(new Ticket(5001,rockDieWelt));
	}
}

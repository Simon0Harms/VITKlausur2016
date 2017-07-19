package Ticketsystem;

import java.util.ArrayList;

public class Band
{
	private String name;
	private ArrayList<Rockkonzert> konzert = new ArrayList<>();

public Band(String name)
{
	this.name=name;
}

public void fuegeKonzertHinzu(Rockkonzert rocken)
{
	konzert.add(rocken);
}

public String getName()
{
	return name;
}

}
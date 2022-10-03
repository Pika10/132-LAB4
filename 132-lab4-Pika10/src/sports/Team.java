package sports;

import java.util.ArrayList;

public class Team {

	
	private String name;
	private ArrayList<Athlete> athletes = new ArrayList<Athlete>();
	private Athlete captain=null;
	private Club club=null;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public ArrayList<Athlete> getAthletes()
	{
		return athletes;
	}
	
	public void setCaptain(Athlete captain)
	{
		if (captain.getTeam()==this)
		{
			
			this.captain=captain;
		
		}
		else
		{
			System.out.print("An error occured\n");
		}
		
		
	}
	public Athlete getCaptain()
	{
		return captain;
	}
	
	public void setClub(Club club)
	{
		this.club=club;
	}
	public Club getClub()
	{
		return club;
	}
	
	public void addAthlete(Athlete athlete)
	{
		athletes.add(athlete);
		athlete.setTeam(this);
		athlete.setOnContract(true);
	}
	public void removeAthlete(Athlete athlete)
	{
		athletes.remove(athlete);
		athlete.setTeam(null);
		athlete.setOnContract(false);
	}
	public int teamSalary()
	{
		int sum=0;
		for (Athlete athlete : athletes)
		{
			sum+= athlete.getSalary();
		}
		return sum;
	}
	
	public String toString() {
		String members = "";
		for(Athlete ath: athletes)
		{
			members += ath.toString() + "\n";
		}
		
		String out = this.name + "\n" + "Team Captain: " + "\n" + this.captain.toString() + "\n" + "Members: \n" + members;
		
		return out;
	}
	
	
	
	
	
	public Team (String name) 
	{
		this.name=name;
	}
}

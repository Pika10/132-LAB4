package sports;

import java.util.ArrayList;

public class Athlete {
	
	private static ArrayList<Athlete> all_athletes=new ArrayList<Athlete>();
	
	
	private String jersey_number;
	private String name;
	private String surname;
	private int salary;         //
	private boolean on_contract=false;//
	private Team team=null;          //
	private Gender gender;
	
	
	public Athlete (String jersey_number, String name, String surname, Gender gender, int salary) 
	{
		this.jersey_number=jersey_number;
		this.name=name;
		this.surname=surname;
		this.gender=gender;
		this.salary=salary;
		
		all_athletes.add(this);
	}
	public Athlete (String jersey_number, String name, String surname, Gender gender)
	{
		this(jersey_number,name,surname,gender,0);
		all_athletes.add(this);
	}
	
	
	
	
	public void setJerseyNumber(String jerseyNumber)
	{
		this.jersey_number=jerseyNumber;
	}
	public String getJerseyNumber()
	{
		return jersey_number;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setSurname(String surname)
	{
		this.surname=surname;
	}
	public String getSurname()
	{
		return surname;
	}
	
	public void setSalary(int salary)
	{
		this.salary=salary;
	}
	public int getSalary()
	{
		return salary;
	}
	
	public void setOnContract(boolean on_contract)
	{
		this.on_contract=on_contract;
	}
	public boolean getOnContract()
	{
		return on_contract;
	}
	
	public void setTeam(Team team)
	{
		this.team=team;
	}
	public Team getTeam()
	{
		return team;
	}
	
	public void setGender(Gender gender)
	{
		this.gender=gender;
	}
	public Gender getGender()
	{
		return gender;
	}
	
	
	
	
	
	
	
	public static ArrayList<Athlete> searchByName(String name)
	{
		ArrayList<Athlete> selectedAthletes= new ArrayList<Athlete>();
		for (Athlete athlete:all_athletes)
		{
			if (athlete.getName()==name)
			{
				selectedAthletes.add(athlete);
			}
		}
		return selectedAthletes;
	}
	
	public String getFullname()
	{
		return name+" "+surname;
	}
	public String toString() {
		return this.jersey_number + "," + this.surname + "," + this.name + "," + this.salary + " TL" ;
	}
	
	public enum Gender
	{
		FEMALE,
		MALE,
	}

}

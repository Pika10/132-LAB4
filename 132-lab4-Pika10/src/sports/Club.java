package sports;

import java.util.ArrayList;

public class Club {
	
	
	private String name;
	private int yearEstablished;
	private ArrayList<Team> teams;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setYearEstablished(int yearEstablished)
	{
		this.yearEstablished=yearEstablished;
	}
	public int getYearEstablished()
	{
		return yearEstablished;
	}
	
	public void setTeams(ArrayList<Team> teams)
	{
		this.teams=teams;
	}
	public ArrayList<Team> getTeams()
	{
		return teams;
	}
	
	public void addTeam(Team team) 
	{
		teams.add(team);
		team.setClub(this);
	}
	public void removeTeam(Team team) 
	{
		teams.remove(team);
		team.setClub(null);
	}
	public int clubSalary()
	{
		int sum=0;
		for (Team team: teams)
		{
			sum+=team.teamSalary();
		}
		return sum;
	}
	public String toString() 
	{
		String t = "";
		for(Team team: teams)
		{
			t += team.toString() + "\n";
		}
		
		String out = "Club: " + this.name + "\n" + "Year Established: " + this.yearEstablished + "\n" + "Teams: " + "\n" + t;
		out = out + "Total Club Salary: " + this.clubSalary() + "TL\n"+"Number of female athletes: "+this.genderCount(Athlete.Gender.FEMALE)+"\n"+"Number of male athletes: "+this.genderCount(Athlete.Gender.MALE)+"\n";
		
		
		return out;
	}
	
	public Club (String name, int yearEstablished, ArrayList<Team> teams) 
	{
		this.name=name;
		this.yearEstablished=yearEstablished;
		this.teams=teams;
	}
	public Club (String name, int yearEstablished) 
	{
		this(name,yearEstablished,new ArrayList<Team>());
	}
	
	public int genderCount(Athlete.Gender gender)
	{
		int sum=0;
			for (Team team: teams)
			{
				for (Athlete athlete: team.getAthletes())
					{
						if (athlete.getGender()==gender)
						{
							sum+=1;
						}
					}
			}
			return sum;
	}
}

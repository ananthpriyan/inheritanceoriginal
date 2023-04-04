package org.single;

//child class
//public class child class extend parent class
public class TeamSponsor extends TeamDetails {
	
	public void sponsorName() {
		
		System.out.println("Sponsor name Anandcricket club");
		
	}
	

	public static void main(String[] args) {
		
		TeamSponsor y=new TeamSponsor();
		y.sponsorName();
        y.teamAdd();
        y.teamName();
	}

}

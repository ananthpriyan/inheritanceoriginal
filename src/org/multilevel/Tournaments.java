package org.multilevel;

// child class
public class Tournaments extends TeamSponsor {
	
	private void tournamentName() {
		System.out.println("Tournament name is: Sangai Trophy");
		
	}

	public static void main(String[] args) {
		Tournaments z=new Tournaments();
		z.tournamentName();
		z.sponsorName();
		teamName();
		z.teamAdd();

	}

}

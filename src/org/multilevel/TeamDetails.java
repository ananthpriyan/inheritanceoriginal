package org.multilevel;

//Grant parent
public  class TeamDetails {
	// memory allocation happening here in static
	public static void teamName() {
	System.out.println("Team name is:Prcc");
}
public void teamAdd() {
	System.out.println("Team add is puthirampattu");
}
public static void main(String[] args) {
	TeamDetails x=new TeamDetails();
	teamName();  // no need create object for memory allocation and no need to call
	x.teamAdd();
}
}

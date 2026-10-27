package Assingmennt2;

public class Outdoor {
	String gameName;

    public Outdoor() {
        gameName = "Cricket";
    }

    public Outdoor(String gameName) {
        this.gameName = gameName;
    }

    public void display() {
        System.out.println("Outdoor Game: " + gameName);
        System.out.println("Players: 11");
    }
}


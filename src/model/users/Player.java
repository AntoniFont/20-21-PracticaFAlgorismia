package model.users;

/**
 * Player's class represents a user that has the capability to play chess and check how many matches has played,how many
 * matches has won and how many matches had not finished.
 */
public class Player extends User {
    private int gPlayed = 0;        //Games played
    private int gWon = 0;           //Games won
    private int gNotFinished = 0;   //Games Not finished.

    public Player(String name, String sn1, String sn2){
        super(name,sn1,sn2);
    }


    public int getgNotFinished() {
        return gNotFinished;
    }

    public int getgPlayed() {
        return gPlayed;
    }

    public int getgWon() {
        return gWon;
    }
}

/**
 * Team is an object based on a basketball team 
 * 
 * @author Chris Casola
 * @version 3/9/2017
 */

import java.util.Random;

public class Team
{
    // instance variables
    private int power;
    private int seed;
    private int gamesWon;
    private String branch;

    /**
     * Constructor for objects of class Team
     */
    public Team(int seed, String branch)
    {
        this.seed = seed;
        this.power = 100 -(seed * 6);
        this.branch = branch;
    }

    /**
     * Getter for power
     * 
     * @return power
     */
    public int getPower()
    {
        return power;
    }
    
    public void wonGame()
    {
        gamesWon++;
    }
    
    public int getGamesWon()
    {
        return gamesWon;
    }
    
    public String getTeamInfo()
    {
        return "Won: "+ gamesWon + " Seed: " + seed;
    }
    
    /**
     * Randomizer for matchup value
     * 
     * @return a random int value based on power
     */
    public int getMatchupVal()
    {
        if(power >0)
            return new Random().nextInt(power);
        else 
            return 0;
    }
}

import java.util.ArrayList;
/**
 * The branch of the bracket with a variable amount of teams
 * 
 * @author Chris Casola
 * @version 3/9/2017
 */


public class Branch
{
    private int slots;
    private String name;
    private ArrayList<Team> teamList = new ArrayList<Team>();

    /**
     * Constructor for objects of class Branch
     * 
     * @param int slots - number of slots for teams in a branch
     * @param String name - The name of the "branch"
     */
    public Branch(int slots, String name)
    {
        this.slots = slots;
        this.name = name;
        
        for(int i = 0; i<slots; i++){
            teamList.add(new Team(i+1, name));
        }
        
        if(slots % 2 != 0)
        {
            // Adding a team with no power to serve as a "bye" in case there aren't an even number of slots
            teamList.add(new Team(0, ""));
        }
    }
    
    /**
     * method to run the matchups on the teams to come to a single overall winner
     * 
     * @return branchWinner
     */
    
    public Team getBranchWinner()
    {
        ArrayList<Team> workingList = new ArrayList<Team>(teamList);
        ArrayList<Team> finalTeam = new ArrayList<Team>();
        finalTeam = this.getWinningList(workingList);
        return finalTeam.remove(0);
    }
    
    /**
     * meat and potatoes of the determining the winner of the branch
     * 
     */
    private ArrayList<Team> getWinningList(ArrayList<Team> list)
    {
        if(list.size()>1) 
        {
            ArrayList<Team> winList = new ArrayList<Team>();
            int counter = list.size()/2;
            for(int i = 0; i < counter; i++)
            {
                winList.add(this.matchup(list.remove(0), list.remove(list.size()-1)));
            }
            list = this.getWinningList(winList);
        }
        return list;
    }
    
    public Team getTeamAt(int idx)
    {
        return teamList.get(idx);
    }
     public ArrayList getTeams()
    {
        return teamList;
    }
    
    /**
     * Method to match teams up against eachother
     * 
     * @param team1 - first team
     * @param team2 - second team
     * 
     * Ties go through recursive overtime
     * 
     * @return winningTeam
     */
    private Team matchup(Team team1, Team team2)
    {
        if(team1.getMatchupVal() > team2.getMatchupVal())
        {
            team1.wonGame();
            return team1;
        }
        else if(team1.getMatchupVal() < team2.getMatchupVal())
        {
            team2.wonGame();
            return team2;
        }
        else
            return this.matchup(team1, team2);
    }
    
    /**
     * Getter for the name
     */
    public String getName()
    {
        return name;
    }
}

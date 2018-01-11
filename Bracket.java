import java.util.ArrayList;
/**
 * This class holds four brackets for the finals of the tournament
 * 
 * @author Chris Casola 
 * @version 3/9/2017
 */
public class Bracket
{
    private ArrayList<Branch> branchList = new ArrayList<Branch>();
    private final int NUMBRANCHES = 4;
    private final String[] NAMES = {"Midwest", "East", "South", "West"}; // will need to add more names if more branches, 4 is good for now

    /**
     * Constructor for objects of class Bracket
     */
    public Bracket()
    {
        for(int i = 0; i < NUMBRANCHES; i++){
            branchList.add(new Branch(16, NAMES[i]));
        }
    }
    
    public ArrayList getBranches()
    {
        return branchList;
    }
    
    public Branch getBranchAt(int idx)
    {
        return branchList.get(idx);
    }
    
    /**
     * Method to get the winning team
     */
    public Team getWinner(){
        return this.getWinningList(this.getFinalFour()).get(0);
    }
    
    /**
     * Method to pit the Final Four teams against Eachother
     * 
     * @return Team winner - the winning team of the tournament
     */
    private ArrayList<Team> getWinningList(ArrayList<Team> list)
    {
        ArrayList<Team> useList = new ArrayList<Team>();
        useList = list;
        if(useList.size()>1) 
        {
            ArrayList<Team> winList = new ArrayList<Team>();
            int counter = useList.size()/2;
            for(int i = 0; i < counter; i++)
            {
                winList.add(this.matchup(useList.remove(0), useList.remove(list.size()-1)));
            }
            useList = this.getWinningList(winList);
        }
        return useList;
    }

    /**
     * Method to get the final teams in each branch
     * 
     * @return ArrayList finalFour - the list of the four finalists from each branch
     */
    private ArrayList<Team> getFinalFour()
    {
        ArrayList<Team> finalfour = new ArrayList<Team>();
        for(int i = 0; i < branchList.size(); i++){
            finalfour.add(branchList.get(i).getBranchWinner());
        }
        return finalfour;
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
}


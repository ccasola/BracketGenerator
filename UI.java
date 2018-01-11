import java.util.Scanner;
/**
 * This is the console interface for the bracket app
 * 
 * @author Chris Casola
 * @version 3/9/2017
 */
public class UI
{
    
    /**
     * Constructor for objects of class UI
     */
    public UI()
    {

    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static void main(String[] args) 
    {
        int choice;
        Bracket bracket = new Bracket();
        do {
            UI ui = new UI();
            ui.displayMenu();
    
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    ui.showBracket(bracket);
                    break;
                case 2:
                    Team win = bracket.getWinner();
                    System.out.println(win.getTeamInfo());
                    break;
                case 3:
                    bracket = new Bracket();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        } while (choice !=4);
    }
    
    private void displayMenu(){
        System.out.println();
        System.out.println("**************************************"); 
        System.out.println("*              Main Menu             *");
        System.out.println("**************************************");
        System.out.println("* 1: Show Bracket                    *");
        System.out.println("* 2: Run                             *");
        System.out.println("* 3: Reset Bracket                   *");
        System.out.println("* 4: Exit                            *");
        System.out.println("**************************************"); 
        System.out.println();
    }
    private void showBracket(Bracket bracket){
        System.out.println();
        
        
            bracket.getBranchAt(0);
            System.out.println("*****" + bracket.getBranchAt(0).getName() + "****************" + bracket.getBranchAt(1).getName() + "****************"  + bracket.getBranchAt(2).getName() + "*******************"  + bracket.getBranchAt(3).getName() +"*********" );    
            System.out.println("* " + bracket.getBranchAt(0).getTeamAt(0).getTeamInfo()+ "  *   * " + bracket.getBranchAt(1).getTeamAt(0).getTeamInfo() + "  *   * " + bracket.getBranchAt(2).getTeamAt(0).getTeamInfo()+ "  *   * " + bracket.getBranchAt(3).getTeamAt(0).getTeamInfo() + "  *");
            System.out.println("* " + bracket.getBranchAt(0).getTeamAt(15).getTeamInfo()+ " *   * " + bracket.getBranchAt(1).getTeamAt(15).getTeamInfo() + " *   * " + bracket.getBranchAt(2).getTeamAt(15).getTeamInfo()+ " *   * " + bracket.getBranchAt(3).getTeamAt(15).getTeamInfo() + " *");
            System.out.println("* " + bracket.getBranchAt(0).getTeamAt(7).getTeamInfo()+ "  *   * " + bracket.getBranchAt(1).getTeamAt(7).getTeamInfo() + "  *   * " + bracket.getBranchAt(2).getTeamAt(7).getTeamInfo()+ "  *   * " + bracket.getBranchAt(3).getTeamAt(7).getTeamInfo() + "  *");
            System.out.println("* " + bracket.getBranchAt(0).getTeamAt(8).getTeamInfo()+ "  *   * " + bracket.getBranchAt(1).getTeamAt(8).getTeamInfo() + "  *   * " + bracket.getBranchAt(2).getTeamAt(8).getTeamInfo()+ "  *   * " + bracket.getBranchAt(3).getTeamAt(8).getTeamInfo() + "  *");
            System.out.println("* " + bracket.getBranchAt(0).getTeamAt(4).getTeamInfo()+ "  *   * " + bracket.getBranchAt(1).getTeamAt(4).getTeamInfo() + "  *   * " + bracket.getBranchAt(2).getTeamAt(4).getTeamInfo()+ "  *   * " + bracket.getBranchAt(3).getTeamAt(4).getTeamInfo() + "  *");
            System.out.println("* " + bracket.getBranchAt(0).getTeamAt(11).getTeamInfo() +" *   * " + bracket.getBranchAt(1).getTeamAt(11).getTeamInfo() + " *   * " + bracket.getBranchAt(2).getTeamAt(11).getTeamInfo() +" *   * " + bracket.getBranchAt(3).getTeamAt(11).getTeamInfo() + " *");
            System.out.println("* " + bracket.getBranchAt(0).getTeamAt(3).getTeamInfo()+ "  *   * " + bracket.getBranchAt(1).getTeamAt(3).getTeamInfo() + "  *   * " + bracket.getBranchAt(2).getTeamAt(3).getTeamInfo()+ "  *   * " + bracket.getBranchAt(3).getTeamAt(3).getTeamInfo() + "  *");
            System.out.println("* " + bracket.getBranchAt(0).getTeamAt(12).getTeamInfo()+ " *   * " + bracket.getBranchAt(1).getTeamAt(12).getTeamInfo() + " *   * " + bracket.getBranchAt(2).getTeamAt(12).getTeamInfo()+ " *   * " + bracket.getBranchAt(3).getTeamAt(12).getTeamInfo() + " *");
            System.out.println("* " + bracket.getBranchAt(0).getTeamAt(5).getTeamInfo()+ "  *   * " + bracket.getBranchAt(1).getTeamAt(5).getTeamInfo() + "  *   * " + bracket.getBranchAt(2).getTeamAt(5).getTeamInfo()+ "  *   * " + bracket.getBranchAt(3).getTeamAt(5).getTeamInfo() + "  *");
            System.out.println("* " + bracket.getBranchAt(0).getTeamAt(10).getTeamInfo()+ " *   * " + bracket.getBranchAt(1).getTeamAt(10).getTeamInfo() + " *   * " + bracket.getBranchAt(2).getTeamAt(10).getTeamInfo()+ " *   * " + bracket.getBranchAt(3).getTeamAt(10).getTeamInfo() + " *");
            System.out.println("* " + bracket.getBranchAt(0).getTeamAt(2).getTeamInfo()+ "  *   * " + bracket.getBranchAt(1).getTeamAt(2).getTeamInfo() + "  *   * " + bracket.getBranchAt(2).getTeamAt(2).getTeamInfo()+ "  *   * " + bracket.getBranchAt(3).getTeamAt(2).getTeamInfo() + "  *");
            System.out.println("* " + bracket.getBranchAt(0).getTeamAt(13).getTeamInfo()+ " *   * " + bracket.getBranchAt(1).getTeamAt(13).getTeamInfo() + " *   * " + bracket.getBranchAt(2).getTeamAt(13).getTeamInfo()+ " *   * " + bracket.getBranchAt(3).getTeamAt(13).getTeamInfo() + " *");
            System.out.println("* " + bracket.getBranchAt(0).getTeamAt(6).getTeamInfo()+ "  *   * " + bracket.getBranchAt(1).getTeamAt(6).getTeamInfo() + "  *   * " + bracket.getBranchAt(2).getTeamAt(6).getTeamInfo()+ "  *   * " + bracket.getBranchAt(3).getTeamAt(6).getTeamInfo() + "  *");
            System.out.println("* " + bracket.getBranchAt(0).getTeamAt(9).getTeamInfo() + " *   * " + bracket.getBranchAt(1).getTeamAt(9).getTeamInfo() + " *   * " + bracket.getBranchAt(2).getTeamAt(9).getTeamInfo() + " *   * " + bracket.getBranchAt(3).getTeamAt(9).getTeamInfo() + " *");
            System.out.println("* " + bracket.getBranchAt(0).getTeamAt(1).getTeamInfo() +"  *   * " + bracket.getBranchAt(1).getTeamAt(1).getTeamInfo() + "  *   * " + bracket.getBranchAt(2).getTeamAt(1).getTeamInfo() +"  *   * " + bracket.getBranchAt(3).getTeamAt(1).getTeamInfo() + "  *");
            System.out.println("* " + bracket.getBranchAt(0).getTeamAt(14).getTeamInfo()+ " *   * " + bracket.getBranchAt(1).getTeamAt(14).getTeamInfo() + " *   * " + bracket.getBranchAt(2).getTeamAt(14).getTeamInfo()+ " *   * " + bracket.getBranchAt(3).getTeamAt(14).getTeamInfo() + " *");
            System.out.println("*************************************************************************************");
  
    }
    
}


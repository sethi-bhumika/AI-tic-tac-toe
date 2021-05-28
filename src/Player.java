import java.util.Scanner;

public class Player{
    private int playerType; //1 or 2
    
    //constructor
    public Player(){
        playerType = 1;
    }
    
    public int makeMove(){
        System.out.print("Enter the desired index, 1-9: ");
	    Scanner input = new Scanner(System.in);
	    int position = input.nextInt();
	    return position;
    }
    
    public void changePlayer(){
        if(playerType == 1)
	        playerType = 2;		
	    else
	        playerType = 1;
    }
    
    public int getType(){
        return playerType;
    }
    
}

import java.util.Scanner;

public class Game{
    
    private int moves;  //count of the total no of moves played
    
    //constructor
    public Game(){
        moves = 0;
    }
    
    public void startGame(){

	    System.out.println("Enter 1 for Player vs Player. Enter 2 for Player vs Computer: ");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
	
	    Player currentPlayer = new Player();    //Human Type
	    Computer Opponent = new Computer();     //Computer(AI) Type

        if(choice == 1)
            System.out.println("Player 1 is X and Player 2 is O");
        else
            System.out.println("Player 1 is X and Computer is O");

        GameBoard board = new GameBoard();
        System.out.println("New Game, Board Numbers are as folllows:");
	    board.printIndexBoard();

	    while(board.Win() == 0 && moves < 9){
	        int index=0;
	        if(choice == 1 || currentPlayer.getType() == 1)
	            index = currentPlayer.makeMove();
	        else
		    index = Opponent.makeMove(board);
	    
            if(board.registerMove(currentPlayer.getType(), index) == 1){    //move registered on the Game Board
			moves++;
			currentPlayer.changePlayer();
		    }
	        else
		        System.out.println("Enter a valid index.");     //invalid index, move not registered
		    board.printBoard();
	    
	    }   //end while
	    
	    if(moves < 9){      //not a Draw
	        if(board.Win() == 1)
	            System.out.println("Player1 Wins!");
	        else{           //player2
	            if(choice == 1)
		            System.out.println("Player2 Wins!");
	            else
		            System.out.println("Computer Wins!");
	        }
	    }   
	
	    if(moves == 9 && board.Win() == 0)      //Draw
	        System.out.println("It's a Draw!");
    }
    
}

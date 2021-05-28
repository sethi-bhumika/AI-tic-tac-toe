public class GameBoard{
    
    private char[][] field; //2D Array
    
    //constructor
    public GameBoard(){
        field = new char[3][3];
        
        //initialize board
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                field[i][j] = ' ';
            }
        }
        
    }

    public void printBoard(){
        
        System.out.println("**********");
        
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(j!=2){
                    System.out.print(field[i][j] + " | ");
                }
                else{
                    System.out.println(field[i][j]);
                }
            }
        }
        
        System.out.println("**********");
        
    }

    public void printIndexBoard(){
	    System.out.println("**********");
        System.out.println("1 | 2 | 3 ");
        System.out.println("4 | 5 | 6 ");
	    System.out.println("7 | 8 | 9 ");
        System.out.println("**********");
    }
    
    
    public int registerMove(int player, int index){
	if(index <1 || index >9)
		return 0;
        
        int i =0, j = 0;
        
	    switch(index){  //converting index to row and column format
	        
	        case 1:
	            i = 0;
	            j = 0;
	            break;
	        case 2:
	            i = 0;
	            j = 1;
	            break;
	        case 3:
	            i = 0;
	            j = 2;
	            break;
	        case 4:
	            i = 1;
	            j = 0;
	            break;
	        case 5:
	            i = 1;
	            j = 1;
	            break;
	        case 6:
	            i = 1;
	            j = 2;
	            break;
	        case 7:
	            i = 2;
	            j = 0;
	            break;
	        case 8:
	            i = 2;
	            j = 1;
	            break;
	        case 9:
	            i = 2;
	            j = 2;
	            break;
	            
	    }
	    if(field[i][j] != ' '){
		System.out.println("Index is already filled.");
		return 0;
	    }
	    if(player == 1){
	        field[i][j] = 'X';
	    }
		
	    else{
	        field[i][j] = 'O';
	    }
	return 1;
    }

    public int Win(){
	if((field[0][0] == 'X' && field[0][1] == 'X' && field[0][2] == 'X')||   //rows
	   (field[1][0] == 'X' && field[1][1] == 'X' && field[1][2] == 'X')||
	   (field[2][0] == 'X' && field[2][1] == 'X' && field[2][2] == 'X')||
	   (field[0][0] == 'X' && field[1][0] == 'X' && field[2][0] == 'X')||   //columns
	   (field[0][1] == 'X' && field[1][1] == 'X' && field[2][1] == 'X')||
	   (field[0][2] == 'X' && field[1][2] == 'X' && field[2][2] == 'X')||
	   (field[0][0] == 'X' && field[1][1] == 'X' && field[2][2] == 'X')||   //diagonals
	   (field[0][2] == 'X' && field[1][1] == 'X' && field[2][0] == 'X')){
	    //System.out.println("Player1 wins!");
	    return 1;
	}
	if((field[0][0] == 'O' && field[0][1] == 'O' && field[0][2] == 'O')||
	   (field[1][0] == 'O' && field[1][1] == 'O' && field[1][2] == 'O')||
	   (field[2][0] == 'O' && field[2][1] == 'O' && field[2][2] == 'O')||
	   (field[0][0] == 'O' && field[1][0] == 'O' && field[2][0] == 'O')||
	   (field[0][1] == 'O' && field[1][1] == 'O' && field[2][1] == 'O')||
	   (field[0][2] == 'O' && field[1][2] == 'O' && field[2][2] == 'O')||
	   (field[0][0] == 'O' && field[1][1] == 'O' && field[2][2] == 'O')||
	   (field[0][2] == 'O' && field[1][1] == 'O' && field[2][0] == 'O')){
	    //System.out.println("Player2 wins!");
	    return 2;
	}
	return 0;
    }

    public boolean hasSpace(){
	for(int i=0; i<3; i++){
	    for(int j=0; j<3; j++)
		if(field[i][j] == ' ')
		    return true;
	}
	return false;
    }

    public char getElement(int row, int column){
	return field[row][column];
    }

    public void putElement(int row, int column, char character){
	field[row][column]=character;
    }

}

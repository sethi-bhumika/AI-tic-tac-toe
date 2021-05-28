public class Computer{
    
    //constructor
    public Computer(){}
    
    public int makeMove(GameBoard board){
        System.out.print("Computer entered: ");
        int position = findOptimalMove(board);  //index selected by the computer
        System.out.println(position);
        return position;
    }
    
    //Implementing minimax algorithm, referred a little to GeeksforGeeks
    public static int minimax(GameBoard board, int depth, boolean isMax){
        
        if(board.Win() == 2){
            return 10;
        }
        if(board.Win() == 1){
            return -10;
        }
        if(!board.hasSpace())
            return 0;
        
        if(isMax){
            int best = -1000;
            for(int i=0; i<3;i++){
                for(int j=0; j<3; j++){
                    if(board.getElement(i,j) == ' '){
                        board.putElement(i,j, 'O');
                        
                        best = Math.max(best, minimax(board, depth+1, !isMax));
                        
                        board.putElement(i, j, ' ');
                    }
                }
            }
            return best;
        }
        
        else{
            int best = 1000;
            for(int i=0; i<3;i++){
                for(int j=0; j<3; j++){
                    if(board.getElement(i,j) == ' '){
                        board.putElement(i,j, 'X');
                        
                        best = Math.min(best, minimax(board, depth+1, !isMax));
                        
                        board.putElement(i, j, ' ');
                    }
                }
            }
            return best;
        }
            
    }

    public static int findOptimalMove(GameBoard board){
        int bestMoveVal = -1000;
        int bestMoveRow = -1;
        int bestMoveCol = -1;
        
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(board.getElement(i,j) == ' '){
                    board.putElement(i,j, 'O');
                    int currentMoveVal = minimax(board, 0, false);
                    board.putElement(i, j, ' ');
                    
                    if(currentMoveVal > bestMoveVal){
                        bestMoveRow = i;
                        bestMoveCol = j;
                        bestMoveVal = currentMoveVal;
                    }
                    
                }
            }
        }
        //converting row and column to index format
	    int i = bestMoveRow;
	    int j = bestMoveCol;
        
        if(i==0 && j==0)
            return 1;
        if(i==0 && j==1)
            return 2;
        if(i==0 && j==2)
            return 3;
        if(i==1 && j==0)
            return 4;
        if(i==1 && j==1)
            return 5;
        if(i==1 && j==2)
            return 6;
        if(i==2 && j==0)
            return 7;
        if(i==2 && j==1)
            return 8;
        if(i==2 && j==2)
            return 9;
        return 0;
    }
    

}

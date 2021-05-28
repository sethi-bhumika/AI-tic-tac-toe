TIC-TAC-TOE IN JAVA USING OOPs
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Classic Tic-tac-toe game is implemented in Java using OOP constructs. In order to run the program, refer to the following instructions.

->The created directory has the following program files:
	1. GameBoard.java/ .class
	2. Game.java/ .class
	3. Player.java/ .class
	4. Computer.java/ .class
	5. TicTacToe.java/ .class
	(main function is in the TicTacToe class)

->Compile all the files using the command javac <filename>.java and run theTicTacToe file using  java TicTacToe command.

->Follow the prompts as shown on the console. The game has two verisions-Player vs Player and 	Player vs Computer. Enter integer 1 or 2 respectively to start the game. A new game appears 	along with the index board indicating the indices of the cells of the Board[1-9].

->Play the game by entering integer index values as and when directed. The program ends when the 	game is won by either player(3 in a row/column/diagonal) or the game is a draw. 

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
			
The Player vs Player version works as directed by the players. For the Player vs Computer version, Computer's playing strategy is designed by an implementation of the interesting Minimax Algorithm, which basically works by backtracking and determining the moves for maximum and minimum utility, thus, making the Computer almost unbeatable.



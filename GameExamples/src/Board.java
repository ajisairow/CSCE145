
public class Board {

	private static int DEFAULT_BOARD_SIZE = 10;

	private char[][] gameBoard;

	public Board()
	{	
		initBoard(DEFAULT_BOARD_SIZE, DEFAULT_BOARD_SIZE);	
	}

	public Board(int sizeX, int sizeY)
	{
		gameBoard = new char[sizeX][sizeY];
		initBoard(sizeX, sizeY);
	}

	private void initBoard(int sizeX, int sizeY)	
	{
		gameBoard = new char[sizeX][sizeY];


		for(int i = 0; i < sizeY; i++)
		{
			for(int j = 0; j < sizeX; j++) 
			{
				gameBoard[i][j] = '.';
			}
		}		
	}
	private void drawBoard(Character[] allCharacters)
	{
		for (int i = 0; i < gameBoard.length; i++)
		{
			for(int j = 0; j < gameBoard.length; j++)
			{
				System.out.print(gameBoard[i][j]);
			}
			System.out.println();
		}
	}
}	
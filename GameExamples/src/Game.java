
public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Board b = new Board();
		
		Player p = new Player('p',1,2,3);

		Enemy e = new Enemy('e',3,3,0,1);

		Enemy e2 = new Enemy('e',1,1,1,0);

		Character bomb = new Character('b',0,0);

		ArrayList<Character> bombs = new ArrayList<Character>();

		Character[] allCharacters = new Character[3]; 

		allCharacters[0] = p;

		allCharacters[1] = e; 

		allCharacters[2] = e2;

		while(true)

		{

		b.drawBoard(allCharacters, bombs);

		for(int i=0; i< allCharacters.length; i++)

		{

		allCharacters[i].move(b, bombs); 

		}

		for(int i=0; i<allCharacters.length; i++) 

		{

		if(allCharacters[i] != p) 

		{

		if(allCharacters[i].getPosX() == p.getPosX() 

		&& allCharacters[i].getPosY() == p.getPosY()) 

		{

		System.out.println("You lose!");

		System.exit(0);

		}

		}

		}

		}

		}



		}
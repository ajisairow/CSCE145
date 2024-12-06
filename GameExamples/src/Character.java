
public class Character {

	private char displayChar;
	private int posX, posY;
	public Character() 

	{

	this.displayChar = 'd';

	this.posX = 0;

	this.posY = 0;

	}

	public Character(char displayChar, int posX, int posY)

	{

	setDisplayChar(displayChar);

	setPosX(posX);

	setPosY(posY);

	}



	public void move(Board b, ArrayList<Character> bombs){

	}

	//Right click --> Source --> Generate Getters & Setters

	public char getDisplayChar() {

	return displayChar;

	}



	public void setDisplayChar(char displayChar) {

	this.displayChar = displayChar;

	}



	public int getPosX() {

	return posX;

	}



	public int getPosY() {

	return posY;

	}

	public void setPosX(int posX) { //add param called boardSizeX

	//if(posX < boardSizeX) --> close & error

	if(posX < 0) //stops character so they do not enter negative-land

	{

	posX = 0;

	return;

	}

	this.posX = posX;

	}



	public void setPosY(int posY) {

	if(posY < 0) //stops character so they do not enter negative-land

	{

	posY = 0;

	return;

	}

	this.posY = posY;

	}

	public void setPosX(int posX, int boardSizeX) { //add param called boardSizeX

	//if(posX < boardSizeX) --> close & error

	if(posX < 0) //stops character so they do not enter negative-land

	{

	posX = 0;

	return;

	}

	else if(posX >= boardSizeX)

	{

	posX = boardSizeX - 1;

	return;

	}

	this.posX = posX;

	}



	public void setPosY(int posY, int boardSizeY) {

	if(posY < 0) //stops character so they do not enter negative-land

	{

	posY = 0;

	return;

	}

	else if(posY >= boardSizeY)

	{

	posY = boardSizeY - 1;

	return;

	}

	this.posY = posY;

	}

	}


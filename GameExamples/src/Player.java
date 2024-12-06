
public class Player extends Character{
	
	private int verticalSpeed = 0;

	private int horizontalSpeed = 0;

	public Enemy() {

	super();

	this.verticalSpeed = 0;

	this.horizontalSpeed = 0;

	}

	public Enemy(char displayChar, int posX, int posY, 

	int verticalSpeed, int horizontalSpeed)

	{

	super(displayChar, posX, posY);

	// this.verticalSpeed = verticalSpeed;

	// this.horizontalSpeed = horizontalSpeed;

	setVerticalSpeed(verticalSpeed);

	setHorizontalSpeed(horizontalSpeed);

	}

	public void move(Board b, ArrayList<Character> bombs)

	{

	//super.move(b); just an example of how to call a parent's method, not necessary

	//if the enemy is too far left OR right, just flip direction

	if(this.getPosX() + this.horizontalSpeed >= b.getBoard()[0].length

	|| this.getPosX() + this.horizontalSpeed < 0) 

	{

	this.horizontalSpeed = -this.horizontalSpeed;

	}

	//if the enemy is too far up OR down, just flip direction

	if(this.getPosY() + this.verticalSpeed >= b.getBoard()[0].length

	|| this.getPosY() + this.verticalSpeed < 0) 

	{

	this.verticalSpeed = -this.verticalSpeed;

	}

	//Moves the enemy in direction according to speed

	this.setPosX(this.getPosX() + this.horizontalSpeed);

	this.setPosY(this.getPosY() + this.verticalSpeed);

	for(int i=0; i<bombs.size(); i++)

	{

	Character bomb = bombs.get(i);

	if(bomb.getPosX() == this.getPosX() && bomb.getPosY() == this.getPosY())

	{

	System.out.println("Enemy ran into a bomb!");

	}

	}

	}



	public int getVerticalSpeed() {

	return verticalSpeed;

	}



	public void setVerticalSpeed(int verticalSpeed) {

	this.verticalSpeed = verticalSpeed;

	}



	public int getHorizontalSpeed() {

	return horizontalSpeed;

	}



	public void setHorizontalSpeed(int horizontalSpeed) {

	this.horizontalSpeed = horizontalSpeed;

	}

	}

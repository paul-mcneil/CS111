package project;

public class Movie {
	
	public static void moveUp(Sprite s){
		s.setPosition(s.getXposition(), s.getYposition()+1);
	}
	
	public static void moveDown(Sprite s){
		s.setPosition(s.getXposition(), s.getYposition()-1);
	}
	
	public static void moveLeft(Sprite s){
		s.setPosition(s.getXposition()-1, s.getYposition());
	}
	
	public static void moveRight(Sprite s){
		s.setPosition(s.getXposition()+1, s.getYposition());
	}	
	
	public static int getYUpperBoundary(Sprite s){
		//System.out.println(s.getXposition() + s.getYsize());
		return (s.getYposition() + s.getYsize());
	}
	public static int getXRightBoundary(Sprite s){
		//System.out.println(s.getXposition() + s.getXsize());
		return (s.getXposition() + s.getXsize());
	}	
	
	public static boolean isOverlappingLeft(Sprite s1, Sprite s2){
		
		if(s1.getXposition() <= getXRightBoundary(s2) && s1.getYposition() <= getYUpperBoundary(s2)){
			
			return true;
		}
		return false;
	}
	
	public static boolean isOverlappingRight(Sprite s1, Sprite s2){
		if(s2.getXposition() <= getXRightBoundary(s1) && s2.getYposition() <= getYUpperBoundary(s1)){
			
			return true;
		}
		return false;
	}
	
	public static boolean isOverlapping(Sprite s1, Sprite s2){
		if(isOverlappingLeft(s1,s2) && isOverlappingRight(s1,s2))
			return true;
		return false;
	}	
	
	public static void gameOver(){
		System.out.println("");
		System.out.println("*******");
		System.out.println("");
		System.out.println("You stepped on a dog!");
		System.out.println("GAME OVER!");
		System.out.println("");
		System.out.println("*******");
		System.out.println("");
		System.out.println("Enter q to quit");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String backgrndIMG = "/Users/pm/Documents/workspace/cs111/src/project/bedroom.jpg";
		String img = "/Users/pm/Documents/workspace/cs111/src/project/key.png";
		String img2 = "/Users/pm/Documents/workspace/cs111/src/project/grandma.png";
		String img3 = "/Users/pm/Documents/workspace/cs111/src/project/YouWin.png";
		String img4 = "/Users/pm/Documents/workspace/cs111/src/project/dog.jpg";
		String img5 = "/Users/pm/Documents/workspace/cs111/src/project/gameover.jpg";
		int numMoves = 0;
		Animation a = new Animation(800, 600);
		Sprite s1 = new Sprite(img);
		Sprite s2 = new Sprite(img2);
		Sprite s3 = new Sprite(img3);
		Sprite s4 = new Sprite(img4);
		Sprite s5 = new Sprite(img4);
		Sprite s6 = new Sprite(img5);
		
		
		a.addSprite(s4);
		a.addSprite(s5);
		a.addSprite(s1);
		a.addSprite(s2);
		//s2.setPosition(200, 0);
		a.setBackgroundImage(backgrndIMG);
		a.frameFinished();
		
		
		s1.setPosition(520, 300);
		s4.setPosition(80, 225);
		s5.setPosition(570, 200);
		a.frameFinished();
		a.setFrameRate(200);
		System.out.println("Instructions:");
		System.out.println("Enter a letter to execute a command.");
		System.out.println("W = Up");
		System.out.println("A = Left");
		System.out.println("S = Down");
		System.out.println("D = Right");
		
		char input;
		do{
			input = IO.readChar();
			if(Character.compare(input, 'q') == 0)
				System.out.println("Quiting");
			if(Character.compare(input, 'w') == 0){
				System.out.println("Moving Up");
				for(int i = 0; i < 25; i++){
					moveUp(s2);
					
				}
				numMoves++;	
				a.frameFinished();
			}	
			if(Character.compare(input, 'a') == 0){
				System.out.println("Moving Left");
				for(int i = 0; i < 25; i++){
					moveLeft(s2);
					
				}
				numMoves++;
				a.frameFinished();
			}
			if(Character.compare(input, 's') == 0){
				System.out.println("Moving Down");
				for(int i = 0; i < 25; i++){
					moveDown(s2);
					
				}
				numMoves++;
				a.frameFinished();
			}
			if(Character.compare(input, 'd') == 0){
				System.out.println("Moving Right");
				for(int i = 0; i < 25; i++){
					moveRight(s2);
					
				}
				numMoves++;	
				a.frameFinished();
			}
			
			if(isOverlapping(s1,s2)){
				a.addSprite(s3);
				a.frameFinished();
				System.out.println("");
				System.out.println("*******");
				System.out.println("");
				System.out.println("CONGRATULATIONS!!!!");
				System.out.println("YOU FOUND GRANDMA'S KEYS!");
				System.out.println("Enter q to quit.");
				System.out.println("");
				System.out.println("*******");
				System.out.println("");
			}else if(isOverlapping(s2,s4)){
				a.addSprite(s6);
				a.frameFinished();
				gameOver();
				//System.out.println("isOverlapping(s2,s4) is true");
			}else if(isOverlapping(s2,s5)){
				a.addSprite(s6);
				a.frameFinished();
				gameOver();
				//System.out.println("isOverlapping(s2,s5) is true");
			}
				
		}while(Character.compare(input, 'q') != 0);
		
		if(Character.compare(input, 'q') == 0)
			System.exit(0);
	}

}

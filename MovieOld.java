package project;

public class MovieOld {

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
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String backgrndIMG = "/Users/pm/Documents/workspace/cs111/src/project/bedroom.jpg";
		String img = "/Users/pm/Documents/workspace/cs111/src/project/key.png";
		String img2 = "/Users/pm/Documents/workspace/cs111/src/project/grandma.png";
		String img3 = "/Users/pm/Documents/workspace/cs111/src/project/YouWin.png";
		int count = 0;
		Animation a = new Animation(800, 600);
		Sprite s1 = new Sprite(img);
		Sprite s2 = new Sprite(img2);
		Sprite s3 = new Sprite(img3);
		
		a.addSprite(s1);
		a.addSprite(s2);
		//s2.setPosition(200, 0);
		a.setBackgroundImage(backgrndIMG);
		a.frameFinished();
		
		System.out.println(s1.getYposition());
		
		s1.setPosition(520, 300);
		//a.frameFinished();
		a.setFrameRate(200);
		for(int i = 0; i < 100; i++){
			moveRight(s2);
			a.frameFinished();
			if(isOverlapping(s1,s2)){
				
				
				System.out.println("isOverlapping returned true.");
				count++;
				
			}
		}
		for(int i = 0; i < (a.getHeight()/2)-s2.getYsize(); i++){
			
			//s2.setPosition(0, i);
			moveUp(s2);
			a.frameFinished();
			if(isOverlapping(s1,s2)){
				
				System.out.println("isOverlapping returned true.");
				count++;
				
			}
				
		}
		
		for(int i = 0; i < (a.getWidth()/2)+s2.getYsize()-35; i++){
			
			//s2.setPosition(0, i);
			moveRight(s2);
			a.frameFinished();
			if(isOverlapping(s1,s2)){
				System.out.println("isOverlapping returned true.");
				
				count++;
				
			}
		}
		
		for(int i = 0; i < 150; i++){
			
			//s2.setPosition(0, i);
			moveUp(s2);
			a.frameFinished();
			if(isOverlapping(s1,s2)){
				
				System.out.println("isOverlapping returned true.");
				count++;
				
			}
		}		
		
		for(int i = 0; i < 70; i++){
			moveLeft(s2);
			a.frameFinished();
			if(isOverlapping(s1,s2)){
				
				System.out.println("isOverlapping returned true.");
				count++;
				
			}
		}
		
		/*
		for(int i = 0; i < a.getWidth()-s2.getXsize(); i++){
			i++;
			s2.setPosition(i, 0);
			a.frameFinished();
		}*/
		
		if(count > 1){
			a.addSprite(s3);
			a.frameFinished();
		}
		
		System.out.println("Count: " + count);
		
	}

}

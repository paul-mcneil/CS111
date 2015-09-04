package project;

public class MovieTestOld {

	
	public static int getYUpperBoundary(Sprite s){
		//System.out.println(s.getXposition() + s.getYsize());
		return (s.getYposition() + s.getYsize());
	}
	public static int getXRightBoundary(Sprite s){
		//System.out.println(s.getXposition() + s.getXsize());
		return (s.getXposition() + s.getXsize());
	}
	
	public static void fourCorners(Sprite s){
		
		System.out.print("Top left: ");
		System.out.println(s.getXposition() + "," + getYUpperBoundary(s));
		System.out.print("Top right: ");
		System.out.println((s.getXposition() + s.getXsize()) + "," + getYUpperBoundary(s));
		System.out.print("Bottom left: ");
		System.out.println(s.getXposition() + "," + s.getYposition());
		System.out.print("Bottom right: ");
		System.out.println(getXRightBoundary(s) + "," + s.getYposition());
	}
	
	public static boolean isOverlappingLeft(Sprite s1, Sprite s2){
		
		if(s1.getXposition() <= getXRightBoundary(s2) && s1.getYposition() <= getYUpperBoundary(s2)){
			//System.out.println("[TEST IS TRUE]");
			return true;
		}
		return false;
	}
	
	public static boolean isOverlappingRight(Sprite s1, Sprite s2){
		if(s2.getXposition() <= getXRightBoundary(s1) && s2.getYposition() <= getYUpperBoundary(s1)){
			System.out.println("[THIS SHIT IS TRUE TOO NIGGA]");
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
		
		Animation a = new Animation(800, 600);
		Sprite keys = new Sprite(img);
		Sprite gma = new Sprite(img2);
		a.addSprite(keys);
		a.addSprite(gma);
		//s2.setPosition(200, 0);
		a.setBackgroundImage(backgrndIMG);
		a.frameFinished();
		
		//System.out.println(s1.getYposition());
		
		keys.setPosition(520, 400);
		gma.setPosition(574, 455);
		a.frameFinished();

	/*	
		if(keys.getXposition() <= getXRightBoundary(gma) && keys.getYposition() <= getYUpperBoundary(gma)){
				System.out.println("TEST IS TRUE");
			}
		else{
			System.out.println("THIS SHIT FAILED");
		}
		if(gma.getXposition() <= getXRightBoundary(keys) && gma.getYposition() <= getYUpperBoundary(keys)){
			System.out.println("THIS SHIT IS TRUE TOO NIGGA");
		}
		else{
			System.out.println("SHIT FAILED NIGGA");
		}
	*/
		if(isOverlapping(keys,gma))
			System.out.println("isOverlapping returned true");
		else
			System.out.println("isOverlapping returned false");
		
	}

}

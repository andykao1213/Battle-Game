
import java.awt.Image;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import java.util.Random;

public class Jake extends AbstractCharacter{
	int count = 0;
	int character;
	BufferedImage image1, image2 ;
	AbstractSkill yee = new Yee();
	Random random = new Random();
	
	Jake(GameStage gs){
		character = random.nextInt(2);
	}
	
	public String getName(){
		if(character == 0)
			return "DragonYee";
		else
			return "Minion";
	}
	
	public void initial(){
		
		setMAXHP(500);
		setNowHP(500);
		
		try {
			if(character == 0){
				image1 = ImageIO.read(new File("yee.png"));
				image2 = ImageIO.read(new File("yee2.png"));
			}
			else{
				image1 = ImageIO.read(new File("minion.png"));
				image2 = ImageIO.read(new File("minion2.png"));
			}
	    } 
		catch (IOException e) {}
		
		setSkill(yee);
		
	}
	public Image getImage(){
		
		if(count < 5){
			count ++;
			return image1;
		}
		else if(count < 10){
			count++;
			return image2;
		}
		else{
			count = 0;
			return image1;
		}
			

	}

	
}

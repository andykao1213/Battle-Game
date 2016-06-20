import java.awt.Image;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import java.util.Random;

public class DefaultCharacter extends AbstractCharacter{
	int count, character;
	BufferedImage image1, image2;
	AbstractSkill pun = new Punch();
	Random random = new Random();
	
	DefaultCharacter(GameStage gs){
		character = random.nextInt(2);	//random決定使用哪一個腳色
	}
	
	public String getName(){			//回傳腳色名稱
		if(character == 0)
			return "One Punch Man";
		else
			return "Tusky";
	}
	
	public void initial(){				//腳色初始化
		
		if(character == 0){				//設定生命值
			setMAXHP(1000);
			setNowHP(1000);
		}
		else{
			setMAXHP(300);
			setNowHP(300);
		}
		
		
		//讀取圖檔，利用兩張交替產生動畫效果
		try {						
			if(character == 0){
				image1 = ImageIO.read(new File("opm.png"));
				image2 = ImageIO.read(new File("opm2.png"));
			}
			else{
				image1 = ImageIO.read(new File("tusky.png"));
				image2 = ImageIO.read(new File("tusky2.png"));
			}
	    } 
		catch (IOException e) {}
		
			
		setSkill(pun);		//設定技能
		
	}
	public Image getImage(){
		//產生圖片動畫，count從0開始用第一張圖，超過10在換成第二張，超過15再變回第一張，count歸0
		if(count < 10){
			count ++;
			return image1;
		}
		else if(count < 15){
			count++;
			return image2;
		}
		else{
			count = 0;
			return image1;
		}
			

	}
	
}

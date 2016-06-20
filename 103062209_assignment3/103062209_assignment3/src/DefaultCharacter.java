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
		character = random.nextInt(2);	//random�M�w�ϥέ��@�Ӹ}��
	}
	
	public String getName(){			//�^�Ǹ}��W��
		if(character == 0)
			return "One Punch Man";
		else
			return "Tusky";
	}
	
	public void initial(){				//�}���l��
		
		if(character == 0){				//�]�w�ͩR��
			setMAXHP(1000);
			setNowHP(1000);
		}
		else{
			setMAXHP(300);
			setNowHP(300);
		}
		
		
		//Ū�����ɡA�Q�Ψ�i������Ͱʵe�ĪG
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
		
			
		setSkill(pun);		//�]�w�ޯ�
		
	}
	public Image getImage(){
		//���͹Ϥ��ʵe�Acount�q0�}�l�βĤ@�i�ϡA�W�L10�b�����ĤG�i�A�W�L15�A�ܦ^�Ĥ@�i�Acount�k0
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

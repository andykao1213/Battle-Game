import javax.swing.JOptionPane;

public class Yee extends AbstractSkill{
	
	public void launch(AbstractCharacter ch){
		
		int damage;
		
		setPower(50);
		setAccuracy(80);
		

		
		if(isattack() == 1){
			damage = ch.getNowHP() - getPower();
			if( damage < 0 )	
				ch.setNowHP(0);
			else
				ch.setNowHP(damage);
			Object[] options = {"OK"};
			JOptionPane.showOptionDialog(null, ch.getName() + " get " + getPower() + "points damage.", "Message",
			JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,null, options, options[0]);
		}
		else{
			Object[] options = {"OK"};
			JOptionPane.showOptionDialog(null, ch.getName() + " avoid the attack.", "Message",
			JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,null, options, options[0]);
		}
	}
	
	public String getName(){
		return "YEEEEE!";
	}

}

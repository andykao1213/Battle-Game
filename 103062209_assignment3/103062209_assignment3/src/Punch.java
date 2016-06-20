import javax.swing.JOptionPane;

public class Punch extends AbstractSkill{
	
	public void launch(AbstractCharacter ch){
		
		int damage;
		
		setPower(250);		//設定技能傷害值
		setAccuracy(20);	//設定命中率
		
		if(isattack() == 1){	//isattack()判定攻擊是否有效
			damage = ch.getNowHP() - getPower(); //damage判斷被攻擊後所剩下的生命值，避免出現負值
			if( damage < 0 )	
				ch.setNowHP(0);
			else
				ch.setNowHP(damage);
			
			//彈出攻擊是否成功的對話框
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
		return "PUNCH!";
	}

}

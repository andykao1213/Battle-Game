import javax.swing.JOptionPane;

public class Punch extends AbstractSkill{
	
	public void launch(AbstractCharacter ch){
		
		int damage;
		
		setPower(250);		//�]�w�ޯ�ˮ`��
		setAccuracy(20);	//�]�w�R���v
		
		if(isattack() == 1){	//isattack()�P�w�����O�_����
			damage = ch.getNowHP() - getPower(); //damage�P�_�Q������ҳѤU���ͩR�ȡA�קK�X�{�t��
			if( damage < 0 )	
				ch.setNowHP(0);
			else
				ch.setNowHP(damage);
			
			//�u�X�����O�_���\����ܮ�
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

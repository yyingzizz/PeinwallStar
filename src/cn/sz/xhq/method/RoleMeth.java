package cn.sz.xhq.method;

import cn.sz.xhq.basics.Level;
import cn.sz.xhq.basics.Monster;
import cn.sz.xhq.basics.Role;
import cn.sz.xhq.basics.StaticInfo;

public class RoleMeth {


	private static Role role ;//�������浱ǰ��ɫ��Ϣ
	//��ɫ����
	public static void role_attack(Role role,Monster monster){
		int result = role.getAtk() - monster.getDefen();
		if (result<0&&Math.abs(result)>=role.getAtk()) {
			result = role.getGrade();
		}
		monster.setBlood(monster.getBlood()-role.getAtk()-result);
		System.out.println("�㹥���˹���"+monster.getName()+"������ʧ��"+(role.getAtk()+result)+"��Ѫ��");
	}
	
	//����
	public void goAway(){
		
	}
	//����
	public static void gradeUp(Role role,Monster monster){
		role.setExp(role.getExp()+monster.getPrice());
		Level[] level = StaticInfo.levelUp;
		for (int i = role.getGrade()-1; i < level.length; i++) {
			if(i==level.length-1){
				if(role.getExp()%level[i].getExp()==0){
					role.setSkillValue(role.getSkillValue()+7);
					System.out.println("�ȼ��ﵽ���ޣ��������Ե�7�㣡");
				}
			}else{
				if(role.getExp()>=level[i+1].getExp()){
					role.setAtk(role.getAtk()+role.getAtk()/role.getGrade());
					role.setDefen(role.getDefen()+role.getDefen()/role.getGrade());
					role.setSpeed(role.getSpeed()+role.getSpeed()/role.getGrade());
					role.setSkillValue(role.getSkillValue()+level[i+1].getSkillValue());
					role.setGrade(role.getGrade()+1);
					System.out.println("��ϲ��,�ȼ�����1����");
				}
			}
		}
	}
	//���װ��
	public static void getEquips(){
		
	}
	
	//ʤ��
	public static void win(Role role,Monster monster){
		System.out.println("��ʤ���ˣ�");
		role.setBlood(100);
		RoleMeth.gradeUp(role,monster);
		RoleMeth.getEquips();
	}
	//����
	public void lose(){
		
	}

	public Role getRole() {
		return role;
	}

}

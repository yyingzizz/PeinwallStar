package cn.sz.xhq.method;

import cn.sz.xhq.basics.Monster;
import cn.sz.xhq.basics.Role;

public class MonsterMeth {

	private static Monster monster;//��������ս��ʱ�������Ϣ
	//���﹥��
	public static void monster_attack(Monster monster,Role role){
		int result = monster.getAtk() - role.getDefen();
		if (result<0&&Math.abs(result)>=monster.getAtk()) {
			result = monster.getGrade();
		}
		role.setBlood(role.getBlood()-monster.getAtk()-result);
		System.out.println("����"+monster.getName()+"�������㣬����ʧ��"+(monster.getAtk()+result)+"��Ѫ��");
	}
	public static void monster_lose(){
		System.out.println("��������");
	}
	
	public Monster getMonster() {
		return monster;
	}
}

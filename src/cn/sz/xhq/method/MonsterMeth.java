package cn.sz.xhq.method;

import cn.sz.xhq.basics.Monster;
import cn.sz.xhq.basics.Role;

public class MonsterMeth {

	private static Monster monster;//用来保存战斗时怪物的信息
	//怪物攻击
	public static void monster_attack(Monster monster,Role role){
		int result = monster.getAtk() - role.getDefen();
		if (result<0&&Math.abs(result)>=monster.getAtk()) {
			result = monster.getGrade();
		}
		role.setBlood(role.getBlood()-monster.getAtk()-result);
		System.out.println("怪物"+monster.getName()+"攻击了你，你损失了"+(monster.getAtk()+result)+"点血！");
	}
	public static void monster_lose(){
		System.out.println("怪物死亡");
	}
	
	public Monster getMonster() {
		return monster;
	}
}

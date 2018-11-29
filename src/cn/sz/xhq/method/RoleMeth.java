package cn.sz.xhq.method;

import cn.sz.xhq.basics.Level;
import cn.sz.xhq.basics.Monster;
import cn.sz.xhq.basics.Role;
import cn.sz.xhq.basics.StaticInfo;

public class RoleMeth {


	private static Role role ;//用来保存当前角色信息
	//角色攻击
	public static void role_attack(Role role,Monster monster){
		int result = role.getAtk() - monster.getDefen();
		if (result<0&&Math.abs(result)>=role.getAtk()) {
			result = role.getGrade();
		}
		monster.setBlood(monster.getBlood()-role.getAtk()-result);
		System.out.println("你攻击了怪物"+monster.getName()+"，它损失了"+(role.getAtk()+result)+"点血！");
	}
	
	//逃跑
	public void goAway(){
		
	}
	//升级
	public static void gradeUp(Role role,Monster monster){
		role.setExp(role.getExp()+monster.getPrice());
		Level[] level = StaticInfo.levelUp;
		for (int i = role.getGrade()-1; i < level.length; i++) {
			if(i==level.length-1){
				if(role.getExp()%level[i].getExp()==0){
					role.setSkillValue(role.getSkillValue()+7);
					System.out.println("等级达到上限，增加属性点7点！");
				}
			}else{
				if(role.getExp()>=level[i+1].getExp()){
					role.setAtk(role.getAtk()+role.getAtk()/role.getGrade());
					role.setDefen(role.getDefen()+role.getDefen()/role.getGrade());
					role.setSpeed(role.getSpeed()+role.getSpeed()/role.getGrade());
					role.setSkillValue(role.getSkillValue()+level[i+1].getSkillValue());
					role.setGrade(role.getGrade()+1);
					System.out.println("恭喜你,等级提升1级！");
				}
			}
		}
	}
	//获得装备
	public static void getEquips(){
		
	}
	
	//胜利
	public static void win(Role role,Monster monster){
		System.out.println("你胜利了！");
		role.setBlood(100);
		RoleMeth.gradeUp(role,monster);
		RoleMeth.getEquips();
	}
	//死亡
	public void lose(){
		
	}

	public Role getRole() {
		return role;
	}

}

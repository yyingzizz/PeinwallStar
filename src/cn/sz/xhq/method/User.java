package cn.sz.xhq.method;

import java.util.Random;
import java.util.Scanner;
import cn.sz.xhq.basics.Biology;
import cn.sz.xhq.basics.Map;
import cn.sz.xhq.basics.Monster;
import cn.sz.xhq.basics.Role;
import cn.sz.xhq.basics.StaticInfo;

public class User {

	//选择角色
	public static Role roleSelect(){
		Scanner input = new Scanner(System.in);
		System.out.println("请选择角色进入游戏,初始等级为1");
		Biology [] role = StaticInfo.r;
		System.out.println("1."+ role[0].getName()+"\t阵营："+role[0].getCamp()+"\t攻击力："+role[0].getAtk()+"\t防御力："+role[0].getDefen()+"\t速度："+role[0].getSpeed());
		System.out.println("2."+ role[1].getName()+"\t阵营："+role[1].getCamp()+"\t攻击力："+role[1].getAtk()+"\t防御力："+role[1].getDefen()+"\t速度："+role[1].getSpeed());
		System.out.println("3."+ role[2].getName()+"\t阵营："+role[2].getCamp()+"\t攻击力："+role[2].getAtk()+"\t防御力："+role[2].getDefen()+"\t速度："+role[2].getSpeed());
		System.out.print("输入你想要玩的角色的编号：");
		int select = input.nextInt();
		switch (select) {
		case 1:
			System.out.println("你选择的是"+role[0].getName());
			return (Role)role[0];	
		case 2:
			System.out.println("你选择的是"+role[1].getName());
			return (Role)role[1];
		case 3:
			System.out.println("你选择的是"+role[2].getName());
			return (Role)role[2];
		default:
			System.out.println("选择有误，请重新选择！");
			break;
		}
		return null;
		
	}
	//主菜单
	public static void menu(Role role){
		Scanner input = new Scanner(System.in);
		boolean menu_flag = true;
		while (menu_flag) {
			System.out.println("**************************************************");
			System.out.println("*****************1.选择副本地图**********************");
			System.out.println("*****************2.查看角色属性**********************");
			System.out.println("*****************3.查看角色装备**********************");
			System.out.println("*****************4.返回上级菜单**********************");
			System.out.println("*****************5.退   出   游   戏**********************");
			System.out.println("**************************************************");
			int meun_select = input.nextInt();
			switch (meun_select) {
			case 1:
				Map map =mapSelect();
				while (true) {
					Monster monster = getMonsters(map);
					combat(role,monster);
					System.out.println("要继续在"+map.getMapName()+"副本中战斗吗？【1.是\t2.否");
					if (input.nextInt()==2) {
						break;
					}
				}
				break;
			case 2:
				lookRole(role);
				break;
			case 3:
				
				break;
			case 4:
				menu_flag = false;
				break;
			case 5:
				System.out.println("退出游戏");
				System.exit(0);
				break;
			default:
				break;
			}
		}
	}
	//查看角色属性
	public static void lookRole(Role role){
		Scanner input = new Scanner(System.in);
		System.out.println("-----------角色属性----------------");
		System.out.println("----------名字："+role.getName()+"-----------");
		System.out.println("----------等级："+role.getGrade()+"级-----------");
		System.out.println("----------攻击力："+role.getAtk()+"-----------");
		System.out.println("----------防御力："+role.getDefen()+"-----------");
		System.out.println("----------速    度："+role.getSpeed()+"-----------");
		System.out.println("----------可分配点数："+role.getSkillValue()+"-----------");
		System.out.println("----------当前经验值："+role.getExp()+"-----------");
		if (role.getSkillValue()>0) {
			System.out.println("你有"+role.getSkillValue()+"可分配");
			System.out.println("【1.是\t2.否】");
			int skill_select = input.nextInt();
			if (skill_select==1) {
				
			}
		}
	}
	//技能分配
	public static void skillAllot(Role role){
		Scanner input = new Scanner(System.in);
		System.out.println("请选择分配的给【1.攻击力\t2.防御力\t3.速度");
		int skillAllotSelect = input.nextInt();
		switch (skillAllotSelect) {
		case 1:
			System.out.println("输入要分配给攻击力的点数，不能大于"+role.getSkillValue());
			int a = input.nextInt();
			role.setAtk(role.getAtk()+a);
			role.setSkillValue(role.getSkillValue()-a);
			System.out.println("攻击力增加"+a+"，现在的攻击力为"+role.getAtk());
			break;
		case 2:
			System.out.println("输入要分配给防御力的点数，不能大于"+role.getSkillValue());
			int b = input.nextInt();
			role.setDefen(role.getDefen()+b);
			role.setSkillValue(role.getSkillValue()-b);
			System.out.println("防御力增加"+b+"，现在的防御力为"+role.getDefen());
			break;
		case 3:
			System.out.println("输入要分配给攻击力的点数，不能大于"+role.getSkillValue());
			int s = input.nextInt();
			role.setSpeed(role.getSpeed()+s);
			role.setSkillValue(role.getSkillValue()-s);
			System.out.println("速度增加"+s+"，现在的速度为"+role.getSpeed());
			break;

		default:
			break;
		}
	}
	//选择进入地图
	public static Map mapSelect(){
		Scanner input = new Scanner(System.in);
		Map[] map = StaticInfo.map;
		System.out.println("****************副本地图********************");
		System.out.println("***************1.低************************");
		System.out.println("***************2.中************************");
		System.out.println("***************3.高************************");
		System.out.println("***************4.返回上级菜单************************");
		int map_select = input.nextInt();
		switch (map_select) {
		case 1:
			System.out.println("进入低级地图！");
			return map[0];
		case 2:
			System.out.println("进入中级地图！");
			return map[1];
		case 3:
			System.out.println("进入高级地图！");
			return map[2];
		case 4:
			

		default:
			System.out.println("你的选择有误，请重新选择！");
			break;
		}
		return null;
	}
	//遭遇怪物
	public static Monster getMonsters(Map map){
		Random rand = new Random();
		Biology [] monster = StaticInfo.m;
		if (map.getMapNo()==0) {
			int num = rand.nextInt(3);
			System.out.println("遇到了"+((Monster) monster[num]).getName());
			System.out.println("等级："+((Monster) monster[num]).getGrade()+"级");
			System.out.println("攻击力："+((Monster) monster[num]).getAtk());
			System.out.println("防御力："+((Monster) monster[num]).getDefen());
			System.out.println("速    度："+((Monster) monster[num]).getSpeed());
			return ((Monster) monster[num]);
		} else if(map.getMapNo()==1) {
			int num = rand.nextInt(3)+3;
			System.out.println("遇到了"+((Monster) monster[num]).getName());
			System.out.println("等级："+((Monster) monster[num]).getGrade()+"级");
			System.out.println("攻击力："+((Monster) monster[num]).getAtk());
			System.out.println("防御力："+((Monster) monster[num]).getDefen());
			System.out.println("速    度："+((Monster) monster[num]).getSpeed());
			return ((Monster) monster[num]); 
		}
		System.out.println("遇到了"+((Monster) monster[rand.nextInt(3)+6]).getName());
		System.out.println("等级："+((Monster) monster[rand.nextInt(3)+6]).getGrade()+"级");
		System.out.println("攻击力："+((Monster) monster[rand.nextInt(3)+6]).getAtk());
		System.out.println("防御力："+((Monster) monster[rand.nextInt(3)+6]).getDefen());
		System.out.println("速    度："+((Monster) monster[rand.nextInt(3)+6]).getSpeed());
		return ((Monster) monster[rand.nextInt(3)+6]);
	}
	//战斗
	public static void combat(Role role,Monster monster){
		Scanner input = new Scanner(System.in);
		System.out.println("进入战斗！");
		int count = 1;
		boolean combat_flag = true;
		while(combat_flag){
			System.out.println("第"+count+"回合");
			System.out.println("你的血量："+role.getBlood());
			System.out.println("请选择你要的操作【1.攻击\t2.逃跑】");
			int combat_select = input.nextInt();
			switch (combat_select) {
			case 1:
				if (role.getSpeed()>=monster.getSpeed()) {
					RoleMeth.role_attack(role,monster);
					if (monster.getBlood()<=0) {
						MonsterMeth.monster_lose();
						RoleMeth.win(role,monster);
						combat_flag = false;
					} else {
						MonsterMeth.monster_attack(monster,role);
						if (role.getBlood()<=0) {
							combat_flag = false;
						}
					}
				} else {
					MonsterMeth.monster_attack(monster,role);
					if (role.getBlood()<=0) {
						combat_flag = false;
					} else {
						RoleMeth.role_attack(role,monster);
						if (monster.getBlood()<=0) {
							MonsterMeth.monster_lose();
							RoleMeth.win(role,monster);
							combat_flag = false;
						}
					}
				}
				count++;
				break;
			case 2:
				//逃跑
				combat_flag = false;

			default:
				System.out.println("你的输入有误，请重新输入！");
				break;
			}
		}
	}
	//退出游戏
	public void exitGame(){
		
	}
	public static void main(String[] args) {
		System.out.println("**************欢迎来到召唤师峡谷！*******************");
		boolean flag_in = true;
		while (flag_in) {
			//Role a = roleSelect();
			menu(roleSelect());		
		}
		
	}
}

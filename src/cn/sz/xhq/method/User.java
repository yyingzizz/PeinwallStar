package cn.sz.xhq.method;

import java.util.Random;
import java.util.Scanner;
import cn.sz.xhq.basics.Biology;
import cn.sz.xhq.basics.Map;
import cn.sz.xhq.basics.Monster;
import cn.sz.xhq.basics.Role;
import cn.sz.xhq.basics.StaticInfo;

public class User {

	//ѡ���ɫ
	public static Role roleSelect(){
		Scanner input = new Scanner(System.in);
		System.out.println("��ѡ���ɫ������Ϸ,��ʼ�ȼ�Ϊ1");
		Biology [] role = StaticInfo.r;
		System.out.println("1."+ role[0].getName()+"\t��Ӫ��"+role[0].getCamp()+"\t��������"+role[0].getAtk()+"\t��������"+role[0].getDefen()+"\t�ٶȣ�"+role[0].getSpeed());
		System.out.println("2."+ role[1].getName()+"\t��Ӫ��"+role[1].getCamp()+"\t��������"+role[1].getAtk()+"\t��������"+role[1].getDefen()+"\t�ٶȣ�"+role[1].getSpeed());
		System.out.println("3."+ role[2].getName()+"\t��Ӫ��"+role[2].getCamp()+"\t��������"+role[2].getAtk()+"\t��������"+role[2].getDefen()+"\t�ٶȣ�"+role[2].getSpeed());
		System.out.print("��������Ҫ��Ľ�ɫ�ı�ţ�");
		int select = input.nextInt();
		switch (select) {
		case 1:
			System.out.println("��ѡ�����"+role[0].getName());
			return (Role)role[0];	
		case 2:
			System.out.println("��ѡ�����"+role[1].getName());
			return (Role)role[1];
		case 3:
			System.out.println("��ѡ�����"+role[2].getName());
			return (Role)role[2];
		default:
			System.out.println("ѡ������������ѡ��");
			break;
		}
		return null;
		
	}
	//���˵�
	public static void menu(Role role){
		Scanner input = new Scanner(System.in);
		boolean menu_flag = true;
		while (menu_flag) {
			System.out.println("**************************************************");
			System.out.println("*****************1.ѡ�񸱱���ͼ**********************");
			System.out.println("*****************2.�鿴��ɫ����**********************");
			System.out.println("*****************3.�鿴��ɫװ��**********************");
			System.out.println("*****************4.�����ϼ��˵�**********************");
			System.out.println("*****************5.��   ��   ��   Ϸ**********************");
			System.out.println("**************************************************");
			int meun_select = input.nextInt();
			switch (meun_select) {
			case 1:
				Map map =mapSelect();
				while (true) {
					Monster monster = getMonsters(map);
					combat(role,monster);
					System.out.println("Ҫ������"+map.getMapName()+"������ս���𣿡�1.��\t2.��");
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
				System.out.println("�˳���Ϸ");
				System.exit(0);
				break;
			default:
				break;
			}
		}
	}
	//�鿴��ɫ����
	public static void lookRole(Role role){
		Scanner input = new Scanner(System.in);
		System.out.println("-----------��ɫ����----------------");
		System.out.println("----------���֣�"+role.getName()+"-----------");
		System.out.println("----------�ȼ���"+role.getGrade()+"��-----------");
		System.out.println("----------��������"+role.getAtk()+"-----------");
		System.out.println("----------��������"+role.getDefen()+"-----------");
		System.out.println("----------��    �ȣ�"+role.getSpeed()+"-----------");
		System.out.println("----------�ɷ��������"+role.getSkillValue()+"-----------");
		System.out.println("----------��ǰ����ֵ��"+role.getExp()+"-----------");
		if (role.getSkillValue()>0) {
			System.out.println("����"+role.getSkillValue()+"�ɷ���");
			System.out.println("��1.��\t2.��");
			int skill_select = input.nextInt();
			if (skill_select==1) {
				
			}
		}
	}
	//���ܷ���
	public static void skillAllot(Role role){
		Scanner input = new Scanner(System.in);
		System.out.println("��ѡ�����ĸ���1.������\t2.������\t3.�ٶ�");
		int skillAllotSelect = input.nextInt();
		switch (skillAllotSelect) {
		case 1:
			System.out.println("����Ҫ������������ĵ��������ܴ���"+role.getSkillValue());
			int a = input.nextInt();
			role.setAtk(role.getAtk()+a);
			role.setSkillValue(role.getSkillValue()-a);
			System.out.println("����������"+a+"�����ڵĹ�����Ϊ"+role.getAtk());
			break;
		case 2:
			System.out.println("����Ҫ������������ĵ��������ܴ���"+role.getSkillValue());
			int b = input.nextInt();
			role.setDefen(role.getDefen()+b);
			role.setSkillValue(role.getSkillValue()-b);
			System.out.println("����������"+b+"�����ڵķ�����Ϊ"+role.getDefen());
			break;
		case 3:
			System.out.println("����Ҫ������������ĵ��������ܴ���"+role.getSkillValue());
			int s = input.nextInt();
			role.setSpeed(role.getSpeed()+s);
			role.setSkillValue(role.getSkillValue()-s);
			System.out.println("�ٶ�����"+s+"�����ڵ��ٶ�Ϊ"+role.getSpeed());
			break;

		default:
			break;
		}
	}
	//ѡ������ͼ
	public static Map mapSelect(){
		Scanner input = new Scanner(System.in);
		Map[] map = StaticInfo.map;
		System.out.println("****************������ͼ********************");
		System.out.println("***************1.��************************");
		System.out.println("***************2.��************************");
		System.out.println("***************3.��************************");
		System.out.println("***************4.�����ϼ��˵�************************");
		int map_select = input.nextInt();
		switch (map_select) {
		case 1:
			System.out.println("����ͼ���ͼ��");
			return map[0];
		case 2:
			System.out.println("�����м���ͼ��");
			return map[1];
		case 3:
			System.out.println("����߼���ͼ��");
			return map[2];
		case 4:
			

		default:
			System.out.println("���ѡ������������ѡ��");
			break;
		}
		return null;
	}
	//��������
	public static Monster getMonsters(Map map){
		Random rand = new Random();
		Biology [] monster = StaticInfo.m;
		if (map.getMapNo()==0) {
			int num = rand.nextInt(3);
			System.out.println("������"+((Monster) monster[num]).getName());
			System.out.println("�ȼ���"+((Monster) monster[num]).getGrade()+"��");
			System.out.println("��������"+((Monster) monster[num]).getAtk());
			System.out.println("��������"+((Monster) monster[num]).getDefen());
			System.out.println("��    �ȣ�"+((Monster) monster[num]).getSpeed());
			return ((Monster) monster[num]);
		} else if(map.getMapNo()==1) {
			int num = rand.nextInt(3)+3;
			System.out.println("������"+((Monster) monster[num]).getName());
			System.out.println("�ȼ���"+((Monster) monster[num]).getGrade()+"��");
			System.out.println("��������"+((Monster) monster[num]).getAtk());
			System.out.println("��������"+((Monster) monster[num]).getDefen());
			System.out.println("��    �ȣ�"+((Monster) monster[num]).getSpeed());
			return ((Monster) monster[num]); 
		}
		System.out.println("������"+((Monster) monster[rand.nextInt(3)+6]).getName());
		System.out.println("�ȼ���"+((Monster) monster[rand.nextInt(3)+6]).getGrade()+"��");
		System.out.println("��������"+((Monster) monster[rand.nextInt(3)+6]).getAtk());
		System.out.println("��������"+((Monster) monster[rand.nextInt(3)+6]).getDefen());
		System.out.println("��    �ȣ�"+((Monster) monster[rand.nextInt(3)+6]).getSpeed());
		return ((Monster) monster[rand.nextInt(3)+6]);
	}
	//ս��
	public static void combat(Role role,Monster monster){
		Scanner input = new Scanner(System.in);
		System.out.println("����ս����");
		int count = 1;
		boolean combat_flag = true;
		while(combat_flag){
			System.out.println("��"+count+"�غ�");
			System.out.println("���Ѫ����"+role.getBlood());
			System.out.println("��ѡ����Ҫ�Ĳ�����1.����\t2.���ܡ�");
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
				//����
				combat_flag = false;

			default:
				System.out.println("��������������������룡");
				break;
			}
		}
	}
	//�˳���Ϸ
	public void exitGame(){
		
	}
	public static void main(String[] args) {
		System.out.println("**************��ӭ�����ٻ�ʦϿ�ȣ�*******************");
		boolean flag_in = true;
		while (flag_in) {
			//Role a = roleSelect();
			menu(roleSelect());		
		}
		
	}
}

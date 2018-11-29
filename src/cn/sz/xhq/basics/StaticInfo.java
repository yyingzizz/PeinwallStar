package cn.sz.xhq.basics;

public class StaticInfo {

	public static Biology [] r = new Role[3];
	public static Biology [] m = new Monster[12];
	
	public static Level [] levelUp = new Level[10];
	public static Equip [] equip = new Equip[5];
	
	public static Map [] map = new Map[3];
	
	static{
		r[0] = new Role("瑞兹", 1, 3, 1, 2, "战争学院", 100, 3, 5);
		r[1] = new Role("艾希", 1, 2, 1, 3, "阿瓦罗萨", 100, 3, 5);
		r[2] = new Role("盖伦", 1, 1, 3, 2, "德玛西亚", 100, 3, 5);
		
		levelUp[0] = new Level(1,5,3);
		levelUp[1] = new Level(2,10,3);
		levelUp[2] = new Level(3,15,3);
		levelUp[3] = new Level(4,40,4);
		levelUp[4] = new Level(5,48,4);
		levelUp[5] = new Level(6,72,4);
		levelUp[6] = new Level(7,120,6);
		levelUp[7] = new Level(8,260,6);
		levelUp[8] = new Level(9,900,6);
		levelUp[9] = new Level(10,1000,7);
		
		m[0] = new Monster("怪物1", 1, 2, 2, 2, "艾欧尼亚", 100, 1);
		m[1] = new Monster("怪物2", 2, 3, 3, 3, "艾欧尼亚", 100, 2);
		m[2] = new Monster("怪物3", 3, 3, 3, 3, "艾欧尼亚", 100, 3);
		m[3] = new Monster("怪物4", 4, 5, 5, 5, "艾欧尼亚", 100, 5);
		m[4] = new Monster("怪物5", 5, 7, 7, 7, "艾欧尼亚", 100, 6);
		m[5] = new Monster("怪物6", 6, 9, 9, 9, "艾欧尼亚", 100, 9);
		m[6] = new Monster("怪物7", 7, 12, 12, 12, "艾欧尼亚", 100, 12);
		m[7] = new Monster("怪物8", 8, 15, 15, 15, "艾欧尼亚", 100, 13);
		m[8] = new Monster("怪物9", 9, 18, 18, 18, "艾欧尼亚", 100, 18);
		m[9] = new Monster("BOSS1", 3, 4, 4, 4, "艾欧尼亚", 150, 6);
		m[10] = new Monster("BOSS2", 6, 11, 11, 11, "艾欧尼亚", 180, 15);
		m[11] = new Monster("BOSS3", 9, 20, 20, 20, "艾欧尼亚", 200, 20);
		
		equip[0] = new Equip(1001, "战神头盔", 0, 6, -2);
		equip[1] = new Equip(1002, "连环锁子甲", 0, 15, -1);
		equip[2] = new Equip(1003, "波斯追风靴", 2, 3, 8);
		equip[3] = new Equip(1004, "蓝魔指环", 2, 12, 2);
		equip[4] = new Equip(1005, "欺霜弑神铲", 21, 5, 0);
		
		map[0] = new Map("低级",0);
		map[1] = new Map("中级",1);
		map[2] = new Map("高级",2);
		
	}
}

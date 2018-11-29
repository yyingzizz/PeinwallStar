package cn.sz.xhq.basics;

public class StaticInfo {

	public static Biology [] r = new Role[3];
	public static Biology [] m = new Monster[12];
	
	public static Level [] levelUp = new Level[10];
	public static Equip [] equip = new Equip[5];
	
	public static Map [] map = new Map[3];
	
	static{
		r[0] = new Role("����", 1, 3, 1, 2, "ս��ѧԺ", 100, 3, 5);
		r[1] = new Role("��ϣ", 1, 2, 1, 3, "��������", 100, 3, 5);
		r[2] = new Role("����", 1, 1, 3, 2, "��������", 100, 3, 5);
		
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
		
		m[0] = new Monster("����1", 1, 2, 2, 2, "��ŷ����", 100, 1);
		m[1] = new Monster("����2", 2, 3, 3, 3, "��ŷ����", 100, 2);
		m[2] = new Monster("����3", 3, 3, 3, 3, "��ŷ����", 100, 3);
		m[3] = new Monster("����4", 4, 5, 5, 5, "��ŷ����", 100, 5);
		m[4] = new Monster("����5", 5, 7, 7, 7, "��ŷ����", 100, 6);
		m[5] = new Monster("����6", 6, 9, 9, 9, "��ŷ����", 100, 9);
		m[6] = new Monster("����7", 7, 12, 12, 12, "��ŷ����", 100, 12);
		m[7] = new Monster("����8", 8, 15, 15, 15, "��ŷ����", 100, 13);
		m[8] = new Monster("����9", 9, 18, 18, 18, "��ŷ����", 100, 18);
		m[9] = new Monster("BOSS1", 3, 4, 4, 4, "��ŷ����", 150, 6);
		m[10] = new Monster("BOSS2", 6, 11, 11, 11, "��ŷ����", 180, 15);
		m[11] = new Monster("BOSS3", 9, 20, 20, 20, "��ŷ����", 200, 20);
		
		equip[0] = new Equip(1001, "ս��ͷ��", 0, 6, -2);
		equip[1] = new Equip(1002, "�������Ӽ�", 0, 15, -1);
		equip[2] = new Equip(1003, "��˹׷��ѥ", 2, 3, 8);
		equip[3] = new Equip(1004, "��ħָ��", 2, 12, 2);
		equip[4] = new Equip(1005, "��˪߱���", 21, 5, 0);
		
		map[0] = new Map("�ͼ�",0);
		map[1] = new Map("�м�",1);
		map[2] = new Map("�߼�",2);
		
	}
}

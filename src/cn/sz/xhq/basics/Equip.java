package cn.sz.xhq.basics;

//import java.util.Random;

public class Equip extends Biology {

	private int equipNum;//ÎäÆ÷±àºÅ
	private String name;//ÎäÆ÷Ãû³Æ
	private int atk;//¹¥»÷Á¦
	private int defen;//·ÀÓùÁ¦
	private int speed;//ËÙ¶È
	
	
	public Equip() {
	}
	public Equip(int equipNum, String name, int atk, int defen, int speed) {
		this.equipNum = equipNum;
		this.name = name;
		this.atk = atk;
		this.defen = defen;
		this.speed = speed;
	}
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public int getDefen() {
		return defen;
	}
	public void setDefen(int defen) {
		this.defen = defen;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getEquipNum() {
		return equipNum;
	}
	public void setEquipNum(int equipNum) {
		this.equipNum = equipNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}

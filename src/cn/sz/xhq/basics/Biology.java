package cn.sz.xhq.basics;

public class Biology {

	private int grade;//等级
	private String name;//名称
	private int atk;//攻击力
	private int defen;//防御力
	private int speed;//速度
	private String camp;//阵营
	private int blood = 100;//血量
	
	public Biology(){
		
	}
	public Biology(String name,int grade,int atk,int defen,int speed,String camp,int blood){
		this.name = name;
		this.grade = grade;
		this.atk = atk;
		this.defen = defen;
		this.speed = speed;
		this.camp = camp;
		this.blood = blood;
	}

	public int getBlood() {
		return blood;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getCamp() {
		return camp;
	}
	public void setCamp(String camp) {
		this.camp = camp;
	}
	public void setBlood(int blood) {
		this.blood = blood;
	}
	
}

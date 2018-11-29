package cn.sz.xhq.basics;

public class Level {

	private int grade;
	private int exp;
	private int skillValue;
	
	public Level() {
	}
	public Level(int grade, int exp, int skillValue) {
		this.grade = grade;
		this.exp = exp;
		this.skillValue = skillValue;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public int getSkillValue() {
		return skillValue;
	}
	public void setSkillValue(int skillValue) {
		this.skillValue = skillValue;
	}
	
}

package cn.sz.xhq.basics;


public class Role extends Biology {

	private int skillValue;//���ܵ���
	private int exp;//����
	
	public Role(){
		
	}
	public Role(String name,int grade,int atk,int defen,int speed,String camp,int blood,int skillValue,int exp){
		super(name,grade,atk,defen,speed,camp,blood);
		this.skillValue = skillValue;
		this.exp = exp;
	}
	
	public int getSkillValue() {
		return skillValue;
	}

	public void setSkillValue(int skillValue) {
		this.skillValue = skillValue;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	
}

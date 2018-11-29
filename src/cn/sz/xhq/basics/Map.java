package cn.sz.xhq.basics;

public class Map {

	//private Biology [] m;
	private String mapName;
	private int mapNo;
	//private Monster monster;

	public Map() {

	}
	public Map(String mapName, int mapNo) {
		this.mapName = mapName;
		this.mapNo = mapNo;
	}
	public String getMapName() {
		return mapName;
	}
	public void setMapName(String mapName) {
		this.mapName = mapName;
	}
	public int getMapNo() {
		return mapNo;
	}
	public void setMapNo(int mapNo) {
		this.mapNo = mapNo;
	}
	
}

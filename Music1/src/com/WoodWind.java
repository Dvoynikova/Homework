package com;

public class WoodWind {
	
	private int num5;
	private int num6;
	private int num7;
	private int num8;
	private int num9;
	
	
	
		
	public void init2(int num5,int num6,int num7,int num8,int num9){
		
		this.num5=num5;
		this.num6=num6;
		this.num7=num7;
		this.num8=num8;
		this.num9=num9;
				
	}
	
	public String getDescription2(){
		return "������ ������:"+"�������"+"-"+num5+"��, "+"�����"+"-"+num6+"��, "+"������"+"-"+num7+"��, "+"�����"+"-"+num8+"��."+"��������"+"-"+num9+"��."+"\n";}

	public String checkWoodWind(){
		if((num5<2)| (num6 <2)| (num7 <2)| (num8 <2)){
			return "� ������������� �������� ������ ���� ������� �� 2 ��������, �����, ������, ������"+"\n";
		} else {
			if(num9>0){
				return "� ������������� ������� �������� �� ������"+"\n";
			}
			else{
			return "���������-������� ������ ��� �������������� �������� �������"+"\n";
				}
				}
			}
		
}

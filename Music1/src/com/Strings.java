package com;

public class Strings  extends Orchestra{
	
	protected int num1;
	protected int num2;
	protected int num3;
	protected int num4;
	
	
	
	public void init1(int num1, int num2,int num3,int num4){
		this.num1=num1;
		this.num2=num2;
		this.num3=num3;
		this.num4=num4;
				
	}
	
	
	public String getDescription1(){
		String s1= "������ ������:"+"�������"+"-"+num1+"��, "+"����������"+"-"+num2+"��, "+"����"+"-"+num3+"��, "+"���������"+"-"+num4+"��."+"\n";
		return s1;}
	public String checkStrings(){
		if(num1<6){
			return "� ������������� �������� ������ ���� ������ 6 �������"+"\n";
		} else {
			if(num2 <4) {
				return "� ������������� �������� ������ ���� ������ 4 ����������"+"\n";
			}
			else{
				if(num3 <6) {
					return "� ������������� �������� ������ ���� ������ 6 ������"+"\n";
				}
				else{
					if(num4 <2) {
						return "� ������������� �������� ������ ���� ������ 2 ����������"+"\n";
					}
					else{
						return "�������� ������ ��� �������������� �������� �������"+"\n";
						
					}
				}
			} 
			}
		
		
	}
}

package com;

public class Keyboards {
	private int num14;
	private int num15;
	private int num16;
	private int num17;
	private int num18;
	
	
	
	public void init4(int num14,int num15,int num16,int num17,int num18){
		this.num14=num14;
		this.num15=num15;
		this.num16=num16;
		this.num17=num17;
		this.num18=num18;
				
	}
	
	public String getDescription4(){
		return "������ ������:"+"����������"+"-"+num14+"��, "+"�����"+"-"+num15+"��, "+"����"+"-"+num16+"��, "+"���������"+"-"+num17+"��."+"����������"+"-"+num18+"��."+"\n";}

	public String checkKeyboards(){
		if((num14>0)| (num16 >0)| (num17 >0)){
			return "� ������������� ������� �� ������ ����������, ����, ���������"+"\n";
		} 
		else {
			if(num15>1){
				return "� ������������� �������� ���������� 1 ������"+"\n";
			}
			else{
				if(num18>1){
					return "� ������������� �������� ���������� 1 ����������"+"\n";
				}
				else{
					if((num15!=0)&(num18!=0)){
						return "� ������������� �������� ���������� 1 �����������"+"\n";
					}
					else{
						return "��������� ������ ��� �������������� �������� �������"+"\n";
						}
					}
				}
			}
			}
}

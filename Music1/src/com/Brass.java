package com;

public class Brass extends Orchestra {
	
	private int num19;
	private int num20;
	private int num21;
	private int num22;
	private int num23;
	
		
	public void init5(int num19,int num20,int num21,int num22,int num23){
		this.num19=num19;
		this.num20=num20;
		this.num21=num21;
		this.num22=num22;
		this.num23=num23;
		System.out.println("������� ���������");
		
	}
	
	public String getDescription5(){
		return "������ ������:"+"��������"+"-"+num19+"��, "+"������������"+"-"+num20+"��, "+"�������"+"-"+num21+"��, "+"�����"+"-"+num22+"��."+"���-���"+"-"+num23+"��."+"\n";}

	public String checkBrass(){
		if(num19<0){
			return "� ������������� �������� ������ ���� ���� �� 1 �������"+"\n";
		} else {
				return "������� ������ ��� �������������� �������� �������"+"\n";
				}
				
			}
		
}

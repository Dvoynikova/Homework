package com;

public class CopperWind {
	
	private int num10;
	private int num11;
	private int num12;
	private int num13;
	
	
			
	public void init3(int num10,int num11,int num12,int num13){
		this.num10=num10;
		this.num11=num11;
		this.num12=num12;
		this.num13=num13;
					}
	
	public String getDescription3(){
		return "������ ������:"+"�����"+"-"+num10+"��, "+"�������"+"-"+num11+"��, "+"����"+"-"+num12+"��, "+"��������"+"-"+num13+"��."+"\n";}

	public String checkCopperWind(){
		if((num10<2)|(num13<2)){
			return "� ������������� �������� ������ ���� ������� �� 2 ����� � ��������"+"\n";
		} else {
				return "�������� ������ ��� �������������� �������� �������"+"\n";
				
			} 
			}
}

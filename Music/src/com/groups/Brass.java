package com.groups;

public class Brass {
	private String inst1;
	private String inst2;
	private String inst3;
	private String inst4;
	private String inst5;
	private int num1;
	private int num2;
	private int num3;
	private int num4;
	private int num5;
	
	
	public void structure5(){
		System.out.println();
		System.out.println("������� ������");
		System.out.println("��������� ������: ��������, ������������, �������, �����, ���-���");
		}
	public void init5(String inst1,int num1,String inst2, int num2,String inst3,int num3,String inst4,int num4, String inst5,int num5){
		this.inst1=inst1;
		this.num1=num1;
		this.inst2=inst2;
		this.num2=num2;
		this.inst3=inst3;
		this.num3=num3;
		this.inst4=inst4;
		this.num4=num4;
		this.inst5=inst5;
		this.num5=num5;
		System.out.println("������� ���������");
		
	}
	
	public String getDescription5(){
		return "������ ������:"+inst1+"-"+num1+"��, "+inst2+"-"+num2+"��, "+inst3+"-"+num3+"��, "+inst4+"-"+num4+"��."+inst5+"-"+num5+"��."+"\n";}

	public String checkBrass(){
		if(num1<0){
			return "� ������������� �������� ������ ���� ���� �� 1 �������"+"\n";
		} else {
				return "������� ������ ��� �������������� �������� �������"+"\n";
				}
				
			}
		
}

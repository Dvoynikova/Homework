package com.groups;

public class CopperWind {
	private String inst1;
	private String inst2;
	private String inst3;
	private String inst4;
	private int num1;
	private int num2;
	private int num3;
	private int num4;
	
	
	public void structure3(){
		System.out.println();
		System.out.println("�����-������� ������");
		System.out.println("��������� ������: �����, �������, ����, ��������");
		}
	public void init3(String inst1,int num1,String inst2, int num2,String inst3,int num3,String inst4,int num4){
		this.inst1=inst1;
		this.num1=num1;
		this.inst2=inst2;
		this.num2=num2;
		this.inst3=inst3;
		this.num3=num3;
		this.inst4=inst4;
		this.num4=num4;
		System.out.println("�����-������� ���������");
		
	}
	
	public String getDescription3(){
		return "������ ������:"+inst1+"-"+num1+"��, "+inst2+"-"+num2+"��, "+inst3+"-"+num3+"��, "+inst4+"-"+num4+"��."+"\n";}

	public String checkCopperWind(){
		if((num1<2)|(num4<2)){
			return "� ������������� �������� ������ ���� ������� �� 2 ����� � ��������"+"\n";
		} else {
				return "�������� ������ ��� �������������� �������� �������"+"\n";
				
			} 
			}
		
		
	}


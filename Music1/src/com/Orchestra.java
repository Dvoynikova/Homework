package com;


public class Orchestra {
	
	protected static int num1;
	protected static int num2;
	protected static int num3;
	protected static int num4;
	
	public static void main (String[]args){
		Strings g1=new Strings();
		g1.init1(num1, num2, num3, num4);
		g1.getDescription1();
		g1.checkStrings();
	/*	System.out.print(g1.getDescription1());
		System.out.print(g1.checkStrings());*/
	
		/*WoodWind g2=new WoodWind(); 
		g2.structure2();
		g2.init2("�������",5,"�����", 4,"������", 5, "�����", 3, "��������",0);
		System.out.print(g2.getDescription2());
		System.out.print(g2.checkWoodWind());
		
		CopperWind g3=new CopperWind();
		g3.structure3();
		g3.init3("�����",5,"�������", 4,"����", 5, "��������", 3);
		System.out.print(g3.getDescription3());
		System.out.print(g3.checkCopperWind());
		
		Keyboards g4=new Keyboards();
		g4.structure4();
		g4.init4("����������",0,"�����", 0,"����", 0, "���������", 0, "����������",1);
		System.out.print(g4.getDescription4());
		System.out.print(g4.checkKeyboards());
		
		Brass g5=new Brass();
		g5.structure5();
		g5.init5("��������",5,"������������", 4,"�������", 5, "�����", 3, "���-���",0);
		System.out.print(g5.getDescription5());
		System.out.print(g5.checkBrass());*/
	}
}

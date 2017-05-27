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
		g2.init2("Кларнет",5,"Гобой", 4,"Флейта", 5, "Фагот", 3, "Саксофон",0);
		System.out.print(g2.getDescription2());
		System.out.print(g2.checkWoodWind());
		
		CopperWind g3=new CopperWind();
		g3.structure3();
		g3.init3("Труба",5,"Тромбон", 4,"Туба", 5, "Валторна", 3);
		System.out.print(g3.getDescription3());
		System.out.print(g3.checkCopperWind());
		
		Keyboards g4=new Keyboards();
		g4.structure4();
		g4.init4("Синтезатор",0,"Орган", 0,"Баян", 0, "Аккордеон", 0, "Фортепиано",1);
		System.out.print(g4.getDescription4());
		System.out.print(g4.checkKeyboards());
		
		Brass g5=new Brass();
		g5.structure5();
		g5.init5("Барабаны",5,"Треугольники", 4,"Тарелки", 5, "Бубен", 3, "Там-там",0);
		System.out.print(g5.getDescription5());
		System.out.print(g5.checkBrass());*/
	}
}

package com;


public class Orchestra {
	
	protected static int num1;
	protected static int num2;
	protected static int num3;
	protected static int num4;
	protected static int num5;
	protected static int num6;
	protected static int num7;
	protected static int num8;
	protected static int num9;
	protected static int num10;
	protected static int num11;
	protected static int num12;
	protected static int num13;
	protected static int num14;
	protected static int num15;
	protected static int num16;
	protected static int num17;
	protected static int num18;
	protected static int num19;
	protected static int num20;
	protected static int num21;
	protected static int num22;
	protected static int num23;
	
	
	public static void main (String[]args){
		Strings g1=new Strings();
		g1.init1(num1, num2, num3, num4);
		g1.getDescription1();
		g1.checkStrings();
	/*	System.out.print(g1.getDescription1());
		System.out.print(g1.checkStrings());*/
	
		WoodWind g2=new WoodWind(); 
		g2.init2(num5, num6, num7, num8, num9);
		g2.getDescription2();
		g2.checkWoodWind();
		
		CopperWind g3=new CopperWind();
		g3.init3(num10, num11, num12, num13);
		g3.getDescription3();
		g3.checkCopperWind();
		
		Keyboards g4=new Keyboards();
		g4.init4(num14, num15, num16, num17, num18);
		g4.getDescription4();
		g4.checkKeyboards();
		
		Brass g5=new Brass();
		
		g5.init5(num19, num20, num21, num22, num23);
		g5.getDescription5();
		g5.checkBrass();
	}
}

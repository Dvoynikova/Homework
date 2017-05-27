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
		String s1= "Состав группы:"+"Скрипка"+"-"+num1+"шт, "+"Виолончель"+"-"+num2+"шт, "+"Альт"+"-"+num3+"шт, "+"Контрабас"+"-"+num4+"шт."+"\n";
		return s1;}
	public String checkStrings(){
		if(num1<6){
			return "В симфоническом оркестре должно быть больше 6 скрипок"+"\n";
		} else {
			if(num2 <4) {
				return "В симфоническом оркестре должно быть больше 4 виолончели"+"\n";
			}
			else{
				if(num3 <6) {
					return "В симфоническом оркестре должно быть больше 6 альтов"+"\n";
				}
				else{
					if(num4 <2) {
						return "В симфоническом оркестре должно быть больше 2 контрабаса"+"\n";
					}
					else{
						return "Струнная группа для симфонического оркестра собрана"+"\n";
						
					}
				}
			} 
			}
		
		
	}
}

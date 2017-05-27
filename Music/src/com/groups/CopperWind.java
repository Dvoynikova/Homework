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
		System.out.println("Медно-духовая группа");
		System.out.println("Возможный состав: труба, трамбон, туба, валторна");
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
		System.out.println("Медно-духовые загружены");
		
	}
	
	public String getDescription3(){
		return "Состав группы:"+inst1+"-"+num1+"шт, "+inst2+"-"+num2+"шт, "+inst3+"-"+num3+"шт, "+inst4+"-"+num4+"шт."+"\n";}

	public String checkCopperWind(){
		if((num1<2)|(num4<2)){
			return "В симфоническом оркестре должно быть минимум по 2 трубы и валторны"+"\n";
		} else {
				return "Струнная группа для симфонического оркестра собрана"+"\n";
				
			} 
			}
		
		
	}


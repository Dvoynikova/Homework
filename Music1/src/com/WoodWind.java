package com;

public class WoodWind {
	
	private int num5;
	private int num6;
	private int num7;
	private int num8;
	private int num9;
	
	
	
		
	public void init2(int num5,int num6,int num7,int num8,int num9){
		
		this.num5=num5;
		this.num6=num6;
		this.num7=num7;
		this.num8=num8;
		this.num9=num9;
				
	}
	
	public String getDescription2(){
		return "Состав группы:"+"Кларнет"+"-"+num5+"шт, "+"Гобой"+"-"+num6+"шт, "+"Флейта"+"-"+num7+"шт, "+"Фагот"+"-"+num8+"шт."+"Саксофон"+"-"+num9+"шт."+"\n";}

	public String checkWoodWind(){
		if((num5<2)| (num6 <2)| (num7 <2)| (num8 <2)){
			return "В симфоническом оркестре должно быть минимум по 2 кларнета, гобоя, флейты, фагота"+"\n";
		} else {
			if(num9>0){
				return "В симфонический оркестр саксофон не входит"+"\n";
			}
			else{
			return "Деревянно-духовая группа для симфонического оркестра собрана"+"\n";
				}
				}
			}
		
}

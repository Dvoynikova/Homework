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
		System.out.println("Ударные загружены");
		
	}
	
	public String getDescription5(){
		return "Состав группы:"+"Барабаны"+"-"+num19+"шт, "+"Треугольники"+"-"+num20+"шт, "+"Тарелки"+"-"+num21+"шт, "+"Бубен"+"-"+num22+"шт."+"Там-там"+"-"+num23+"шт."+"\n";}

	public String checkBrass(){
		if(num19<0){
			return "В симфоническом оркестре должен быть хотя бы 1 барабан"+"\n";
		} else {
				return "Ударная группа для симфонического оркестра собрана"+"\n";
				}
				
			}
		
}

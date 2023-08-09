package main;

import animaleszoo.Gorila;


public class GorilaTest  {
	public static void main(String[]args) {
  Gorila tito = new Gorila(0, 0, 0, 0, 0);{
 
  System.out.println("Este es Tito nuestro Gorila, le gusta jugar y comer bananas"); 
	  
	  
  System.out.println("```````````````````````````````````````"); 
  System.out.print("Nivel de vida de Tito el Gorila: ");
  tito.displayEnergia();
  System.out.println("```````````````````````````````````````"); 
}
  int i=1;
	while(i <= 3 ) {
		//System.out.println("Come banana: + "+ tito.getComerBananas());
		 tito.comerBananas();
  System.out.println("Come Banana: + " + tito.getComerBananas());
		i++;
	}
  System.out.println("````````````````````````````````````````"); 
  System.out.print("Nivel de vida:");
	 tito.displayEnergia();
  System.out.println("````````````````````````````````````````"); 
	
  
  int a=1;
   while(a<=4){
	   tito.arrojarPiedra();
	   System.out.println("Tito arrojo una piedra: " + tito.getArrojarPiedras());
	   a++;
   }
   
   System.out.println("````````````````````````````````````````"); 
   System.out.print("Nivel de vida:");
  tito.displayEnergia();
  System.out.println("````````````````````````````````````````"); 
	
  
  System.out.println("Tito se durmio: ZZZzzZzZZzZ +" + tito.getDormir());
	tito.dormir();
  
	System.out.println("````````````````````````````````````````"); 
  System.out.print("Nivel de vida:");
  tito.displayEnergia();
  System.out.println("````````````````````````````````````````"); 
	
  System.out.println("Tito desperto, es hora de jugar");
  System.out.println("Tito trepa un arbolito: "+ tito.getTreparArbol());
  tito.treparArbol();
  
  System.out.println("````````````````````````````````````````"); 
  System.out.print("Nivel de vida:");
  tito.displayEnergia();
  System.out.println("````````````````````````````````````````"); 
	
	}
}
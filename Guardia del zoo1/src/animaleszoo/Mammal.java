package animaleszoo;

public class Mammal {

	private int energiaTotal;
	 
	//constructor
	
	public Mammal(int i){
	this.energiaTotal = 100;
	}

//metodo
	
	public int displayEnergia() {
		System.out.println(energiaTotal);
		return energiaTotal;
	}

   public int getEnergiaTotal() {
	return energiaTotal;
	   
   }
public void setEnergiaTotal(int energiaTotal) {
	this.energiaTotal = energiaTotal;
}
}





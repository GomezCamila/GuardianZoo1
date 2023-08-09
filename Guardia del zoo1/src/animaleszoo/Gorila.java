package animaleszoo;

import tiendapack.Item;
import java.lang.Iterable;
import animaleszoo.Mammal;

@SuppressWarnings("unused")
public class Gorila extends Mammal{
	
	private int comerBananas=10;
	private int dormir= 45;
	private int arrojarPiedras = -15;
	private int treparArbol=-10;
	
	
	public Gorila(int i,int comerBananas, int dormir,int arrojarPiedras, int treparArbol) {
		super(i);
		// TODO Auto-generated constructor stub
	}

	public void arrojarPiedra() {
		this.getEnergiaTotal();
		this.setEnergiaTotal(this.getEnergiaTotal()-15);
	}
public void comerBananas() {
	this.getEnergiaTotal();
	this.setEnergiaTotal(getEnergiaTotal()+10);
}
 public void dormir() {
	 this.getEnergiaTotal();
	 this.setEnergiaTotal(getEnergiaTotal()+45);
 }
	public void treparArbol() {
		this.getEnergiaTotal();	
        this.setEnergiaTotal(getEnergiaTotal()-10);
	}


//getters y setters


public int getArrojarPiedras() {
return arrojarPiedras;
}

public void setArrojarPiedras(int arrojarPiedras) {
this.arrojarPiedras = arrojarPiedras;
}

public int getComerBananas() {
return comerBananas;
}

public void setComerBananas(int comerBananas) {
this.comerBananas = comerBananas;
}

public int getTreparArbol() {
return treparArbol;
}

public void setTreparArbol(int treparArbol) {
this.treparArbol = treparArbol;
}


public int getDormir() {
return dormir;
}
public void setDormir(int dormir) {
	this.dormir = dormir;
}

}

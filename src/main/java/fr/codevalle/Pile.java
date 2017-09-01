package fr.codevalle;

import java.util.ArrayList;

public class Pile {

	private int size;
	private ArrayList<Integer> pileInt = new ArrayList<Integer>();
	
	public Pile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pile(int size) {
		super();
		this.size = size;
	}

	public void push(int newItem) {
		pileInt.add(newItem);
	}
	
	public void pop() {
		pileInt.remove(pileInt.size()-1);
	}
	
	public void popAll() {
		pileInt.clear();
	}
	
	public int peek() {
		return pileInt.get((pileInt.size())-1);
	}

	public int getSize() {
		return pileInt.size();
	}

	public void setSize(int size) {
		this.size = size;
	}

	public ArrayList<Integer> getPileInt() {
		return pileInt;
	}

	public void setPileInt(ArrayList<Integer> pileInt) {
		this.pileInt = pileInt;
	}
	
	
}

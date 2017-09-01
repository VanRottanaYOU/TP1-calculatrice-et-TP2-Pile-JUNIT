package fr.codevalle;

import java.util.ArrayList;

public class PileObject<T> {

	private int size;
	private ArrayList<T> pileObject = new ArrayList<T>();
	
	public PileObject() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PileObject(int size) {
		super();
		this.size = size;
	}

	public void push(T newItem) {
		pileObject.add(newItem);
	}
	
	public void pop() {
		pileObject.remove(pileObject.size()-1);
	}
	
	public void popAll() {
		pileObject.clear();
	}
	
	public T peek() {
		return pileObject.get((pileObject.size())-1);
	}

	public int getSize() {
		return pileObject.size();
	}

	public void setSize(int size) {
		this.size = size;
	}

	public ArrayList<T> getPileObject() {
		return pileObject;
	}

	public void setPileObject(ArrayList<T> pileObject) {
		this.pileObject = pileObject;
	}
	
	
}

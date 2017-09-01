package fr.codevalle;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class PileTest {

	Pile maPile;
	
	@Before
	public void initialition() {
		maPile =new Pile();
	}
	
	@Test
	public void pushTest() {
		 maPile.push(1);
		 assertTrue(maPile.getPileInt().get((maPile.getPileInt().size())-1)==1);
//		 assertTrue(maPile.getPileInt().contains(1));
	}
	
	@Test
	public void popTest() {
		maPile.push(1);
		int sizeAvant=maPile.getSize();
		 maPile.pop();
		 assertTrue(maPile.getPileInt().size()==(sizeAvant-1));
	}
	
	@Test
	public void popAllTest() {
		maPile.push(1);
		 maPile.popAll();
		 assertTrue(maPile.getPileInt().size()==0);
	}
	
	@Test
	public void PeekTest() {
		 maPile.push(1);
		 maPile.push(2);
		 maPile.peek();
		 assertTrue(2==maPile.peek());
	}
	
}

package rec3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DataSetTest {

	@Test
	void testSize() {
		DataSet ds = new DataSet();
		ds.add(1.5);
		ds.add(2.0);
		assertEquals(2, ds.size());
	}

	@Test
	void testMax() {
		DataSet ds = new DataSet();
		ds.add(1.5);
		ds.add(2.0);
		ds.add(6.0);
		assertEquals(6.0, ds.max());
		
		ds = new DataSet();
		ds.add(-1.5);
		ds.add(-2.0);
		ds.add(-6.0);
		assertEquals(-1.5, ds.max());
	}

	@Test
	void testMin() {
		DataSet ds = new DataSet();
		ds.add(1.5);
		ds.add(2.0);
		ds.add(6.0);
		assertEquals(1.5, ds.min());
		
		ds = new DataSet();
		ds.add(-1.5);
		ds.add(-2.0);
		ds.add(-6.0);
		assertEquals(-6, ds.min());		
	}

	@Test
	void testMean() {
		DataSet ds = new DataSet();
		ds.add(1.5);
		ds.add(2.0);
		ds.add(6.0);
		assertEquals((1.5+2.0+6.0)/3, ds.mean());
	}

	@Test
	void testMedian() {
		DataSet ds = new DataSet();
		ds.add(1.5);
		ds.add(2.0);
		ds.add(6.0);
		assertEquals(2, ds.median());
	}

}

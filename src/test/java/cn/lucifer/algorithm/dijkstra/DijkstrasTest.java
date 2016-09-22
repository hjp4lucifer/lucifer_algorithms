package cn.lucifer.algorithm.dijkstra;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DijkstrasTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Graph g = new Graph();
		g.addVertex('A', Arrays.asList(new Vertex('B', 7), new Vertex('C', 8)));
		g.addVertex('B', Arrays.asList(new Vertex('A', 7), new Vertex('F', 2)));
		g.addVertex('C', Arrays.asList(new Vertex('A', 8), new Vertex('F', 6),
				new Vertex('G', 4)));
		g.addVertex('D', Arrays.asList(new Vertex('F', 8)));
		g.addVertex('E', Arrays.asList(new Vertex('H', 1)));
		g.addVertex('F', Arrays.asList(new Vertex('B', 2), new Vertex('C', 6),
				new Vertex('D', 8), new Vertex('G', 9), new Vertex('H', 3)));
		g.addVertex('G', Arrays.asList(new Vertex('C', 4), new Vertex('F', 9)));
		g.addVertex('H', Arrays.asList(new Vertex('E', 1), new Vertex('F', 3)));
		System.out.println(g.getShortestPath('E', 'A'));
	}

	@Test
	public void test2() {
		Graph g = new Graph();
		g.addVertex('A', Arrays.asList(new Vertex('B', 7), new Vertex('C', 1)));
		g.addVertex('B', Arrays.asList(new Vertex('A', 7), new Vertex('F', 1)));
		g.addVertex('C', Arrays.asList(new Vertex('A', 1), new Vertex('G', 8)));
		g.addVertex('F', Arrays.asList(new Vertex('B', 1), new Vertex('H', 2)));
		g.addVertex('G', Arrays.asList(new Vertex('C', 8), new Vertex('H', 2)));
		g.addVertex('H', Arrays.asList(new Vertex('G', 1), new Vertex('F', 3)));
		System.out.println(g.getShortestPath('A', 'H'));
	}
}

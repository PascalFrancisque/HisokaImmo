package com.edu.model;

import java.util.Iterator;

public class IteratorTable implements Iterator {
	
	String[] tab;
	int index; 
	private boolean[] visited;
	
	/*  DU DEBUT A LA FIN 
	public IteratorTable( String[] tab) {
			this.tab = tab;
			this.index = -1;
	}

	@Override
	public boolean hasNext() {
		return tab.length>index+1;
	}

	@Override
	public Object next() {
		index ++;
		return tab[index];
	}
	*/
	
	/* DE LA FIN AU DEBUT 
	public IteratorTable( String[] tab) {
		this.tab = tab;
		this.index = tab.length;
}

	@Override
	public boolean hasNext() {
		return index > 0;
	}
	
	@Override
	public Object next() {
		index --;
		return tab[index];
	}
	*/
	
	// ALEATOIRE 
	
	public IteratorTable( String[] tab) {
		this.tab = tab;
		this.visited = new boolean[tab.length];
}

	@Override
	public boolean hasNext() {
		int i = 0;
		do {
			if (!visited[i]) return true;
		} while (++i < visited.length);
		return false;
	}
	
	@Override
	public Object next() {
		int r = (int) (Math.random()*tab.length);
		while (visited[r])
			r = (int) (Math.random()*tab.length);
		visited[r] = true;
		return tab[r];
	}

}

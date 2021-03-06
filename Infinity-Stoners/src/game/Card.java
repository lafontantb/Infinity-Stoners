package game;

import java.io.Serializable;

/*
 * @author: Zhiheng Chang
 * @date: Dec/02/2018
 */


public class Card implements Comparable<Card> ,Serializable {

	private final String GRAPHIC;
	private final int PRIORITY;
	/**
	 * 
	 */
	public Card(String graphic, int priority) {
		this.GRAPHIC = graphic;
		this.PRIORITY = priority;
	}

	public String getGraphic() {
		return GRAPHIC;
	}
	public int getPriority() {
		return PRIORITY;
	}
	
	/*
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Card o) {
		if(this.PRIORITY > o.getPriority()) {
			return 1;
		}else if(this.PRIORITY < o.getPriority()) {
			return -1;
		}
		return 0 ;
	}
	
	@Override
	public String toString() {
		return GRAPHIC;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

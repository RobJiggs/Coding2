package coding3;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Random rand = new Random(); //instance of random class
	      int upperbound = 25;
	        //generate random values from 0-24
	      int int_ = rand.nextInt(upperbound); 
	      System.out.println(int_);

	}

}

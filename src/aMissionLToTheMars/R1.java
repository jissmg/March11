package aMissionLToTheMars;

import java.util.Random;

public class R1 extends Rocket {

	public R1() {
		//super(100, 10000, 18000);
		cost = 100;
        weight = 10000;
        maxWeight = 18000;
        currentWeight = weight;
	}



	@Override
	public boolean launch() {
		// TODO Auto-generated method stub
		double chanceOfExplosion = 0.05 * ((double) (currentWeight - weight) / (maxWeight - weight));
		boolean explosion=new Random().nextDouble() > chanceOfExplosion;
		return explosion;
		
	}

	@Override
	public boolean landing() {
		// TODO Auto-generated method stub
		double chanceOfCrash = 0.01 * ((double) (currentWeight - weight) / (maxWeight - weight));
		boolean crash=new Random().nextDouble() > chanceOfCrash;
		return crash;
		
	}

}

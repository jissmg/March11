package aMissionLToTheMars;

import java.util.Random;

public class R2 extends Rocket {

	public R2() {
		//super(120, 18000, 29000);
		cost = 120;
        weight = 18000;
        maxWeight = 29000;
        currentWeight = weight;
		
	}

	@Override
	public boolean launch() {
		// TODO Auto-generated method stub
		double chanceOfExplosion = 0.04 * ((double) (currentWeight - weight) / (maxWeight - weight));
		boolean explosion=new Random().nextDouble() > chanceOfExplosion;
		return explosion;
	}

	@Override
	public boolean landing() {
		// TODO Auto-generated method stub
		double chanceOfCrash = 0.08 * ((double) (currentWeight - weight) / (maxWeight - weight));
		boolean crash=new Random().nextDouble() > chanceOfCrash;
		return crash;
		
	}

}

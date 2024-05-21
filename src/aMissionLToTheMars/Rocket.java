package aMissionLToTheMars;

public class Rocket implements SpaceShip{
	protected int cost;
    protected int weight;
    protected int maxWeight;
    protected int currentWeight;
//    
//	public Rocket(int cost, int weight, int maxWeight) {
//		super();
//		this.setCost(cost);
//		this.setWeight(weight);
//		this.maxWeight = maxWeight;
//		this.currentWeight = currentWeight;
//	}

	@Override
	public boolean launch() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean landing() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean canCarry(Item item) {
		// TODO Auto-generated method stub
		return currentWeight + item.weight <= maxWeight;
	}

	@Override
	public void carry(Item item) {
		// TODO Auto-generated method stub
		currentWeight += item.weight;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
}

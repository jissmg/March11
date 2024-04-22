package constructorInJava;

public class Banquet {
	double baseBookingCost;
    double foodCost;
    double beverageCost;
    double taxOnFood;
    double taxOnBeverage;
    double tip;

    // Constructor
    public Banquet(double baseBookingCost, double foodCost, double beverageCost, double taxOnFood, double taxOnBeverage, double tip) {
        this.baseBookingCost = baseBookingCost;
        this.foodCost = foodCost;
        this.beverageCost = beverageCost;
        this.taxOnFood = taxOnFood;
        this.taxOnBeverage = taxOnBeverage;
        this.tip = tip;
    }

    // Method to calculate base cost
    public double calculateBaseCost(double baseCost, double foodCost, double beverageCost, double tip) {
        return baseCost + foodCost + beverageCost + tip;
    }

    // Method to calculate tax
    public double calculateTax(double baseCost) {
        double taxRate = 0.1; // 10% tax
        return baseCost * taxRate;
    }

    // Method to calculate cess tax
    public double calculateCess(int numberOfGuests, double baseCost) {
        double cessRate;
        if (numberOfGuests <= 40) {
            cessRate = 0.04; // 4%
        } else if (numberOfGuests <= 80) {
            cessRate = 0.08; // 8%
        } else if (numberOfGuests < 150) {
            cessRate = 0.1; // 10%
        } else {
            cessRate = 0.125; // 12.5%
        }
        return baseCost * cessRate;
    }

    // Method to calculate total cost
    public double calculateTheTotalCost(double baseCost, double tax, double cess) {
        return baseCost + tax + cess;
    }
}

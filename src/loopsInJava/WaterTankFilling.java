package loopsInJava;

public class WaterTankFilling {
	void WaterTankFillingUsingBucket() {
		for (int i = 10; i <= 100; i = i + 10) {
			System.out.println("Tank is filled " + i + " Litters of water");

		}
		System.out.println("Tank is filled, Stop filling to avoid the overflow");
	}

}

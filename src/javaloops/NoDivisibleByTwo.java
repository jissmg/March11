package javaloops;

public class NoDivisibleByTwo {
	int i;
	int [] listofnumbers= {1,2,3,4,5,6,7,8,9,10};
	public void findDivisibleBytwo() {
	for(i=1;i<=10;i++) {
		if(i%2==0) {
			System.out.println(+i);
		}
	}
}
}
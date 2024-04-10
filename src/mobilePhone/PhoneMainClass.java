package mobilePhone;

public class PhoneMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("My Phone");
		MobilePhoneClass mp= new MobilePhoneClass();
		mp.makeCalls();
		String phonecolour=mp.colour;
		System.out.println(phonecolour);
		//float cameraConfiguration=mp.cameraCongiguration;

	}

}

package ontarioLicence;

public class LicenceMain {
	public static void main(String[] args) {
		//String G,G1,G2;
		System.out.println("Welcome to Ontario Diriving license authority!!! ");
		OntarioLicence on = new OntarioLicence();
		on.checkAgeIsOk();
		on.checkTheLevelOfLicence();
		
		
	}

}

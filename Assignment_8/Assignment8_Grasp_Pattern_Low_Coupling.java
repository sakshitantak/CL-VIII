public class User{
	String userType;
	String name;
	String gender;
	String email;
	long int mobile;
	String Username;
	String password;
	
	public Integer signup() { 
		// code to signup. returns 1 on successful, 0 on unsuccessful return 0; 
	}
	public Integer login() { 
		// code to login. returns 1 on successful, 0 on unsuccessful return 0; 
	}
	public void createTeam(user) {
		// To create team
	}

}

public class Address extends User{
	String StreetName;
	String area;
	String city;
	int zipcode;
	
    public void createAddress() {
		// To add address
	}
	public void updateAddress() {
		// To update address
	}
}


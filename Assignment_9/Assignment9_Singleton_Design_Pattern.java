public class Administrator
{
	priavate static Administrator instance = null;
	
	private String name;
	private String gender;
	private String contactno;
	private String email;
	private String username;
	private char[] password;
	
	private Administrator() {
		public static Administrator getInstance() {
			if(instance == null) {
				instance = new FactoryManager();
			}
			return instance;
		}
		
		public void addManager() {
			//Code
		}
		
		public void addVolunteer() {
			//Code
		}
		
		public void addEvents() {
			//Code
		}
		
		public bool checkParticipantDetails() {
			//Code
		}
		
		public bool checkPayments() {
			//Code
		}
		
		//Getter and Setter methods
		public String getname() { return name;
		}
		
		public String getgender() { return gender;
		}
		
		public String getcontact() { return contactno;
		}
		
		public String getemail() { return email;
		}
		
		public void setname(String name) {
			this.name = name;
		}
		
		public void setcontact(String contactno) {
			this.contactno = contactno;
		}
		
		public void setemail(String email) {
			this.email = email;
		} 
		
		public void setpassword(char[] pwd) {
			password = Array.cpoyOf(pwd,pwd.length);
		}
	}
}

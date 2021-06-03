public abstract class User
{
	private String name;
	private String gender;
	private String contactno;
	private String email;
	private String username;
	private char[] password;
	
	public void register() {
		//Code
	}
	
	public void login() {
		//Code
	}
}

public class Participant extends User 
{
	@Override
	public void bookSlot() {
		selectEvent();
		selectTeam();
		selectPayment();
	}
}

public class Volunteer extends User 
{
	@Override
	public void bookSlot() {
		checkParticipantDetails();
		checkTeamDetails();
		updatePayment();
		updateWinner();
	}
}

public class Manager extends User 
{
	@Override
	public void bookSlot() {
		addVolunteer();
		checkParticipantDetails();
		checkTeamDetails();
		checkPayment();
		checkWinner();
	}
}

public class UserSelectFactory
{
	public User createUser(String type)
	{
		if(type == null)
			return null;
		else if(type == "Participant")
			return new Participant();
		else if(type == "Volunteer")
			return new Volunteer();
		else if(type == "Manager")
			return new Manager;
		else return null;		
	}
}

public class UserFactory()
{
	public static void min(String[] args)
	{
		UserSelectFactory userselect = new UserSelectFactory();
		
		String type;
		
		System.out.println("Enter the type of user : ");
		
		Scanner sc = new Scanner(System.in);
		type = sc.next();
		
		User user = userselect.createUser(type);
	}
}

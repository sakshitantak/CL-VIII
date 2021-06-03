//DESIGN MODEL FOR EVENT REGISTRATION SYSTEM

public class Administrator
{	
	private String name;
	private String gender;
	private String contactno;
	private String email;
	private String username;
	private char[] password;
	
	private Administrator() {

		Administrator(String name, String gender, String contactno, String email, 
						String username, char[] password);
		public void addManager(Integer userId, Integer eventId);
		public void addVolunteer(Integer userId, Integer eventId);;
		public void addEvents(Integer eventId);
		public bool checkParticipantDetails(Integer userId);
        	public bool checkTeamDetails(User users[], Int teamId);
		public bool checkPayment(paymentHandler);
        	public bool checkWinner(Integer userId, Integer eventId);
	}
}

public abstract class User
{
	protected String name;
	protected String gender;
	protected String contactno;
	protected String email;
	protected String username;
	private char[] password;
	
	User(String name, String gender, String contactno, String email, 
		String username, char[] password);
	public void register(Integer userId, String Category, String name, 
				String username, String password);
	public void login(Integer ManagerId, String eventName, String username, 
				String password);
}

public class Event{
    Integer eventid;
    String eventName;
    String organizingDept;
    Integer managerID;
    Integer partcipationAmount;
    String eventType;
    Date startDate;
    Date endDate;
    
    Event(int eventid,String eventName,String organizingDept,
			int partcipationAmount,String eventType;
    Date startDate,Date endDate);
}

public class Participant extends User 
{
	public Integer userId;
	public String Category;
	
	Participant(Integer userId, String Category, String name, String gender, 
				String contactno, String email, String username, char[] password) {}
	@Override
	public void register(Integer userId, String Category, String name, 
				String username, String password);
	@Override
	public void login(Integer ManagerId, String eventName, String username, 
				String password);

	public void selectEvent(String eventName);
        public void selectTeam(String teamName);
}

public class Volunteer extends User 
{
	public Integer volunteerId;
	public String eventName;

	Volunteer(Integer volunteerId, String eventName, String name, String gender, 
				String contactno, String email, String username, char[] password) {}
	@Override
	public void register(Integer volunteerId, String eventName, String name, 
				String username, String password);
	@Override
	public void login(Integer volunteerId, String eventName, String username, 
				String password);
	public bool checkParticipantDetails(Integer userId);
        public bool checkTeamDetails(User users[], Int teamId);
	public bool updatePayment(paymentHandler);
        public bool updateWinner(Integer userId, Integer eventId);
}

public class Manager extends User 
{
	public Integer ManagerId;
	public String eventName;

	Manager(Integer managerId, String eventName, String name, String gender, 
				String contactno, String email, String username, char[] password);
	@Override
	public void register(Integer ManagerId, String eventName, String name, 
				String username, String password);
	@Override
	public void login(Integer ManagerId, String eventName, String username, 
				String password);
	public void addVolunteer(Integer eventId, Integer userId);
	public bool checkParticipantDetails(Integer userId);
        public bool checkTeamDetails(User users[], Int teamId);
	public bool checkPayment(paymentHandler);
        public bool checkWinner(Integer userId, Integer eventId);
}

public class Registration
{
	public Integer RegId;
	public Integer UserId;
	public Integer EventId;
	public Date regDate;

	Registration(Integer RegId, Integer UserId, Integer EventId, Date regDate);
}

public class Team
{
	public Integer teamId;
	public Integer eventId;
	public Integer noOfMembers;

	Team(Integer teamId, Integer eventId, Integer noOfMembers);
	public void createTeam(String teamName);
	public void selectTeam(String teamName);
}

public class Address extends User{
	public String StreetName;
	public String area;
	public String city;
	public Inetger zipcode;
	
    	public void createAddress(String username);
	public void updateAddress(String username);
}

public class Payment {
	public Integer paymentId;
	public String paymentType;
	public String paymentDescription;
	public Date paymentDate;

	public void addPayment(Integer participantId) {}
	public void editPayment(Integer participantId) {}
	public void selectPaymentMethod(paymentHandler) {}
}
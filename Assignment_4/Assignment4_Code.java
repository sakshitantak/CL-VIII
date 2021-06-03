//ANALYSIS MODEL FOR EVENT REGISTRATION SYSTEM

public class Administrator
{	
	private String name;
	private String gender;
	private String contactno;
	private String email;
	private String username;
	private char[] password;
	
	private Administrator() {

		Administrator(...);
		public void addManager(...);
		public void addVolunteer(...);
		public void addEvents(...);
		public bool checkParticipantDetails(...);
		public bool checkTeamDetails(...);
		public bool checkPayments(...);
		public bool checkWinner(...);
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
	
	User(...);
	public void register(...);
	public void login(...);
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
    
    Event(...);
}

public class Participant extends User 
{
	public Integer userId;
	public String Category;
	
	Participant(...);
	@Override
	public void register(...);
	@Override
	public void login(...);
	public void selectEvent(...);
        public void selectTeam(...);
        public void selectPayment(...);
}

public class Volunteer extends User 
{
	public Integer volunteerId;
	public String eventName;

	Volunteer(...);
	@Override
	public void register(...);
	@Override
	public void login(...);
	public bool checkParticipantDetails(...);
	public bool checkTeamDetails(...);
	public void updatePayment(...);
	public void updateWinner((...);
}

public class Manager extends User 
{
	public Integer ManagerId;
	public String eventName;

	Manager(...);
	@Override
	public void register(...);
	@Override
	public void login(...);
	public void addVolunteer(...);
	public bool checkParticipantDetails(...);
        public bool checkTeamDetails(...);
	public bool checkPayment(...);
        public bool checkWinner(...);
}

public class Registration
{
	public Integer RegId;
	public Integer UserId;
	public Integer EventId;
	public Date regDate;

	Registration(...);
}

public class Team
{
	public Integer teamId;
	public Integer eventId;
	public Integer noOfMembers;

	Team(...);
	public void select Team(...);
}

public class Event{
    int eventid;
    String eventName;
    String organizingDept;
    int managerID;
    int partcipationAmount;
    String eventType;
    Date startDate;
    Date endDate;
    
    Event(int eventid,String eventName,String organizingDept,int partcipationAmount,String eventType;
    Date startDate,Date endDate){
        this.eventid = eventid;
        this.eventName = eventName;
        this.organizingDept = organizingDept;
        this.partcipationAmount = partcipationAmount;
        this.eventType = eventType;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}

public class Admin{
    int Admin_id;
    
    public void createEvent() { 
		// code to crete event
	}
	public void addManager() { 
		// code to add manager in the system
	}
	public void addVolunteer() { 
		// code to add volunteer in the system
	}
	public void checkParticipant() { 
		// code to check check Participant
	}
	public void checkTeamDetails() { 
		// code to check Team Details
	}
	public void checkPayment() { 
		// code to check Payment made by Participant
	}
	public void checkWinner() { 
		// code to check winner
	}
    
}

public abstact class Event {
	Integer id;
	String eventName;
	Integer participationAmount;
	Date startDate;
	Date endDate;
}

public class technicalEvent extends Event {
	String eventType = "technical";
}

public class nonTechnicalEvent extends Event {
	String eventType = "nonTechnical";
}

public class Template 
{
	public Event registerEvent(char eventType)
	{
		Event event = null;
		switch(eventType)
		{
			case 'A':
				event = new technicalEvent();
				break;
				
			case 'B':
				event = new nonTechnicalEvent();
				break;
			
			default:
				break;
		}
		return event;
	}
}

public class Controller
{
	public static void main(String[] args)
	{
		Template template = new Template();
		Event event1 = new Event('A');
		Event event2 = new Event('B');
	}
}

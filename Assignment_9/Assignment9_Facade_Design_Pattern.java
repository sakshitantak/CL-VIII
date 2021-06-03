public class Slot {
    public Integer slotNo;
    public String eventName;
    public Slot(){}
    public Slot(int slotNo){
        this.slotNo=slotNo;
    }
}

public class AvailabilityService {
    public static boolean isAvailable(Slot slot){
        /*Check database for slot availability*/
        return true;
    }
}

public class BookingService {
    public static void bookEventSlot(Slot slot){
         /*Update slot counter for event */
    }
}


public class PaymentService {
    public static boolean makePayment(){
        /*Connect with payment gateway for payment*/
        return true;
    }
}

public interface SlotBookingServiceFacade {
    boolean slotBook(int slotNo);
}


public class SlotBookingServiceFacadeImpl implements SlotBookingServiceFacade{
    public boolean slotBook(int sno){
        boolean slotBooked=false;
        Slot slot=new Slot();
        slot.slotNo=sno;
        if(AvailabilityService.isAvailable(slot))
        {
            System.out.println("Slot "+ slot.slotNo+" is available for "+ slot.eventName "event");
            boolean paymentConfirmed= PaymentService.makePayment();
            if(paymentConfirmed){
                System.out.println("Payment confirmed...");
                BookingService.bookEventSlot(slot);
                System.out.println("Slot Booked...");
                slotBooked=true;
            }
        }
        return slotBooked;
    }
}


public class SlotBookingController {
    SlotBookingServiceFacade facade;
    boolean slotBooked=false;
    public void slot_book(int slotNo) {
        slotBooked=facade.slotBook(slotNo);
        System.out.println("SlotBookingController: Slot Booking for event completed. ");
    }
}

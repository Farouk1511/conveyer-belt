public class Main {
    public static void main(String[] args) {

        Baggage bag1 = new Baggage(1234, 12.4f, 168, false);
        Baggage bag2 = new Baggage(987, 18.3f, 280, true);
        Baggage bag3 = new Baggage(1234, 19.3f, 146, false);
        Baggage bag4 = new Baggage(567, 8.2f, 74, false);

        ConveyorBelt cb = new ConveyorBelt();

        cb.printSummary();
        cb.checkBag(bag1);
        cb.checkBag(bag2);
        cb.checkBag(bag3);
        cb.checkBag(bag4);
        
        cb.printDetails();
        
        cb.loadFlight(1234);
        cb.printSummary();

        cb.loadFlight(987);
        cb.loadFlight(567);

        
        cb.printDetails();

        cb.checkBag(new Baggage(800, 13.5f, 192, true));
        cb.checkBag(new Baggage(1010, 12.8f, 258, true));
        cb.checkBag(new Baggage(1010, 13.7f, 242, false));
        cb.checkBag(new Baggage(800, 9.7f, 159, false));
        cb.checkBag(new Baggage(1010, 8.7f, 147, true));
        cb.checkBag(new Baggage(1010, 13.7f, 172, false));
        cb.checkBag(new Baggage(800, 9.4f, 129, false));
       

       

        cb.printSummary();
        cb.removeOverSize(200);
        cb.printSummary();
        

    }
}

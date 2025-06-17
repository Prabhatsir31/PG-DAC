public class Client
{
public static void main(String[] args)
{
TravelFacade facade = new TravelFacade(); 
facade.getFlightsAndHotels(from, to);
}
}

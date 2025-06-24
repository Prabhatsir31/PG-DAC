public class TravelFacade
{
private HotelBooker hotelBooker;
private FlightBooker flightBooker; 
public void getFlightsAndHotels(Date from, Data to)
{
List<Flight> flights = flightBooker.getFlightsFor(from, to);
List<Hotel> hotels = hotelBooker.getHotelsFor(from, to);
// display both the lists i.e. flights and hotels
}
}

package com.springdemo.EzeeTransport;

public class TransportService {

	private Vehicle vehicle;
	private ArrayList<Booking> bookings=new ArrayList<Booking>();

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public void registerBooking(Booking booking)
	{
		bookings.add(booking);
	}
	public void calculateTravelCost(String source,String destination,String doj)
	{
		if(checkAvailableDateForTravel(doj))
			System.out.println("Total travel cost is "+getCost(destination));
	}
	public boolean checkAvailableDateForTravel(String doj)
	{
		for(Booking b:bookings)
		{
			if(doj.equals(b.getDateOfJourney()))
				return false;
		}
		return true;
	}
	public double getCost(String destination)
	{
		return vehicle.getDesMap().get(destination);
	}
}

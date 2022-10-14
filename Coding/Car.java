package CodingP;

public class Car extends Vehicle {
	public Car(String licPlate, String companyName) {
		slotsNeeded =1;
		siz=VSize.CarSize;
		this.licPlate=licPlate;
		this.companyName = companyName;
	}
	public boolean canFitInSlot(ParkingSlot spot) {
		return spot.getSize()=VSize.CarSize;
	}

}

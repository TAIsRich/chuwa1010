package ParkingLot;

public class ParkingSlot {
	private Vehicle vh;  
	private VSize siz;  
	private int lane;  
	private int slotNumber;  
	private Lvl l;  
	  
	// constructor of the class  
	public ParkingSlot(Lvl lvl, int r, int num, VSize vs)   
	{  
	l = lvl;  
	lane = r;  
	slotNumber = num;  
	siz = vs;  
	}  
	  
	  
	public boolean isAvailable()   
	{  
	return vh == null;  
	}  
	  
	public boolean canFitVehicle(Vehicle vh)   
	{  
	//check if the spot is big enough and is available  
	return isAvailable() && vh.canFitInSlot(this);  
	}  
	  
	public boolean park(Vehicle vObj)   
	{  
	if (!canFitVehicle(vObj))  
	{  
	return false;  
	}  
	  
	vh = vObj;  
	vh.parkInSlot(this);  
	return true;  
	}  
	  
	// get method for lane  
	public int getLane()   
	{  
	return lane;  
	}  
	  
	// get method for slot number  
	public int getSlotNumber()   
	{  
	return slotNumber;  
	}  
	  
	// get method for getting the Size  
	public VSize getSize()   
	{  
	return siz;  
	}  
	  
	// method for removing the vehicle from the parking lot  
	public void removeVehicle()   
	{  
	l.slotFreed();  
	vh = null;  
	}  
}

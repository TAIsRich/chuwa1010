package ParkingLot;

public class ParkingLot{
    private Level[] levels;

    public ParkingLot(int numLevels, int numSpotsPerLevel) {
        levels = new level[numLevels];
        for (int i = 0; i < numsLevels; i++) {
            levels[i] = new Level(numSpotsPerLevel);
        }
    }

    //given a vehicle, tell me whether I can park it?
    public boolean hasSpot(Vehicle V) {
        //to do: chech each level, for each level, call Level#hasSpot(Vehicle v)
        for (level l : levels) {
            if (l.hasSpot(v)) {
                return true;
            }
        }
        return false;
    }

    public boolean park(Vehicle v) {
        for (level l : levels) {
            if(l.park(v)) {
                return true;
            }
        }
        return false;
    }

    public boolean leave(Vehicle v) {
        for (level l : levels) {
            if (l.leave(v)) {
                return true;
            }
            return false;
        }
    }
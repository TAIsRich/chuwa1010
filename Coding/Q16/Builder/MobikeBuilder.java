package Pattern.Builder.SimpleBulder;

class MobikeBuilder extends Builder {
    @Override
    public void buildFrame() {
        mBike.setFrame("Frame");
    }

    @Override
    public void buildSeat() {
        mBike.setSeat("Seat");
    }

    @Override
    public Bike createBike() {
        return mBike;
    }
}

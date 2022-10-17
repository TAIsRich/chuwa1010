package Pattern.Builder.SimpleBulder;

class OfoBuilder extends Builder {
    @Override
    public void buildFrame() {
        mBike.setSeat("Frame2");
    }

    @Override
    public void buildSeat() {
        mBike.setSeat("Seat2");
    }

    @Override
    public Bike createBike() {
        return mBike;
    }
}

public abstract class ProductAbstraction {
    private String type;
    private int sequence;


    public ProductAbstraction(){}

    public ProductAbstraction(String type, int sequence) {
        this.type = type;
        this.sequence = sequence;
    }

    public abstract void printOutParameter();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }
}

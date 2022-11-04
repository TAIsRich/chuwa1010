public class ProductOne extends ProductAbstraction{

    private Double weight;

    public ProductOne(){}

    public ProductOne(double weight){
        super("One", 1);
        this.weight = weight;
    }

    @Override
    public void printOutParameter() {
        System.out.println("This is product one with weight "+Double.toString(weight)+" g.");
    }
}

import java.math.BigDecimal;

public class ProductTwo extends ProductAbstraction{
    Float volume;
    public ProductTwo(){}

    public ProductTwo(float volume){
        super("Two", 2);
        this.volume = volume;
    }

    @Override
    public void printOutParameter() {
        System.out.println("This is product two with volume "+Float.toString(volume) + " cm^2.");
    }
}

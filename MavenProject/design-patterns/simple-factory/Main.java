import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        SimpleFactory factory = new SimpleFactory();
        List<ProductAbstraction> productOnes =
                new Random().doubles(5, 0,100)
                            .mapToObj(x ->factory.makeProduct(1, x))
                            .collect(Collectors.toList());
        List<ProductAbstraction> productTwos =
                new Random().doubles(5, 0,100)
                            .mapToObj(x -> ((Double)x).floatValue())
                            .map(x ->factory.makeProduct(2, x))
                            .collect(Collectors.toList());
        Arrays.stream(new List[] {productOnes, productTwos})
                .flatMap(List::stream)
                .forEach(product -> ((ProductAbstraction)product).printOutParameter());
    }
}

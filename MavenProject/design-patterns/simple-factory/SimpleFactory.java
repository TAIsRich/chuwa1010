public class SimpleFactory {
    public SimpleFactory(){};

    public <T extends Number> ProductAbstraction makeProduct(int sequence, T t){
        try {
            if (sequence == 1) {
                return new ProductOne((Double) t);
            } else if (sequence == 2) {
                return new ProductTwo((Float) t);
            } else {
                throw new RuntimeException("Product not defined.");
            }
        }catch(ClassCastException e){
            throw new RuntimeException("Wrong type of parameter.");
        }
    }
}

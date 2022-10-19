package java8_features.lambda;

public class ProcessorImpl implements Processor{
    @Override
    public String process(Callable<String> c) throws Exception {
        return "Callable";
    }

    @Override
    public String process(Supplier<String> s) {
        return "Supplier";
    }
}

package threadPractice.create;

import java.util.concurrent.Callable;

public class CallableExamp implements Callable {
    @Override
    public Object call() throws Exception {
        Thread.sleep(5000);
        return "Callable Thread Example";
    }
}

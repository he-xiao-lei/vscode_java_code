package MultipleThread;

import java.util.Map;
import java.util.concurrent.Callable;

public class MyCallable implements Callable<Map<String,String>> {

    @Override
    public Map<String, String> call() throws Exception {
           return System.getenv();
    }
}

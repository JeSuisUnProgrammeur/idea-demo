import static java.lang.Class.forName;

public class ComputeFactory {

    public static Computable getCompute(String symbol) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        return (Computable) forName(symbol).newInstance();
    }
}

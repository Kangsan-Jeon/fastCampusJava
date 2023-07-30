package Chapter6.src.ch09;

public class AutoCloseableObj implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("closing...");
    }
}

import java.io.IOException;

interface HandleActions {
    public abstract void doAction();

    public abstract int trueFalse() throws IOException;
}
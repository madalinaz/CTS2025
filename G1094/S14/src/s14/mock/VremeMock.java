package s14.mock;

public class VremeMock implements AbstractVreme{
    private boolean suntPrecipitatii;

    public VremeMock(boolean suntPrecipitatii) {
        this.suntPrecipitatii = suntPrecipitatii;
    }

    @Override
    public boolean suntPrecipitatii() {
        return this.suntPrecipitatii;
    }
}

import frame.RumahViewFrame;
import helpers.Koneksi;

public class Main {
    public static void main(String[] args) {
        Koneksi.getConnection();
        RumahViewFrame viewFrame = new RumahViewFrame();
        viewFrame.setVisible(true);
    }
}

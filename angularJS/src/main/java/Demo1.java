import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        Socket sc = new Socket("127.0.0.1", 9999);
        PrintStream ps = new PrintStream(sc.getOutputStream());
        ps.print("服务器你好");
    }
}

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(9999);
        Socket so = ss.accept();
        InputStream is = so.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String line = null;
        while ((line = br.readLine()) != null){
            System.out.println(line);
        }
    }


}

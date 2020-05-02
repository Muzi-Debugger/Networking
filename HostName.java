package networking;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;
/**
 * @author Muzi Mzolo
 */

public class HostName {

    public static void main(String[] args) throws UnknownHostException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        input.lines().forEach((line) -> {
            try {
                InetAddress address = InetAddress.getByName(line);
                System.out.println(address.getHostAddress());
            } catch (UnknownHostException e) {
                System.out.println("Unknown host");
            }
        });
    }
}
// This application reads the fully qualified domain names from the standard inputs and writes the IP
// address to the standard output. To read the input it uses that buffer the reader reaping an input
// stream reader that is capable of reading a single line from the time on a console. The for each 
// process input line by line. Type a qualified domain name i.e. www.Google.com to retrieve the address

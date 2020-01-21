import java.io.IOException;
import java.net.ServerSocket;
import java.util.stream.Stream;

public class test {
ServerSocket server = new ServerSocket(8080);
public test() throws IOException {
	Double[] list = {1d,2d,3d};
	Stream<Double> dubstream = Stream.of(list);
	dubstream.forEach((e)->System.out.println(Math.sqrt(e)));
}
}

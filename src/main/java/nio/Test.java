package nio;

import java.io.IOException;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;

public class Test {
    public static void main(String[] args) throws IOException {
       NioServer nioServer=new NioServer(8000);
       nioServer.run();
    }
}

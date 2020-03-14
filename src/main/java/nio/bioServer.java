package nio;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 传统Bio
 */
public class bioServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(10101);
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        System.out.println("服务器启动");
        while (true) {
            final Socket socket = server.accept();
            System.out.println("来一个新客户端");
            //新客户端创建新线程
            newCachedThreadPool.execute(() -> {
                //读数据
                handler(socket);
            });

        }
    }

    private static void handler(Socket socket) {
        try {
            byte[] bytes = new byte[1024];
            InputStream inputStream;
            inputStream = socket.getInputStream();
            while (true) {
                int read = inputStream.read(bytes);
                if (read != -1) {
                    System.out.println(new String(bytes, 0, read));
                } else {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

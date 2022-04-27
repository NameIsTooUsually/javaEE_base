package tcpSocket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //创建一个服务器的接收流
        ServerSocket serverSocket = new ServerSocket(10088);
        //获取socket对象
        Socket socket = serverSocket.accept();
        //获取输入流
        BufferedInputStream is = new BufferedInputStream(socket.getInputStream());
        //写入到本体文件中
            //获取创建本地的输出流
        FileOutputStream fos = new FileOutputStream("C:\\Develop\\project\\AdvanceCode\\study-Test\\Server\\aaa.jpg");
        //开始写入
        int len;
        byte[] bytes = new byte[1024];
        while((len = is.read(bytes))!=-1){
            fos.write(bytes);
        }
        //上传成功，告诉客户端上传成功
        //获取输出流
        BufferedWriter os= new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        os.write("长传成功");
        os.newLine();
        os.flush();
        //关闭资源

        fos.close();
        socket.close();
        serverSocket.close();
    }
}

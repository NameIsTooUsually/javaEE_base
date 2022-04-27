package tcpSocket;

import java.io.*;
import java.net.Socket;

//客户端上传文件
public class ClientDemo {
    public static void main(String[] args) throws Exception {
        //创建一个tcp传输对象
        Socket socket = new Socket("127.0.0.1",10088);
        //上传文件，获取一个输出流
        OutputStream os = socket.getOutputStream();

        //读取一个本地文件
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Develop\\project\\AdvanceCode\\study-Test\\Client\\123.jpg"));
        int len;
        byte[] bytes = new byte[1024];
        while((len=bis.read(bytes))!=-1){
            os.write(bytes,0,len);
        }
        //关闭输出流
        socket.shutdownOutput();

        //获取输入流
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String s;
        while((s=br.readLine())!=null){
            System.out.println(s);
        }
        //关闭资源
        br.close();
        bis.close();
        socket.close();
    }
}

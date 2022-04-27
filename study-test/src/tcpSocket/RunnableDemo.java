package tcpSocket;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class RunnableDemo implements Runnable {
    private Socket socket;

    public RunnableDemo(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {

        FileOutputStream fos = null;
        try {
            //获取一个输入流，并转换成缓冲流；
            BufferedInputStream is = new BufferedInputStream(socket.getInputStream());
            //写入到本体文件中
            //1、创建本地的输出流
            fos = new FileOutputStream("C:\\Develop\\project\\AdvanceCode\\study-Test\\Server\\"+ UUID.randomUUID().toString()+".jpg");
            //开始写入
            int len;
            byte[] bytes = new byte[1024];
            //从网络流中获取数据，并写入到本地中
            while((len = is.read(bytes))!=-1){
                fos.write(bytes,0,len);
            }

            //上传成功，告诉客户端上传成功"
            //获取输出流
            BufferedWriter os= new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            os.write("上传传成功");
            os.newLine();
            os.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            //关闭资源
            if(null!=fos){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
           if(null!=socket){
               try {
                   socket.close();
               } catch (IOException e) {
                   e.printStackTrace();
               }
           }
        }
    }
}

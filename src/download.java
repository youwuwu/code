import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
@WebServlet("/download")
public class download extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        OutputStream out; //输出响应正文的输出流
        InputStream in;  //读取本地文件的输入流
        //获得filename请求参数
        String filename=request.getParameter("filename");
        if(filename==null){
            out=response.getOutputStream();
            out.write("Please input filename.".getBytes());
            out.close();
            return;
        }

        //创建读取本地文件的输入流.getResourceAsStream("D:/data/Java/access/text/text.txt");
        in= getServletContext().getResourceAsStream("/text.txt");
        int length=in.available();
        response.setContentType("application/force-download");
        response.setHeader("Content-Length",String.valueOf(length));
        response.setHeader("Content-Disposition", "attachment;filename=\""+filename +"\" ");

        /** 把本地文件中的数据发送给客户 */
        out=response.getOutputStream();
        int bytesRead = 0;
        byte[] buffer = new byte[512];
        while ((bytesRead = in.read(buffer)) != -1){
            out.write(buffer, 0, bytesRead);
        }
        in.close();
        out.close();
    }
}

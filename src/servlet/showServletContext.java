package servlet;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
@WebServlet("/showServletContext")
public class showServletContext extends HttpServlet {

    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=utf-8");
        ServletContext context = getServletContext();
        PrintWriter out = resp.getWriter();
        Enumeration<String> names = context.getAttributeNames();
        String name;
        while (names.hasMoreElements()){
            name = names.nextElement();
            out.println(name+": "+context.getAttribute(name));
        }
    }

    public void destroy() {
        super.destroy();
    }

}

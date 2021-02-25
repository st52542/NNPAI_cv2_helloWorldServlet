package servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/HelloWorld")
public class HelloWorldServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("GET metoda dana z HelloWorld");
        response.setContentType("text/html");
        response.getWriter().println("<h1>Hello World pomoci H1</h1>");
        response.getWriter().println("<p>Hello World pomoci p</p>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("POST metoda dana z HelloWorld");

    }
}

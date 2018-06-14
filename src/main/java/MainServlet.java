
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet; 

@WebServlet("/mainserv")

public class MainServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.print("<html>");
        out.print("<head>");

        out.print("</head>");
        
        out.print("<body style=background-repeat:no-repeat;background-size:cover; background=2.jpg>");
        out.print("<center>");
        out.print("<h1 style=\"color: rgb(255,255,255)\"><i><b>Welcome to our Restaurant</b></i></h1>");
        out.print("<p><h2 style=\"color: rgb(255,255,255)\"><i><b> Our Special Menus and Items</b></i> </h2></p>");
        out.print("<p><h4 style=\"color: rgb(255,255,255)\"><b><i>Select the item you want and press click here button</i></b></h4></p>");

        out.print("<form action=\"\\chatserv\">");
        out.print("<p style=\"color: rgb(255,255,255)\"><b><i> Chats Items</i></b> </p>");
        out.print("<input type=submit value=ClickHere>");
        out.print("</form>");

        
        out.print("<form action=\"\\iceserv\">");
        out.print("<p style=\"color: rgb(255,255,255)\"><b><i> Icecream Items </i></b></p>");
        out.print("<input type=submit value=ClickHere>");
        out.print("</form>");

        out.print("<form action=\"\\bakeserv\">");
        out.print("<p style=\"color: rgb(255,255,255)\"><b><i> Bakery Items </i></b></p>");
        out.print("<input type=submit value=ClickHere>");
        out.print("</form>");

        out.print("<form action=\"\\cakeserv\">");
        out.print("<p style=\"color: rgb(255,255,255)\"><b><i> Cake Items </i></b> </p>");
        out.print("<input type=submit value=ClickHere>");
        out.print("</form>");
        out.print("<br> </br>");
        out.print("<h2 style=\"color: rgb(255,255,255)\">Thanks for visting us</h2>");
        out.print("</center>");

        out.print("</body>");
        out.print("</html>");

        out.close();

    }

}
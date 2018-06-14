import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 @WebServlet("/cakeserv")
 
public class Cakes extends HttpServlet {
 
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("<html>");
        out.print("<head>");
         out.print("</head>");
         out.print("<body style=background-repeat:no-repeat;background-size:cover; background=5.jpg>");
         out.print("<h1><b><i><center>WELCOME TO CAKES ZONE</center></i></b> </h1>");
         
         out.print("<h2>Select your flavours here</h2>");
         out.print("<form action=\"/items1.jsp\" method=\"post\">");

         out.print("<select name=Cakes>");
         out.print("<option value=Chocolate> Chocolate</option>");
         out.print("<option value=Butterscotch> Butterscotch</option>");
         out.print("<option value=Buttercreamspl> Buttercreamspl</option>");
         out.print("<option value=Redvelvet> Redvelvet</option>");
         out.print("<option value=Whiteforest> Whiteforest</option>");
         out.print("<option value=Blackforest> Blackforest</option>");
         out.print("<option value=Blueberry> Blueberry</option>");
         out.print("<option value=Cheesecake> Cheesecake</option>");
         out.print("</select>");
         out.print("</body>");
         out.print("<br> </br>");
         out.print("<input type = submit value=clickhere>");
         out.print("</form>");
         out.print("<form>");
         out.print("<input type=button value=GoBack! onclick=history.back()>");
         out.print("</form>");
                  
         out.print("</html>");




    
        out.flush();
        out.close();
    }}
import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 @WebServlet("/bakeserv")
 
public class Bakery extends HttpServlet {
 
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("<html>");
        out.print("<head>");
         out.print("</head>");
         out.print("<body style=background-repeat:no-repeat;background-size:cover; background=6.jpg >");
         out.print("<h1 style=\"color: rgb(255,255,255)\"><center><i><b>WELCOME TO BAKERY ITEMS ZONE</b></i></center> </h1>");
         
         out.print("<h2 style=\"color: rgb(255, 255, 255)\">Select your order here</h2>");
         out.print("<form action=\"/items1.jsp\" method=\"post\">");

         out.print("<select name=Bakery>");
         out.print("<option value=Tea> Tea</option>");
         out.print("<option value=Coffee> Coffee</option>");
         out.print("<option value=Hotchocolate> Hotchocolate</option>");
         out.print("<option value=Coldcoffee> Coldcoffee</option>");
         out.print("<option value=Freshjuice> Freshjuice</option>");
         out.print("<option value=Greentea> Greentea</option>");
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
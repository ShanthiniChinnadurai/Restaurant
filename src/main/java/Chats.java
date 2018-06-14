import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 @WebServlet("/chatserv")
 
public class Chats extends HttpServlet {
 
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("<html>");
        out.print("<head>");
         out.print("</head>");
         out.print("<body style=background-repeat:no-repeat;background-size:cover; background=chat.jpg>");
         out.print("<h1><b><i><center>WELCOME TO CHATS ZONE</center></i></b> </h1>");
         
         out.print("<h2>Select your chats here</h2>");
         out.print("<form action=\"/items1.jsp\" method=\"post\">");

         out.print("<select name=chats>");
         out.print("<option value=Panipuri> Panipuri</option>");
         out.print("<option value=Dahipuri> Dahipuri</option>");
         out.print("<option value=Masalapuri> Masalapuri</option>");
         out.print("<option value=Bhelpuri> Bhelpuri</option>");
         out.print("<option value=RajKachori> RajKachori</option>");
         out.print("<option value=Cutlet> Cutlet</option>");
         out.print("<option value=VegPizza> VegPizza</option>");
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
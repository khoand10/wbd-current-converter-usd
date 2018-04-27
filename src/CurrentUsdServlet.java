import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CurrentUsdServlet",urlPatterns = "/current")
public class CurrentUsdServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double rate = Double.parseDouble(request.getParameter("rate"));
        double usd = Double.parseDouble(request.getParameter("usd"));
        double vnd = rate * usd ;
        request.setAttribute("vnd",vnd);
        PrintWriter writer = response.getWriter();
        writer.println("<h1>"+vnd+"</h1>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

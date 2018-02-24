package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Calculate", urlPatterns = {"/Calculate"})
public class Calculate extends HttpServlet 
{
    public void doGet(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException 
    {
        try
        {
            Valute valute = new Valute();
        
            double chislo1 = Double.parseDouble(req.getParameter("chislo1"));
            String valute1 = req.getParameter("valute1");
            String valute2 = req.getParameter("valute2");
            double ch1 = 0, ch2 = 0;
            float it;
            
            for(int i = 0; i < valute.b.length; i++)
            {
                if(valute1.equals(valute.b[i].get("CharCode") + " - " 
                        + valute.b[i].get("Name")))
                {
                    ch1 = Double.parseDouble(valute.b[i].get("Value").toString())
                            * Double.parseDouble(valute.b[i].get("Nominal").toString());
                }
                
                if(valute2.equals(valute.b[i].get("CharCode") + " - " 
                        + valute.b[i].get("Name")))
                {
                    ch2 = Double.parseDouble(valute.b[i].get("Value").toString())
                            * Double.parseDouble(valute.b[i].get("Nominal").toString());
                }
            }
            
            if(valute1.equals(valute.map.get("RUB").get("CharCode") + " - " 
                    + valute.map.get("RUB").get("Name")))
            {
                ch1 = Double.parseDouble(valute.map.get("RUB").get("Value")) 
                        * Double.parseDouble(valute.map.get("RUB").get("Nominal"));
            }
            
            if(valute2.equals(valute.map.get("RUB").get("CharCode") + " - " 
                    + valute.map.get("RUB").get("Name")))
            {
                ch2 = Double.parseDouble(valute.map.get("RUB").get("Value")) 
                        * Double.parseDouble(valute.map.get("RUB").get("Nominal"));
            }

            it = (float) (ch1 / ch2 * chislo1);

            resp.setContentType("text/html;charset=utf-8");
            PrintWriter pw = resp.getWriter();
            pw.println("<!DOCTYPE html>");
            pw.println("<html>");
                pw.println("<head>");
                    pw.println("<meta charset=\"utf-8\">");
                    pw.println("<title>Валютный калькулятор</title>");
                pw.println("</head>");


                pw.println("<body>");

                if(chislo1 == 0)
                {
                    pw.println("<p>Введите значение переменной</p>");
                }
                else 
                {
                    pw.println("<p>" + valute1 + " переведенная в " + valute2 
                            + " = " + it + "</p>");
                }

                    pw.println("<p><a href=\"Main\"> Валютный калькулятор </*a></p>");
                    pw.println("<p><a href=\"index.html\"> Главная </*a></p>");

                pw.println("</body>");
            pw.println("</html>");
        }
        catch(Exception e)
        {}
    }
}
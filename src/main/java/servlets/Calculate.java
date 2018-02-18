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
            Valute valute= new Valute();
        
            double chislo1 = Double.parseDouble(req.getParameter("chislo1"));
            String valute1 = req.getParameter("valute1");
            String valute2 = req.getParameter("valute2");
            double ch1 = 0, ch2 = 0, it;

            for(int i=0; i<valute.map.size(); i++)
            {
                if(valute1.equals(valute.map.get("AUD").get("Name")))
                    ch1 = Double.parseDouble(valute.map.get("AUD").get("Value")) 
                            * Double.parseDouble(valute.map.get("AUD").get("Nominal"));
                else if(valute1.equals(valute.map.get("AZN").get("Name")))
                    ch1 = Double.parseDouble(valute.map.get("AZN").get("Value")) 
                            * Double.parseDouble(valute.map.get("AZN").get("Nominal"));
                else if(valute1.equals(valute.map.get("GBP").get("Name")))
                    ch1 = Double.parseDouble(valute.map.get("GBP").get("Value")) 
                            * Double.parseDouble(valute.map.get("GBP").get("Nominal"));
                else if(valute1.equals(valute.map.get("AMD").get("Name")))
                    ch1 = Double.parseDouble(valute.map.get("AMD").get("Value")) 
                            * Double.parseDouble(valute.map.get("AMD").get("Nominal"));
                else if(valute1.equals(valute.map.get("BYN").get("Name")))
                    ch1 = Double.parseDouble(valute.map.get("BYN").get("Value")) 
                            * Double.parseDouble(valute.map.get("BYN").get("Nominal"));
                else if(valute1.equals(valute.map.get("BGN").get("Name")))
                    ch1 = Double.parseDouble(valute.map.get("BGN").get("Value")) 
                            * Double.parseDouble(valute.map.get("BGN").get("Nominal"));
                else if(valute1.equals(valute.map.get("BRL").get("Name")))
                    ch1 = Double.parseDouble(valute.map.get("BRL").get("Value")) 
                            * Double.parseDouble(valute.map.get("BRL").get("Nominal"));
                else if(valute1.equals(valute.map.get("HUF").get("Name")))
                    ch1 = Double.parseDouble(valute.map.get("HUF").get("Value")) 
                            * Double.parseDouble(valute.map.get("HUF").get("Nominal"));
                else if(valute1.equals(valute.map.get("HKD").get("Name")))
                    ch1 = Double.parseDouble(valute.map.get("HKD").get("Value")) 
                            * Double.parseDouble(valute.map.get("HKD").get("Nominal"));
                else if(valute1.equals(valute.map.get("DKK").get("Name")))
                    ch1 = Double.parseDouble(valute.map.get("DKK").get("Value")) 
                            * Double.parseDouble(valute.map.get("DKK").get("Nominal"));
                else if(valute1.equals(valute.map.get("USD").get("Name")))
                    ch1 = Double.parseDouble(valute.map.get("USD").get("Value")) 
                            * Double.parseDouble(valute.map.get("USD").get("Nominal"));
                else if(valute1.equals(valute.map.get("EUR").get("Name")))
                    ch1 = Double.parseDouble(valute.map.get("EUR").get("Value")) 
                            * Double.parseDouble(valute.map.get("EUR").get("Nominal"));
                else if(valute1.equals(valute.map.get("INR").get("Name")))
                    ch1 = Double.parseDouble(valute.map.get("INR").get("Value")) 
                            * Double.parseDouble(valute.map.get("INR").get("Nominal"));
                else if(valute1.equals(valute.map.get("KZT").get("Name")))
                    ch1 = Double.parseDouble(valute.map.get("KZT").get("Value")) 
                            * Double.parseDouble(valute.map.get("KZT").get("Nominal"));
                else if(valute1.equals(valute.map.get("CAD").get("Name")))
                    ch1 = Double.parseDouble(valute.map.get("CAD").get("Value")) 
                            * Double.parseDouble(valute.map.get("CAD").get("Nominal"));
                else if(valute1.equals(valute.map.get("KGS").get("Name")))
                    ch1 = Double.parseDouble(valute.map.get("KGS").get("Value")) 
                            * Double.parseDouble(valute.map.get("KGS").get("Nominal"));
                else if(valute1.equals(valute.map.get("CNY").get("Name")))
                    ch1 = Double.parseDouble(valute.map.get("CNY").get("Value")) 
                            * Double.parseDouble(valute.map.get("CNY").get("Nominal"));
                else if(valute1.equals(valute.map.get("MDL").get("Name")))
                    ch1 = Double.parseDouble(valute.map.get("MDL").get("Value")) 
                            * Double.parseDouble(valute.map.get("MDL").get("Nominal"));
                else if(valute1.equals(valute.map.get("NOK").get("Name")))
                    ch1 = Double.parseDouble(valute.map.get("NOK").get("Value")) 
                            * Double.parseDouble(valute.map.get("NOK").get("Nominal"));
                else if(valute1.equals(valute.map.get("PLN").get("Name")))
                    ch1 = Double.parseDouble(valute.map.get("PLN").get("Value")) 
                            * Double.parseDouble(valute.map.get("PLN").get("Nominal"));
                else if(valute1.equals(valute.map.get("RON").get("Name")))
                    ch1 = Double.parseDouble(valute.map.get("RON").get("Value")) 
                            * Double.parseDouble(valute.map.get("RON").get("Nominal"));
                else if(valute1.equals(valute.map.get("XDR").get("Name")))
                    ch1 = Double.parseDouble(valute.map.get("XDR").get("Value")) 
                            * Double.parseDouble(valute.map.get("XDR").get("Nominal"));
                else if(valute1.equals(valute.map.get("SGD").get("Name")))
                    ch1 = Double.parseDouble(valute.map.get("SGD").get("Value")) 
                            * Double.parseDouble(valute.map.get("SGD").get("Nominal"));
                else if(valute1.equals(valute.map.get("TJS").get("Name")))
                    ch1 = Double.parseDouble(valute.map.get("TJS").get("Value")) 
                            * Double.parseDouble(valute.map.get("TJS").get("Nominal"));
                else if(valute1.equals(valute.map.get("TRY").get("Name")))
                    ch1 = Double.parseDouble(valute.map.get("TRY").get("Value")) 
                            * Double.parseDouble(valute.map.get("TRY").get("Nominal"));
                else if(valute1.equals(valute.map.get("TMT").get("Name")))
                    ch1 = Double.parseDouble(valute.map.get("TMT").get("Value")) 
                            * Double.parseDouble(valute.map.get("TMT").get("Nominal"));
                else if(valute1.equals(valute.map.get("UZS").get("Name")))
                    ch1 = Double.parseDouble(valute.map.get("UZS").get("Value")) 
                            * Double.parseDouble(valute.map.get("UZS").get("Nominal"));
                else if(valute1.equals(valute.map.get("UAH").get("Name")))
                    ch1 = Double.parseDouble(valute.map.get("UAH").get("Value")) 
                            * Double.parseDouble(valute.map.get("UAH").get("Nominal"));
                else if(valute1.equals(valute.map.get("CZK").get("Name")))
                    ch1 = Double.parseDouble(valute.map.get("CZK").get("Value")) 
                            * Double.parseDouble(valute.map.get("CZK").get("Nominal"));
                else if(valute1.equals(valute.map.get("SEK").get("Name")))
                    ch1 = Double.parseDouble(valute.map.get("SEK").get("Value")) 
                            * Double.parseDouble(valute.map.get("SEK").get("Nominal"));
                else if(valute1.equals(valute.map.get("CHF").get("Name")))
                    ch1 = Double.parseDouble(valute.map.get("CHF").get("Value")) 
                            * Double.parseDouble(valute.map.get("CHF").get("Nominal"));
                else if(valute1.equals(valute.map.get("ZAR").get("Name")))
                    ch1 = Double.parseDouble(valute.map.get("ZAR").get("Value")) 
                            * Double.parseDouble(valute.map.get("ZAR").get("Nominal"));
                else if(valute1.equals(valute.map.get("KRW").get("Name")))
                    ch1 = Double.parseDouble(valute.map.get("KRW").get("Value")) 
                            * Double.parseDouble(valute.map.get("KRW").get("Nominal"));
                else if(valute1.equals(valute.map.get("JPY").get("Name")))
                    ch1 = Double.parseDouble(valute.map.get("JPY").get("Value")) 
                            * Double.parseDouble(valute.map.get("JPY").get("Nominal"));
                else if(valute1.equals(valute.map.get("RUB").get("Name")))
                    ch1 = Double.parseDouble(valute.map.get("RUB").get("Value")) 
                            * Double.parseDouble(valute.map.get("RUB").get("Nominal"));
                
                if(valute2.equals(valute.map.get("AUD").get("Name")))
                    ch2 = Double.parseDouble(valute.map.get("AUD").get("Value")) 
                            * Double.parseDouble(valute.map.get("AUD").get("Nominal"));
                else if(valute2.equals(valute.map.get("AZN").get("Name")))
                    ch2 = Double.parseDouble(valute.map.get("AZN").get("Value")) 
                            * Double.parseDouble(valute.map.get("AZN").get("Nominal"));
                else if(valute2.equals(valute.map.get("GBP").get("Name")))
                    ch2 = Double.parseDouble(valute.map.get("GBP").get("Value")) 
                            * Double.parseDouble(valute.map.get("GBP").get("Nominal"));
                else if(valute2.equals(valute.map.get("AMD").get("Name")))
                    ch2 = Double.parseDouble(valute.map.get("AMD").get("Value")) 
                            * Double.parseDouble(valute.map.get("AMD").get("Nominal"));
                else if(valute2.equals(valute.map.get("BYN").get("Name")))
                    ch2 = Double.parseDouble(valute.map.get("BYN").get("Value")) 
                            * Double.parseDouble(valute.map.get("BYN").get("Nominal"));
                else if(valute2.equals(valute.map.get("BGN").get("Name")))
                    ch2 = Double.parseDouble(valute.map.get("BGN").get("Value")) 
                            * Double.parseDouble(valute.map.get("BGN").get("Nominal"));
                else if(valute2.equals(valute.map.get("BRL").get("Name")))
                    ch2 = Double.parseDouble(valute.map.get("BRL").get("Value")) 
                            * Double.parseDouble(valute.map.get("BRL").get("Nominal"));
                else if(valute2.equals(valute.map.get("HUF").get("Name")))
                    ch2 = Double.parseDouble(valute.map.get("HUF").get("Value")) 
                            * Double.parseDouble(valute.map.get("HUF").get("Nominal"));
                else if(valute2.equals(valute.map.get("HKD").get("Name")))
                    ch2 = Double.parseDouble(valute.map.get("HKD").get("Value")) 
                            * Double.parseDouble(valute.map.get("HKD").get("Nominal"));
                else if(valute2.equals(valute.map.get("DKK").get("Name")))
                    ch2 = Double.parseDouble(valute.map.get("DKK").get("Value")) 
                            * Double.parseDouble(valute.map.get("DKK").get("Nominal"));
                else if(valute2.equals(valute.map.get("USD").get("Name")))
                    ch2 = Double.parseDouble(valute.map.get("USD").get("Value")) 
                            * Double.parseDouble(valute.map.get("USD").get("Nominal"));
                else if(valute2.equals(valute.map.get("EUR").get("Name")))
                    ch2 = Double.parseDouble(valute.map.get("EUR").get("Value")) 
                            * Double.parseDouble(valute.map.get("EUR").get("Nominal"));
                else if(valute2.equals(valute.map.get("INR").get("Name")))
                    ch2 = Double.parseDouble(valute.map.get("INR").get("Value")) 
                            * Double.parseDouble(valute.map.get("INR").get("Nominal"));
                else if(valute2.equals(valute.map.get("KZT").get("Name")))
                    ch2 = Double.parseDouble(valute.map.get("KZT").get("Value")) 
                            * Double.parseDouble(valute.map.get("KZT").get("Nominal"));
                else if(valute2.equals(valute.map.get("CAD").get("Name")))
                    ch2 = Double.parseDouble(valute.map.get("CAD").get("Value")) 
                            * Double.parseDouble(valute.map.get("CAD").get("Nominal"));
                else if(valute2.equals(valute.map.get("KGS").get("Name")))
                    ch2 = Double.parseDouble(valute.map.get("KGS").get("Value")) 
                            * Double.parseDouble(valute.map.get("KGS").get("Nominal"));
                else if(valute2.equals(valute.map.get("CNY").get("Name")))
                    ch2 = Double.parseDouble(valute.map.get("CNY").get("Value")) 
                            * Double.parseDouble(valute.map.get("CNY").get("Nominal"));
                else if(valute2.equals(valute.map.get("MDL").get("Name")))
                    ch2 = Double.parseDouble(valute.map.get("MDL").get("Value")) 
                            * Double.parseDouble(valute.map.get("MDL").get("Nominal"));
                else if(valute2.equals(valute.map.get("NOK").get("Name")))
                    ch2 = Double.parseDouble(valute.map.get("NOK").get("Value")) 
                            * Double.parseDouble(valute.map.get("NOK").get("Nominal"));
                else if(valute2.equals(valute.map.get("PLN").get("Name")))
                    ch2 = Double.parseDouble(valute.map.get("PLN").get("Value")) 
                            * Double.parseDouble(valute.map.get("PLN").get("Nominal"));
                else if(valute2.equals(valute.map.get("RON").get("Name")))
                    ch2 = Double.parseDouble(valute.map.get("RON").get("Value")) 
                            * Double.parseDouble(valute.map.get("RON").get("Nominal"));
                else if(valute2.equals(valute.map.get("XDR").get("Name")))
                    ch2 = Double.parseDouble(valute.map.get("XDR").get("Value")) 
                            * Double.parseDouble(valute.map.get("XDR").get("Nominal"));
                else if(valute2.equals(valute.map.get("SGD").get("Name")))
                    ch2 = Double.parseDouble(valute.map.get("SGD").get("Value")) 
                            * Double.parseDouble(valute.map.get("SGD").get("Nominal"));
                else if(valute2.equals(valute.map.get("TJS").get("Name")))
                    ch2 = Double.parseDouble(valute.map.get("TJS").get("Value")) 
                            * Double.parseDouble(valute.map.get("TJS").get("Nominal"));
                else if(valute2.equals(valute.map.get("TRY").get("Name")))
                    ch2 = Double.parseDouble(valute.map.get("TRY").get("Value")) 
                            * Double.parseDouble(valute.map.get("TRY").get("Nominal"));
                else if(valute2.equals(valute.map.get("TMT").get("Name")))
                    ch2 = Double.parseDouble(valute.map.get("TMT").get("Value")) 
                            * Double.parseDouble(valute.map.get("TMT").get("Nominal"));
                else if(valute2.equals(valute.map.get("UZS").get("Name")))
                    ch2 = Double.parseDouble(valute.map.get("UZS").get("Value")) 
                            * Double.parseDouble(valute.map.get("UZS").get("Nominal"));
                else if(valute2.equals(valute.map.get("UAH").get("Name")))
                    ch2 = Double.parseDouble(valute.map.get("UAH").get("Value")) 
                            * Double.parseDouble(valute.map.get("UAH").get("Nominal"));
                else if(valute2.equals(valute.map.get("CZK").get("Name")))
                    ch2 = Double.parseDouble(valute.map.get("CZK").get("Value")) 
                            * Double.parseDouble(valute.map.get("CZK").get("Nominal"));
                else if(valute2.equals(valute.map.get("SEK").get("Name")))
                    ch2 = Double.parseDouble(valute.map.get("SEK").get("Value")) 
                            * Double.parseDouble(valute.map.get("SEK").get("Nominal"));
                else if(valute2.equals(valute.map.get("CHF").get("Name")))
                    ch2 = Double.parseDouble(valute.map.get("CHF").get("Value")) 
                            * Double.parseDouble(valute.map.get("CHF").get("Nominal"));
                else if(valute2.equals(valute.map.get("ZAR").get("Name")))
                    ch2 = Double.parseDouble(valute.map.get("ZAR").get("Value")) 
                            * Double.parseDouble(valute.map.get("ZAR").get("Nominal"));
                else if(valute2.equals(valute.map.get("KRW").get("Name")))
                    ch2 = Double.parseDouble(valute.map.get("KRW").get("Value")) 
                            * Double.parseDouble(valute.map.get("KRW").get("Nominal"));
                else if(valute2.equals(valute.map.get("JPY").get("Name")))
                    ch2 = Double.parseDouble(valute.map.get("JPY").get("Value")) 
                            * Double.parseDouble(valute.map.get("JPY").get("Nominal"));
                else if(valute2.equals(valute.map.get("RUB").get("Name")))
                    ch2 = Double.parseDouble(valute.map.get("RUB").get("Value")) 
                            * Double.parseDouble(valute.map.get("RUB").get("Nominal"));
            }

            it = ch1 / ch2 * chislo1;

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
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/Main"})
public class Main extends HttpServlet 
{   
    public void doGet(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException 
    {
        Valute valute = new Valute();
        
        String[] Name = {
            valute.map.get("AUD").get("Name"), 
            valute.map.get("AZN").get("Name"), 
            valute.map.get("GBP").get("Name"), 
            valute.map.get("AMD").get("Name"), 
            valute.map.get("BYN").get("Name"), 
            valute.map.get("BGN").get("Name"), 
            valute.map.get("BRL").get("Name"), 
            valute.map.get("HUF").get("Name"), 
            valute.map.get("HKD").get("Name"), 
            valute.map.get("DKK").get("Name"), 
            valute.map.get("USD").get("Name"), 
            valute.map.get("EUR").get("Name"), 
            valute.map.get("INR").get("Name"), 
            valute.map.get("KZT").get("Name"), 
            valute.map.get("CAD").get("Name"), 
            valute.map.get("KGS").get("Name"), 
            valute.map.get("CNY").get("Name"), 
            valute.map.get("MDL").get("Name"), 
            valute.map.get("NOK").get("Name"), 
            valute.map.get("PLN").get("Name"), 
            valute.map.get("RON").get("Name"), 
            valute.map.get("XDR").get("Name"), 
            valute.map.get("SGD").get("Name"), 
            valute.map.get("TJS").get("Name"), 
            valute.map.get("TRY").get("Name"), 
            valute.map.get("TMT").get("Name"), 
            valute.map.get("UZS").get("Name"), 
            valute.map.get("UAH").get("Name"), 
            valute.map.get("CZK").get("Name"), 
            valute.map.get("SEK").get("Name"), 
            valute.map.get("CHF").get("Name"), 
            valute.map.get("ZAR").get("Name"), 
            valute.map.get("KRW").get("Name"), 
            valute.map.get("JPY").get("Name"), 
            valute.map.get("RUB").get("Name")
        };
         
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter pw = resp.getWriter();
        pw.println("<!DOCTYPE html>");
        pw.println("<html>");
            pw.println("<head>");
                pw.println("<meta charset=\"utf-8\">");
                pw.println("<title>Валютный калькулятор</title>");
            pw.println("</head>");
            
            
            pw.println("<body>");
                pw.println("<h1>Валютный калькулятор</h1>");
                pw.println("<h3>Курсы валют</h3>");
                pw.println("<p>EUR - Евро " + valute.map.get("EUR").get("Value") + "</p>");
                pw.println("<p>USD - Доллар " + valute.map.get("USD").get("Value") + "</p>");
                pw.println("<form action=\"Calculate\">");
                    pw.println("<p>Размер валюты</p>");
                    pw.println("<input type=\"text\" size=\"40\" "
                            + "max=\"10\" min=\"1\" name=\"chislo1\">");
                    pw.println("<p>Выберите валюту</p>");
                    pw.println("<select name=\"valute1\">");
                    
                    //выпадающий список
                    for(int i = 0; i < Name.length; i++)
                    {
                        pw.println("<option>" + Name[i] + "</option>");
                    }
                    
                    pw.println("</select>");
                    pw.println("<p>Выберите валюту</p>");
                    pw.println("<select name=\"valute2\">");
                    
                    //выпадающий список
                    for(int i = 0; i < Name.length; i++)
                    {
                        pw.println("<option>" + Name[i] + "</option>");
                    }
                    
                    pw.println("</select>");
                    pw.println("<p><input type=\"submit\" value=\"Перевести\"></p>");
                pw.println("</form>");
                
                pw.println("<p><a href=\"index.html\"> Главная </*a></p>");
            pw.println("</body>");
        pw.println("</html>");
    }
}
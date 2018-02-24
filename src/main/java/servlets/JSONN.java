package servlets;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;

public class JSONN
{
    StringBuilder sb;
    String sURL;
    URL url;
    JsonParser jsp;
    JsonObject objMain, valute;
    JsonObject aud, azn, gbp, amd, byn, bgn, brl, huf, hkd, dkk, usd, eur, inr,  
            kzt, cad, kgs, cny, mdl, nok, pln, ron, xdr, sgd, tjs, trY, tmt, uzs, 
            uah, czk, sek, chf, zar, krw, jpy;
    
    JsonObject[] a = {aud, azn, gbp, amd, byn, bgn, brl, huf, hkd, 
        dkk, usd, eur, inr, kzt, cad, kgs, cny, mdl, nok, pln, ron, 
        xdr, sgd, tjs, trY, tmt, uzs, uah, czk, sek, chf, zar, krw, 
        jpy};
    
    JsonObject[] b;
    
    JSONN()
    {
        sb = new StringBuilder();
        try
        {
            sURL = "https://www.cbr-xml-daily.ru/daily_json.js";
            url = new URL(sURL);
            try
            {
                Scanner scn = new Scanner(new InputStreamReader
        (url.openConnection().getInputStream(),"utf-8"));
                while(scn.hasNext()) 
                    sb.append(scn.nextLine()+"\r");
            }
            catch(IOException ioe)
            {}
        }
        catch(Exception e)
        {}
        jsp = new JsonParser();
        objMain=jsp.parse(sb.toString()).getAsJsonObject();
        valute=objMain.get("Valute").getAsJsonObject();
        
        a[0] = valute.get("AUD").getAsJsonObject();
        a[1] = valute.get("AZN").getAsJsonObject();
        a[2] = valute.get("GBP").getAsJsonObject();
        a[3] = valute.get("AMD").getAsJsonObject();
        a[4] = valute.get("BYN").getAsJsonObject();
        a[5] = valute.get("BGN").getAsJsonObject();
        a[6] = valute.get("BRL").getAsJsonObject();
        a[7] = valute.get("HUF").getAsJsonObject();
        a[8] = valute.get("HKD").getAsJsonObject();
        a[9] = valute.get("DKK").getAsJsonObject();
        a[10] = valute.get("USD").getAsJsonObject();
        a[11] = valute.get("EUR").getAsJsonObject();
        a[12] = valute.get("INR").getAsJsonObject();
        a[13] = valute.get("KZT").getAsJsonObject();
        a[14] = valute.get("CAD").getAsJsonObject();
        a[15] = valute.get("KGS").getAsJsonObject();
        a[16] = valute.get("CNY").getAsJsonObject();
        a[17] = valute.get("MDL").getAsJsonObject();
        a[18] = valute.get("NOK").getAsJsonObject();
        a[19] = valute.get("PLN").getAsJsonObject();
        a[20] = valute.get("RON").getAsJsonObject();
        a[21] = valute.get("XDR").getAsJsonObject();
        a[22] = valute.get("SGD").getAsJsonObject();
        a[23] = valute.get("TJS").getAsJsonObject();
        a[24] = valute.get("TRY").getAsJsonObject();
        a[25] = valute.get("TMT").getAsJsonObject();
        a[26] = valute.get("UZS").getAsJsonObject();
        a[27] = valute.get("UAH").getAsJsonObject();
        a[28] = valute.get("CZK").getAsJsonObject();
        a[29] = valute.get("SEK").getAsJsonObject();
        a[30] =  valute.get("CHF").getAsJsonObject();
        a[31] = valute.get("ZAR").getAsJsonObject();
        a[32] = valute.get("KRW").getAsJsonObject();
        a[33] = valute.get("JPY").getAsJsonObject();
    }
}
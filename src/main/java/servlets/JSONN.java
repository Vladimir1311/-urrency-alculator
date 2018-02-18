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
        
        aud=valute.get("AUD").getAsJsonObject();
        azn=valute.get("AZN").getAsJsonObject();
        gbp=valute.get("GBP").getAsJsonObject();
        amd=valute.get("AMD").getAsJsonObject();
        byn=valute.get("BYN").getAsJsonObject();
        bgn=valute.get("BGN").getAsJsonObject();
        brl=valute.get("BRL").getAsJsonObject();
        huf=valute.get("HUF").getAsJsonObject();
        hkd=valute.get("HKD").getAsJsonObject();
        dkk=valute.get("DKK").getAsJsonObject();
        usd=valute.get("USD").getAsJsonObject();
        eur=valute.get("EUR").getAsJsonObject();
        inr=valute.get("INR").getAsJsonObject();
        kzt=valute.get("KZT").getAsJsonObject();
        cad=valute.get("CAD").getAsJsonObject();
        kgs=valute.get("KGS").getAsJsonObject();
        cny=valute.get("CNY").getAsJsonObject();
        mdl=valute.get("MDL").getAsJsonObject();
        nok=valute.get("NOK").getAsJsonObject();
        pln=valute.get("PLN").getAsJsonObject();
        ron=valute.get("RON").getAsJsonObject();
        xdr=valute.get("XDR").getAsJsonObject();
        sgd=valute.get("SGD").getAsJsonObject();
        tjs=valute.get("TJS").getAsJsonObject();
        trY=valute.get("TRY").getAsJsonObject();
        tmt=valute.get("TMT").getAsJsonObject();
        uzs=valute.get("UZS").getAsJsonObject();
        uah=valute.get("UAH").getAsJsonObject();
        czk=valute.get("CZK").getAsJsonObject();
        sek=valute.get("SEK").getAsJsonObject();
        chf=valute.get("CHF").getAsJsonObject();
        zar=valute.get("ZAR").getAsJsonObject();
        krw=valute.get("KRW").getAsJsonObject();
        jpy=valute.get("JPY").getAsJsonObject();
    }
}
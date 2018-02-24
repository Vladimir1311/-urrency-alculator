package servlets;

import java.util.HashMap;
import java.util.Map;

public class Valute 
{
    JSONN json;
    Map<String, String> audmap = new HashMap<String, String>();
    Map<String, String> aznmap = new HashMap<String, String>();
    Map<String, String> gbpmap = new HashMap<String, String>();
    Map<String, String> amdmap = new HashMap<String, String>();
    Map<String, String> bynmap = new HashMap<String, String>();
    Map<String, String> bgnmap = new HashMap<String, String>();
    Map<String, String> brlmap = new HashMap<String, String>();
    Map<String, String> hufmap = new HashMap<String, String>();
    Map<String, String> hkdmap = new HashMap<String, String>();
    Map<String, String> dkkmap = new HashMap<String, String>();
    Map<String, String> usdmap = new HashMap<String, String>();
    Map<String, String> eurmap = new HashMap<String, String>();
    Map<String, String> inrmap = new HashMap<String, String>();
    Map<String, String> kztmap = new HashMap<String, String>();
    Map<String, String> cadmap = new HashMap<String, String>();
    Map<String, String> kgsmap = new HashMap<String, String>();
    Map<String, String> cnymap = new HashMap<String, String>();
    Map<String, String> mdlmap = new HashMap<String, String>();
    Map<String, String> nokmap = new HashMap<String, String>();
    Map<String, String> plnmap = new HashMap<String, String>();
    Map<String, String> ronmap = new HashMap<String, String>();
    Map<String, String> xdrmap = new HashMap<String, String>();
    Map<String, String> sgdmap = new HashMap<String, String>();
    Map<String, String> tjsmap = new HashMap<String, String>();
    Map<String, String> trymap = new HashMap<String, String>();
    Map<String, String> tmtmap = new HashMap<String, String>();
    Map<String, String> uzsmap = new HashMap<String, String>();
    Map<String, String> uahmap = new HashMap<String, String>();
    Map<String, String> czkmap = new HashMap<String, String>();
    Map<String, String> sekmap = new HashMap<String, String>();
    Map<String, String> chfmap = new HashMap<String, String>();
    Map<String, String> zarmap = new HashMap<String, String>();
    Map<String, String> krwmap = new HashMap<String, String>();
    Map<String, String> jpymap = new HashMap<String, String>();
    Map<String, String> rubmap = new HashMap<String, String>();
    
    Map<String, HashMap<String, String>> map;
    
    Map[] b = {audmap, aznmap, gbpmap, amdmap, bynmap, bgnmap, brlmap, 
        hufmap, hkdmap, dkkmap, usdmap, eurmap, inrmap, kztmap, cadmap, 
        kgsmap, cnymap, mdlmap, nokmap, plnmap, ronmap, xdrmap, sgdmap, 
        tjsmap, trymap, tmtmap, uzsmap, uahmap, czkmap, sekmap, chfmap, 
        zarmap, krwmap, jpymap};
    
    public void add(String key1, String key2, String key3, String key4, 
            Map<String, String> a)
    {
        a.put("CharCode", key1);
        a.put("Nominal", key2);
        a.put("Name", key3);
        a.put("Value", key4);
    }
    
    @SuppressWarnings("empty-statement")
    Valute()
    {
        
        json = new JSONN();
        
        for(int i = 0, j = 0; i < b.length; i++, j++)
        {
            add(json.a[j].get("CharCode").getAsString(), 
                    json.a[j].get("Nominal").getAsString(), 
                    json.a[j].get("Name").getAsString(), 
                    json.a[j].get("Value").getAsString(), b[i]);
        }
        
        //rubmap = new HashMap<String, String>();
        add("RUB", "1", "Российский рубль", "1", rubmap);
        
        map = new 
            HashMap<String, HashMap<String, String>>();
        map.put("AUD", (HashMap<String, String>) audmap);
        map.put("AZN", (HashMap<String, String>) aznmap);
        map.put("GBP", (HashMap<String, String>) gbpmap);
        map.put("AMD", (HashMap<String, String>) amdmap);
        map.put("BYN", (HashMap<String, String>) bynmap);
        map.put("BGN", (HashMap<String, String>) bgnmap);
        map.put("BRL", (HashMap<String, String>) brlmap);
        map.put("HUF", (HashMap<String, String>) hufmap);
        map.put("HKD", (HashMap<String, String>) hkdmap);
        map.put("DKK", (HashMap<String, String>) dkkmap);
        map.put("USD", (HashMap<String, String>) usdmap);
        map.put("EUR", (HashMap<String, String>) eurmap);
        map.put("INR", (HashMap<String, String>) inrmap);
        map.put("KZT", (HashMap<String, String>) kztmap);
        map.put("CAD", (HashMap<String, String>) cadmap);
        map.put("KGS", (HashMap<String, String>) kgsmap);
        map.put("CNY", (HashMap<String, String>) cnymap);
        map.put("MDL", (HashMap<String, String>) mdlmap);
        map.put("NOK", (HashMap<String, String>) nokmap);
        map.put("PLN", (HashMap<String, String>) plnmap);
        map.put("RON", (HashMap<String, String>) ronmap);
        map.put("XDR", (HashMap<String, String>) xdrmap);
        map.put("SGD", (HashMap<String, String>) sgdmap);
        map.put("TJS", (HashMap<String, String>) tjsmap);
        map.put("TRY", (HashMap<String, String>) trymap);
        map.put("TMT", (HashMap<String, String>) tmtmap);
        map.put("UZS", (HashMap<String, String>) uzsmap);
        map.put("UAH", (HashMap<String, String>) uahmap);
        map.put("CZK", (HashMap<String, String>) czkmap);
        map.put("SEK", (HashMap<String, String>) sekmap);
        map.put("CHF", (HashMap<String, String>) chfmap);
        map.put("ZAR", (HashMap<String, String>) zarmap);
        map.put("KRW", (HashMap<String, String>) krwmap);
        map.put("JPY", (HashMap<String, String>) jpymap);
        map.put("RUB", (HashMap<String, String>) rubmap);
    }
}
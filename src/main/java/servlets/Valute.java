package servlets;

import java.util.HashMap;
import java.util.Map;

public class Valute 
{
    JSONN json;
    Map<String, String> audmap, aznmap, gbpmap, amdmap, bynmap, bgnmap, 
            brlmap, hufmap, hkdmap, dkkmap, usdmap, eurmap, inrmap, kztmap, 
            cadmap, kgsmap, cnymap, mdlmap, nokmap, plnmap, ronmap, xdrmap, 
            sgdmap, tjsmap, trymap, tmtmap, uzsmap, uahmap, czkmap, sekmap, 
            chfmap, zarmap, krwmap, jpymap, rubmap;
    
    Map<String, HashMap<String, String>> map;
    
    public void add(String key1, String key2, String key3, String key4, 
            Map<String, String> a)
    {
        a.put("CharCode", key1);
        a.put("Nominal", key2);
        a.put("Name", key3);
        a.put("Value", key4);
    }
    
    Valute()
    {
        json = new JSONN();
        
        audmap = new HashMap<String, String>();
        add(json.aud.get("CharCode").getAsString(), 
                json.aud.get("Nominal").getAsString(), 
                json.aud.get("Name").getAsString(), 
                json.aud.get("Value").getAsString(), audmap);
        aznmap = new HashMap<String, String>();
        add(json.azn.get("CharCode").getAsString(), 
                json.azn.get("Nominal").getAsString(), 
                json.azn.get("Name").getAsString(), 
                json.azn.get("Value").getAsString(), aznmap);
        gbpmap = new HashMap<String, String>();
        add(json.gbp.get("CharCode").getAsString(), 
                json.gbp.get("Nominal").getAsString(), 
                json.gbp.get("Name").getAsString(), 
                json.gbp.get("Value").getAsString(), gbpmap);
        amdmap = new HashMap<String, String>();
        add(json.amd.get("CharCode").getAsString(), 
                json.amd.get("Nominal").getAsString(), 
                json.amd.get("Name").getAsString(), 
                json.amd.get("Value").getAsString(), amdmap);
        bynmap = new HashMap<String, String>();
        add(json.byn.get("CharCode").getAsString(), 
                json.byn.get("Nominal").getAsString(), 
                json.byn.get("Name").getAsString(), 
                json.byn.get("Value").getAsString(), bynmap);
        bgnmap = new HashMap<String, String>();
        add(json.bgn.get("CharCode").getAsString(), 
                json.bgn.get("Nominal").getAsString(), 
                json.bgn.get("Name").getAsString(), 
                json.bgn.get("Value").getAsString(), bgnmap);
        brlmap = new HashMap<String, String>();
        add(json.brl.get("CharCode").getAsString(), 
                json.brl.get("Nominal").getAsString(), 
                json.brl.get("Name").getAsString(), 
                json.brl.get("Value").getAsString(), brlmap);
        hufmap = new HashMap<String, String>();
        add(json.huf.get("CharCode").getAsString(), 
                json.huf.get("Nominal").getAsString(), 
                json.huf.get("Name").getAsString(), 
                json.huf.get("Value").getAsString(), hufmap);
        hkdmap = new HashMap<String, String>();
        add(json.hkd.get("CharCode").getAsString(), 
                json.hkd.get("Nominal").getAsString(), 
                json.hkd.get("Name").getAsString(), 
                json.hkd.get("Value").getAsString(), hkdmap);
        dkkmap = new HashMap<String, String>();
        add(json.dkk.get("CharCode").getAsString(), 
                json.dkk.get("Nominal").getAsString(), 
                json.dkk.get("Name").getAsString(), 
                json.dkk.get("Value").getAsString(), dkkmap);
        usdmap = new HashMap<String, String>();
        add(json.usd.get("CharCode").getAsString(), 
                json.usd.get("Nominal").getAsString(), 
                json.usd.get("Name").getAsString(), 
                json.usd.get("Value").getAsString(), usdmap);
        eurmap = new HashMap<String, String>();
        add(json.eur.get("CharCode").getAsString(), 
                json.eur.get("Nominal").getAsString(), 
                json.eur.get("Name").getAsString(), 
                json.eur.get("Value").getAsString(), eurmap);
        inrmap = new HashMap<String, String>();
        add(json.inr.get("CharCode").getAsString(), 
                json.inr.get("Nominal").getAsString(), 
                json.inr.get("Name").getAsString(), 
                json.inr.get("Value").getAsString(), inrmap);
        kztmap = new HashMap<String, String>();
        add(json.kzt.get("CharCode").getAsString(), 
                json.kzt.get("Nominal").getAsString(), 
                json.kzt.get("Name").getAsString(), 
                json.kzt.get("Value").getAsString(), kztmap);
        cadmap = new HashMap<String, String>();
        add(json.cad.get("CharCode").getAsString(), 
                json.cad.get("Nominal").getAsString(), 
                json.cad.get("Name").getAsString(), 
                json.cad.get("Value").getAsString(), cadmap);
        kgsmap = new HashMap<String, String>();
        add(json.kgs.get("CharCode").getAsString(), 
                json.kgs.get("Nominal").getAsString(), 
                json.kgs.get("Name").getAsString(), 
                json.kgs.get("Value").getAsString(), kgsmap);
        cnymap = new HashMap<String, String>();
        add(json.cny.get("CharCode").getAsString(), 
                json.cny.get("Nominal").getAsString(), 
                json.cny.get("Name").getAsString(), 
                json.cny.get("Value").getAsString(), cnymap);
        mdlmap = new HashMap<String, String>();
        add(json.mdl.get("CharCode").getAsString(), 
                json.mdl.get("Nominal").getAsString(), 
                json.mdl.get("Name").getAsString(), 
                json.mdl.get("Value").getAsString(), mdlmap);
        nokmap = new HashMap<String, String>();
        add(json.nok.get("CharCode").getAsString(), 
                json.nok.get("Nominal").getAsString(), 
                json.nok.get("Name").getAsString(), 
                json.nok.get("Value").getAsString(), nokmap);
        plnmap = new HashMap<String, String>();
        add(json.pln.get("CharCode").getAsString(), 
                json.pln.get("Nominal").getAsString(), 
                json.pln.get("Name").getAsString(), 
                json.pln.get("Value").getAsString(), plnmap);
        ronmap = new HashMap<String, String>();
        add(json.ron.get("CharCode").getAsString(), 
                json.ron.get("Nominal").getAsString(), 
                json.ron.get("Name").getAsString(), 
                json.ron.get("Value").getAsString(), ronmap);
        xdrmap = new HashMap<String, String>();
        add(json.xdr.get("CharCode").getAsString(), 
                json.xdr.get("Nominal").getAsString(), 
                json.xdr.get("Name").getAsString(), 
                json.xdr.get("Value").getAsString(), xdrmap);
        sgdmap = new HashMap<String, String>();
        add(json.sgd.get("CharCode").getAsString(), 
                json.sgd.get("Nominal").getAsString(), 
                json.sgd.get("Name").getAsString(), 
                json.sgd.get("Value").getAsString(), sgdmap);
        tjsmap = new HashMap<String, String>();
        add(json.sgd.get("CharCode").getAsString(), 
                json.tjs.get("Nominal").getAsString(), 
                json.tjs.get("Name").getAsString(), 
                json.tjs.get("Value").getAsString(), tjsmap);
        trymap = new HashMap<String, String>();
        add(json.trY.get("CharCode").getAsString(), 
                json.trY.get("Nominal").getAsString(), 
                json.trY.get("Name").getAsString(), 
                json.trY.get("Value").getAsString(), trymap);
        tmtmap = new HashMap<String, String>();
        add(json.tmt.get("CharCode").getAsString(), 
                json.tmt.get("Nominal").getAsString(), 
                json.tmt.get("Name").getAsString(), 
                json.tmt.get("Value").getAsString(), tmtmap);
        uzsmap = new HashMap<String, String>();
        add(json.uzs.get("CharCode").getAsString(), 
                json.uzs.get("Nominal").getAsString(), 
                json.uzs.get("Name").getAsString(), 
                json.uzs.get("Value").getAsString(), uzsmap);
        uahmap = new HashMap<String, String>();
        add(json.uah.get("CharCode").getAsString(), 
                json.uah.get("Nominal").getAsString(), 
                json.uah.get("Name").getAsString(), 
                json.uah.get("Value").getAsString(), uahmap);
        czkmap = new HashMap<String, String>();
        add(json.czk.get("CharCode").getAsString(), 
                json.czk.get("Nominal").getAsString(), 
                json.czk.get("Name").getAsString(), 
                json.czk.get("Value").getAsString(), czkmap);
        sekmap = new HashMap<String, String>();
        add(json.sek.get("CharCode").getAsString(), 
                json.sek.get("Nominal").getAsString(), 
                json.sek.get("Name").getAsString(), 
                json.sek.get("Value").getAsString(), sekmap);
        chfmap = new HashMap<String, String>();
        add(json.chf.get("CharCode").getAsString(), 
                json.chf.get("Nominal").getAsString(), 
                json.chf.get("Name").getAsString(), 
                json.chf.get("Value").getAsString(), chfmap);
        zarmap = new HashMap<String, String>();
        add(json.zar.get("CharCode").getAsString(), 
                json.zar.get("Nominal").getAsString(), 
                json.zar.get("Name").getAsString(), 
                json.zar.get("Value").getAsString(), zarmap);
        krwmap = new HashMap<String, String>();
        add(json.krw.get("CharCode").getAsString(), 
                json.krw.get("Nominal").getAsString(), 
                json.krw.get("Name").getAsString(), 
                json.krw.get("Value").getAsString(), krwmap);
        jpymap = new HashMap<String, String>();
        add(json.jpy.get("CharCode").getAsString(), 
                json.jpy.get("Nominal").getAsString(), 
                json.jpy.get("Name").getAsString(), 
                json.jpy.get("Value").getAsString(), jpymap);
        rubmap = new HashMap<String, String>();
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
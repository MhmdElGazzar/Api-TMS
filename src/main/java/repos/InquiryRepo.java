package repos;

import models.InquiryBody;

import java.util.HashMap;
import java.util.Map;

public class InquiryRepo {
   static Map<String, InquiryBody> inquiryTestData = new HashMap<>()
    {{
        put("gobus_line",new InquiryBody(System.getProperty("OrangeAccount"),  "36", "6")); //"en"
        put("extraqouta_line",new InquiryBody(System.getProperty("VFAccount"),  "36", "6")); //"en"
        put("shahry_line",new InquiryBody(System.getProperty("EtisalatAccount"),  "36", "6")); //"en"
        put("landline",new InquiryBody(System.getProperty("LandlineAccount"),  "36", "6")); //"en"


    }
    };
    public static InquiryBody get(String line)
    {
        return  inquiryTestData.get(line);
    }
}

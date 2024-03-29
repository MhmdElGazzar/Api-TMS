package repos;

import models.FeesBody;

import java.util.HashMap;
import java.util.Map;

public class FeeRepo {
   static Map<String, FeesBody> feeTestData = new HashMap<>()
    {{
        put("ValidFee",new FeesBody(450.7, "36", "6",null)); //"en"
        put("InvalidFee",new FeesBody(450.7, "36", "6",null)); //"en"

    }
    };
    public static FeesBody get(String feeLabel, int brn)
    {
        FeesBody feesBody= feeTestData.get(feeLabel);
        feesBody.brn=brn;
        return  feesBody;
    }
    public static FeesBody get(String feeLabel, int brn, String sequence)
    {
        FeesBody feesBody= feeTestData.get(feeLabel);
        feesBody.brn=brn;
        FeesBody.Datum datum = new FeesBody.Datum();
        datum.key="Sequence";
        datum.value=sequence;
        feesBody.data.add(1,datum);
        return  feesBody;
    }
}

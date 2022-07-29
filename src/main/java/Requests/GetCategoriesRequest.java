package Requests;

import api.GetRequest;
import api.URI;
import models.GetCategoriesResponse;

public class GetCategoriesRequest extends GetRequest {
    public GetCategoriesRequest() {
        super(new URI("https://momkn-test.mkn.com/gateway/"), "api/v2/categories/0", GetCategoriesResponse.class);
    }
    public static void main (String [] args )
    {
        GetCategoriesRequest getCategoriesRequest= new GetCategoriesRequest();
         getCategoriesRequest.send().prettyPrint();
    }
}

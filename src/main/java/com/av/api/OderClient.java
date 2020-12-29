package com.av.api;

import feign.Param;
import feign.RequestLine;

import java.util.List;

public interface OderClient {

       // @RequestLine("GET /api/v2/order/request?apiKey={apikey}&ServiceProviderId=2&NetworkProvider=4&MaximumSms=1&AllowVoiceSms=false")
        @RequestLine("GET /api/v2/order/request?apiKey={apikey}&ServiceProviderId=178&NetworkProvider=4&MaximumSms=1&AllowVoiceSms=false")
        Oders getOder(@Param("apikey") String apikey);
        @RequestLine("GET /api/v2/order/{id}/check?apiKey={apikey}")
        CheckOrderResults checkOder(@Param("id")int id, @Param("apikey") String apikey);
}

# DefaultApi

All URIs are relative to *http://localhost:9003/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**smsSend**](DefaultApi.md#smsSend) | **POST** /sms/send | Send a text message request.



## smsSend

> SmsSendResponse smsSend(smsSendRequest)

Send a text message request.

### Example

```java
// Import classes:
import com.nvt.api.client.ApiClient;
import com.nvt.api.client.ApiException;
import com.nvt.api.client.Configuration;
import com.nvt.api.client.auth.*;
import com.nvt.api.client.model.*;
import com.nvt.api.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:9003/api/v1");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        SmsSendRequest smsSendRequest = new SmsSendRequest(); // SmsSendRequest | 
        try {
            SmsSendResponse result = apiInstance.smsSend(smsSendRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#smsSend");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **smsSendRequest** | [**SmsSendRequest**](SmsSendRequest.md)|  |

### Return type

[**SmsSendResponse**](SmsSendResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | A response to a text message send request. |  -  |


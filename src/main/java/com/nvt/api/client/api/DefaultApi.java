package com.nvt.api.client.api;

import com.nvt.api.client.ApiException;
import com.nvt.api.client.ApiClient;
import com.nvt.api.client.ApiResponse;
import com.nvt.api.client.Configuration;
import com.nvt.api.client.Pair;

import javax.ws.rs.core.GenericType;

import com.nvt.api.client.model.SmsSendRequest;
import com.nvt.api.client.model.SmsSendResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-13T17:14:21.815679+01:00[Europe/Warsaw]")
public class DefaultApi {
  private ApiClient apiClient;

  public DefaultApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DefaultApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API cilent
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API cilent
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Send a text message request.
   * 
   * @param smsSendRequest  (required)
   * @return SmsSendResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 0 </td><td> A response to a text message send request. </td><td>  -  </td></tr>
     </table>
   */
  public SmsSendResponse smsSend(SmsSendRequest smsSendRequest) throws ApiException {
    return smsSendWithHttpInfo(smsSendRequest).getData();
  }

  /**
   * Send a text message request.
   * 
   * @param smsSendRequest  (required)
   * @return ApiResponse&lt;SmsSendResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 0 </td><td> A response to a text message send request. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SmsSendResponse> smsSendWithHttpInfo(SmsSendRequest smsSendRequest) throws ApiException {
    Object localVarPostBody = smsSendRequest;
    
    // verify the required parameter 'smsSendRequest' is set
    if (smsSendRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'smsSendRequest' when calling smsSend");
    }
    
    // create path and map variables
    String localVarPath = "/sms/send";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

    GenericType<SmsSendResponse> localVarReturnType = new GenericType<SmsSendResponse>() {};

    return apiClient.invokeAPI("DefaultApi.smsSend", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}

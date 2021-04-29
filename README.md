# openapi-java-client

sms-client

- API version: 1.0.0

- Build date: 2021-03-13T17:14:21.815679+01:00[Europe/Warsaw]

API for sms-send functions


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Requirements

Building the API client library requires:

1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.openapitools:openapi-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/openapi-java-client-1.0.0.jar`
- `target/lib/*.jar`

## Usage

To add a HTTP proxy for the API client, use `ClientConfig`:
```java

import org.glassfish.jersey.apache.connector.ApacheConnectorProvider;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.ClientProperties;
import com.nvt.api.client.*;
import com.nvt.api.client.api.DefaultApi;

...

ApiClient defaultClient = Configuration.getDefaultApiClient();
ClientConfig clientConfig = defaultClient.getClientConfig();
clientConfig.connectorProvider(new ApacheConnectorProvider());
clientConfig.property(ClientProperties.PROXY_URI, "http://proxy_url_here");
clientConfig.property(ClientProperties.PROXY_USERNAME, "proxy_username");
clientConfig.property(ClientProperties.PROXY_PASSWORD, "proxy_password");
defaultClient.setClientConfig(clientConfig);

DefaultApi apiInstance = new DefaultApi(defaultClient);

```

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.nvt.api.client.*;
import com.nvt.api.client.auth.*;
import com.nvt.api.client.model.*;
import com.nvt.api.client.api.DefaultApi;

public class DefaultApiExample {

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

## Documentation for API Endpoints

All URIs are relative to *http://localhost:9003/api/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**smsSend**](docs/DefaultApi.md#smsSend) | **POST** /sms/send | Send a text message request.


## Documentation for Models

 - [SmsSendRequest](docs/SmsSendRequest.md)
 - [SmsSendResponse](docs/SmsSendResponse.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### ApiKeyAuth


- **Type**: API key
- **API key parameter name**: X-Auth-Token
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author




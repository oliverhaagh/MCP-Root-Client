# AttestorControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAttestorUsingPOST**](AttestorControllerApi.md#createAttestorUsingPOST) | **POST** /api/attestor | createAttestor
[**getAttestorUsingGET**](AttestorControllerApi.md#getAttestorUsingGET) | **GET** /api/attestor/{id} | getAttestor
[**getAttestorsUsingGET**](AttestorControllerApi.md#getAttestorsUsingGET) | **GET** /api/attestors | getAttestors

<a name="createAttestorUsingPOST"></a>
# **createAttestorUsingPOST**
> Attestor createAttestorUsingPOST(body)

createAttestor

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AttestorControllerApi;


AttestorControllerApi apiInstance = new AttestorControllerApi();
String body = "body_example"; // String | 
try {
    Attestor result = apiInstance.createAttestorUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttestorControllerApi#createAttestorUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**String**](String.md)|  | [optional]

### Return type

[**Attestor**](Attestor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/pem-certificate-chain
 - **Accept**: application/json

<a name="getAttestorUsingGET"></a>
# **getAttestorUsingGET**
> Attestor getAttestorUsingGET(id)

getAttestor

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AttestorControllerApi;


AttestorControllerApi apiInstance = new AttestorControllerApi();
Long id = 789L; // Long | id
try {
    Attestor result = apiInstance.getAttestorUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttestorControllerApi#getAttestorUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**Attestor**](Attestor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAttestorsUsingGET"></a>
# **getAttestorsUsingGET**
> List&lt;Attestor&gt; getAttestorsUsingGET()

getAttestors

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AttestorControllerApi;


AttestorControllerApi apiInstance = new AttestorControllerApi();
try {
    List<Attestor> result = apiInstance.getAttestorsUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttestorControllerApi#getAttestorsUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Attestor&gt;**](Attestor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


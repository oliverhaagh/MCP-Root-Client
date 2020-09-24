# RevocationControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRevocationUsingPOST**](RevocationControllerApi.md#createRevocationUsingPOST) | **POST** /api/revocation | createRevocation
[**getRevocationUsingGET**](RevocationControllerApi.md#getRevocationUsingGET) | **GET** /api/revocation/{id} | getRevocation
[**getRevocationsUsingGET**](RevocationControllerApi.md#getRevocationsUsingGET) | **GET** /api/revocations | getRevocations

<a name="createRevocationUsingPOST"></a>
# **createRevocationUsingPOST**
> Revocation createRevocationUsingPOST(body)

createRevocation

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RevocationControllerApi;


RevocationControllerApi apiInstance = new RevocationControllerApi();
RevocationRequest body = new RevocationRequest(); // RevocationRequest | 
try {
    Revocation result = apiInstance.createRevocationUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RevocationControllerApi#createRevocationUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RevocationRequest**](RevocationRequest.md)|  | [optional]

### Return type

[**Revocation**](Revocation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRevocationUsingGET"></a>
# **getRevocationUsingGET**
> Revocation getRevocationUsingGET(id)

getRevocation

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RevocationControllerApi;


RevocationControllerApi apiInstance = new RevocationControllerApi();
Long id = 789L; // Long | id
try {
    Revocation result = apiInstance.getRevocationUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RevocationControllerApi#getRevocationUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**Revocation**](Revocation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRevocationsUsingGET"></a>
# **getRevocationsUsingGET**
> List&lt;Revocation&gt; getRevocationsUsingGET()

getRevocations

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RevocationControllerApi;


RevocationControllerApi apiInstance = new RevocationControllerApi();
try {
    List<Revocation> result = apiInstance.getRevocationsUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RevocationControllerApi#getRevocationsUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Revocation&gt;**](Revocation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


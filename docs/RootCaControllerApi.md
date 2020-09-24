# RootCaControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRootCAUsingPOST**](RootCaControllerApi.md#createRootCAUsingPOST) | **POST** /api/root | createRootCA
[**getRootCAUsingGET**](RootCaControllerApi.md#getRootCAUsingGET) | **GET** /api/root/{id} | getRootCA
[**getRootCAsUsingGET**](RootCaControllerApi.md#getRootCAsUsingGET) | **GET** /api/roots | getRootCAs

<a name="createRootCAUsingPOST"></a>
# **createRootCAUsingPOST**
> RootCA createRootCAUsingPOST(body)

createRootCA

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RootCaControllerApi;


RootCaControllerApi apiInstance = new RootCaControllerApi();
String body = "body_example"; // String | 
try {
    RootCA result = apiInstance.createRootCAUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RootCaControllerApi#createRootCAUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**String**](String.md)|  | [optional]

### Return type

[**RootCA**](RootCA.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-pem-file
 - **Accept**: application/json

<a name="getRootCAUsingGET"></a>
# **getRootCAUsingGET**
> RootCA getRootCAUsingGET(id)

getRootCA

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RootCaControllerApi;


RootCaControllerApi apiInstance = new RootCaControllerApi();
Long id = 789L; // Long | id
try {
    RootCA result = apiInstance.getRootCAUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RootCaControllerApi#getRootCAUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**RootCA**](RootCA.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRootCAsUsingGET"></a>
# **getRootCAsUsingGET**
> List&lt;RootCA&gt; getRootCAsUsingGET(attestorId)

getRootCAs

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RootCaControllerApi;


RootCaControllerApi apiInstance = new RootCaControllerApi();
Long attestorId = 789L; // Long | attestorId
try {
    List<RootCA> result = apiInstance.getRootCAsUsingGET(attestorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RootCaControllerApi#getRootCAsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attestorId** | **Long**| attestorId | [optional]

### Return type

[**List&lt;RootCA&gt;**](RootCA.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


# AttestationControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAttestationUsingPOST**](AttestationControllerApi.md#createAttestationUsingPOST) | **POST** /api/attestation | createAttestation
[**getAttestationUsingGET**](AttestationControllerApi.md#getAttestationUsingGET) | **GET** /api/attestation/{id} | getAttestation
[**getAttestationsUsingGET**](AttestationControllerApi.md#getAttestationsUsingGET) | **GET** /api/attestations | getAttestations

<a name="createAttestationUsingPOST"></a>
# **createAttestationUsingPOST**
> Attestation createAttestationUsingPOST(body)

createAttestation

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AttestationControllerApi;


AttestationControllerApi apiInstance = new AttestationControllerApi();
AttestationRequest body = new AttestationRequest(); // AttestationRequest | 
try {
    Attestation result = apiInstance.createAttestationUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttestationControllerApi#createAttestationUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AttestationRequest**](AttestationRequest.md)|  | [optional]

### Return type

[**Attestation**](Attestation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAttestationUsingGET"></a>
# **getAttestationUsingGET**
> Attestation getAttestationUsingGET(id)

getAttestation

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AttestationControllerApi;


AttestationControllerApi apiInstance = new AttestationControllerApi();
Long id = 789L; // Long | id
try {
    Attestation result = apiInstance.getAttestationUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttestationControllerApi#getAttestationUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**Attestation**](Attestation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAttestationsUsingGET"></a>
# **getAttestationsUsingGET**
> List&lt;Attestation&gt; getAttestationsUsingGET()

getAttestations

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AttestationControllerApi;


AttestationControllerApi apiInstance = new AttestationControllerApi();
try {
    List<Attestation> result = apiInstance.getAttestationsUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttestationControllerApi#getAttestationsUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Attestation&gt;**](Attestation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


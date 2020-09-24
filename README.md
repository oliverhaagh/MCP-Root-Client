# swagger-java-client

MCP Root CA Service
- API version: 1.0.0
  - Build date: 2020-09-23T12:06:32.267Z[GMT]

Service for maintaining a list of root CAs

  For more information, please visit [https://maritimeconnectivity.net](https://maritimeconnectivity.net)

*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


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
  <groupId>io.swagger</groupId>
  <artifactId>swagger-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/swagger-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AttestationControllerApi;

import java.io.File;
import java.util.*;

public class AttestationControllerApiExample {

    public static void main(String[] args) {
        
        AttestationControllerApi apiInstance = new AttestationControllerApi();
        AttestationRequest body = new AttestationRequest(); // AttestationRequest | 
        try {
            Attestation result = apiInstance.createAttestationUsingPOST(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AttestationControllerApi#createAttestationUsingPOST");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AttestationControllerApi;

import java.io.File;
import java.util.*;

public class AttestationControllerApiExample {

    public static void main(String[] args) {
        
        AttestationControllerApi apiInstance = new AttestationControllerApi();
        Long id = 789L; // Long | id
        try {
            Attestation result = apiInstance.getAttestationUsingGET(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AttestationControllerApi#getAttestationUsingGET");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AttestationControllerApi;

import java.io.File;
import java.util.*;

public class AttestationControllerApiExample {

    public static void main(String[] args) {
        
        AttestationControllerApi apiInstance = new AttestationControllerApi();
        try {
            List<Attestation> result = apiInstance.getAttestationsUsingGET();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AttestationControllerApi#getAttestationsUsingGET");
            e.printStackTrace();
        }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *http://localhost:8080*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AttestationControllerApi* | [**createAttestationUsingPOST**](docs/AttestationControllerApi.md#createAttestationUsingPOST) | **POST** /api/attestation | createAttestation
*AttestationControllerApi* | [**getAttestationUsingGET**](docs/AttestationControllerApi.md#getAttestationUsingGET) | **GET** /api/attestation/{id} | getAttestation
*AttestationControllerApi* | [**getAttestationsUsingGET**](docs/AttestationControllerApi.md#getAttestationsUsingGET) | **GET** /api/attestations | getAttestations
*AttestorControllerApi* | [**createAttestorUsingPOST**](docs/AttestorControllerApi.md#createAttestorUsingPOST) | **POST** /api/attestor | createAttestor
*AttestorControllerApi* | [**getAttestorUsingGET**](docs/AttestorControllerApi.md#getAttestorUsingGET) | **GET** /api/attestor/{id} | getAttestor
*AttestorControllerApi* | [**getAttestorsUsingGET**](docs/AttestorControllerApi.md#getAttestorsUsingGET) | **GET** /api/attestors | getAttestors
*RevocationControllerApi* | [**createRevocationUsingPOST**](docs/RevocationControllerApi.md#createRevocationUsingPOST) | **POST** /api/revocation | createRevocation
*RevocationControllerApi* | [**getRevocationUsingGET**](docs/RevocationControllerApi.md#getRevocationUsingGET) | **GET** /api/revocation/{id} | getRevocation
*RevocationControllerApi* | [**getRevocationsUsingGET**](docs/RevocationControllerApi.md#getRevocationsUsingGET) | **GET** /api/revocations | getRevocations
*RootCaControllerApi* | [**createRootCAUsingPOST**](docs/RootCaControllerApi.md#createRootCAUsingPOST) | **POST** /api/root | createRootCA
*RootCaControllerApi* | [**getRootCAUsingGET**](docs/RootCaControllerApi.md#getRootCAUsingGET) | **GET** /api/root/{id} | getRootCA
*RootCaControllerApi* | [**getRootCAsUsingGET**](docs/RootCaControllerApi.md#getRootCAsUsingGET) | **GET** /api/roots | getRootCAs

## Documentation for Models

 - [Attestation](docs/Attestation.md)
 - [AttestationRequest](docs/AttestationRequest.md)
 - [Attestor](docs/Attestor.md)
 - [Revocation](docs/Revocation.md)
 - [RevocationRequest](docs/RevocationRequest.md)
 - [RootCA](docs/RootCA.md)

## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

info@maritimeconnectivity.net
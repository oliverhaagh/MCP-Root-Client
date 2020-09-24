# AttestationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**algorithmIdentifier** | **String** | The algorithm identifier of the signature | 
**attestorId** | **Long** | The ID of the attestor making the attestation | 
**rootCAid** | **Long** | The ID of the root CA being attested | 
**signature** | **String** | The HEX encoded signature that is made by signing the certificate of the root CAwith the private key of the attestor | 

# RevocationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**algorithmIdentifier** | **String** | The algorithm identifier of the signature | 
**attestationId** | **Long** | The ID of the attestation that is being revoked | 
**attestorId** | **Long** | The ID of the attestor making the attestation | 
**rootCAid** | **Long** | The ID of the root CA being revoked | 
**signature** | **String** | The HEX encoded signature that is made by signing the original attestation signature of the root CAwith the private key of the attestor | 

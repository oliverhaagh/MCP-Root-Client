# Revocation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**algorithmIdentifier** | **String** | The identifier of the algorithm that was used to generate the signature | 
**attestation** | [**Attestation**](Attestation.md) |  |  [optional]
**attestor** | [**Attestor**](Attestor.md) |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**id** | **Long** |  |  [optional]
**rootCA** | [**RootCA**](RootCA.md) |  |  [optional]
**signature** | **String** | HEX encoded signature signed with the private key of the attestor | 

# Attestation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**algorithmIdentifier** | **String** | The identifier of the algorithm that was used to generate the signature | 
**attestor** | [**Attestor**](Attestor.md) |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**id** | **Long** |  |  [optional]
**revocation** | [**Revocation**](Revocation.md) |  |  [optional]
**rootCA** | [**RootCA**](RootCA.md) |  |  [optional]
**signature** | **String** | HEX encoded signature signed with the private key of the attestor | 

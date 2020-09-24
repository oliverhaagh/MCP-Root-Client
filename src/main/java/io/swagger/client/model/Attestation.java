/*
 * MCP Root CA Service
 * Service for maintaining a list of root CAs
 *
 * OpenAPI spec version: 1.0.0
 * Contact: info@maritimeconnectivity.net
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.Attestor;
import io.swagger.client.model.Revocation;
import io.swagger.client.model.RootCA;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * Attestation
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-09-23T12:06:32.267Z[GMT]")
public class Attestation {
  @SerializedName("algorithmIdentifier")
  private String algorithmIdentifier = null;

  @SerializedName("attestor")
  private Attestor attestor = null;

  @SerializedName("createdAt")
  private OffsetDateTime createdAt = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("revocation")
  private Revocation revocation = null;

  @SerializedName("rootCA")
  private RootCA rootCA = null;

  @SerializedName("signature")
  private String signature = null;

  public Attestation algorithmIdentifier(String algorithmIdentifier) {
    this.algorithmIdentifier = algorithmIdentifier;
    return this;
  }

   /**
   * The identifier of the algorithm that was used to generate the signature
   * @return algorithmIdentifier
  **/
  @Schema(required = true, description = "The identifier of the algorithm that was used to generate the signature")
  public String getAlgorithmIdentifier() {
    return algorithmIdentifier;
  }

  public void setAlgorithmIdentifier(String algorithmIdentifier) {
    this.algorithmIdentifier = algorithmIdentifier;
  }

  public Attestation attestor(Attestor attestor) {
    this.attestor = attestor;
    return this;
  }

   /**
   * Get attestor
   * @return attestor
  **/
  @Schema(description = "")
  public Attestor getAttestor() {
    return attestor;
  }

  public void setAttestor(Attestor attestor) {
    this.attestor = attestor;
  }

  public Attestation createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @Schema(description = "")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public Attestation id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Attestation revocation(Revocation revocation) {
    this.revocation = revocation;
    return this;
  }

   /**
   * Get revocation
   * @return revocation
  **/
  @Schema(description = "")
  public Revocation getRevocation() {
    return revocation;
  }

  public void setRevocation(Revocation revocation) {
    this.revocation = revocation;
  }

  public Attestation rootCA(RootCA rootCA) {
    this.rootCA = rootCA;
    return this;
  }

   /**
   * Get rootCA
   * @return rootCA
  **/
  @Schema(description = "")
  public RootCA getRootCA() {
    return rootCA;
  }

  public void setRootCA(RootCA rootCA) {
    this.rootCA = rootCA;
  }

  public Attestation signature(String signature) {
    this.signature = signature;
    return this;
  }

   /**
   * HEX encoded signature signed with the private key of the attestor
   * @return signature
  **/
  @Schema(required = true, description = "HEX encoded signature signed with the private key of the attestor")
  public String getSignature() {
    return signature;
  }

  public void setSignature(String signature) {
    this.signature = signature;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Attestation attestation = (Attestation) o;
    return Objects.equals(this.algorithmIdentifier, attestation.algorithmIdentifier) &&
        Objects.equals(this.attestor, attestation.attestor) &&
        Objects.equals(this.createdAt, attestation.createdAt) &&
        Objects.equals(this.id, attestation.id) &&
        Objects.equals(this.revocation, attestation.revocation) &&
        Objects.equals(this.rootCA, attestation.rootCA) &&
        Objects.equals(this.signature, attestation.signature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(algorithmIdentifier, attestor, createdAt, id, revocation, rootCA, signature);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attestation {\n");
    
    sb.append("    algorithmIdentifier: ").append(toIndentedString(algorithmIdentifier)).append("\n");
    sb.append("    attestor: ").append(toIndentedString(attestor)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    revocation: ").append(toIndentedString(revocation)).append("\n");
    sb.append("    rootCA: ").append(toIndentedString(rootCA)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
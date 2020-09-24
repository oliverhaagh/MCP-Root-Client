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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * Attestor
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-09-23T12:06:32.267Z[GMT]")
public class Attestor {
  @SerializedName("certificate")
  private String certificate = null;

  @SerializedName("createdAt")
  private OffsetDateTime createdAt = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("issuer")
  private String issuer = null;

  @SerializedName("name")
  private String name = null;

  public Attestor certificate(String certificate) {
    this.certificate = certificate;
    return this;
  }

   /**
   * PEM encoded certificate of the entity
   * @return certificate
  **/
  @Schema(required = true, description = "PEM encoded certificate of the entity")
  public String getCertificate() {
    return certificate;
  }

  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }

  public Attestor createdAt(OffsetDateTime createdAt) {
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

  public Attestor id(Long id) {
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

  public Attestor issuer(String issuer) {
    this.issuer = issuer;
    return this;
  }

   /**
   * The CA that has issued the certificate of this attestor
   * @return issuer
  **/
  @Schema(description = "The CA that has issued the certificate of this attestor")
  public String getIssuer() {
    return issuer;
  }

  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }

  public Attestor name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name that identifies the entity
   * @return name
  **/
  @Schema(required = true, description = "The name that identifies the entity")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Attestor attestor = (Attestor) o;
    return Objects.equals(this.certificate, attestor.certificate) &&
        Objects.equals(this.createdAt, attestor.createdAt) &&
        Objects.equals(this.id, attestor.id) &&
        Objects.equals(this.issuer, attestor.issuer) &&
        Objects.equals(this.name, attestor.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificate, createdAt, id, issuer, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attestor {\n");
    
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

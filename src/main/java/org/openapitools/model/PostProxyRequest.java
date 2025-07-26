package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PostProxyRequest
 */

@JsonTypeName("postProxy_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-07-26T19:35:46.310079470-04:00[America/New_York]", comments = "Generator version: 7.14.0")
public class PostProxyRequest {

  private @Nullable String url;

  private @Nullable Object payload;

  public PostProxyRequest url(@Nullable String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
   */
  
  @Schema(name = "url", example = "https://example.com", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("url")
  public @Nullable String getUrl() {
    return url;
  }

  public void setUrl(@Nullable String url) {
    this.url = url;
  }

  public PostProxyRequest payload(@Nullable Object payload) {
    this.payload = payload;
    return this;
  }

  /**
   * Get payload
   * @return payload
   */
  
  @Schema(name = "payload", example = "{\"key\":\"value\"}", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("payload")
  public @Nullable Object getPayload() {
    return payload;
  }

  public void setPayload(@Nullable Object payload) {
    this.payload = payload;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostProxyRequest postProxyRequest = (PostProxyRequest) o;
    return Objects.equals(this.url, postProxyRequest.url) &&
        Objects.equals(this.payload, postProxyRequest.payload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, payload);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostProxyRequest {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


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
 * PostLogin200Response
 */

@JsonTypeName("postLogin_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-07-27T17:46:50.636306-04:00[America/New_York]", comments = "Generator version: 7.14.0")
public class PostLogin200Response {

  private @Nullable String token;

  public PostLogin200Response token(@Nullable String token) {
    this.token = token;
    return this;
  }

  /**
   * Get token
   * @return token
   */
  
  @Schema(name = "token", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("token")
  public @Nullable String getToken() {
    return token;
  }

  public void setToken(@Nullable String token) {
    this.token = token;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostLogin200Response postLogin200Response = (PostLogin200Response) o;
    return Objects.equals(this.token, postLogin200Response.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostLogin200Response {\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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


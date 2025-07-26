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
 * PostProxy200Response
 */

@JsonTypeName("postProxy_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-07-26T19:35:46.310079470-04:00[America/New_York]", comments = "Generator version: 7.14.0")
public class PostProxy200Response {

  private @Nullable Object response;

  public PostProxy200Response response(@Nullable Object response) {
    this.response = response;
    return this;
  }

  /**
   * Get response
   * @return response
   */
  
  @Schema(name = "response", example = "{\"key\":\"value\"}", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("response")
  public @Nullable Object getResponse() {
    return response;
  }

  public void setResponse(@Nullable Object response) {
    this.response = response;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostProxy200Response postProxy200Response = (PostProxy200Response) o;
    return Objects.equals(this.response, postProxy200Response.response);
  }

  @Override
  public int hashCode() {
    return Objects.hash(response);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostProxy200Response {\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
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


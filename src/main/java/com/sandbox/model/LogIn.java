package com.sandbox.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * LogIn
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-27T20:59:23.376174800+03:00[Europe/Minsk]")
public class LogIn {

  @JsonProperty("email")
  private String email;

  @JsonProperty("password")
  private String password;

  public LogIn email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  */
  @Pattern(regexp = "^[a-z0-9]+[\\.]{0,1}[a-z0-9]+@[a-z0-9]+\\.[a-z]{2,4}$") @Size(max = 254) 
  @Schema(name = "email", required = false)
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public LogIn password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
  */
  @Pattern(regexp = "^[a-zA-Z0-9!@#\\$%\\^\\&*\\)\\(/+=._-]") @Size(min = 8, max = 100) 
  @Schema(name = "password", required = false)
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogIn logIn = (LogIn) o;
    return Objects.equals(this.email, logIn.email) &&
        Objects.equals(this.password, logIn.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogIn {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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


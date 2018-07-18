package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Error
 */
@Validated

public class Error   {
  @JsonProperty("errText")
  private String errText = null;

  @JsonProperty("errNumber")
  private Integer errNumber = null;

  public Error errText(String errText) {
    this.errText = errText;
    return this;
  }

  /**
   * Get errText
   * @return errText
  **/
  @ApiModelProperty(example = "Invalid license ID", required = true, value = "")
  @NotNull


  public String getErrText() {
    return errText;
  }

  public void setErrText(String errText) {
    this.errText = errText;
  }

  public Error errNumber(Integer errNumber) {
    this.errNumber = errNumber;
    return this;
  }

  /**
   * Get errNumber
   * @return errNumber
  **/
  @ApiModelProperty(example = "4711", required = true, value = "")
  @NotNull


  public Integer getErrNumber() {
    return errNumber;
  }

  public void setErrNumber(Integer errNumber) {
    this.errNumber = errNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.errText, error.errText) &&
        Objects.equals(this.errNumber, error.errNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errText, errNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    errText: ").append(toIndentedString(errText)).append("\n");
    sb.append("    errNumber: ").append(toIndentedString(errNumber)).append("\n");
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


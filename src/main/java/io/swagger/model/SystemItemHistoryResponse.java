package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.SystemItemHistoryUnit;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SystemItemHistoryResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-09-15T16:26:27.612Z[GMT]")


public class SystemItemHistoryResponse   {
  @JsonProperty("items")
  @Valid
  private List<SystemItemHistoryUnit> items = null;

  public SystemItemHistoryResponse items(List<SystemItemHistoryUnit> items) {
    this.items = items;
    return this;
  }

  public SystemItemHistoryResponse addItemsItem(SystemItemHistoryUnit itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<SystemItemHistoryUnit>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * История в произвольном порядке.
   * @return items
   **/
  @Schema(description = "История в произвольном порядке.")
      @Valid
    public List<SystemItemHistoryUnit> getItems() {
    return items;
  }

  public void setItems(List<SystemItemHistoryUnit> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemItemHistoryResponse systemItemHistoryResponse = (SystemItemHistoryResponse) o;
    return Objects.equals(this.items, systemItemHistoryResponse.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemItemHistoryResponse {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

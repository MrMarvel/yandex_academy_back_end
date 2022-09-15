package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.SystemItemImport;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SystemItemImportRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-09-15T16:26:27.612Z[GMT]")


public class SystemItemImportRequest   {
  @JsonProperty("items")
  @Valid
  private List<SystemItemImport> items = null;

  @JsonProperty("updateDate")
  private OffsetDateTime updateDate = null;

  public SystemItemImportRequest items(List<SystemItemImport> items) {
    this.items = items;
    return this;
  }

  public SystemItemImportRequest addItemsItem(SystemItemImport itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<SystemItemImport>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Импортируемые элементы
   * @return items
   **/
  @Schema(description = "Импортируемые элементы")
      @Valid
    public List<SystemItemImport> getItems() {
    return items;
  }

  public void setItems(List<SystemItemImport> items) {
    this.items = items;
  }

  public SystemItemImportRequest updateDate(OffsetDateTime updateDate) {
    this.updateDate = updateDate;
    return this;
  }

  /**
   * Время обновления добавляемых элементов.
   * @return updateDate
   **/
  @Schema(example = "2022-05-28T21:12:01Z", description = "Время обновления добавляемых элементов.")
  
    @Valid
    public OffsetDateTime getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(OffsetDateTime updateDate) {
    this.updateDate = updateDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemItemImportRequest systemItemImportRequest = (SystemItemImportRequest) o;
    return Objects.equals(this.items, systemItemImportRequest.items) &&
        Objects.equals(this.updateDate, systemItemImportRequest.updateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, updateDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemItemImportRequest {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
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

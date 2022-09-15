package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.SystemItemType;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SystemItemHistoryUnit
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-09-15T16:26:27.612Z[GMT]")


public class SystemItemHistoryUnit   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("parentId")
  private String parentId = null;

  @JsonProperty("type")
  private SystemItemType type = null;

  @JsonProperty("size")
  private Long size = null;

  @JsonProperty("date")
  private OffsetDateTime date = null;

  public SystemItemHistoryUnit id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Уникальный идентфикатор
   * @return id
   **/
  @Schema(example = "элемент_1_1", required = true, description = "Уникальный идентфикатор")
      @NotNull

    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SystemItemHistoryUnit url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Ссылка на файл. Для папок поле равнно null.
   * @return url
   **/
  @Schema(description = "Ссылка на файл. Для папок поле равнно null.")
  
    public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public SystemItemHistoryUnit parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * id родительской папки
   * @return parentId
   **/
  @Schema(example = "элемент_1_1", description = "id родительской папки")
  
    public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public SystemItemHistoryUnit type(SystemItemType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public SystemItemType getType() {
    return type;
  }

  public void setType(SystemItemType type) {
    this.type = type;
  }

  public SystemItemHistoryUnit size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * Целое число, для папки - это суммарный размер всех её элементов.
   * @return size
   **/
  @Schema(description = "Целое число, для папки - это суммарный размер всех её элементов.")
  
    public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public SystemItemHistoryUnit date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

  /**
   * Время последнего обновления элемента.
   * @return date
   **/
  @Schema(required = true, description = "Время последнего обновления элемента.")
      @NotNull

    @Valid
    public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemItemHistoryUnit systemItemHistoryUnit = (SystemItemHistoryUnit) o;
    return Objects.equals(this.id, systemItemHistoryUnit.id) &&
        Objects.equals(this.url, systemItemHistoryUnit.url) &&
        Objects.equals(this.parentId, systemItemHistoryUnit.parentId) &&
        Objects.equals(this.type, systemItemHistoryUnit.type) &&
        Objects.equals(this.size, systemItemHistoryUnit.size) &&
        Objects.equals(this.date, systemItemHistoryUnit.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url, parentId, type, size, date);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemItemHistoryUnit {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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

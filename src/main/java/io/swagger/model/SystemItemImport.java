package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.SystemItemType;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SystemItemImport
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-09-15T16:26:27.612Z[GMT]")


public class SystemItemImport   {
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

  public SystemItemImport id(String id) {
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

  public SystemItemImport url(String url) {
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

  public SystemItemImport parentId(String parentId) {
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

  public SystemItemImport type(SystemItemType type) {
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

  public SystemItemImport size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * Целое число, для папок поле должно содержать null.
   * @return size
   **/
  @Schema(description = "Целое число, для папок поле должно содержать null.")
  
    public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemItemImport systemItemImport = (SystemItemImport) o;
    return Objects.equals(this.id, systemItemImport.id) &&
        Objects.equals(this.url, systemItemImport.url) &&
        Objects.equals(this.parentId, systemItemImport.parentId) &&
        Objects.equals(this.type, systemItemImport.type) &&
        Objects.equals(this.size, systemItemImport.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url, parentId, type, size);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemItemImport {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

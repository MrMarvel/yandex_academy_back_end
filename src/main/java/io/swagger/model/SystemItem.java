package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.SystemItem;
import io.swagger.model.SystemItemType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SystemItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-09-15T16:26:27.612Z[GMT]")


public class SystemItem   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("date")
  private OffsetDateTime date = null;

  @JsonProperty("parentId")
  private String parentId = null;

  @JsonProperty("type")
  private SystemItemType type = null;

  @JsonProperty("size")
  private Long size = null;

  @JsonProperty("children")
  @Valid
  private List<SystemItem> children = null;

  public SystemItem id(String id) {
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

  public SystemItem url(String url) {
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

  public SystemItem date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

  /**
   * Время последнего обновления элемента.
   * @return date
   **/
  @Schema(example = "2022-05-28T21:12:01Z", required = true, description = "Время последнего обновления элемента.")
      @NotNull

    @Valid
    public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public SystemItem parentId(String parentId) {
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

  public SystemItem type(SystemItemType type) {
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

  public SystemItem size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * Целое число, для папки - это суммарный размер всех элеметов.
   * @return size
   **/
  @Schema(description = "Целое число, для папки - это суммарный размер всех элеметов.")
  
    public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public SystemItem children(List<SystemItem> children) {
    this.children = children;
    return this;
  }

  public SystemItem addChildrenItem(SystemItem childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<SystemItem>();
    }
    this.children.add(childrenItem);
    return this;
  }

  /**
   * Список всех дочерних элементов. Для файлов поле равно null.
   * @return children
   **/
  @Schema(description = "Список всех дочерних элементов. Для файлов поле равно null.")
      @Valid
    public List<SystemItem> getChildren() {
    return children;
  }

  public void setChildren(List<SystemItem> children) {
    this.children = children;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemItem systemItem = (SystemItem) o;
    return Objects.equals(this.id, systemItem.id) &&
        Objects.equals(this.url, systemItem.url) &&
        Objects.equals(this.date, systemItem.date) &&
        Objects.equals(this.parentId, systemItem.parentId) &&
        Objects.equals(this.type, systemItem.type) &&
        Objects.equals(this.size, systemItem.size) &&
        Objects.equals(this.children, systemItem.children);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url, date, parentId, type, size, children);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
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

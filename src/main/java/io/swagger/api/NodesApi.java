/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.35).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.SystemItem;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-09-15T16:26:27.612Z[GMT]")
@Validated
public interface NodesApi {

    @Operation(summary = "", description = "Получить информацию об элементе по идентификатору. При получении информации о папке также предоставляется информация о её дочерних элементах.  - для пустой папки поле children равно пустому массиву, а для файла равно null - размер папки - это суммарный размер всех её элементов. Если папка не содержит элементов, то размер равен 0. При обновлении размера элемента, суммарный размер папки, которая содержит этот элемент, тоже обновляется. ", tags={ "Базовые задачи" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Информация об элементе.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = SystemItem.class))),
        
        @ApiResponse(responseCode = "404", description = "Элемент не найден.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))) })
    @RequestMapping(value = "/nodes/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<SystemItem> nodesIdGet(@Parameter(in = ParameterIn.PATH, description = "Идентификатор элемента", required=true, schema=@Schema()) @PathVariable("id") String id);

}


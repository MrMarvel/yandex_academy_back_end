package io.swagger.api;

import io.swagger.model.Error;
import org.threeten.bp.OffsetDateTime;
import io.swagger.model.SystemItemHistoryResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-09-15T16:26:27.612Z[GMT]")
@RestController
public class UpdatesApiController implements UpdatesApi {

    private static final Logger log = LoggerFactory.getLogger(UpdatesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public UpdatesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<SystemItemHistoryResponse> updatesGet(@NotNull @Parameter(in = ParameterIn.QUERY, description = "???????? ?? ?????????? ??????????????. ???????? ???????????? ???????????????????????????? ???????????????? ISO 8601 (?????????? ???????????????????????????? OpenAPI). ???????? ???????? ???? ?????????????????????????? ?????????????? ??????????????, ???????????????????? ???????????????? 400" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "date", required = true) OffsetDateTime date) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<SystemItemHistoryResponse>(objectMapper.readValue("{\n  \"items\" : [ {\n    \"id\" : \"??????????????_1_4\",\n    \"url\" : \"/file/url1\",\n    \"date\" : \"2022-05-28T21:12:01.000Z\",\n    \"parentId\" : \"??????????????_1_1\",\n    \"size\" : 234,\n    \"type\" : \"FILE\"\n  }, {\n    \"id\" : \"??????????????_1_4\",\n    \"url\" : \"/file/url1\",\n    \"date\" : \"2022-05-28T21:12:01.000Z\",\n    \"parentId\" : \"??????????????_1_1\",\n    \"size\" : 234,\n    \"type\" : \"FILE\"\n  } ]\n}", SystemItemHistoryResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<SystemItemHistoryResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<SystemItemHistoryResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}

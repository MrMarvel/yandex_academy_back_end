package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.SystemItem;
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
public class NodesApiController implements NodesApi {

    private static final Logger log = LoggerFactory.getLogger(NodesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public NodesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<SystemItem> nodesIdGet(@Parameter(in = ParameterIn.PATH, description = "Идентификатор элемента", required=true, schema=@Schema()) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<SystemItem>(objectMapper.readValue("{\n  \"id\" : \"элемент_1_2\",\n  \"type\" : \"FOLDER\",\n  \"date\" : \"2022-05-28T21:12:01.000Z\",\n  \"size\" : 12,\n  \"children\" : [ {\n    \"url\" : \"/file/url1\",\n    \"id\" : \"элемент_1_3\",\n    \"size\" : 4,\n    \"date\" : \"2022-05-28T21:12:01.000Z\",\n    \"type\" : \"FILE\",\n    \"parentId\" : \"элемент_1_2\"\n  }, {\n    \"type\" : \"FOLDER\",\n    \"id\" : \"элемент_1_1\",\n    \"date\" : \"2022-05-26T21:12:01.000Z\",\n    \"parentId\" : \"элемент_1_2\",\n    \"size\" : 8,\n    \"children\" : [ {\n      \"url\" : \"/file/url2\",\n      \"id\" : \"элемент_1_4\",\n      \"parentId\" : \"элемент_1_1\",\n      \"date\" : \"2022-05-26T21:12:01.000Z\",\n      \"size\" : 8,\n      \"type\" : \"FILE\"\n    } ]\n  } ]\n}", SystemItem.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<SystemItem>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<SystemItem>(HttpStatus.NOT_IMPLEMENTED);
    }

}

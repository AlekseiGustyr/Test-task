/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.0.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.sandbox.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-27T16:53:11.784207700+03:00[Europe/Minsk]")
@Validated
@Tag(name = "hello", description = "the hello API")
public interface HelloApi {

    /**
     * GET /hello : Returns a &#39;hello world&#39; string.
     * Returns a &#39;hello world&#39; string.
     *
     * @return A list of user&#39;s wallets (status code 200)
     */
    @Operation(
        operationId = "hello",
        summary = "Returns a 'hello world' string.",
        tags = { "hello world sample" },
        responses = {
            @ApiResponse(responseCode = "200", description = "A list of user's wallets", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))
            })
        },
        security = {
            @SecurityRequirement(name = "bearerAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/hello",
        produces = { "application/json" }
    )
    ResponseEntity<String> hello(
        
    );

}

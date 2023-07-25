package com.lorandi.assembly.resource;

import com.lorandi.assembly.dto.SurveyDTO;
import com.lorandi.assembly.service.MessengerService;
import com.lorandi.assembly.service.SurveyService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

@RestController
@RequestMapping("/messenger")
@RequiredArgsConstructor
public class MessengerResource {
    private final MessengerService service;
    @GetMapping("/publish/{message}")
    @Operation(summary = "Search survey by id",
            responses = {@ApiResponse(responseCode = "200", description = "Resource successfully retrieved" )})
    public void send(@PathVariable String message) throws IOException, TimeoutException {
        service.send(message);
    }

    @GetMapping("/consumer")
    @Operation(summary = "Search survey by id",
            responses = {@ApiResponse(responseCode = "200", description = "Resource successfully retrieved" )})
    public void consumer() throws IOException, TimeoutException {
        service.consumer();
    }

}

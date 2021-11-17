package com.nixsolutions.dataservice;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.sleuth.Tracer;
import org.springframework.cloud.sleuth.annotation.NewSpan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@Slf4j
@RequiredArgsConstructor
public class DataServiceController {

    private final Tracer tracer;

    @GetMapping("/")
    @NewSpan(name = "getData")
    public String getData() {
        log.info("in get data method");
        Objects.requireNonNull(tracer.currentSpan()).tag("output", "get data for content");
        return "get data for content";
    }

}

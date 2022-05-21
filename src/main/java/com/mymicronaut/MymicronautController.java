package com.mymicronaut;

import io.micronaut.http.annotation.*;

@Controller("/mymicronaut")
public class MymicronautController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}
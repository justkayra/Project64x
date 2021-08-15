package com.semantyca.controller;

import com.semantyca.dto.IPage;
import com.semantyca.service.LocalizationService;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/lang")
@Singleton
public class HomeController {


    private LocalizationService localizationService = new LocalizationService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public IPage sayHello() {
        return  localizationService.getLocalizedPage("home", "en");
    }

}

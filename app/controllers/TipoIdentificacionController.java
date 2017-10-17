package controllers;

import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import javax.inject.Inject;

import services.TipoIdentificacionService;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's tipo identificacion rest.
 */
public class TipoIdentificacionController extends Controller {
    
    private TipoIdentificacionService service;


    @Inject
    private TipoIdentificacionController(TipoIdentificacionService service)
{
    this.service = service;
}
    public Result jsonResult(Result httpResponse) {
        return httpResponse.as("application/json; charset=utf-8");
    }

    public Result getTiposIdentificacion() {
            return jsonResult(ok(Json.toJson(service.getTiposIdentificacion())));
    }
    
}
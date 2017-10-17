package controllers;

import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import javax.inject.Inject;

import services.TipoEstratoService;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's tipo Estrato rest.
 */
public class TipoEstratoController extends Controller {
    
    private TipoEstratoService service;


    @Inject
    private TipoEstratoController(TipoEstratoService service)
{
    this.service = service;
}
    public Result jsonResult(Result httpResponse) {
        return httpResponse.as("application/json; charset=utf-8");
    }

    public Result getTiposEstrato() {
            return jsonResult(ok(Json.toJson(service.getTiposEstrato())));
    }
    
}
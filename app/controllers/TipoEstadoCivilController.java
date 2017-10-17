package controllers;


import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import services.TipoEstadoCivilService;
import javax.inject.Inject;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's tipo identificacion rest.
 */
public class TipoEstadoCivilController extends Controller {

    private TipoEstadoCivilService service;
    
    
        @Inject
        public TipoEstadoCivilController(TipoEstadoCivilService service)
    {
        this.service = service;
    }
        public Result jsonResult(Result httpResponse) {
            return httpResponse.as("application/json; charset=utf-8");
        }
    
        public Result getTiposEstadoCivil() {
                return jsonResult(ok(Json.toJson(service.getTiposEstadoCivil())));
        }
}
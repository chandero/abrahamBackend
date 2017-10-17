package controllers;


import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import services.TipoPersonaService;
import javax.inject.Inject;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's tipo identificacion rest.
 */
public class TipoPersonaController extends Controller {

    private TipoPersonaService service;
    
    
        @Inject
        private TipoPersonaController(TipoPersonaService service)
    {
        this.service = service;
    }
        public Result jsonResult(Result httpResponse) {
            return httpResponse.as("application/json; charset=utf-8");
        }
    
        public Result getTiposPersona() {
                return jsonResult(ok(Json.toJson(service.getTiposPersona())));
        }
}

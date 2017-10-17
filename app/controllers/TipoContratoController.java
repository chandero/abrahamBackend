package controllers;


import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import services.TipoContratoService;
import javax.inject.Inject;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's tipo identificacion rest.
 */
public class TipoContratoController extends Controller {

    private TipoContratoService service;
    
    
        @Inject
        private TipoContratoController(TipoContratoService service)
    {
        this.service = service;
    }
        public Result jsonResult(Result httpResponse) {
            return httpResponse.as("application/json; charset=utf-8");
        }
    
        public Result getTiposContrato() {
                return jsonResult(ok(Json.toJson(service.getTiposContrato())));
        }
}

package controllers;


import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import services.TipoRelacionService;
import javax.inject.Inject;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's tipo identificacion rest.
 */
public class TipoRelacionController extends Controller {

    private TipoRelacionService service;
    
    
        @Inject
        private TipoRelacionController(TipoRelacionService service)
    {
        this.service = service;
    }
        public Result jsonResult(Result httpResponse) {
            return httpResponse.as("application/json; charset=utf-8");
        }
    
        public Result getTiposRelacion() {
                return jsonResult(ok(Json.toJson(service.getTiposRelacion())));
        }
}
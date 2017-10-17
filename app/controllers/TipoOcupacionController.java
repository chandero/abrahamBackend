package controllers;


import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import services.TipoOcupacionService;
import javax.inject.Inject;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's tipo identificacion rest.
 */
public class TipoOcupacionController extends Controller {

    private TipoOcupacionService service;
    
    
        @Inject
        private TipoOcupacionController(TipoOcupacionService service)
    {
        this.service = service;
    }
        public Result jsonResult(Result httpResponse) {
            return httpResponse.as("application/json; charset=utf-8");
        }
    
        public Result getTiposOcupacion() {
                return jsonResult(ok(Json.toJson(service.getTiposOcupacion())));
        }
}

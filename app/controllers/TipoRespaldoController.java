package controllers;


import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import services.TipoRespaldoService;
import javax.inject.Inject;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's tipo identificacion rest.
 */
public class TipoRespaldoController extends Controller {

    private TipoRespaldoService service;
    
    
        @Inject
        private TipoRespaldoController(TipoRespaldoService service)
    {
        this.service = service;
    }
        public Result jsonResult(Result httpResponse) {
            return httpResponse.as("application/json; charset=utf-8");
        }
    
        public Result getTiposRespaldo() {
                return jsonResult(ok(Json.toJson(service.getTiposRespaldo())));
        }
}
package controllers;


import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import services.TipoReferenciaService;
import javax.inject.Inject;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's tipo identificacion rest.
 */
public class TipoReferenciaController extends Controller {

    private TipoReferenciaService service;
    
    
        @Inject
        private TipoReferenciaController(TipoReferenciaService service)
    {
        this.service = service;
    }
        public Result jsonResult(Result httpResponse) {
            return httpResponse.as("application/json; charset=utf-8");
        }
    
        public Result getTiposReferencia() {
                return jsonResult(ok(Json.toJson(service.getTiposReferencia())));
        }
}
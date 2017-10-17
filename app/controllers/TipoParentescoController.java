package controllers;


import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import services.TipoParentescoService;
import javax.inject.Inject;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's tipo identificacion rest.
 */
public class TipoParentescoController extends Controller {

    private TipoParentescoService service;
    
    
        @Inject
        private TipoParentescoController(TipoParentescoService service)
    {
        this.service = service;
    }
        public Result jsonResult(Result httpResponse) {
            return httpResponse.as("application/json; charset=utf-8");
        }
    
        public Result getTiposParentesco() {
                return jsonResult(ok(Json.toJson(service.getTiposParentesco())));
        }
}
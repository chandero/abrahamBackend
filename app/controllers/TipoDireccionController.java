package controllers;


import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import services.TipoDireccionService;
import javax.inject.Inject;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's tipo identificacion rest.
 */
public class TipoDireccionController extends Controller {

    private TipoDireccionService service;
    
    
        @Inject
        private TipoDireccionController(TipoDireccionService service)
    {
        this.service = service;
    }
        public Result jsonResult(Result httpResponse) {
            return httpResponse.as("application/json; charset=utf-8");
        }
    
        public Result getTiposDireccion() {
                return jsonResult(ok(Json.toJson(service.getTiposDireccion())));
        }
}

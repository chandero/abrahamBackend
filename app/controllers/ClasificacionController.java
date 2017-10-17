package controllers;


import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import services.ClasificacionService;
import javax.inject.Inject;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's tipo identificacion rest.
 */
public class ClasificacionController extends Controller {

    private ClasificacionService service;
    
    
        @Inject
        private ClasificacionController(ClasificacionService service)
    {
        this.service = service;
    }
        public Result jsonResult(Result httpResponse) {
            return httpResponse.as("application/json; charset=utf-8");
        }
    
        public Result getClasificacions() {
                return jsonResult(ok(Json.toJson(service.getClasificacion())));
        }
}

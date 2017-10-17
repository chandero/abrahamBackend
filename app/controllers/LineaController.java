package controllers;


import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import services.LineaService;
import javax.inject.Inject;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's tipo identificacion rest.
 */
public class LineaController extends Controller {

    private LineaService service;
    
    
        @Inject
        private LineaController(LineaService service)
    {
        this.service = service;
    }
        public Result jsonResult(Result httpResponse) {
            return httpResponse.as("application/json; charset=utf-8");
        }
    
        public Result getLineas() {
                return jsonResult(ok(Json.toJson(service.getLinea())));
        }
}

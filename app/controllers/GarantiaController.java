package controllers;


import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import services.GarantiaService;
import javax.inject.Inject;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's tipo identificacion rest.
 */
public class GarantiaController extends Controller {

    private GarantiaService service;
    
    
        @Inject
        private GarantiaController(GarantiaService service)
    {
        this.service = service;
    }
        public Result jsonResult(Result httpResponse) {
            return httpResponse.as("application/json; charset=utf-8");
        }
    
        public Result getGarantias() {
                return jsonResult(ok(Json.toJson(service.getGarantia())));
        }
}

package controllers;


import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import services.DescuentoService;
import javax.inject.Inject;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's tipo identificacion rest.
 */
public class DescuentoController extends Controller {

    private DescuentoService service;
    
    
        @Inject
        private DescuentoController(DescuentoService service)
    {
        this.service = service;
    }
        public Result jsonResult(Result httpResponse) {
            return httpResponse.as("application/json; charset=utf-8");
        }
    
        public Result getDescuentos() {
                return jsonResult(ok(Json.toJson(service.getDescuento())));
        }
}

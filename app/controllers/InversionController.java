package controllers;


import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import services.InversionService;
import javax.inject.Inject;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's tipo identificacion rest.
 */
public class InversionController extends Controller {

    private InversionService service;
    
    
        @Inject
        private InversionController(InversionService service)
    {
        this.service = service;
    }
        public Result jsonResult(Result httpResponse) {
            return httpResponse.as("application/json; charset=utf-8");
        }
    
        public Result getInversions() {
                return jsonResult(ok(Json.toJson(service.getInversion())));
        }
}

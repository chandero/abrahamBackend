package controllers;


import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import services.EnteAprobadorService;
import javax.inject.Inject;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's tipo identificacion rest.
 */
public class EnteAprobadorController extends Controller {

    private EnteAprobadorService service;
    
    
        @Inject
        private EnteAprobadorController(EnteAprobadorService service)
    {
        this.service = service;
    }
        public Result jsonResult(Result httpResponse) {
            return httpResponse.as("application/json; charset=utf-8");
        }
    
        public Result getEnteAprobadors() {
                return jsonResult(ok(Json.toJson(service.getEnteAprobador())));
        }
}

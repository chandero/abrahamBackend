package controllers;


import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import services.AgenciaService;
import javax.inject.Inject;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's tipo identificacion rest.
 */
public class AgenciaController extends Controller {

    private AgenciaService service;
    
    
        @Inject
        private AgenciaController(AgenciaService service)
    {
        this.service = service;
    }
        public Result jsonResult(Result httpResponse) {
            return httpResponse.as("application/json; charset=utf-8");
        }
    
        public Result getAgencias() {
                return jsonResult(ok(Json.toJson(service.getAgencia())));
        }
}

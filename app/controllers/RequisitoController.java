package controllers;


import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import services.RequisitoService;
import javax.inject.Inject;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's tipo identificacion rest.
 */
public class RequisitoController extends Controller {

    private RequisitoService service;
    
    
        @Inject
        private RequisitoController(RequisitoService service)
    {
        this.service = service;
    }
        public Result jsonResult(Result httpResponse) {
            return httpResponse.as("application/json; charset=utf-8");
        }
    
        public Result getRequisitos() {
                return jsonResult(ok(Json.toJson(service.getRequisito())));
        }
}

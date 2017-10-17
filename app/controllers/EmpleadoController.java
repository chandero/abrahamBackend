package controllers;


import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import services.EmpleadoService;
import javax.inject.Inject;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's tipo identificacion rest.
 */
public class EmpleadoController extends Controller {

    private EmpleadoService service;
    
    
        @Inject
        private EmpleadoController(EmpleadoService service)
    {
        this.service = service;
    }
        public Result jsonResult(Result httpResponse) {
            return httpResponse.as("application/json; charset=utf-8");
        }
    
        public Result getEmpleados() {
                return jsonResult(ok(Json.toJson(service.getEmpleado())));
        }
}
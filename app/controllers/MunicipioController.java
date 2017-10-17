package controllers;


import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import services.MunicipioService;
import javax.inject.Inject;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's tipo identificacion rest.
 */
public class MunicipioController extends Controller {

    private MunicipioService service;
    
    
        @Inject
        private MunicipioController(MunicipioService service)
    {
        this.service = service;
    }
        public Result jsonResult(Result httpResponse) {
            return httpResponse.as("application/json; charset=utf-8");
        }
    
        public Result getMunicipios() {
                return jsonResult(ok(Json.toJson(service.getMunicipio())));
        }
}

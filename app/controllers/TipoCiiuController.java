package controllers;


import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import services.TipoCiiuService;
import javax.inject.Inject;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's tipo identificacion rest.
 */
public class TipoCiiuController extends Controller {

    private TipoCiiuService service;
    
    
        @Inject
        private TipoCiiuController(TipoCiiuService service)
    {
        this.service = service;
    }
        public Result jsonResult(Result httpResponse) {
            return httpResponse.as("application/json; charset=utf-8");
        }
    
        public Result getTiposCiiu() {
                return jsonResult(ok(Json.toJson(service.getTiposCiiu())));
        }
}

package controllers;


import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import services.TipoCuotaService;
import javax.inject.Inject;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's tipo identificacion rest.
 */
public class TipoCuotaController extends Controller {

    private TipoCuotaService service;
    
    
        @Inject
        private TipoCuotaController(TipoCuotaService service)
    {
        this.service = service;
    }
        public Result jsonResult(Result httpResponse) {
            return httpResponse.as("application/json; charset=utf-8");
        }
    
        public Result getTiposCuota() {
                return jsonResult(ok(Json.toJson(service.getTiposCuota())));
        }
}

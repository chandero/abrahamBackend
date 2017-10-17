package controllers;


import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import services.TipoViviendaService;
import javax.inject.Inject;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's tipo identificacion rest.
 */
public class TipoViviendaController extends Controller {

    private TipoViviendaService service;
    
    
        @Inject
        private TipoViviendaController(TipoViviendaService service)
    {
        this.service = service;
    }
        public Result jsonResult(Result httpResponse) {
            return httpResponse.as("application/json; charset=utf-8");
        }
    
        public Result getTiposVivienda() {
                return jsonResult(ok(Json.toJson(service.getTiposVivienda())));
        }
}
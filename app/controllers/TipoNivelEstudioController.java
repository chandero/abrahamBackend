package controllers;


import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import services.TipoNivelEstudioService;
import javax.inject.Inject;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's tipo identificacion rest.
 */
public class TipoNivelEstudioController extends Controller {

    private TipoNivelEstudioService service;
    
    
        @Inject
        private TipoNivelEstudioController(TipoNivelEstudioService service)
    {
        this.service = service;
    }
        public Result jsonResult(Result httpResponse) {
            return httpResponse.as("application/json; charset=utf-8");
        }
    
        public Result getTiposNivelEstudio() {
                return jsonResult(ok(Json.toJson(service.getTiposNivelEstudio())));
        }
}

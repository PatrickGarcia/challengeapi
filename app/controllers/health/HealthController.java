package controllers.health;

import play.mvc.Result;
import play.mvc.Controller;

public class HealthController extends Controller {

    public Result healthCheck(){
        return ok();
    }

}

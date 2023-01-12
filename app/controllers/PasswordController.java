package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import usecases.PasswordDTO;
import play.Logger;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import usecases.PasswordValidation;

import javax.inject.Inject;

public class PasswordController extends Controller {

    private final static Logger.ALogger appLogger = Logger.of("app");

    @Inject
    PasswordValidation passwordValidation;
    public Result IsValidPassword(Http.Request request){
        try {
            appLogger.info("Requisição recebida");
            JsonNode bodyJson = request.body().asJson();
            appLogger.info("Dados recebidos: '{}'", bodyJson);
            if (bodyJson == null){
                return badRequest("Body da requisição inválido");
            }
            PasswordDTO passwordDTO = Json.fromJson(bodyJson, PasswordDTO.class);

            if (passwordValidation.execute(passwordDTO.getPassword())) {
                String message = "Validação executada. Password válido";
                appLogger.info(message);
                return ok(message);
            } else {
                String message = "Validação executada. Password inválido";
                appLogger.warn(message);
                return badRequest(message);
            }
        } catch (Exception e){
            String message = "Erro interno do servidor ao processar a requisição";
            appLogger.error(message);
            return internalServerError(message);
        }


    }
}

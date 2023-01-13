package controllers.password;

import com.fasterxml.jackson.databind.JsonNode;
import usecases.password.InputValidatePasswordDto;
import play.Logger;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import usecases.password.OutputValidatePasswordDto;
import usecases.password.validate.PasswordValidationUseCase;

import javax.inject.Inject;

public class PasswordController extends Controller {

    private final static Logger.ALogger appLogger = Logger.of("app");

    @Inject
    PasswordValidationUseCase passwordValidationUseCase;
    public Result isValidPassword(Http.Request request){
        try {
            appLogger.info("Requisição recebida");
            JsonNode bodyJson = request.body().asJson();
            appLogger.info("Dados recebidos: '{}'", bodyJson);
            if (bodyJson == null){
                return badRequest("Body da requisição inválido");
            }

            InputValidatePasswordDto input = Json.fromJson(bodyJson, InputValidatePasswordDto.class);

            OutputValidatePasswordDto output = passwordValidationUseCase.execute(input);

            JsonNode outputJson = Json.toJson(output);
            appLogger.info("Retornando dados ao usuário: {}", outputJson);
            return ok(Json.toJson(outputJson));

        } catch (Exception e){
            String message = "Erro interno do servidor ao processar a requisição";
            appLogger.error(message);
            return internalServerError(message);
        }


    }
}

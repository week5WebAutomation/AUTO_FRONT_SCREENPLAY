package com.pedidos.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ConfirmacionCreacionUsuario implements Question<String> {

    private static final Target DIALOG = Target.the("diálogo de resultado")
            .locatedBy("//*[@role='dialog' or name()='dialog']");

    private static final Target CONFIRMATION_MESSAGE = Target.the("mensaje de confirmación")
            .locatedBy("//*[@role='dialog' or name()='dialog']//*[contains(text(),'registrado')]");

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(DIALOG, isPresent()).forNoMoreThan(20).seconds());
        return CONFIRMATION_MESSAGE.resolveFor(actor).getText();
    }

    public static ConfirmacionCreacionUsuario mensajeDeConfirmacion() {
        return new ConfirmacionCreacionUsuario();
    }
}

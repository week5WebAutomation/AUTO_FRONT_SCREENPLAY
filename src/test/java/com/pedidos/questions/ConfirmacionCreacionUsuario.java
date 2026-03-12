package com.pedidos.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class ConfirmacionCreacionUsuario implements Question<String> {

    private static final Target CONFIRMATION_MESSAGE = Target.the("mensaje de confirmación")
            .locatedBy("//dialog[.//h2[text()='Usuario creado']]");

    @Override
    public String answeredBy(Actor actor) {
        return CONFIRMATION_MESSAGE.resolveFor(actor).getText();
    }

    public static ConfirmacionCreacionUsuario mensajeDeConfirmacion() {
        return new ConfirmacionCreacionUsuario();
    }
}

package com.pedidos.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class HacerPedido implements Task {

    private final String email;
    private final String nombreProducto;
    private final String notasAdicionales;

    private static final Target EMAIL_FIELD = Target.the("email del usuario").locatedBy("#email");
    private static final Target PRODUCT_NAME_FIELD = Target.the("Nombre del Producto").locatedBy("#productName");
    private static final Target NOTES_FIELD = Target.the("Notas adicionales").locatedBy("#notes");
    private static final Target CREATE_ORDER_BUTTON = Target.the("Crear Pedido").locatedBy("#createOrder");
    private static final Target HOME_PAGE = Target.the("Home Page").locatedBy("#home");
    private static final Target ORDER_LIST = Target.the("Order List").locatedBy("#orderList");

    public HacerPedido(String email, String nombreProducto, String notasAdicionales) {
        this.email = email;
        this.nombreProducto = nombreProducto;
        this.notasAdicionales = notasAdicionales;
    }

    @Step("{0} hace un pedido con email {email}, producto {nombreProducto} y notas {notasAdicionales}")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Click.on(HOME_PAGE),
            Click.on(Target.the("Nuevo Pedido").locatedBy("#newOrder")),
            Enter.theValue(email).into(EMAIL_FIELD),
            Enter.theValue(nombreProducto).into(PRODUCT_NAME_FIELD),
            notasAdicionales != null ? Enter.theValue(notasAdicionales).into(NOTES_FIELD) : Task.where("No notas adicionales", actor1 -> {}),
            Click.on(CREATE_ORDER_BUTTON),
            Click.on(HOME_PAGE),
            Scroll.to(ORDER_LIST)
        );
    }

    public static HacerPedido crearPedido(String email, String nombreProducto, String notasAdicionales) {
        return instrumented(HacerPedido.class, email, nombreProducto, notasAdicionales);
    }
}

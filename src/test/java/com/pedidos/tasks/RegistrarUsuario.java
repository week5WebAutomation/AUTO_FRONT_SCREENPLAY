package com.pedidos.tasks;

import com.pedidos.ui.PaginaAddUser;
import com.pedidos.ui.PaginaHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegistrarUsuario implements Task {

    private final String nombre;
    private final String correoElectronico;
    private final String contrasena;

    public RegistrarUsuario(String nombre, String correoElectronico, String contrasena) {
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.contrasena = contrasena;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Click.on(PaginaHome.BOTON_AGREGAR_USUARIO),
            WaitUntil.the(PaginaAddUser.CAMPO_NOMBRE_COMPLETO, isVisible()).forNoMoreThan(10).seconds(),
            Enter.theValue(nombre).into(PaginaAddUser.CAMPO_NOMBRE_COMPLETO),
            Enter.theValue(correoElectronico).into(PaginaAddUser.CAMPO_CORREO_ELECTRONICO),
            Enter.theValue(contrasena).into(PaginaAddUser.CAMPO_CONTRASENA),
            Click.on(PaginaAddUser.BOTON_REGISTRAR_ADMINISTRADOR)
        );
    }

    public static RegistrarUsuario conDatos(String nombre, String correoElectronico, String contrasena) {
        return instrumented(RegistrarUsuario.class, nombre, correoElectronico, contrasena);
    }
}
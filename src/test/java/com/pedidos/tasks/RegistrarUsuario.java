package com.pedidos.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Alert;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static com.pedidos.ui.PaginaAddUser.*;

public class RegistrarUsuario implements Task {

    private final String identificacion;
    private final String nombre;
    private final String correoElectronico;
    private final String contrasena;

    public RegistrarUsuario(String identificacion, String nombre, String correoElectronico, String contrasena) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.contrasena = contrasena;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Click.on(HOME_PAGE),
            Click.on(BOTON_AGREGAR_USUARIO),
            WaitUntil.the(CAMPO_NOMBRE_COMPLETO, isVisible()).forNoMoreThan(10).seconds(),
            Enter.theValue(nombre).into(CAMPO_NOMBRE_COMPLETO),
            Enter.theValue(correoElectronico).into(CAMPO_CORREO_ELECTRONICO),
            Enter.theValue(contrasena).into(CAMPO_CONTRASENA),
            Ensure.that(contrasena, PasswordValidator::isValid),
            Click.on(BOTON_REGISTRAR_ADMINISTRADOR)
        );

        actor.attemptsTo(Switch.toAlert());
        Alert alert = actor.usingWebDriver().switchTo().alert();
        if (alert.getText().equals("El usuario fue registrado correctamente.")) {
            alert.accept();
        }

        actor.attemptsTo(SendPostRequest.withData(identificacion, nombre, correoElectronico, contrasena));
    }

    public static RegistrarUsuario crearUsuario(String identificacion, String nombre, String correoElectronico, String contrasena) {
        return new RegistrarUsuario(identificacion, nombre, correoElectronico, contrasena);
    }
}
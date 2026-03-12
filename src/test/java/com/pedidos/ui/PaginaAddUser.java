package com.pedidos.ui;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaAddUser {

    public static final Target HOME_PAGE = Target.the("Home Page")
            .locatedBy("#home");

    public static final Target BOTON_AGREGAR_USUARIO = Target.the("Boton para agregar usuario")
            .locatedBy("//button[contains(translate(normalize-space(),'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'),'agregar usuario')]");

    public static final Target CAMPO_NOMBRE_COMPLETO = Target.the("campo nombre completo")
            .locatedBy("//input[contains(@placeholder,'Juan') or @aria-label='Nombre completo']");

    public static final Target CAMPO_CORREO_ELECTRONICO = Target.the("campo correo electronico")
            .locatedBy("//input[contains(@placeholder,'@') or @type='email']");

    public static final Target CAMPO_CONTRASENA = Target.the("campo contrasena")
            .locatedBy("//input[@type='password' or contains(@placeholder,'••')]");

    public static final Target BOTON_REGISTRAR_ADMINISTRADOR = Target.the("boton registrar administrador")
            .locatedBy("//button[contains(translate(normalize-space(),'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'),'registrar')]");

    public static final Target POPUP_ERROR = Target.the("pop-up de error al crear usuario")
            .locatedBy("//*[@role='dialog' or name()='dialog'][.//*[contains(text(),'Error')]]");

    public static final Target POPUP_USUARIO_CREADO = Target.the("pop-up de usuario creado")
            .locatedBy("//*[@role='dialog' or name()='dialog'][.//*[contains(text(),'Usuario creado')]]");

    public static final Target BOTON_ACEPTAR_POPUP = Target.the("boton aceptar del popup")
            .locatedBy("//*[@role='dialog' or name()='dialog']//button[contains(text(),'Aceptar')]");
}

package com.pedidos.ui;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaHome {

    public static final Target BOTON_AGREGAR_USUARIO = Target.the("Boton para agregar usuario")
            .locatedBy("//button[contains(translate(normalize-space(),'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'),'agregar usuario')]");

    public static final Target BOTON_AGREGAR_PEDIDO = Target.the("Boton para agregar pedido")
            .locatedBy("//button[contains(translate(normalize-space(),'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'),'agregar pedido')]");

    public static final Target BOTON_HOME = Target.the("Boton Home")
            .locatedBy("//button[contains(translate(normalize-space(),'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'),'inicio')]");
}
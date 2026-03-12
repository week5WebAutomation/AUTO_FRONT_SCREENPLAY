package com.pedidos.ui;

import net.serenitybdd.screenplay.targets.Target;

public class paginaAddOrder {

    public static final Target CAMPO_CORREO_ELECTRONICO = Target.the("campo de correo electronico")
            .locatedBy("//*[self::input or self::textarea][contains(@placeholder,'@') or contains(@placeholder,'correo') or contains(@placeholder,'email')]");

    public static final Target CAMPO_NOMBRE_DEL_PRODUCTO = Target.the("campo de nombre del producto")
            .locatedBy("//*[self::input or self::textarea][contains(@placeholder,'Zapatillas') or contains(@placeholder,'Producto')]");

    public static final Target CAMPO_NOTAS_ADICIONALES = Target.the("campo de notas adicionales")
            .locatedBy("//*[self::input or self::textarea][contains(@placeholder,'Instrucciones') or contains(@placeholder,'especiales') or contains(@placeholder,'entrega')]");

    public static final Target BOTON_CREAR_PEDIDO = Target.the("boton para crear pedido")
            .locatedBy("//button[contains(translate(normalize-space(),'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'),'crear pedido')]");
}

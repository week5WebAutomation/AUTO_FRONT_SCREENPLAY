import net.serenitybdd.screenplay.targets.Target;

public class paginaAddOrder {

    public static final Target CAMPO_CORREO_ELECTRONICO = Target.the("campo de correo electrónico")
            .locatedBy("//input[@placeholder='ejemplo@correo.com']");

    public static final Target CAMPO_NOMBRE_DEL_PRODUCTO = Target.the("campo de nombre del producto")
            .locatedBy("//input[@placeholder='Ej. Zapatillas Running X']");

    public static final Target CAMPO_NOTAS_ADICIONALES = Target.the("campo de notas adicionales")
            .locatedBy("//input[@placeholder='Instrucciones especiales de entrega, envoltorio para regalo, etc.']");

    public static final Target BOTON_CREAR_PEDIDO = Target.the("botón para crear pedido")
            .locatedBy("//button[contains(text(),'Crear Pedido')]");
}

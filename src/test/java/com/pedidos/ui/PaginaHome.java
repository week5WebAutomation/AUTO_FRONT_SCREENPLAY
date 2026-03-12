import net.serenitybdd.screenplay.targets.Target;

public class PaginaHome {

    public static final Target BOTON_AGREGAR_USUARIO = Target.the("Botón para agregar usuario")
            .locatedBy("//button[.//text()='Agregar Usuario']");

    public static final Target BOTON_AGREGAR_PEDIDO = Target.the("Botón para agregar pedido")
            .locatedBy("//button[.//text()='Agregar Pedido']");
}
import net.serenitybdd.screenplay.targets.Target;

public class PaginaAddUser {

    public static final Target CAMPO_NOMBRE_COMPLETO = Target.the("campo nombre completo")
            .locatedBy("//input[@placeholder='Ej. Juan Pérez']");

    public static final Target CAMPO_CORREO_ELECTRONICO = Target.the("campo correo electrónico")
            .locatedBy("//input[@placeholder='nombre@empresa.com']");

    public static final Target CAMPO_CONTRASENA = Target.the("campo contraseña")
            .locatedBy("//input[@placeholder='••••••••']");

    public static final Target BOTON_REGISTRAR_ADMINISTRADOR = Target.the("botón registrar administrador")
            .locatedBy("//button[text()='Registrar Administrador']");

    public static final Target POPUP_ERROR = Target.the("pop-up de error al crear usuario")
            .locatedBy("//dialog[.//h2[text()='Error al crear usuario']]");

    public static final Target POPUP_USUARIO_CREADO = Target.the("pop-up de usuario creado")
            .locatedBy("//dialog[.//h2[text()='Usuario creado']]");
}

import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.actors.OnStage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import static org.assertj.core.api.Assertions.assertThat;

public class RegistroStepDefinitions {

    @Given("el administrador esta en el home de la aplicacion")
    public void administradorEnHomeAplicacion() {
        OnStage.theActorCalled(Constantes.ACTOR).attemptsTo(
            AbrirNavegador.AbrirUrl(Constantes.URL)
        );
    }

    @When("da click al boton \"Agregar Usuario\"")
    public void clickBotonAgregarUsuario() {
        OnStage.theActorInTheSpotlight().attemptsTo(
            Click.on(PaginaHome.BOTON_AGREGAR_USUARIO)
        );
    }

    @And("llena el formulario de registro con los datos:")
    public void llenarFormularioRegistro(io.cucumber.datatable.DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(
            Enter.theValue(dataTable.cell(1, 0)).into(PaginaAddUser.CAMPO_NOMBRE_COMPLETO),
            Enter.theValue(dataTable.cell(1, 1)).into(PaginaAddUser.CAMPO_CORREO_ELECTRONICO),
            Enter.theValue(dataTable.cell(1, 2)).into(PaginaAddUser.CAMPO_CONTRASENA)
        );
    }

    @And("da click al boton \"Registrar Administrador\"")
    public void clickBotonRegistrarAdministrador() {
        OnStage.theActorInTheSpotlight().attemptsTo(
            Click.on(PaginaAddUser.BOTON_REGISTRAR_ADMINISTRADOR)
        );
    }

    @Then("ve un mensaje que dice \"El usuario fue registrado correctamente.\"")
    public void verificarMensajeUsuarioRegistrado() {
        String mensaje = OnStage.theActorInTheSpotlight().asksFor(
            ConfirmacionCreacionUsuario.mensajeDeConfirmacion()
        );
        assertThat(mensaje).isEqualTo("El usuario fue registrado correctamente.");
    }

    @And("vuelve al home de la aplicacion")
    public void volverHomeAplicacion() {
        OnStage.theActorInTheSpotlight().attemptsTo(
            Click.on(PaginaHome.BOTON_HOME)
        );
    }

    @When("da click al boton \"Agregar pedido\"")
    public void clickBotonAgregarPedido() {
        OnStage.theActorInTheSpotlight().attemptsTo(
            Click.on(PaginaHome.BOTON_AGREGAR_PEDIDO)
        );
    }

    @And("llena el formulario de nuevo pedido con los datos:")
    public void llenarFormularioNuevoPedido(io.cucumber.datatable.DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(
            Enter.theValue(dataTable.cell(1, 0)).into(paginaAddOrder.CAMPO_CORREO_ELECTRONICO),
            Enter.theValue(dataTable.cell(1, 1)).into(paginaAddOrder.CAMPO_NOMBRE_DEL_PRODUCTO),
            Enter.theValue(dataTable.cell(1, 2)).into(paginaAddOrder.CAMPO_NOTAS_ADICIONALES)
        );
    }

    @And("da click al boton \"Crear Pedido\"")
    public void clickBotonCrearPedido() {
        OnStage.theActorInTheSpotlight().attemptsTo(
            Click.on(paginaAddOrder.BOTON_CREAR_PEDIDO)
        );
    }

    @Then("es redirigido al home de la aplicacion")
    public void verificarRedireccionHomeAplicacion() {
        OnStage.theActorInTheSpotlight().attemptsTo(
            Ensure.thatTheCurrentPage().currentUrl().contains("/home")
        );
    }

    @And("puede ver su pedido en la lista de pedidos con los siguientes datos:")
    public void verificarPedidoEnLista(io.cucumber.datatable.DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(
            Ensure.that(Target.the("lista de pedidos").locatedBy("#orderList")).text().contains(dataTable.cell(1, 0)),
            Ensure.that(Target.the("lista de pedidos").locatedBy("#orderList")).text().contains(dataTable.cell(1, 1))
        );
    }
}

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

public class RegistroStepDefinitions {

    @Given("el administrador esta en el home de la aplicacion")
    public void administradorEnHomeAplicacion() {
        // Implementación del paso
    }

    @When("da click al boton \"Agregar Usuario\"")
    public void clickBotonAgregarUsuario() {
        // Implementación del paso
    }

    @And("llena el formulario de registro con los datos:")
    public void llenarFormularioRegistro(io.cucumber.datatable.DataTable dataTable) {
        // Implementación del paso
    }

    @And("da click al boton \"Registrar Administrador\"")
    public void clickBotonRegistrarAdministrador() {
        // Implementación del paso
    }

    @Then("ve un mensaje que dice \"El usuario fue registrado correctamente.\"")
    public void verificarMensajeUsuarioRegistrado() {
        // Implementación del paso
    }

    @And("vuelve al home de la aplicacion")
    public void volverHomeAplicacion() {
        // Implementación del paso
    }

    @When("da click al boton \"Agregar pedido\"")
    public void clickBotonAgregarPedido() {
        // Implementación del paso
    }

    @And("llena el formulario de nuevo pedido con los datos:")
    public void llenarFormularioNuevoPedido(io.cucumber.datatable.DataTable dataTable) {
        // Implementación del paso
    }

    @And("da click al boton \"Crear Pedido\"")
    public void clickBotonCrearPedido() {
        // Implementación del paso
    }

    @Then("es redirigido al home de la aplicacion")
    public void verificarRedireccionHomeAplicacion() {
        // Implementación del paso
    }

    @And("puede ver su pedido en la lista de pedidos con los siguientes datos:")
    public void verificarPedidoEnLista(io.cucumber.datatable.DataTable dataTable) {
        // Implementación del paso
    }
}

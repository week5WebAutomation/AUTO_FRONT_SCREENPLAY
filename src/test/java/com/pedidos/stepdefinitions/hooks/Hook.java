import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ScenarioSetupHook {

    @Before
    public void iniciarEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }
}


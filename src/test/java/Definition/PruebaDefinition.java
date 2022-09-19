package Definition;


import Pages.PruebaPages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class PruebaDefinition {
    PruebaPages pruebaPages=new PruebaPages();



    @Given("Como un usuario que no tiene cuenta de Email")
    public void como_un_usuario_que_no_tiene_cuenta_de_email() {

        pruebaPages.launchBrowse();




    }
    @When("Quiero crear una Cuenta Con mis datos personales")
    public void quiero_crear_una_cuenta_con_mis_datos_personales() {
        pruebaPages.EscribirNombre();
        pruebaPages.EscribirApellidos();
        pruebaPages.EscribirUsername();

    }
    @When("Un passwd correcto")
    public void un_passwd_correcto() {
        pruebaPages.EscribirPasswd();
        pruebaPages.Confirmpasswd();
        pruebaPages.checkbox();

    }
    @Then("Validar que la cuenta se pueda Crear")
    public void validar_que_la_cuenta_se_pueda_crear() throws InterruptedException {
        pruebaPages.InteractuarSiguiente();
        pruebaPages.close();

    }
    @When("Validar {string} de correos")
    public void validar_de_correos(String username) {
        pruebaPages.EscribirNombre();
        pruebaPages.EscribirApellidos();
        pruebaPages.EscribirUsernames(username);
    }
    @When("Validar {string} y {string}")
    public void validar_y(String pass, String Rpass) {
        pruebaPages.ValidarPass(pass,Rpass);
        pruebaPages.checkbox();
    }






}













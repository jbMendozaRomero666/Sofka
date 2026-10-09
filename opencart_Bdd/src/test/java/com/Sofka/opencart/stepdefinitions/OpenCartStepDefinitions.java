package com.Sofka.opencart.stepdefinitions;

import com.Sofka.opencart.questions.CantidadProductosEnCarrito;
import com.Sofka.opencart.questions.ConfirmacionCompra;

import com.Sofka.opencart.tasks.AgregarDosProductosAleatorios;
import com.Sofka.opencart.tasks.CompletarDatosCheckout;
import com.Sofka.opencart.tasks.ConfirmarCompra;
import com.Sofka.opencart.tasks.IrAlCarrito;
import com.Sofka.opencart.tasks.IrAlCheckout;
import com.Sofka.opencart.tasks.SeleccionarGuestCheckout;

import com.Sofka.opencart.userinterfaces.OpenCartPage;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.containsText;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class OpenCartStepDefinitions {

    private Actor actor;

    @Before
    public void setUp() {

        actor = Actor.named("Usuario");

        actor.can(
                BrowseTheWeb.with(
                        Serenity.getDriver()
                )
        );
    }

    @Given("que el usuario ingresa a OpenCart")
    public void queElUsuarioIngresaAOpenCart() {

        actor.attemptsTo(
                Open.url("https://opencart.abstracta.us/")
        );
    }

    @When("agrega dos productos aleatorios al carrito")
    public void agregaDosProductosAleatoriosAlCarrito() {

        actor.attemptsTo(
                AgregarDosProductosAleatorios.alCarrito()
        );
    }

    @When("visualiza el carrito")
    public void visualizaElCarrito() {

        actor.attemptsTo(
                IrAlCarrito.ahora()
        );
    }

    @Then("el carrito debe contener dos productos")
    public void elCarritoDebeContenerDosProductos() {

        int cantidad = actor.asksFor(
                CantidadProductosEnCarrito.es()
        );

        System.out.println(
                "CANTIDAD ENCONTRADA EN EL CARRITO: " + cantidad
        );

        assertEquals(2, cantidad);
    }

    @When("procede al checkout")
    public void procedeAlCheckout() {

        actor.attemptsTo(
                IrAlCheckout.ahora()
        );
    }

    @When("selecciona Guest Checkout")
    public void seleccionaGuestCheckout() {

        actor.attemptsTo(
                SeleccionarGuestCheckout.ahora()
        );
    }

    @When("completa los datos del checkout")
    public void completaLosDatosDelCheckout() {

        actor.attemptsTo(
                CompletarDatosCheckout.ahora()
        );
    }

    @When("confirma la compra")
    public void confirmaLaCompra() {

        actor.attemptsTo(
                ConfirmarCompra.ahora()
        );
    }


    @Then("la compra debe mostrar el mensaje de confirmación")
    public void laCompraDebeMostrarElMensajeDeConfirmacion() {

        actor.attemptsTo(
                WaitUntil.the(
                        OpenCartPage.MENSAJE_CONFIRMACION,
                        containsText("Your order has been placed!")
                )
        );

        String mensaje = actor.asksFor(
                ConfirmacionCompra.texto()
        );

        System.out.println("======================================");
        System.out.println("MENSAJE OBTENIDO: [" + mensaje + "]");
        System.out.println("LONGITUD: " + mensaje.length());
        System.out.println("======================================");

        assertEquals(
                "Your order has been placed!",
                mensaje
        );
    }
}


package com.Sofka.opencart.tasks;

import com.Sofka.opencart.userinterfaces.OpenCartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AgregarDosProductosAleatorios implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        // Agregar MacBook
        actor.attemptsTo(
                WaitUntil.the(
                        OpenCartPage.BOTON_AGREGAR_PRODUCTO.of("1"),
                        isVisible()
                ),
                Click.on(
                        OpenCartPage.BOTON_AGREGAR_PRODUCTO.of("1")
                )
        );

        // Agregar iPhone
        actor.attemptsTo(
                WaitUntil.the(
                        OpenCartPage.BOTON_AGREGAR_PRODUCTO.of("2"),
                        isVisible()
                ),
                Click.on(
                        OpenCartPage.BOTON_AGREGAR_PRODUCTO.of("2")
                )
        );
    }

    public static AgregarDosProductosAleatorios alCarrito() {
        return instrumented(AgregarDosProductosAleatorios.class);
    }
}
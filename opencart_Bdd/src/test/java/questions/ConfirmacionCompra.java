package com.Sofka.opencart.questions;

import com.Sofka.opencart.userinterfaces.OpenCartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ConfirmacionCompra implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {

        String texto = OpenCartPage.MENSAJE_CONFIRMACION
                .resolveFor(actor)
                .getText();

        System.out.println("======================================");
        System.out.println("TEXTO DEL H1: [" + texto + "]");
        System.out.println("======================================");

        return texto.trim();
    }

    public static ConfirmacionCompra texto() {
        return new ConfirmacionCompra();
    }
}
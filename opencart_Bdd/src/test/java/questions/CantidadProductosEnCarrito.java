package com.Sofka.opencart.questions;

import com.Sofka.opencart.userinterfaces.OpenCartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class CantidadProductosEnCarrito implements Question<Integer> {

    @Override
    public Integer answeredBy(Actor actor) {
        return OpenCartPage.PRODUCTOS_EN_CARRITO
                .resolveAllFor(actor)
                .size();
    }

    public static CantidadProductosEnCarrito es() {
        return new CantidadProductosEnCarrito();
    }
}
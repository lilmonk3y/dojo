package steps;

import shippings.EnvioADomicilio;
import shippings.RetiroEnCorreo;
import shippings.ShippingOption;

public class SeleccionDeEnvio extends CheckoutStep{

    public CheckoutStep envioADomicilio() {
        if (!CheckoutStep.isEditMode()) {
            return new SeleccionDeMedioDePago();
        } else {
            return new Review();
        }
    }

    public CheckoutStep retiroEnCorreo() {
        return new MapaDeSucursales();
    }
}

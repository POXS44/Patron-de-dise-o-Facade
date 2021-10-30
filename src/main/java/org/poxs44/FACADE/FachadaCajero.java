package org.poxs44.FACADE;

public class FachadaCajero {

    private ValidacionUsuario val = new ValidacionUsuario();
    private RecargaMovil rec = new RecargaMovil();
    private RetirarDinero ret = new RetirarDinero();



    public String sacarDinero()
    {
        return val.valida() + ret.retirar();
    }

    public String recargaMovil()
    {
        return val.valida() + rec.recarga();
    }

}
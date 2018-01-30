/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica3;

/**
 *
 * @author infor14
 */
public class Cuenta {

    private String nombre;
    private String numCuenta;
    private double tipoInteres;
    private double saldo;

    public Cuenta() {
    }

    public Cuenta(String nombre, String numCuenta, double tipoInteres, double saldo) {
        this.nombre = nombre;
        this.numCuenta = numCuenta;
        this.tipoInteres = tipoInteres;
        this.saldo = saldo;
    }

    public Cuenta(Cuenta copia) {
        this.nombre = copia.nombre;
        this.numCuenta = copia.numCuenta;
        this.tipoInteres = copia.tipoInteres;
        this.saldo = copia.saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean ingresar(double importe) {
        if (importe > 0) {
            saldo += importe;
            return true;
        } else {
            return false;
        }
    }

    public boolean reintegrar(double importe) {
        if (importe > 0 && saldo >= importe) {
            saldo -= importe;
            return true;
        } else {
            return false;
        }
    }

    public boolean transferir(Cuenta cuenta, double importe) {
        if (importe > 0 && saldo >= importe) {
            reintegrar(importe);
            cuenta.ingresar(importe);
            return true;
        } else {
            return false;
        }
    }
}

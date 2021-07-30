package com.company;

import javax.swing.JOptionPane;

/**
 * Este Proyecto fue hecho By amtoDev
 * u20171110 UNIVO, para encontrar el
 * codigo fuente lo encontras en
 * Github: https://github.com/manasesortez/Introduction-to-Java
 * **/

public class telefono {
    private String telefono;
    private double saldo;
    private String marca;
    private double price;
    //private final double tarifa = 0.10; al sustituir esta variable podemos cambiar la tarifa a opcion

    //Definiremos los Get y Set de las propoedades

    public String getTelefono(){
        return telefono;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public  String getMarca(){
        return marca;
    }
    public  void  setMarca(String marca){
        this.marca = marca;
    }

    public double getPrice(){return price;}
    public void setPrice(double price){ this.price = price;}

    public telefono() {
        this.telefono = "00000000";
        this.saldo = 0.0;
        this.marca = "Samsung";
        this.price = 000.00;
    }
    //fin del contructor

    public void realizarLlamada(String telefono, int minutos, double tarifa){

        double saldoGastar;
        double nuevoSaldo = this.saldo;
        saldoGastar = minutos * tarifa;
        if(saldoGastar <= this.saldo){
            nuevoSaldo = nuevoSaldo - saldoGastar;
            this.setSaldo(nuevoSaldo);
            JOptionPane.showMessageDialog(null, "Llamada realizada con exito");
        }else{
            JOptionPane.showMessageDialog(null, "Saldo Insuficiente");
        }
    }

    public  void recargarSaldo(double cantidad){
        double nuevoSaldo;
        nuevoSaldo = this.saldo + cantidad;
        this.setSaldo(nuevoSaldo);
        JOptionPane.showMessageDialog(null, "Saldo Cargado con exito");
    }
}



package com.company;

import javax.swing.JOptionPane;

public class Main {


    public static void main(String[] args) {
	// write your code here
    System.out.println("Hola usuario bienvenido");
    telefono objTelefono = new telefono();

    int continuar = 1;

        while(continuar == 1){

        Object [] opciones = {
                "Recargar Saldo",
                "Hacer Llamada",
                "Mostrar Informacion",
                "Salir"
        };

        if(!objTelefono.getTelefono().equals("00000000")){
            Object opcion = JOptionPane.showInputDialog(null, "Selecciona una Categoria",
                    "Elejir", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

            switch (opcion.toString()){
                case "Salir":
                    continuar = 0;
                    break;
                case "Recargar Saldo":
                    double cantidad;
                    cantidad = Double.parseDouble(JOptionPane.showInputDialog("Cantidad de saldo a Recargar"));
                    objTelefono.recargarSaldo(cantidad);
                    break;
                case "Hacer Llamada":
                    String telefonoDestino;
                    int minutos;
                    double PriceMinute;
                    telefonoDestino = JOptionPane.showInputDialog("Numero a llamar");
                    minutos = Integer.parseInt(JOptionPane.showInputDialog("Minutos a llamar"));
                    PriceMinute = Double.parseDouble(JOptionPane.showInputDialog("Tarifa por Minutos"));
                    objTelefono.realizarLlamada(telefonoDestino, minutos, PriceMinute );
                    break;
                case "Mostrar Informacion":
                    String getTelefono = objTelefono.getTelefono();
                    double getSaldo = objTelefono.getSaldo();
                    String getMarca = objTelefono.getMarca();
                    String getModelo = objTelefono.getModelo();
                    double getPrecio = objTelefono.getPrice();

                    JOptionPane.showMessageDialog(null, "--- Informacion Principal --- " + "\n\nNumero: " + getTelefono + "\n\nSaldo: $" + getSaldo + "\n\nMarca: " + getMarca + "\n\nModelo: " + getModelo + "\n\n Precio de Compra: $" + getPrecio);
                    break;
                default:
                    break;
            }

        }else{
            JOptionPane.showMessageDialog(null, "Bienvenido Por Favor Compre un Telefono");
            final String telefono, marca, modelo;
            final double price;
            telefono = JOptionPane.showInputDialog("Numero de Telefono");
            marca = JOptionPane.showInputDialog("Introduzca la marca");
            modelo = JOptionPane.showInputDialog("Introduzca el Modelo");
            price = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Precio del Telefono"));
            if(!telefono.equals("")){
                objTelefono.setTelefono(telefono);
                objTelefono.setMarca(marca);
                objTelefono.setPrice(price);
                objTelefono.setModelo(modelo);
                JOptionPane.showMessageDialog(null, "--- Factura ---" + "\n\nNumero: " + telefono + "\n\nMarca: " + marca  +  "\n\nModelo: " + modelo + "\n\nPrecio: $"+ price  +"\n\n ------- Exit -------" + "\n\n Preciones OK para continuar");
            }
        }

    }JOptionPane.showMessageDialog(null, "Gracias :D");
    }
}

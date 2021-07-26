package com.company;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
	// write your code here
    System.out.println("Hola usuario bienvenido");
    System.out.println("A continuación se muestra una cuenta regresiva");

    telefono objTelefono = new telefono();
    int continuar = 1;

    while(continuar == 1){
        Object [] opciones = {
                "Comprar telefono",
                "Recargar Saldo",
                "Hacer Llamada",
                "Mostrar Informacion",
                "Salir"
        };
        Object opcion = JOptionPane.showInputDialog(null, "Selecciona un color",
                "Elejir", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
        switch(opcion.toString()){
            case "salir":
                continuar = 0;
                break;
            case "Comprar Telefono":
                if(!objTelefono.getTelefono().equals("00000000")){
                    JOptionPane.showMessageDialog(null, "Creo que ya compro un celular no?");
                }else{
                    String telefono, marca;
                    telefono = JOptionPane.showInputDialog("Numero de telefono");
                    marca = JOptionPane.showInputDialog("Introduccion la marca");
                    if(!telefono.equals("")){
                        objTelefono.setTelefono(telefono);
                        objTelefono.setMarca(marca);
                        JOptionPane.showMessageDialog(null, "Telefono Comprado Exitosamente");
                    }
                    break;
                }
            case "Hacer Llamada":
                String telefonoDestino;
                int minutos;
                telefonoDestino = JOptionPane.showInputDialog("Numero a llamar");
                minutos = Integer.parseInt(JOptionPane.showInputDialog("Minutos a llamar"));
                objTelefono.realizarLlamada(telefonoDestino, minutos);
                break;
            default:
                break;
        }
    }
    JOptionPane.showMessageDialog(null, "Gracias :D");

    }
}

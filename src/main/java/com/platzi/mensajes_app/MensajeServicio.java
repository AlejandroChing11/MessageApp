package com.platzi.mensajes_app;
import java.util.Scanner;
import java.util.ArrayList;

public class MensajeServicio {

    public static void crearMensaje() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write your message");
        String mensaje = sc.nextLine();


        System.out.println("Tu nombre: ");
        String autor = sc.nextLine();

        Mensaje registro = new Mensaje();
        registro.setMensaje(mensaje);
        registro.setAutorMensaje(autor);
        MensajeDao.crearMensajeBd(registro);
    }

    public static void listarMensaje(){
        ArrayList <Mensaje> mensajes = MensajeDao.leerMensajeDb();
        for (Mensaje mensaje: mensajes) {
            System.out.println("id: " + mensaje.getIdMensaje());
            System.out.println("Mensaje: " + mensaje.getMensaje());
            System.out.println("Autor: " + mensaje.getAutorMensaje());
            System.out.println("Fecha de registros: " + mensaje.getFechaMensaje());
        }
        MensajeDao.leerMensajeDb();
    }
    public static void borrarMensaje(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el id del mensaje a borrrar");
        int id_mensaje = scanner.nextInt();
        MensajeDao.borrarMensajeDb(id_mensaje);
    }
    public static void editarMensaje(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu nuevo mensaje: ");
        String mensaje = scanner.nextLine();


        System.out.println("Indica el id del mensaje a editar: ");
        int id_mensaje = scanner.nextInt();
        Mensaje actualizado = new Mensaje();
        actualizado.setIdMensaje(id_mensaje);
        actualizado.setMensaje(mensaje);

        MensajeDao.actualizarMensaje(actualizado);

    }
}

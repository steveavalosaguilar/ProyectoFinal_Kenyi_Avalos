package www.cibertec;

import javax.swing.JOptionPane;

public class Main {

    // Metodos
    public static int calcularEdad(int anio) {
        return 2026 - anio;
    }

    public static double calcularPesoTotal(double peso, int cantidad) {
        return peso * cantidad;
    }

    public static void main(String[] args) {

        // Datos del usuario
        String nombre = JOptionPane.showInputDialog("Ingrese nombre y apellidos:");
        int anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese año de nacimiento:"));
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese peso en kg:"));
        boolean garantia = Boolean.parseBoolean(JOptionPane.showInputDialog("¿Desea garantia? true/false"));

        int edad = calcularEdad(anio);

        // Validacion de edad
        if (edad >= 18) {
            System.out.println("Es mayor de edad.");
        } else {
            System.out.println("Es menor de edad.");
        }

        // Seleccion de modelo
        String opcion = JOptionPane.showInputDialog(
                "Seleccione un modelo:\n" +
                        "1. Toyota Hilux\n" +
                        "2. Toyota Hiace\n" +
                        "3. Kia Seltos"
        );

        String modelo;
        switch (opcion) {
            case "1":
                modelo = "Toyota Hilux";
                break;
            case "2":
                modelo = "Toyota Hiace";
                break;
            case "3":
                modelo = "Kia Seltos";
                break;
            default:
                modelo = "No seleccionado";
                break;
        }

        // Pedir cantidad valida
        int cantidad = 0;
        while (cantidad <= 0) {
            cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad:"));
        }

        // Mostrar unidades
        System.out.println("\nUnidades:");
        for (int i = 1; i <= cantidad; i++) {
            System.out.println("Unidad " + i + ": " + modelo);
        }

        // Confirmacion
        String confirmar;
        do {
            confirmar = JOptionPane.showInputDialog("¿Confirmar compra? si/no");
        } while (!confirmar.equalsIgnoreCase("si") && !confirmar.equalsIgnoreCase("no"));

        double pesoTotal = calcularPesoTotal(peso, cantidad);

        // Mostrar resumen
        System.out.println("\n=== RESULTADO DE COMPRA ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Peso total: " + pesoTotal + " kg");
        System.out.println("Garantia: " + garantia);
        System.out.println("Estado: Compra confirmada.");
    }
}
package www.cibertec;

import javax.swing.JOptionPane;

public class Main {

    // Metodo calcular edad
    public static int calcularEdad(int anio) {
        return 2026 - anio;
    }

    // Metodo calcular peso total
    public static double calcularPesoTotal(double peso, int cantidad) {
        return peso * cantidad;
    }

    // El método main DEBE ser static
    public static void main(String[] args) {

        String nombre;
        int anio;
        double peso;
        boolean garantia;

        nombre = JOptionPane.showInputDialog("Ingrese nombre y apellidos:");

        anio = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese año de nacimiento:"));

        peso = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese peso en kg:"));

        garantia = Boolean.parseBoolean(
                JOptionPane.showInputDialog("¿Desea garantia? true/false"));

        int edad = calcularEdad(anio);

        // IF / ELSE
        if (edad >= 18) {
            System.out.println("Es mayor de edad.");
        } else {
            System.out.println("Es menor de edad.");
        }

        // SWITCH
        String opcion = JOptionPane.showInputDialog(
                "Seleccione un modelo:\n" +
                        "1. Toyota Hilux\n" +
                        "2. Toyota Hiace\n" +
                        "3. Kia Seltos");

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
        }

        // WHILE
        int cantidad = 0;

        while (cantidad <= 0) {
            cantidad = Integer.parseInt(
                    JOptionPane.showInputDialog("Ingrese cantidad:"));
        }

        // FOR
        System.out.println("\nUnidades:");

        for (int i = 1; i <= cantidad; i++) {
            System.out.println("Unidad " + i + ": " + modelo);
        }

        // DO WHILE
        String confirmar;

        do {
            confirmar = JOptionPane.showInputDialog(
                    "¿Confirmar compra? si/no");
        } while (!confirmar.equalsIgnoreCase("si")
                && !confirmar.equalsIgnoreCase("no"));

        double pesoTotal = calcularPesoTotal(peso, cantidad);

        System.out.println("\n= RESULTADO =");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Peso total: " + pesoTotal + " kg");
        System.out.println("Garantia: " + garantia);
        System.out.println("Compra confirmada.");
    }
}
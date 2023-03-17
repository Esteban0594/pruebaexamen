import java.util.Scanner;


public class PruebaExamen {
    
    // Crear un objeto de la clase InformacionCompra
InformacionCompra compra = new InformacionCompra();

// Llamar a un método de la clase InformacionCompra

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int MAX_PERSONAS = 1;
        int[] facturas = new int[MAX_PERSONAS];
        int[] cedulas = new int[MAX_PERSONAS];
        String[] nombres = new String[MAX_PERSONAS];
        int[] entradasSolNorteSur = new int[MAX_PERSONAS];
        int[] entradasSombraEsteOeste = new int[MAX_PERSONAS];
        int[] entradasPreferencial = new int[MAX_PERSONAS];
        int[] montosSolNorteSur = new int[MAX_PERSONAS];
        int[] montosSombraEsteOeste = new int[MAX_PERSONAS];
        int[] montosPreferencial = new int[MAX_PERSONAS];
        int contadorPersonas = 0;
        int numeroFactura = 0;
        

        int opcion = 0;
        while (opcion != 4) {
            System.out.println("1. Inicializar vector");
            System.out.println("2. Comprar entradas");
            System.out.println("3. Estadística");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Inicializando vector...");
                    facturas = new int[MAX_PERSONAS];
                    cedulas = new int[MAX_PERSONAS];
                    nombres = new String[MAX_PERSONAS];
                    entradasSolNorteSur = new int[MAX_PERSONAS];
                    entradasSombraEsteOeste = new int[MAX_PERSONAS];
                    entradasPreferencial = new int[MAX_PERSONAS];
                    montosSolNorteSur = new int[MAX_PERSONAS];
                    montosSombraEsteOeste = new int[MAX_PERSONAS];
                    montosPreferencial = new int[MAX_PERSONAS];
                    contadorPersonas = 0;
                    System.out.println("Vector inicializado.");
                    break;

                case 2:
                    if (contadorPersonas >= MAX_PERSONAS) {
                        System.out.println("No se pueden ingresar más personas.");
                        break;
                    }
                    
                    numeroFactura++; // Incrementa el número de factura actual
                    System.out.print("Ingrese número de factura: ");
                    scanner.nextLine();
                    
                    System.out.print("Ingrese la cédula: ");
                    int cedula = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Ingrese el nombre: ");
                    String nombre = scanner.nextLine();

                    int cantidadEntradas = 0;
                    while (cantidadEntradas <= 0 || cantidadEntradas > 4) {
                        System.out.print("Ingrese la cantidad de entradas (máximo 4): ");
                        cantidadEntradas = scanner.nextInt();
                        scanner.nextLine();
                    }

                    System.out.println("Elija la localidad:");
                    System.out.println("1. Sol Norte/Sur (10500 colones)");
                    System.out.println("2. Sombra Este/Oeste (20500 colones)");
                    System.out.println("3. Preferencial (25500 colones)");
                    System.out.print("Seleccione una opción: ");
                    int localidad = scanner.nextInt();
                    scanner.nextLine();

                    int precio = 0;
                    switch (localidad) {
                        case 1:
                            precio = 10500;
                        entradasSolNorteSur[contadorPersonas] = cantidadEntradas;
                        montosSolNorteSur[contadorPersonas] = precio * cantidadEntradas;
                        break;

                    case 2:
                        precio = 20500;
                        entradasSombraEsteOeste[contadorPersonas] = cantidadEntradas;
                        montosSombraEsteOeste[contadorPersonas] = precio * cantidadEntradas;
                        break;

                    case 3:
                        precio = 25500;
                        entradasPreferencial[contadorPersonas] = cantidadEntradas;
                        montosPreferencial[contadorPersonas] = precio * cantidadEntradas;
                        break;

                    default:
                        
                        System.out.println("Número de factura\tCédula\tNombre\tLocalidad\tCantidad de entradas\tSubtotal\tCargos por servicios\tTotal a pagar");
    System.out.println("-----------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Opción inválida.");
                        break;
                        
                        
                }
                    
                    
                    
                   
                

                contadorPersonas++;
                System.out.println("Compra registrada.");
                break;
                
                
                
                
                
               

            case 3:
                if (contadorPersonas == 0) {
                    System.out.println("No hay datos para mostrar.");
                    break;
                }

                int totalEntradasSolNorteSur = 0;
                int totalEntradasSombraEsteOeste = 0;
                int totalEntradasPreferencial = 0;
                int totalMontoSolNorteSur = 0;
                int totalMontoSombraEsteOeste = 0;
                int totalMontoPreferencial = 0;

                for (int i = 0; i < contadorPersonas; i++) {
                    totalEntradasSolNorteSur += entradasSolNorteSur[i];
                    totalEntradasSombraEsteOeste += entradasSombraEsteOeste[i];
                    totalEntradasPreferencial += entradasPreferencial[i];
                    totalMontoSolNorteSur += montosSolNorteSur[i];
                    totalMontoSombraEsteOeste += montosSombraEsteOeste[i];
                    totalMontoPreferencial += montosPreferencial[i];
                }

                int totalEntradas = totalEntradasSolNorteSur + totalEntradasSombraEsteOeste + totalEntradasPreferencial;
                int totalMonto = totalMontoSolNorteSur + totalMontoSombraEsteOeste + totalMontoPreferencial;

                System.out.println("----------ESTADÍSTICAS----------");
                System.out.println("Total de entradas vendidas: " + totalEntradas);
                System.out.println("Total de ventas: " + totalMonto + " colones");
                System.out.println("Promedio de ventas por persona: " + (double) totalMonto / contadorPersonas + " colones");
                System.out.println("Entradas vendidas por localidad:");
                System.out.println("Sol Norte/Sur: " + totalEntradasSolNorteSur);
                System.out.println("Sombra Este/Oeste: " + totalEntradasSombraEsteOeste);
                System.out.println("Preferencial: " + totalEntradasPreferencial);
                break;

            case 4:
                System.out.println("Saliendo...");
                break;

            default:
                System.out.println("Opción inválida.");
                break;
        }
    }

    scanner.close();
}
    
}
   


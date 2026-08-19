import java.util.Scanner;
public class ampliacion_de_imagenes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] imagenes = new String[10];
        String[] formatos = new String[10];
        String[] tamanosOriginales = new String[10];
        String[] tamanosAmpliados = new String[10];
        String[] factoresAmpliacion = new String[10];
        String[] fechas = new String[10];
        String[] estados = new String[10];
        int total = 0;
        int opcion;
        //----------------------------------------------//
        //--|menu_principal_de_ampliacion_de_imagenes|--//
        //----------------------------------------------//
        do {
            System.out.println("menu principal de ampliacion de imagenes");
            System.out.println("1) Registrar ampliacion");
            System.out.println("2) Editar ampliacion");
            System.out.println("3) Listar ampliaciones");
            System.out.println("4) Buscar ampliacion");
            System.out.println("5) Eliminar ampliacion");
            System.out.println("6) Mostrar resumen");
            System.out.println("7) Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                //--------------------------//
                //--|registrar_ampliacion|--//
                //--------------------------//
                case 1:
                    if (total >= imagenes.length) {
                        System.out.println("No hay espacio para registrar mas ampliaciones.");
                        break;
                    }
                    int id = total + 1;
                    System.out.println("registro de ampliacion de imagen");
                    System.out.println("id de la ampliacion a registrar: " + id);
                    System.out.print("nombre de la imagen: ");
                    imagenes[total] = entrada.nextLine();
                    System.out.print("formato de la imagen: ");
                    formatos[total] = entrada.nextLine();
                    System.out.print("tamaño original de la imagen: ");
                    tamanosOriginales[total] = entrada.nextLine();
                    System.out.print("tamaño ampliado de la imagen: ");
                    tamanosAmpliados[total] = entrada.nextLine();
                    System.out.print("factor de ampliacion: ");
                    factoresAmpliacion[total] = entrada.nextLine();
                    System.out.print("fecha de la ampliacion: ");
                    fechas[total] = entrada.nextLine();
                    System.out.print("estado de la ampliacion: ");
                    estados[total] = entrada.nextLine();
                    System.out.println("Ampliacion registrada correctamente.");
                    total++;
                    break;
                //-----------------------//
                //--|editar_ampliacion|--//
                //-----------------------//
                case 2:
                    if (total == 0) {
                        System.out.println("No existen ampliaciones registradas.");
                        break;
                    }
                    System.out.println("Datos de las ampliaciones");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Imagen: " + imagenes[i] + " | Formato: " + formatos[i] + " | Tamaño original: " + tamanosOriginales[i] + " | Tamaño ampliado: " + tamanosAmpliados[i] + " | Factor: " + factoresAmpliacion[i] + " | Fecha: " + fechas[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID de la ampliacion: ");
                    int idEditar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEditar >= 1 && idEditar <= total) {
                        int posicion = idEditar - 1;
                        System.out.println("Editar el dato de la ampliacion");
                        System.out.print("Nuevo nombre de la imagen: ");
                        imagenes[posicion] = entrada.nextLine();
                        System.out.print("Nuevo formato de la imagen: ");
                        formatos[posicion] = entrada.nextLine();
                        System.out.print("Nuevo tamaño original de la imagen: ");
                        tamanosOriginales[posicion] = entrada.nextLine();
                        System.out.print("Nuevo tamaño ampliado de la imagen: ");
                        tamanosAmpliados[posicion] = entrada.nextLine();
                        System.out.print("Nuevo factor de ampliacion: ");
                        factoresAmpliacion[posicion] = entrada.nextLine();
                        System.out.print("Nueva fecha de la ampliacion: ");
                        fechas[posicion] = entrada.nextLine();
                        System.out.print("Nuevo estado de la ampliacion: ");
                        estados[posicion] = entrada.nextLine();
                        System.out.println("Ampliacion actualizada correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //-------------------------//
                //--|listar_ampliaciones|--//
                //-------------------------//
                case 3:
                    if (total == 0) {
                        System.out.println("No existen ampliaciones registradas.");
                    } else {
                        System.out.println("Lista de ampliaciones de imagenes");
                        for (int i = 0; i < total; i++) {
                            System.out.println("ID: " + (i + 1) + " | Imagen: " + imagenes[i] + " | Formato: " + formatos[i] + " | Tamaño original: " + tamanosOriginales[i] + " | Tamaño ampliado: " + tamanosAmpliados[i] + " | Factor: " + factoresAmpliacion[i] + " | Fecha: " + fechas[i] + " | Estado: " + estados[i]);
                        }
                    }
                    break;
                //-----------------------//
                //--|buscar_ampliacion|--//
                //-----------------------//
                case 4:
                    if (total == 0) {
                        System.out.println("No existen ampliaciones registradas.");
                        break;
                    }
                    System.out.println("busqueda de ampliacion");
                    System.out.print("ingresa la id para buscar ampliacion: ");
                    int idBusqueda = entrada.nextInt();
                    entrada.nextLine();
                    if (idBusqueda >= 1 && idBusqueda <= total) {
                        int posicion = idBusqueda - 1;
                        System.out.println("Datos de la ampliacion encontrada:");
                        System.out.println("ID: " + idBusqueda + " | Imagen: " + imagenes[posicion] + " | Formato: " + formatos[posicion] + " | Tamaño original: " + tamanosOriginales[posicion] + " | Tamaño ampliado: " + tamanosAmpliados[posicion] + " | Factor: " + factoresAmpliacion[posicion] + " | Fecha: " + fechas[posicion] + " | Estado: " + estados[posicion]);
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //-------------------------//
                //--|eliminar_ampliacion|--//
                //-------------------------//
                case 5:
                    if (total == 0) {
                        System.out.println("No existen ampliaciones registradas.");
                        break;
                    }
                    System.out.println("Datos de las ampliaciones");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Imagen: " + imagenes[i] + " | Formato: " + formatos[i] + " | Tamaño original: " + tamanosOriginales[i] + " | Tamaño ampliado: " + tamanosAmpliados[i] + " | Factor: " + factoresAmpliacion[i] + " | Fecha: " + fechas[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID de la ampliacion a eliminar: ");
                    int idEliminar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEliminar >= 1 && idEliminar <= total) {
                        int posicion = idEliminar - 1;
                        for (int i = posicion; i < total - 1; i++) {
                            imagenes[i] = imagenes[i + 1];
                            formatos[i] = formatos[i + 1];
                            tamanosOriginales[i] = tamanosOriginales[i + 1];
                            tamanosAmpliados[i] = tamanosAmpliados[i + 1];
                            factoresAmpliacion[i] = factoresAmpliacion[i + 1];
                            fechas[i] = fechas[i + 1];
                            estados[i] = estados[i + 1];
                        }
                        total--;
                        System.out.println("Ampliacion eliminada correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //---------------------//
                //--|mostrar_resumen|--//
                //---------------------//
                case 6:
                    if (total == 0) {
                        System.out.println("No existen ampliaciones registradas.");
                        break;
                    }
                    int pendientes = 0;
                    int procesadas = 0;
                    int canceladas = 0;
                    int otrosEstados = 0;
                    for (int i = 0; i < total; i++) {
                        if (estados[i].equalsIgnoreCase("Pendiente")) {
                            pendientes++;
                        } else if (estados[i].equalsIgnoreCase("Procesada")) {
                            procesadas++;
                        } else if (estados[i].equalsIgnoreCase("Cancelada")) {
                            canceladas++;
                        } else {
                            otrosEstados++;
                        }
                    }
                    String formatoMayor = formatos[0];
                    int cantidadFormatoMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadFormato = 0;
                        for (int j = 0; j < total; j++) {
                            if (formatos[i].equalsIgnoreCase(formatos[j])) {
                                cantidadFormato++;
                            }
                        }
                        if (cantidadFormato > cantidadFormatoMayor) {
                            cantidadFormatoMayor = cantidadFormato;
                            formatoMayor = formatos[i];
                        }
                    }
                    String factorMayor = factoresAmpliacion[0];
                    int cantidadFactorMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadFactor = 0;
                        for (int j = 0; j < total; j++) {
                            if (factoresAmpliacion[i].equalsIgnoreCase(factoresAmpliacion[j])) {
                                cantidadFactor++;
                            }
                        }
                        if (cantidadFactor > cantidadFactorMayor) {
                            cantidadFactorMayor = cantidadFactor;
                            factorMayor = factoresAmpliacion[i];
                        }
                    }
                    System.out.println("resumen de ampliacion de imagenes");
                    System.out.println("Ampliaciones registradas: " + total);
                    System.out.println("Formato mas utilizado: " + formatoMayor);
                    System.out.println("Factor de ampliacion mas utilizado: " + factorMayor);
                    System.out.println("Pendientes: " + pendientes);
                    System.out.println("Procesadas: " + procesadas);
                    System.out.println("Canceladas: " + canceladas);
                    System.out.println("Otros estados: " + otrosEstados);
                    break;
                //------------------------------//
                //--|salir_del_menu_principal|--//
                //------------------------------//
                case 7:
                    System.out.println("Gracias por utilizar Ampliacion de Imagenes.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 7);
        entrada.close();
    }
}
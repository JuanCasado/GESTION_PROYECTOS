package planificador;

public class Planificador {


public static void main(String[] args) {

    //Dispositivos de Enchufe
    float tablaEnchufe_Duracion[] = {0.95f,1.64f,5.11f,1.9f};
    float tablaEnchufe_PersonalMedio[] = {1.66f,2.55f,3.34f,2.62f};
    float tablaEnchufe_Porcentajes[] = {0.3f,0.35f,0.35f};//3
    float tablaEnchufe_PersonalReal1[] = {2f,2f,4f,4f};
    float tablaEnchufe_PersonalReal2[] = {2f,2f,2f,2f};
    float tablaEnchufe_PersonalReal3[] = {2f,2f,2f,2f};

    //Puerta de Enlace
    float tablaPuertaEnlace_Duracion[] = {0.58f,1.0f,3.11f,1.16f};
    float tablaPuertaEnlace_PersonalMedio[] = {0.73f,1.14f,1.49f,1.17f};
    float tablaPuertaEnlace_Porcentajes[] = {0.2f,0.15f,0.35f,0.3f};//4
    float tablaPuertaEnlace_PersonalReal1[] = {2f,2f,2f,2f};
    float tablaPuertaEnlace_PersonalReal2[] = {2f,2f,2f,2f};
    float tablaPuertaEnlace_PersonalReal3[] = {3f,2f,2f,2f};
    float tablaPuertaEnlace_PersonalReal4[] = {2f,2f,2f,2f};

    //Aplicacion Clientes
    float tablaClientesNoVIP_Duracion[] = {0.59f, 1.03f, 3.2f, 1.2f};
    float tablaClientesNoVIP_PersonalMedio[] = {0.77f, 1.19f, 1.56f, 1.22f};
    float tablaClientesNoVIP_Porcentajes[] = {0.4f,0.25f,0.35f};//3
    float tablaClientesNoVIP_PersonalReal1[] = {2f,2f,2f,2f};
    float tablaClientesNoVIP_PersonalReal2[] = {2f,2f,2f,2f};
    float tablaClientesNoVIP_PersonalReal3[] = {2f,2f,2f,2f};
    
    //BBDD
    float tablaBBDD_Duracion[] = {0.52f,0.90f,2.81f,1.05f};
    float tablaBBDD_PersonalMedio[] = {0.62f,0.96f,1.26f,0.99f};
    float tablaBBDD_Porcentajes[] = {0.5f,0.2f,0.3f};//3
    float tablaBBDD_PersonalReal1[] = {2f,2f,2f,2f};
    float tablaBBDD_PersonalReal2[] = {2f,2f,2f,2f};
    float tablaBBDD_PersonalReal3[] = {2f,2f,2f,2f};

    /*float tablaDispositivoClientesVIP_Duracion[] = {1.51f, 2.61f, 8.11f, 3.02f};
    float tablaDispositivoClientesVIP_PersonalMedio[] = {3.52f, 5.44f, 7.12f, 5.58f};

    float tablaDispositivoProcesamientoClientesVIP_Duracion[] = {1.31f, 2.26f,7.02f, 2.61f};
    float tablaDispositivoProcesamientoClientesVIP_PersonalMedio[] = {2.78f, 4.29f, 5.61f, 4.40f};*/

    System.out.println("----------2-DISPOSITIVOS ENCHUFE----------");
    System.out.println("-3-Dispositivo Enchufe-Tomar datos de los sensores");
    for (int i = 0; i < 4; i++) {
        calculador(tablaEnchufe_Duracion[i], tablaEnchufe_PersonalMedio[i], tablaEnchufe_PersonalReal1[i], tablaEnchufe_Porcentajes[0]);
    }   
    System.out.println("-8-Dispositivo Enchufe-Conectar los enchufes con la puerta de enlace");
    for (int i = 0; i < 4; i++) {
        calculador(tablaEnchufe_Duracion[i], tablaEnchufe_PersonalMedio[i], tablaEnchufe_PersonalReal2[i], tablaEnchufe_Porcentajes[1]);
    }  
    System.out.println("-13-Dispositivo Enchufe-Gestión de tareas que tomarán los datos periódicamente");
    for (int i = 0; i < 4; i++) {
        calculador(tablaEnchufe_Duracion[i], tablaEnchufe_PersonalMedio[i], tablaEnchufe_PersonalReal3[i], tablaEnchufe_Porcentajes[2]);
    }

    
    
    System.out.println("----------DISPOSITIVOS DE PUERTA DE ENLACE----------");
    System.out.println("-19-Dispositivos de puerta de enlace-Conectar la puerta de enlace con los enchufes");
    for (int i = 0; i < 4; i++) {
        calculador(tablaPuertaEnlace_Duracion[i], tablaPuertaEnlace_PersonalMedio[i], tablaPuertaEnlace_PersonalReal1[i], tablaPuertaEnlace_Porcentajes[0]);
    }
    System.out.println("-24-Dispositivos de puerta de enlace-Conectar la puerta de enlace con la base de datos");
    for (int i = 0; i < 4; i++) {
        calculador(tablaPuertaEnlace_Duracion[i], tablaPuertaEnlace_PersonalMedio[i], tablaPuertaEnlace_PersonalReal2[i], tablaPuertaEnlace_Porcentajes[1]);
    }
    System.out.println("-29-Dispositivos de puerta de enlace-Procesar las medidas recibidas de los sensores");
    for (int i = 0; i < 4; i++) {
        calculador(tablaPuertaEnlace_Duracion[i], tablaPuertaEnlace_PersonalMedio[i], tablaPuertaEnlace_PersonalReal3[i], tablaPuertaEnlace_Porcentajes[2]);
    }   
    System.out.println("-34-Dispositivos de puerta de enlace-Enlazar la puerta enlace con la aplicación de usuario");
    for (int i = 0; i < 4; i++) {
        calculador(tablaPuertaEnlace_Duracion[i], tablaPuertaEnlace_PersonalMedio[i], tablaPuertaEnlace_PersonalReal4[i], tablaPuertaEnlace_Porcentajes[3]);
    }

    System.out.println("----------APLICACIÓN DE CLIENTES----------");
    System.out.println("-40-Aplicacion de Clientes-Creación de Interfaz");
    for (int i = 0; i < 4; i++) {
        calculador(tablaClientesNoVIP_Duracion[i], tablaClientesNoVIP_PersonalMedio[i], tablaClientesNoVIP_PersonalReal1[i], tablaClientesNoVIP_Porcentajes[0]);
    }
    System.out.println("-45-Aplicacion de Clientes-Enlazar la aplicación con la base de datos");
    for (int i = 0; i < 4; i++) {
        calculador(tablaClientesNoVIP_Duracion[i], tablaClientesNoVIP_PersonalMedio[i], tablaClientesNoVIP_PersonalReal2[i], tablaClientesNoVIP_Porcentajes[1]);
    }
    System.out.println("-50-Aplicacion de Clientes-Mostrar los datos recibidos en la interfaz");
    for (int i = 0; i < 4; i++) {
        calculador(tablaClientesNoVIP_Duracion[i], tablaClientesNoVIP_PersonalMedio[i], tablaClientesNoVIP_PersonalReal3[i], tablaClientesNoVIP_Porcentajes[2]);
    }
    
    
    System.out.println("----------BASE DE DATOS----------");
    System.out.println("-56-Base de Datos-Crear la estructura de datos");
    for (int i = 0; i < 4; i++) {
        calculador(tablaBBDD_Duracion[i], tablaBBDD_PersonalMedio[i], tablaBBDD_PersonalReal1[i], tablaBBDD_Porcentajes[0]);
    }
    System.out.println("-61-Base de Datos-Recibir peticiones externas");
    for (int i = 0; i < 4; i++) {
        calculador(tablaBBDD_Duracion[i], tablaBBDD_PersonalMedio[i], tablaBBDD_PersonalReal2[i], tablaBBDD_Porcentajes[1]);
    }
    System.out.println("-66-Base de Datos-Gestión de cuentas");
    for (int i = 0; i < 4; i++) {
        calculador(tablaBBDD_Duracion[i], tablaBBDD_PersonalMedio[i], tablaBBDD_PersonalReal3[i], tablaBBDD_Porcentajes[2]);
    }


}
    
    
public static void calculador(float tiempoCocomo, float personasCocomo, float personasReales, float porcentaje){

    float diasPrevistos = ((personasCocomo*tiempoCocomo/personasReales)*porcentaje)*30;
    System.out.println("Dias: "+diasPrevistos);

}
    
}

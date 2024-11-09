package helpers;

import java.util.ArrayList;
public class GestorEmpleados {
    private ArrayList<Empleado> lista_Empleados;
    
    public GestorEmpleados(){
        this.lista_Empleados = new ArrayList<>();
    }
    
    public void agragarEmpleado(Empleado empleado){
        lista_Empleados.add(empleado);
        System.out.println("EMPLEADO INGRESADO CORRECTAMENTE: ");
    }
    
    public void mostrarEmpleados(){
        if(lista_Empleados.isEmpty()){
            System.out.println("LISTA NO CONTIENE EMPLEADOS.");
            
        }else{
            for(Empleado empleado : lista_Empleados){
                empleado.imprimirInformacion();
               System.out.println("///////////////////////////////////");
            }
        }
    }
}

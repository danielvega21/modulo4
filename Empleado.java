package helpers;
public class Empleado {
    private String nombre_de_empleado;
   private int edad__de_empleado;
   private double salario_de_empleado;
   
   public Empleado(String nombre, int edad, double Salario){
       this.nombre_de_empleado = nombre;
       this.edad__de_empleado = edad;
       this.salario_de_empleado = Salario;
   }
   
   public String get_nombre(){
       return nombre_de_empleado;
   }
   
   public void set_nombre(String nombre){
       this.nombre_de_empleado = nombre;
   }
   
   public int get_edad(){
      return edad__de_empleado; 
   }
   
   public void set_edad(int edad){
       this.edad__de_empleado = edad;
   }
   
   public double Salario(){
       return salario_de_empleado;
   }
   
   public void set_salario(double salario){
       this.salario_de_empleado = salario;
   }
   
            public void imprimirInformacion(){
        System.out.println("Nombre Correcto Del Empleado: " + nombre_de_empleado);
            System.out.println("Edad Correcta Del Empleado: " + edad__de_empleado);
            System.out.println("Salario Que Le Corresponderia Al Usuario: " + salario_de_empleado);
   }
}

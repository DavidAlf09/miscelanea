
/**
 * Write a description of class EstudianteEstructurado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class EstudianteEstructurado
{
    
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       String[] identificaciones = new String[50];
       String[] nombres = new String[50];
       String[] cursos = new String[50];
       double[] notauno = new double [50];
       double[] notados = new double [50];
       double[] notatres = new double [50];
       int numeroEstudiantes;
       String identificacion, nombre, curso;
       double nota1, nota2, nota3;
       double promedio = 0;
       System.out.println ("Digite el numero de estudiantes: ");
       numeroEstudiantes = sc.nextInt();
       for(int i = 0; i < numeroEstudiantes; i++){
           System.out.println("Digite la identificacion del estudiante: ");
           identificacion = sc.next();
           System.out.println("Digite el nombre del estudiante: ");
           nombre = sc.next();
           System.out.println("Digite el curso del estudiante: ");
           curso = sc.next();
           System.out.println("Digite la nota uno del estudiante: ");
           nota1 = sc.nextDouble(); 
           System.out.println("Digite la nota dos del estudiante: ");
           nota2 = sc.nextDouble();
           System.out.println("Digite la nota tres del estuiante: ");
           nota3 = sc.nextDouble();
           identificaciones[i] = identificacion;
           nombres[i] = nombre;
           cursos[i] = curso;
           notauno[i] = nota1;
           notados[i] = nota2;
           notatres[i] = nota3;
       }
       for(int i = 0; i < numeroEstudiantes; i++){
           promedio = promedio +((notauno[i] + notados[i] + notatres[i]) / 3) / numeroEstudiantes;
           System.out.println("El promedio de notas es: " + promedio);
       }
   }
}

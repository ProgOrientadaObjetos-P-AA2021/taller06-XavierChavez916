/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Scanner;
import paquete1.Ciudad;
import paquete1.Enfermero;
import paquete1.Hospital;
import paquete1.Medico;

/**
 *
 * @author xavierchavez
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Medico[] conjuntoMedico;
        Enfermero[] conjuntoEnfermero;

        System.out.println("Ingrese el nombre del hospital");
        String nomHosp = entrada.nextLine();
        System.out.println("Ingrese la direccion del hospital");
        String direcHosp = entrada.nextLine();
        System.out.println("Ingrese la ciudad del hospital");
        String ciudad = entrada.nextLine();
        System.out.println("Ingrese la provincia del hospital");
        String provincia = entrada.nextLine();
        System.out.println("Ingrese el número de especialidades");
        int numEspecialidades = entrada.nextInt();
        System.out.println("Ingrese cuantos doctores tiene el hospital");
        int numDoctor = entrada.nextInt();
        entrada.nextLine();

        Ciudad c1 = new Ciudad(ciudad, provincia);
        conjuntoMedico = new Medico[numDoctor];

        for (int i = 0; i < numDoctor; i++) {
            System.out.printf("---Ingrese los datos del doctor #%d---\n",i+1);
            System.out.println("Ingrese el nombre del doctor");
            String nomDoctor = entrada.nextLine();
            System.out.println("Ingrese la especilidad del doctor");
            String especialidad = entrada.nextLine();
            System.out.println("Ingrese el sueldo mensual");
            double sueldo = entrada.nextDouble();
            System.out.println("---------------------------------------");
            entrada.nextLine();

            Medico doc1 = new Medico(nomDoctor, especialidad, sueldo);
            conjuntoMedico[i] = doc1;
        }

        System.out.println("Ingrese cuantos enfermeros(as) tiene el hospital");
        int numEnfe = entrada.nextInt();
        entrada.nextLine();

        conjuntoEnfermero = new Enfermero[numEnfe];
        for (int i = 0; i < numEnfe; i++) {
            System.out.printf("---Ingrese los datos del enfermera/o #%d---\n",
                    i+1);
            System.out.println("Ingrese el nombre del enfermera/o");
            String nomEnfe = entrada.nextLine();
            System.out.println("Ingrese el tipo (nombramiento, contrato)");
            String tipo = entrada.nextLine();
            System.out.println("Ingrese el sueldo");
            double suel = entrada.nextDouble();
            entrada.nextLine();
            System.out.println("---------------------------------------");
            Enfermero enfe1 = new Enfermero(nomEnfe, tipo, suel);
            conjuntoEnfermero[i] = enfe1;
        }
        Hospital h1 = new Hospital(c1, nomHosp, direcHosp, numEspecialidades,
                conjuntoMedico, conjuntoEnfermero);
        h1.establecerSueldo();

        System.out.printf("%s\n", h1);

    }

}

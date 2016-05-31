/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parqueadero;

import java.util.Scanner;
import java.util.Random;
import java.awt.Color;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author undine
 */
public class MisMetodos {

    static Scanner leer = new Scanner(System.in);

    public static int[] llenar_enteros(int[] datos, String mensaje) {
        int i = 0;
        for (i = 0; i < datos.length; i++) {
            System.out.println(mensaje);
            datos[i] = leer.nextInt();
        }
        return datos;
    }

    public static float[] llenar_float(float[] datos, String mensaje) {
        int i = 0;
        for (i = 0; i < datos.length; i++) {
            System.out.println(mensaje);
            datos[i] = leer.nextInt();
        }
        return datos;
    }

    public static void mostrar_vector_entero(int[] datos, String mensaje) {
        int i = 0;
        for (i = 0; i < datos.length; i++) {
            System.out.println(mensaje + "" + datos[i]);
        }
    }

    public static void mostrar_vector_float(float[] datos, String mensaje) {
        int i = 0;
        for (i = 0; i < datos.length; i++) {
            System.out.println(mensaje + "" + datos[i]);
        }
    }

    public static void mostrar_entero(int dato, String mensaje) {
        System.out.println(mensaje + "" + dato);
    }

    public static void mostrar_float(float dato, String mensaje) {
        System.out.println(mensaje + "" + dato);
    }

    public static int sumatoria_enteros(int[] datos) {
        int sumatoria = 0, i = 0;
        for (i = 0; i < datos.length; i++) {
            sumatoria = sumatoria + datos[i];
        }
        return sumatoria;
    }

    public static int sumatoria_enteros_pares(int[] datos) {
        int sumatoria = 0, i = 0;
        for (i = 0; i < datos.length; i++) {
            if ((datos[i] % 2) == 0) {
                sumatoria = sumatoria + datos[i];
            }
        }
        return sumatoria;
    }

    public static void llenar_2_vectores(int[] derecho, int[] contrario) {
        int i = 0, j = 0;
        j = contrario.length;
        for (i = 0; i < derecho.length; i++) {
            System.out.println("Digite valor para vector 1: ");
            derecho[i] = leer.nextInt();
            System.out.println("Digite valor para vector 2: ");
            contrario[(j - 1)] = leer.nextInt();
            j--;
        }
    }

    public static int[] llenar_solo_elementos_pares(int[] datos, String mensaje) {

        int i = 0;
        for (i = 0; i < datos.length; i++) {
            if ((i % 2) != 0) {
                System.out.println(mensaje);
                datos[i] = leer.nextInt();
            }
        }
        return datos;
    }

    public static int[] llenar_elementos_impares_menos_anterior(int[] datos) {
        int i = 0;
        for (i = 2; i < datos.length; i++) {
            //System.out.println(mensaje);
            if ((i % 2) == 0) {
                datos[i] = datos[i] - datos[(i - 1)];
            }
        }
        return datos;
    }

    public static int[] vector_resultado(int[] x, int[] y) {
        int i = 0;
        int z[] = new int[x.length];
        for (i = 0; i < x.length; i++) {
            if (i < y.length) {
                z[i] = x[i] + y[i];
            } else {
                z[i] = x[i];
            }
        }
        return z;
    }

    public static int mostrar_sumatoria_pares(int[] datos) {
        int i = 0, suma = 0;

        for (i = 0; i < datos.length; i++) {
            if (pares(datos[i]) == 1) {
                suma = suma + datos[i];
            }
        }

        return suma;
    }

    public static int pares(int a) {
        if (a % 2 == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int[] llenar_vector_entero_random(int[] datos) {
        int i = 0;
        Random rnd = new Random();
        for (i = 0; i < datos.length; i++) {
            datos[i] = rnd.nextInt(1000);
        }
        return datos;
    }

    public static int suma3enteros(int x, int y, int z) {
        int suma = 0;
        suma = x + y + z;
        return suma;
    }

    public static String concatenar_vector(int[] datos, String cadena) {
        int i = 0;
        String dato = "";
        cadena = "";
        for (i = 0; i < datos.length; i++) {
            dato = String.valueOf(datos[i]);
            cadena = cadena + " " + dato + "  ";
        }
        return cadena;
    }

    public static String concatenar_vectord(double[] datos, String cadena) {
        int i = 0;
        String dato = "";
        cadena = "";
        for (i = 0; i < datos.length; i++) {
            dato = String.valueOf(datos[i]);
            cadena = cadena + " " + dato + "\n";
        }
        return cadena;
    }

    public static double promedio_vector(int[] datos) {
        int i = 0, suma = 0;
        double promedio = 0;

        for (i = 0; i < datos.length; i++) {
            suma = suma + datos[i];
        }
        return promedio = suma / datos.length;
    }

    public static Font seleccionar_fuente(int opc) {
        Font fuente = null;
        switch (opc) {
            case 1:
                fuente = new Font("Times New Roman", Font.PLAIN, 14);
                break;
            case 2:
                fuente = new Font("Tunga", Font.PLAIN, 14);
                break;
            case 3:
                fuente = new Font("Tahoma", Font.PLAIN, 14);
                break;
            case 4:
                fuente = new Font("Calibri", Font.PLAIN, 14);
                break;
        }
        return fuente;
    }

    public static Font seleccionar_tamaño(int opc) {
        Font fuente = null;
        switch (opc) {
            case 10:
                fuente = new Font("", Font.PLAIN, 10);
                break;
            case 12:
                fuente = new Font("", Font.PLAIN, 12);
                break;
            case 14:
                fuente = new Font("", Font.PLAIN, 14);
                break;
            case 16:
                fuente = new Font("", Font.PLAIN, 16);
                break;
        }
        return fuente;
    }

    public static int cuantas_veces_palabra(String palabra, String texto) {
        int veces = 0, i = 0;

        for (i = 0; i < texto.length(); i++) {
            if (texto.indexOf(palabra, i) > -1) {
                veces++;
                i = texto.indexOf(palabra, i);
            } else {
                i = texto.length();
            }
        }
        return veces;
    }

    public static int[] intercalar_vectores(int[] datosv1, int[] datosv2, int[] datosv3) {
        int z = 0, i = 0, m = 0;

        if (datosv1.length > datosv2.length) {
            m = datosv1.length;
        } else {
            m = datosv2.length;
        }

        for (i = 0; i < datosv3.length;) {
            if (datosv1.length > z) {
                datosv3[i] = datosv1[z];
                i++;
            }
            if (datosv2.length > z) {
                datosv3[i] = datosv2[z];
                i++;
            }
            z++;
        }

        return datosv3;
    }

    public static int cantidad_primos(int[] datosv3) {
        int cant = 0, i = 0;
        for (i = 0; i < datosv3.length; i++) {
            if (primo(datosv3[i]) < 2) {
                cant++;
            }
        }
        return cant;
    }

    public static int primo(int dato) {
        int i = 0, cant = 0;
        for (i = 1; i < dato; i++) {
            if ((dato % i) == 0) {
                cant++;
            }
        }
        return cant;
    }

    public static int[] llenar_vector_primos(int[] datosv3, int[] datosv4) {
        int i = 0, m = 0;
        for (i = 0; i < datosv3.length; i++) {
            if (primo(datosv3[i]) < 2) {
                datosv4[m] = datosv3[i];
                m++;
            }
        }
        return datosv4;
    }

    public static int[] llenar_notas(int[] datos) {
        int i = 0;
        Random rnd = new Random();
        for (i = 0; i < datos.length; i++) {
            datos[i] = rnd.nextInt(5);
        }
        return datos;
    }

    public static int[] llenar_estudiantes(int[] datos) {
        int i = 0;

        for (i = 0; i < datos.length; i++) {
            datos[i] = i + 1000;
        }
        return datos;
    }

    public static int[] llenar_materias(int[] datos) {
        int i = 0;

        for (i = 0; i < datos.length; i++) {
            datos[i] = i + 2000;
        }
        return datos;
    }

    public static double[] promedio(int[] datos) {
        double promedio[] = new double[10];
        int i = 0, a = 0, b = 0, c = 0;
        double prom = 0;
        for (i = 0; i < datos.length; i++) {
            b = b + datos[i];
            a++;
            if (a == 3) {
                promedio[c] = b / 3;
                c++;
                a = 0;
                b = 0;
            }
        }
        return promedio;
    }

    public static double[] promedioa(int[] datos) {
        double promedio[] = new double[3];
        int i = 0, a = 0, b = 0, c = 0;
        double proma = 0, promb = 0, promc = 0;
        for (i = 0; i < datos.length; i++) {
            a = a + datos[i];
            i++;
            b = b + datos[i];
            i++;
            c = c + datos[i];
        }
        promedio[0] = a / 10;
        promedio[1] = b / 10;
        promedio[2] = c / 10;
        return promedio;
    }

    public static int[] alta(int[] datos) {
        int i = 0, a = 0, b = 0, c = 0;
        int datosr[] = new int[3];
        datosr[0] = a;
        datosr[1] = b;
        datosr[2] = c;

        for (i = 0; i < datos.length; i++) {
            if (datosr[0] < datos[i]) {
                datosr[0] = datos[i];
            }
            i++;
            if (datosr[1] < datos[i]) {
                datosr[1] = datos[i];
            }
            i++;
            if (datosr[2] < datos[i]) {
                datosr[2] = datos[i];
            }
        }
        return datosr;
    }

    public static String[][] llenar_columna_estudiantes(String[][] matriz, int col) {
        int i = 0;
        Random rnd = new Random();
        for (i = 0; i < matriz.length; i++) {
            if (i == 0) {
                matriz[i][col] = "Estudiante";
            } else {
                matriz[i][col] = String.valueOf(rnd.nextInt(100) + 1000);
            }
        }
        return matriz;
    }

    public static String[][] llenar_columna_notas(String[][] matriz, int col) {
        int i = 0;
        Random rnd = new Random();
        for (i = 0; i < matriz.length; i++) {
            if (i == 0) {
                matriz[i][col] = String.valueOf(rnd.nextInt(100) + 2000);
            } else {
                matriz[i][col] = String.valueOf(rnd.nextFloat() + rnd.nextInt(4));
            }
        }
        return matriz;
    }

    public static String concatenar_matriz(String[][] matriz, String cadena) {
        int i = 0;
        cadena = "";
        for (i = 0; i < matriz.length; i++) {
            //dato=String.valueOf(datos[i]);
            cadena = cadena + " " + String.valueOf(matriz[i][0]) + " N: " + String.valueOf(matriz[i][1]) + " N: " + String.valueOf(matriz[i][2]) + " N: " + String.valueOf(matriz[i][3]) + "\n";
        }
        return cadena;
    }

    public static String concatenar_matriz_entero(int[][] matriz, String cadena) {
        int i = 0, j = 0;
        cadena = "";
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++) {
                cadena = cadena + String.valueOf(matriz[i][j]) + "  ";
            }
            cadena = cadena + "\n";
        }
        return cadena;
    }

    public static double[] calcular_promedio_estudiantes(String[][] matriz, double[] promedio) {
        int i = 0, j = 0;
        double prom = 0;
        for (i = 1; i < matriz.length; i++) {
            for (j = 1; j < 4; j++) {
                prom = prom + Float.parseFloat(matriz[i][j]);
            }
            promedio[i - 1] = prom / 3;
            j = 0;
            prom = 0;
        }
        return promedio;
    }

    public static double[] calcular_promedio_materia(String[][] matriz, double[] promediom) {
        int i = 0, j = 0;
        double prom = 0;
        for (j = 1; j < 4; j++) {
            for (i = 1; i < matriz.length; i++) {
                prom = prom + Float.parseFloat(matriz[i][j]);
            }
            promediom[j - 1] = prom / 10;
            i = 0;
            prom = 0;
        }

        return promediom;
    }

    public static double[] calcular_nota_mayor(String[][] matriz, double[] alto) {
        int i = 0, j = 0;
        double prom = 0;
        for (j = 1; j < 4; j++) {
            for (i = 1; i < matriz.length; i++) {
                if (prom < Float.parseFloat(matriz[i][j])) {
                    prom = Float.parseFloat(matriz[i][j]);
                }
            }
            alto[j - 1] = prom;
            i = 0;
            prom = 0;
        }

        return alto;
    }

    public static int[][] llenar_matriz_entero_fila_random(int[][] matriz, String mensaje) {
        int i = 0, j = 0;
        Random rnd = new Random();
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++) {
                System.out.println(mensaje);
                matriz[i][j] = rnd.nextInt(10000);
            }
        }
        return matriz;
    }

    public static int[][] llenar_matriz_entero_par_fila_random(int[][] matriz, String mensaje) {
        int i = 0, j = 0, num = 0;
        Random rnd = new Random();
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++) {
                System.out.println(mensaje);
                num = rnd.nextInt(10000);
                if ((num % 2) == 0) {
                    matriz[i][j] = num;
                } else {
                    j--;
                }
            }
        }
        return matriz;
    }

    public static int[][] llenar_matriz_entero_columna_random(int[][] matriz, String mensaje) {
        int i = 0, j = 0;
        Random rnd = new Random();
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++) {
                System.out.println(mensaje);
                matriz[j][i] = rnd.nextInt(10000);
            }
        }
        return matriz;
    }

    public static void mostrar_matriz_entero_columna(int[][] matriz, String mensaje) {
        int i = 0, j = 0;
        Random rnd = new Random();
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++) {
                System.out.println(mensaje + " " + matriz[j][i]);
            }
        }
    }

    public static void mostrar_matriz_entero_fila(int[][] matriz, String mensaje) {
        int i = 0, j = 0;
        Random rnd = new Random();
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++) {
                System.out.println(mensaje + " " + matriz[i][j]);
            }
        }
    }

    public static void mostrar_pares_matriz(int[][] matriz, String mensaje) {
        int i = 0, j = 0;
        Random rnd = new Random();
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++) {
                if ((matriz[i][j] % 2) == 0) {
                    System.out.println(mensaje + " " + matriz[i][j]);
                }
            }
        }
    }

    public static int mayor_fila_matriz(int[][] matriz, int fila) {
        int i = 0, j = 0, mayor = 0;

        for (i = 0; i < matriz[(fila - 1)].length; i++) {
            if (matriz[(fila - 1)][i] > mayor) {
                mayor = matriz[(fila - 1)][i];
            }
        }
        return mayor;
    }

    public static int mayor_matriz(int[][] matriz) {
        int i = 0, j = 0, mayor = 0;

        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }
            }
        }
        return mayor;
    }

    public static int menor_matriz(int[][] matriz) {
        int i = 0, j = 0, menor = 0;

        menor = mayor_matriz(matriz);

        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }
        return menor;
    }

    public static int[][] traza_matriz(int[][] matriz, int[][] traza) {
        int i = 0, j = 0, mayor = 0;

        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++) {
                traza[j][i] = matriz[i][j];
            }
        }
        return traza;
    }

    public static int[][] matriz_recorrido_1(int[][] matriz, int[][] auxiliar, String mensaje) {
        int i = 0, j = 0, k = 0, l = 0;

        for (i = matriz.length - 1; i >= 0; i--) {
            if (i % 2 != 0) {
                for (j = matriz[i].length - 1; j >= 0; j--) {
                    auxiliar[l][k] = matriz[i][j];
                    k++;
                }
            } else {
                for (j = 0; j < matriz.length; j++) {
                    auxiliar[l][k] = matriz[i][j];
                    k++;
                }
            }
            k = 0;
            l++;
        }
        k = 0;
        l = 0;
        return auxiliar;
    }

    public static int[][] matriz_recorrido_2(int[][] matriz, int[][] auxiliar, String mensaje) {
        int i = 0, j = 0, k = 0, l = 0, count = 0;

        for (i = matriz.length - 1; i >= 0; i--) {
            if (count == 0 || count == 1) {
                for (j = matriz[i].length - 1; j >= 0; j--) {
                    auxiliar[l][k] = matriz[j][i];
                    k++;
                }
                count++;
            } else {
                for (j = 0; j < matriz[i].length; j++) {
                    auxiliar[l][k] = matriz[j][i];
                    k++;
                }
                count++;
                if (count == 4) {
                    count = 0;
                }
            }
            k = 0;
            l++;
        }
        k = 0;
        l = 0;
        return auxiliar;
    }

    public static int[][] matriz_recorrido_3(int[][] matriz, int[][] auxiliar, String mensaje) {
        int i = 0, j = 0, k = 0, l = 0, count = 0;

        for (i = 0; i < matriz.length; i++) {
            if (count == 0 || count == 1) {
                for (j = matriz[i].length - 1; j >= 0; j--) {
                    auxiliar[l][k] = matriz[i][j];
                    k++;
                }
                count++;
            } else {
                for (j = 0; j < matriz[i].length; j++) {
                    auxiliar[l][k] = matriz[i][j];
                    k++;
                }
                count++;
                if (count == 4) {
                    count = 0;
                }
            }
            k = 0;
            l++;
        }
        k = 0;
        l = 0;
        return auxiliar;
    }

    public static int[][] matriz_recorrido_4(int[][] matriz, int[][] auxiliar, String mensaje) {
        int i = 0, j = 0, k = 0, l = 0, count = 0;

        for (i = 0; i < matriz.length; i++) {
            if (count == 0) {
                for (j = matriz[i].length - 1; j >= 0; j--) {
                    auxiliar[l][k] = matriz[j][i];
                    k++;
                }
                count++;
            } else {
                for (j = 0; j < matriz[i].length; j++) {
                    auxiliar[l][k] = matriz[j][i];
                    k++;
                }
                count++;
                if (count == 3) {
                    count = 0;
                }
            }
            k = 0;
            l++;
        }
        k = 0;
        l = 0;
        return auxiliar;
    }

    public static int[][] diagonal_principal(int[][] matriz){
        
        int x=0,y=0,i=0,j=0;
        y=matriz[x].length;
        x=matriz.length;
        int[][] auxiliar = new int[x][y];
        
        for(i=0;i<matriz.length;i++){
            auxiliar[i][i]=matriz[i][i];
        }
        return auxiliar;
    }
    
    public static int[][] diagonal_secundaria(int[][] matriz){
        
        int x=0,y=0,i=0,j=0;
        y=matriz[x].length;
        x=matriz.length;
        int[][] auxiliar = new int[x][y];
        
        for(i=0;i<matriz.length;i++){
            auxiliar[i][y-1]=matriz[i][y-1];
            y--;
        }
        return auxiliar;
    }
    
    public static int[][] superior_diagonal_principal(int[][] matriz){
        
        int x=0,y=0,i=0,j=0;
        y=matriz[x].length;
        x=matriz.length;
        int[][] auxiliar = new int[x][y];
        
        for(i=0;i<matriz.length;i++){
            for(j=0;j<matriz[i].length;j++){
                if(j>0 && j>i){
                    auxiliar[i][j] = matriz[i][j];
                }
            }            
        }
        return auxiliar;
    }
    
    public static int[][] inferior_diagonal_principal(int[][] matriz){
        
        int x=0,y=0,i=0,j=0;
        y=matriz[x].length;
        x=matriz.length;
        int[][] auxiliar = new int[x][y];
        
        for(i=0;i<matriz.length;i++){
            for(j=0;j<matriz[i].length;j++){
                if(i>0 && j<i){
                    auxiliar[i][j] = matriz[i][j];
                }
            }            
        }
        return auxiliar;
    }
    
    public static int[][] superior_diagonal_secundaria(int[][] matriz){
        
        int x=0,y=0,i=0,j=0;
        y=matriz[x].length;
        x=matriz.length;
        int[][] auxiliar = new int[x][y];
        x=x-1;
        for(i=0;i<matriz.length;i++){
            for(j=0;j<matriz[i].length;j++){
                if(x>j){
                    auxiliar[i][j] = matriz[i][j];
                }
            }
            x--;
        }
        return auxiliar;
    }
    
    public static int[][] inferior_diagonal_secundaria(int[][] matriz){
        
        int x=0,y=0,i=0,j=0;
        y=matriz[x].length;
        x=matriz.length;
        int[][] auxiliar = new int[x][y];
        x=x-1;
        for(i=0;i<matriz.length;i++){
            for(j=0;j<matriz[i].length;j++){
                if(j>x){
                    auxiliar[i][j] = matriz[i][j];
                }
            }
            x--;
        }
        return auxiliar;
    }
    
    public static int[] espiral_1(int[][] matriz){
        
        int x=0,y=0,j=0;
        y=matriz[x].length;
        x=matriz.length;
        int[] auxiliar = new int[16];
        
        //int[][] matriz= new int[10][10];
        int n=4; //Matriz cuadrada 8x8
        int inicio=0;
        int nlimite=n-1;
        int c=0;
        while(c<(n*n)){
            for(int i=inicio; i<=nlimite; i++){
                auxiliar[c] = matriz[inicio][i];
                c++;
            }
            for(int i=inicio+1; i<=nlimite; i++){
                auxiliar[c] = matriz[i][nlimite];
                c++;
            }
            for(int i=nlimite-1;i>=inicio; i--){
                auxiliar[c] = matriz[nlimite][i];
                c++;
            }
            for(int i=nlimite-1;i>=inicio+1;i--){
                auxiliar[c] = matriz[i][inicio];
                c++;
            }
            inicio = inicio+1;
            nlimite = nlimite-1;
        }
        
        
        return auxiliar;
    }
    
    public static int[][] espiral_2(int[][] matriz){
        
        int x=0,y=0,i=0,j=0;
        y=matriz[x].length;
        x=matriz.length;
        int[][] auxiliar = new int[x][y];
        x=x-1;
        for(i=0;i<matriz.length;i++){
            for(j=0;j<matriz[i].length;j++){
                if(j>x){
                    auxiliar[i][j] = matriz[i][j];
                }
            }
            x--;
        }
        return auxiliar;
    }
    
    public static int[][] espiral_3(int[][] matriz){
        
        int x=0,y=0,i=0,j=0;
        y=matriz[x].length;
        x=matriz.length;
        int[][] auxiliar = new int[x][y];
        x=x-1;
        for(i=0;i<matriz.length;i++){
            for(j=0;j<matriz[i].length;j++){
                if(j>x){
                    auxiliar[i][j] = matriz[i][j];
                }
            }
            x--;
        }
        return auxiliar;
    }
    
    public static int[][] sumar_vector_matriz(int[][] matriz, int vector[]){
        
        int i=0,j=0;
        
        for(i=0;i<matriz.length;i++){
            for(j=0;j<matriz[i].length;j++){
                matriz[i][j]=matriz[i][j]+vector[j];
            }
        }
        
        return matriz;
    }
    
    public static int[][] restar_vector_matriz(int[][] matriz, int vector[]){
        
        int i=0,j=0;
        
        for(i=0;i<matriz.length;i++){
            for(j=0;j<matriz[i].length;j++){
                matriz[i][j]=matriz[i][j]-vector[j];
            }
        }
        
        return matriz;
    }
    
    public static int[] burbuja(int arreglo[])
    {
        for(int i = 0; i < arreglo.length - 1; i++)
        {
            for(int j = 0; j < arreglo.length - 1; j++)
            {
                if (arreglo[j] > arreglo[j + 1])
                {
                    int tmp = arreglo[j+1];
                    arreglo[j+1] = arreglo[j];
                    arreglo[j] = tmp;
                }
            }
        }
        return arreglo;
    }
    
    public static int[] seleccion(int A[]) {
        
        int i, j, menor, pos, tmp;
        
        for (i = 0; i < A.length - 1; i++) { // tomamos como menor el primero
            menor = A[i]; // de los elementos que quedan por ordenar
            pos = i; // y guardamos su posición
            
            for (j = i + 1; j < A.length; j++){ // buscamos en el resto
                if (A[j] < menor) { // del array algún elemento
                    menor = A[j]; // menor que el actual
                    pos = j;
                }
            }
            if (pos != i){ // si hay alguno menor se intercambia
                tmp = A[i];
                A[i] = A[pos];
                A[pos] = tmp;
            }
        }
        return A;
    }
    
    public static int[] insercionDirecta(int A[]){
    int p, j;
    int aux;
        for(p = 1; p < A.length; p++){ // desde el segundo elemento hasta
            aux = A[p]; // el final, guardamos el elemento y
            j = p - 1; // empezamos a comprobar con el anterior
            while ((j >= 0) && (aux < A[j])){ // mientras queden posiciones y el
                                                                    // valor de aux sea menor que los
                             A[j + 1] = A[j];       // de la izquierda, se desplaza a
                             j--;                   // la derecha
            }
        A[j + 1] = aux; // colocamos aux en su sitio
        }
        return A;
    }
    
    public static int[] burbuja_desc(int arreglo[])
    {
        for(int i = 0; i < arreglo.length - 1; i++)
        {
            for(int j = 0; j < arreglo.length - 1; j++)
            {
                if (arreglo[j] < arreglo[j + 1])
                {
                    int tmp = arreglo[j+1];
                    arreglo[j+1] = arreglo[j];
                    arreglo[j] = tmp;
                }
            }
        }
        return arreglo;
    }
    
    public static int[] seleccion_desc(int A[]) {
        
        int i, j, menor, pos, tmp;
        
        for (i = 0; i < A.length - 1; i++) { // tomamos como menor el primero
            menor = A[i]; // de los elementos que quedan por ordenar
            pos = i; // y guardamos su posición
            
            for (j = i + 1; j < A.length; j++){ // buscamos en el resto
                if (A[j] > menor) { // del array algún elemento
                    menor = A[j]; // menor que el actual
                    pos = j;
                }
            }
            if (pos != i){ // si hay alguno menor se intercambia
                tmp = A[i];
                A[i] = A[pos];
                A[pos] = tmp;
            }
        }
        return A;
    }
    
    public static int[] insercionDirecta_desc(int A[]){
    int p, j;
    int aux;
        for(p = 1; p < A.length; p++){ // desde el segundo elemento hasta
            aux = A[p]; // el final, guardamos el elemento y
            j = p - 1; // empezamos a comprobar con el anterior
            while ((j >= 0) && (aux > A[j])){ // mientras queden posiciones y el
                                                                    // valor de aux sea menor que los
                             A[j + 1] = A[j];       // de la izquierda, se desplaza a
                             j--;                   // la derecha
            }
        A[j + 1] = aux; // colocamos aux en su sitio
        }
        return A;
    }
    
    public static int sumar_matriz_enteros(int[][] matriz){
        
        int i=0,j=0,sumatoria=0;
        
        for(i=0;i<matriz.length;i++){
            for(j=0;j<matriz[i].length;j++){
                sumatoria = sumatoria + matriz[i][j];
            }
        }
        
        return sumatoria;
    }
    
    public static double promedio_matriz_enteros(int[][] matriz){
        
        int i=0,j=0,sumatoria=0;
        
        for(i=0;i<matriz.length;i++){
            for(j=0;j<matriz[i].length;j++){
                sumatoria = sumatoria + matriz[i][j];
            }
        }
        
        return sumatoria/(matriz.length*matriz[0].length);
    }
    
    public static DefaultTableModel llenar_tabla(DefaultTableModel dtm,int[][] matriz){
        
        int i=0,j=0;
        
        for(i=0;i<matriz.length;i++){
            for(j=0;j<matriz[i].length;j++){
                dtm.setValueAt(matriz[i][j], i, j);
            }
        }
        
        return dtm;
    }
    
    public static DefaultTableModel limpiar_tabla(DefaultTableModel dtm){
        
        dtm=new DefaultTableModel();
        
        return dtm;
    }
    
    public static int[] sumar_vector_matriz_columnas(int[][] matriz, int vector[]){
        
        int i=0,j=0;
        int aux[]=new int[vector.length];
        
        for(i=0;i<matriz.length;i++){
            for(j=0;j<matriz[i].length;j++){
                aux[i]=matriz[j][i]+aux[i];
            }
        }
        
        for(i=0;i<aux.length;i++){
            aux[i]=aux[i]+vector[i];
        }
        
        return aux;
    }
    
    public static int[] cambiar_fila(int[][] matriz, int vector[]){
        
        int i=0,j=0;
        int aux[]=new int[vector.length];
        
        for(i=0;i<matriz[0].length;i++){
            aux[i]=matriz[0][i];
        }
        
        return aux;
    }
    
    public static int[][] cambiar_fila_matriz(int[][] matriz, int vector[]){
        
        int i=0,j=0;
        //int aux[]=new int[vector.length];
        
        for(i=0;i<matriz[0].length;i++){
            matriz[0][i]=vector[i];
        }
        
        return matriz;
    }
    
    public static int[][] generar_datos_estudiantes(int [][] matriz){
        
        int i = 0;
        Random rnd = new Random();
        for (i = 0; i < matriz.length; i++) {
            matriz[i][0] = rnd.nextInt(10000);
            matriz[i][1] = rnd.nextInt(80);
            matriz[i][2] = rnd.nextInt(2) + 1;
            if(matriz[i][2]==1){
                if(matriz[i][1]<18){
                    matriz[i][3] = 1400000;
                }else{
                    matriz[i][3] = 2000000;
                }
            }else{
                if(matriz[i][1]<18){
                    matriz[i][3] = 1050000;
                }else{
                    matriz[i][3] = 1500000;
                }
            }
        }
        
    return matriz;
    }
    
    public static int contar_rurales(int [][] matriz){
        int rurales=0;
            for(int i=0;i<matriz.length;i++){
                if(matriz[i][2]==2 && matriz[i][1] < 18){
                    rurales++;
                }
            }
        return rurales;
    }
    
    public static int contar_urbanos(int [][] matriz){
        int urbanos=0;
            for(int i=0;i<matriz.length;i++){
                if(matriz[i][2]==1 && matriz[i][1] < 18){
                    urbanos++;
                }
            }
        return urbanos;
    }
    
    public static int[] generar_celsius(int[] datos) {
        int i = 0;
        Random rnd = new Random();
        for (i = 0; i < datos.length; i++) {
            datos[i] = rnd.nextInt(100);
        }
        return datos;
    }
    
    public static int[] calcular_farenheit(int[] datos, int[] vector) {
        int i = 0;
        
        for (i = 0; i < datos.length; i++) {
            vector[i] = (int) ((datos[i] * 1.8) + 32);
        }
        return vector;
    }
    
    public static int[] calcular_kelvin(int[] datos, int[] vector) {
        int i = 0;
        
        for (i = 0; i < datos.length; i++) {
            vector[i] = (int) (datos[i] + 273.15);
        }
        return vector;
    }
    
    public static int mayor_vector(int[] vector) {
        int i = 0, mayor = 0;

        for (i = 0; i < vector.length; i++) {
            if (vector[i] > mayor) {
                mayor = vector[i];
            }
        }
        return mayor;
    }
    
    public static int menor_vector(int[] vector) {
        int i = 0, mayor = 0;
        mayor=vector[0];

        for (i = 0; i < vector.length; i++) {
            if (vector[i] < mayor) {
                mayor = vector[i];
            }
        }
        return mayor;
    }
    
    public static int[] temp_mayores(int datos, int[] vector) {
        
        vector[0]=datos;
        vector[1]=(int)((datos * 1.8000) + 32);
        vector[2]=(int)(datos + 273.15);
        
        
        return vector;
    }
    
    public static int[] temp_menores(int datos, int[] vector) {
        
        vector[0]=datos;
        vector[1]=(int)((datos * 1.8000) + 32);
        vector[2]=(int)(datos + 273.15);
        
        
        return vector;
    }
    
    public static String concatenar_lista(ArrayList placas,String cadena){
        cadena="";
        for(int i=0;i<placas.size();i++){
            cadena = cadena + " - " + placas.get(i) + "\n";
        }
        System.out.println(cadena);
    
        return cadena;
    }
    
    public static ArrayList eliminar_elemento(ArrayList placas,String cadena){
        
        int indice = MisMetodos.indice_elemento(placas,cadena);
        placas.remove(indice);
        System.out.println(indice);
    
        return placas;
    }
    
    public static int indice_elemento(ArrayList placas,String cadena){
        
        int indice=-1;
        
        for(int i=0;i<placas.size();i++){
            System.out.println(cadena);
            System.out.println(indice);
            if(placas.get(i).equals(cadena)){
                indice=i;   
            }
        }
        
        System.out.println(indice);
    
        return indice;
    }
}

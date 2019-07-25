package controller;

/**
 * Created by TETEU on 10/11/2017.
 */

public class Calculo {

    private String a, b, c, d, e, f, g;
    private int contador, erroHabDesenv;

    public int Questions(String q1, String q2, String q3, String q4, String q5, String q6, String q7){

        a = q1;
        b = q2;
        c = q3;
        d = q4;
        e = q5;
        f = q6;
        g = q7;


        contador = 0;
        erroHabDesenv = 0;
        //---------------HABILIDADES DESENVOLVIDAS-----------------------
        if (a.equals("Sim"))
            contador+= 10;
        else
            erroHabDesenv += 1;

        if (b.equals("Sim"))
            contador+=10;
        else
            erroHabDesenv +=1;

        if (c.equals("Sim"))
            contador+=10;
        else
            erroHabDesenv+=1;
        //------------- HABILIDADES EM DESENVOLVIMENTO--------------------
        if (d.equals("Sim"))
            contador+=4;
        else
            contador+=0;

        if(e.equals("Sim"))
            contador+=4;
        else
            contador+=0;
        //------------- HABILIDADES AVANÇADAS-----------------------------

        if(f.equals("Sim"))
            contador+=1;
        else
            contador+=0;

        if(g.equals("Sim"))
            contador+=1;
        else
            contador+=0;

        return contador;
    }

    public int QtdErroHabDesenvolv(){
        return erroHabDesenv;
    }


    public int resultado(int cont, int erro){
        int i = cont;
        int b = erro;
        int resultado;

        if(i < 20){
            if(b > 0)
                return resultado = 1;
            else
                return resultado = 2;
        }else if(i>=20 && i<34){
            if(b > 0)
                return resultado = 3;
            else
                return resultado = 4;
        }else if(i>34 && i<38)
            return resultado = 5;
        else
            return resultado = 6;
    }
}

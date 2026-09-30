package org.example;

public class Peleador {

    String nombre;
    long nivelPoder;
    long vida;
    String habilidadEspecial;

    public Peleador(String nombre, long nivelPoder) {
        this.nombre = nombre;
        this.nivelPoder = nivelPoder;
    }

    public String getNombre() {
        return this.nombre;
    }

    public long getNivelPoder() {
        return this.nivelPoder;
    }

    public void setNivelPoder(long nivelPoder) {
        if (nivelPoder > 2000) {
            this.nombre += nivelPoder;
        }
    }

    public String getHabilidadEspecial() {
        return this.habilidadEspecial;
    }

    public String setHabilidadEspecial(String habilidadEspecial){
        if (nivelPoder > 2000) {
            this.nombre += habilidadEspecial;
        } else {
            System.out.println("Haz Obtenido esta habilidad");
        }
        return habilidadEspecial;
    }

    public long getVida(){
        return this.vida;
    }

    public long setVida(long vida){
        if (vida>10000) {
            if (vida <1000000) {
                this.vida += vida;
            }else {
                System.out.println("Esta es tu vida");
            }
        }

        return vida;
    }

}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel RC
 */
class RAM extends Parte{
//    Tamaño y marca
   private String tamaño;
   private String marca;

    public RAM(String tamaño, String marca, int tiempo, String nombre) {
        super(tiempo, nombre);
        this.tamaño = tamaño;
        this.marca = marca;
    }

    public RAM(int tiempo) {
        super(tiempo);
    }
    

    public RAM(String tamaño, String marca, int tiempo) {
        super(tiempo);
        this.tamaño = tamaño;
        this.marca = marca;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "RAM" ;
    }
    
}

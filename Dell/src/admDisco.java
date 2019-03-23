
import java.util.Random;
import javax.swing.JProgressBar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel RC
 */
public class admDisco extends Thread{
     Random r = new Random();
    private JProgressBar ensamble;
    private Orden compu;
    private boolean avanzar;
    private boolean vive;
    

    public admDisco(JProgressBar ensamble,Orden compu) {
        this.ensamble = ensamble;
        this.compu=compu;
        avanzar = true;
        vive = true;
    }

    public JProgressBar getEnsamble() {
        return ensamble;
    }

    public void setEnsamble(JProgressBar ensamble) {
        this.ensamble = ensamble;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }



    public void run() {
        int cont =1 ;
        int limite=6;
        while (vive) {
            if (avanzar) {
                if (cont<limite) {
                    ensamble.setValue(ensamble.getValue()+1);
                    ensamble.setString(Integer.toString(ensamble.getValue()) + "s");
                   cont++;
                            ;}
                }
            }
            try {
                Thread.sleep(10000000);
            } catch (InterruptedException ex) {
            }
        }
    
}

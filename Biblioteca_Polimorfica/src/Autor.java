/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Usuario
 */
public class Autor extends Usuario {
    private long fecha_nac;
    private long fecha_mue;

    public Autor(String nombre, String apellidos, String dni,  long fecha_nac, long fecha_mue) {
        super(nombre, apellidos, dni);
        this.fecha_nac = fecha_nac;
        this.fecha_mue = fecha_mue;
    }

    public long getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(long fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public long getFecha_mue() {
        return fecha_mue;
    }

    public void setFecha_mue(long fecha_mue) {
        this.fecha_mue = fecha_mue;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import repository.MesaRepository;

/**
 *
 * @author jeanfernandes
 */
@Entity
public class Mesa extends MesaRepository implements Serializable {
    
    @Id
    private Integer codigo;
    private Integer nrMesa;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getNrMesa() {
        return nrMesa;
    }

    public void setNrMesa(Integer nrMesa) {
        this.nrMesa = nrMesa;
    }
    
}

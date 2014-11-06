/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.genesis.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author orlando
 */
@Entity
@Table(name = "DONACIONDETA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Donaciondeta.findAll", query = "SELECT d FROM Donaciondeta d"),
    @NamedQuery(name = "Donaciondeta.findByCodcorrdndeta", query = "SELECT d FROM Donaciondeta d WHERE d.donaciondetaPK.codcorrdndeta = :codcorrdndeta"),
    @NamedQuery(name = "Donaciondeta.findByCodprdto", query = "SELECT d FROM Donaciondeta d WHERE d.donaciondetaPK.codprdto = :codprdto"),
    @NamedQuery(name = "Donaciondeta.findByCantidad", query = "SELECT d FROM Donaciondeta d WHERE d.cantidad = :cantidad"),
    @NamedQuery(name = "Donaciondeta.findByVprpdad1", query = "SELECT d FROM Donaciondeta d WHERE d.vprpdad1 = :vprpdad1"),
    @NamedQuery(name = "Donaciondeta.findByVprpdad2", query = "SELECT d FROM Donaciondeta d WHERE d.vprpdad2 = :vprpdad2")})
public class Donaciondeta implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DonaciondetaPK donaciondetaPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidad")
    private double cantidad;
    @Size(max = 150)
    @Column(name = "vprpdad1")
    private String vprpdad1;
    @Size(max = 150)
    @Column(name = "vprpdad2")
    private String vprpdad2;
    @JoinColumn(name = "codlote", referencedColumnName = "codlote")
    @ManyToOne(optional = false)
    private Lote codlote;
    @JoinColumn(name = "codprdto", referencedColumnName = "codprdto", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Producto producto;
    @JoinColumn(name = "codprpdad", referencedColumnName = "codprpdad")
    @ManyToOne(optional = false)
    private Propiedad codprpdad;
    @JoinColumn(name = "codstdprdto", referencedColumnName = "codstdprdto")
    @ManyToOne(optional = false)
    private Estdprdto codstdprdto;
    @JoinColumn(name = "codcorredncn", referencedColumnName = "codcorredncn")
    @ManyToOne(optional = false)
    private Donacion codcorredncn;

    public Donaciondeta() {
    }

    public Donaciondeta(DonaciondetaPK donaciondetaPK) {
        this.donaciondetaPK = donaciondetaPK;
    }

    public Donaciondeta(DonaciondetaPK donaciondetaPK, double cantidad) {
        this.donaciondetaPK = donaciondetaPK;
        this.cantidad = cantidad;
    }

    public Donaciondeta(int codcorrdndeta, String codprdto) {
        this.donaciondetaPK = new DonaciondetaPK(codcorrdndeta, codprdto);
    }

    public DonaciondetaPK getDonaciondetaPK() {
        return donaciondetaPK;
    }

    public void setDonaciondetaPK(DonaciondetaPK donaciondetaPK) {
        this.donaciondetaPK = donaciondetaPK;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getVprpdad1() {
        return vprpdad1;
    }

    public void setVprpdad1(String vprpdad1) {
        this.vprpdad1 = vprpdad1;
    }

    public String getVprpdad2() {
        return vprpdad2;
    }

    public void setVprpdad2(String vprpdad2) {
        this.vprpdad2 = vprpdad2;
    }

    public Lote getCodlote() {
        return codlote;
    }

    public void setCodlote(Lote codlote) {
        this.codlote = codlote;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Propiedad getCodprpdad() {
        return codprpdad;
    }

    public void setCodprpdad(Propiedad codprpdad) {
        this.codprpdad = codprpdad;
    }

    public Estdprdto getCodstdprdto() {
        return codstdprdto;
    }

    public void setCodstdprdto(Estdprdto codstdprdto) {
        this.codstdprdto = codstdprdto;
    }

    public Donacion getCodcorredncn() {
        return codcorredncn;
    }

    public void setCodcorredncn(Donacion codcorredncn) {
        this.codcorredncn = codcorredncn;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (donaciondetaPK != null ? donaciondetaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Donaciondeta)) {
            return false;
        }
        Donaciondeta other = (Donaciondeta) object;
        if ((this.donaciondetaPK == null && other.donaciondetaPK != null) || (this.donaciondetaPK != null && !this.donaciondetaPK.equals(other.donaciondetaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.genesis.entidades.Donaciondeta[ donaciondetaPK=" + donaciondetaPK + " ]";
    }
    
}

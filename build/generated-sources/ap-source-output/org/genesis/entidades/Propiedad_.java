package org.genesis.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.genesis.entidades.Donaciondeta;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-11-04T20:31:33")
@StaticMetamodel(Propiedad.class)
public class Propiedad_ { 

    public static volatile SingularAttribute<Propiedad, String> nombre;
    public static volatile ListAttribute<Propiedad, Donaciondeta> donaciondetaList;
    public static volatile SingularAttribute<Propiedad, String> descripcion;
    public static volatile SingularAttribute<Propiedad, String> codprpdad;

}
package sys.model;
// Generated 07-ago-2020 22:38:20 by Hibernate Tools 4.3.1



/**
 * Rol generated by hbm2java
 */
public class Rol  implements java.io.Serializable {


     private Integer id;
     private String rol;

    public Rol() {
    }

    public Rol(String rol) {
       this.rol = rol;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getRol() {
        return this.rol;
    }
    
    public void setRol(String rol) {
        this.rol = rol;
    }




}



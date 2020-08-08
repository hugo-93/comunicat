package sys.model;
// Generated 07-ago-2020 22:38:20 by Hibernate Tools 4.3.1



/**
 * Documento generated by hbm2java
 */
public class Documento  implements java.io.Serializable {


     private Integer id;
     private String ruta;
     private String nombre;
     private String extension;
     private String mime;

    public Documento() {
    }

    public Documento(String ruta, String nombre, String extension, String mime) {
       this.ruta = ruta;
       this.nombre = nombre;
       this.extension = extension;
       this.mime = mime;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getRuta() {
        return this.ruta;
    }
    
    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getExtension() {
        return this.extension;
    }
    
    public void setExtension(String extension) {
        this.extension = extension;
    }
    public String getMime() {
        return this.mime;
    }
    
    public void setMime(String mime) {
        this.mime = mime;
    }




}


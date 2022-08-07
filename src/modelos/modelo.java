package modelos;

import java.util.ArrayList;

public class modelo {
     
    // Usuarios
    
    int tipo_usuario;
    String usuario, pregunta, respuesta, clave, nombre, apellido, cedula;

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(int tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }
    
    // Exámenes
    
    int id_examen, estado;
    byte[] archivo_subido;
    String fecha;
    boolean sangre, orina;

    public boolean isSangre() {
        return sangre;
    }

    public void setSangre(boolean sangre) {
        this.sangre = sangre;
    }

    public boolean isOrina() {
        return orina;
    }

    public void setOrina(boolean orina) {
        this.orina = orina;
    }

    public int getId_examen() {
        return id_examen;
    }

    public void setId_examen(int id_examen) {
        this.id_examen = id_examen;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public byte[] getArchivo_subido() {
        return archivo_subido;
    }

    public void setArchivo_subido(byte[] archivo_subido) {
        this.archivo_subido = archivo_subido;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    //Examenes de Sangre
    
    float s_hematies, s_hemoglobina, s_hematocritos, s_plaquetas, s_leucocitos, s_segmentados, s_linfocitos;

    public float getS_hematies() {
        return s_hematies;
    }

    public void setS_hematies(float s_hematies) {
        this.s_hematies = s_hematies;
    }

    public float getS_hemoglobina() {
        return s_hemoglobina;
    }

    public void setS_hemoglobina(float s_hemoglobina) {
        this.s_hemoglobina = s_hemoglobina;
    }

    public float getS_hematocritos() {
        return s_hematocritos;
    }

    public void setS_hematocritos(float s_hematocritos) {
        this.s_hematocritos = s_hematocritos;
    }

    public float getS_plaquetas() {
        return s_plaquetas;
    }

    public void setS_plaquetas(float s_plaquetas) {
        this.s_plaquetas = s_plaquetas;
    }

    public float getS_leucocitos() {
        return s_leucocitos;
    }

    public void setS_leucocitos(float s_leucocitos) {
        this.s_leucocitos = s_leucocitos;
    }

    public float getS_segmentados() {
        return s_segmentados;
    }

    public void setS_segmentados(float s_segmentados) {
        this.s_segmentados = s_segmentados;
    }

    public float getS_linfocitos() {
        return s_linfocitos;
    }

    public void setS_linfocitos(float s_linfocitos) {
        this.s_linfocitos = s_linfocitos;
    }
    
    //Examenes de Orina
    
    String o_aspecto, o_color, o_reaccion, o_piocitos, o_bacterias, o_proteinas, o_glucosa, o_hemoglobina, o_cetonico, o_pbiliares,
            o_urobilinogelen, o_bilirrubina, o_nitritos;
    float o_densidad, o_leucocitos, o_hematies, o_eplano;

    public String getO_aspecto() {
        return o_aspecto;
    }

    public void setO_aspecto(String o_aspecto) {
        this.o_aspecto = o_aspecto;
    }

    public String getO_color() {
        return o_color;
    }

    public void setO_color(String o_color) {
        this.o_color = o_color;
    }

    public String getO_reaccion() {
        return o_reaccion;
    }

    public void setO_reaccion(String o_reaccion) {
        this.o_reaccion = o_reaccion;
    }

    public String getO_piocitos() {
        return o_piocitos;
    }

    public void setO_piocitos(String o_piocitos) {
        this.o_piocitos = o_piocitos;
    }

    public String getO_bacterias() {
        return o_bacterias;
    }

    public void setO_bacterias(String o_bacterias) {
        this.o_bacterias = o_bacterias;
    }

    public String getO_proteinas() {
        return o_proteinas;
    }

    public void setO_proteinas(String o_proteinas) {
        this.o_proteinas = o_proteinas;
    }

    public String getO_glucosa() {
        return o_glucosa;
    }

    public void setO_glucosa(String o_glucosa) {
        this.o_glucosa = o_glucosa;
    }

    public String getO_hemoglobina() {
        return o_hemoglobina;
    }

    public void setO_hemoglobina(String o_hemoglobina) {
        this.o_hemoglobina = o_hemoglobina;
    }

    public String getO_cetonico() {
        return o_cetonico;
    }

    public void setO_cetonico(String o_cetonico) {
        this.o_cetonico = o_cetonico;
    }

    public String getO_pbiliares() {
        return o_pbiliares;
    }

    public void setO_pbiliares(String o_pbiliares) {
        this.o_pbiliares = o_pbiliares;
    }

    public String getO_urobilinogelen() {
        return o_urobilinogelen;
    }

    public void setO_urobilinogelen(String o_urobilinogelen) {
        this.o_urobilinogelen = o_urobilinogelen;
    }

    public String getO_bilirrubina() {
        return o_bilirrubina;
    }

    public void setO_bilirrubina(String o_bilirrubina) {
        this.o_bilirrubina = o_bilirrubina;
    }

    public String getO_nitritos() {
        return o_nitritos;
    }

    public void setO_nitritos(String o_nitritos) {
        this.o_nitritos = o_nitritos;
    }

    public float getO_densidad() {
        return o_densidad;
    }

    public void setO_densidad(float o_densidad) {
        this.o_densidad = o_densidad;
    }

    public float getO_leucocitos() {
        return o_leucocitos;
    }

    public void setO_leucocitos(float o_leucocitos) {
        this.o_leucocitos = o_leucocitos;
    }

    public float getO_hematies() {
        return o_hematies;
    }

    public void setO_hematies(float o_hematies) {
        this.o_hematies = o_hematies;
    }

    public float getO_eplano() {
        return o_eplano;
    }

    public void setO_eplano(float o_eplano) {
        this.o_eplano = o_eplano;
    }
    
    //Diagnosticos
    
    ArrayList<String> d_valores, d_seleccionados;
    String d_nombre, d_descripcion;
    int idDiagnostico;

    public int getIdDiagnostico() {
        return idDiagnostico;
    }

    public void setIdDiagnostico(int idDiagnostico) {
        this.idDiagnostico = idDiagnostico;
    }

    public String getD_nombre() {
        return d_nombre;
    }

    public void setD_nombre(String d_nombre) {
        this.d_nombre = d_nombre;
    }

    public String getD_descripcion() {
        return d_descripcion;
    }

    public void setD_descripcion(String d_descripcion) {
        this.d_descripcion = d_descripcion;
    }

    public ArrayList<String> getD_valores() {
        return d_valores;
    }

    public void setD_valores(ArrayList<String> d_valores) {
        this.d_valores = d_valores;
    }

    public ArrayList<String> getD_seleccionados() {
        
        return d_seleccionados;
    }

    public void setD_seleccionados(ArrayList<String> d_seleccionados) {
        
        this.d_seleccionados = d_seleccionados;
    }
    
}

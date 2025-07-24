import java.util.Objects;

public class PersonaOverride {

   private String nombre;

   private String apellidos;

   private String dni;

   public PersonaOverride(String dni) {
      this.dni = dni;
      this.nombre = "";
      this.apellidos = "";
   }

   public PersonaOverride(String nombre, String apellidos, String dni) {
      this.nombre = nombre;
      this.apellidos = apellidos;
      this.dni = dni;
   }

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public String getApellidos() {
      return apellidos;
   }

   public void setApellidos(String apellidos) {
      this.apellidos = apellidos;
   }

   public String getDni() {
      return dni;
   }

   public void setDni(String dni) {
      this.dni = dni;
   }

   @Override
   public boolean equals(Object o) {
      if(!(o instanceof PersonaOverride)) return false;

      PersonaOverride that = (PersonaOverride) o;

      return dni.equals(that.dni) && nombre.equals(that.nombre) && apellidos.equals(that.apellidos) ;
   }

   @Override
   public int hashCode() {
      return Objects.hash(nombre, apellidos, dni);
   }
}

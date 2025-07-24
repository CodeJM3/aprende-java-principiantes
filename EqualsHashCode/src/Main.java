import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      // equals en cadenas
      System.out.println("***STRING***");
      String cad1 = "Java";
      String cad2 = "Java"; // Esta variable tiene la misma referencia que cad2
      String cad3 = new String("Java"); // Esto crea un nuevo objeto String con distinta referencia
      System.out.println(cad1==cad2); // Comparamos referencias
      System.out.println(cad1);
      System.out.println(cad3);
      System.out.println(cad1==cad3); // Comparamos referencias
      System.out.println(cad2==cad3); // Comparamos referencias
      // Los objetos se comparan SIEMPRE con equals
      System.out.println(cad1.equals(cad3));
      System.out.println(cad2.equals(cad3));
      System.out.println(cad2.equals("java"));

      // clase Persona
      System.out.println("***PERSONA***");
      Persona p1 = new Persona("34765423L");
      Persona p2 = new Persona("43764523M");
      Persona p3 = new Persona("23765434B");
      Persona p4 = new Persona("34765423L");
      System.out.println(p1.equals(p2));
      System.out.println(p1.equals(p3));
      System.out.println(p2.equals(p3));
      System.out.println(p1.equals(p1));
      System.out.println(p1.equals(p4));

      // objetos de Persona con equals por defecto en listas
      List<Persona> listaPersona = new ArrayList<>();
      listaPersona.add(p1);
      listaPersona.add(p2);
      listaPersona.add(p3);
      System.out.println(listaPersona);
      System.out.println(listaPersona.contains(p1));
      System.out.println(listaPersona.contains(p4));

      // objetos de Persona con equals sobreescrito en listas
      System.out.println("***PERSONA OVERRIDE***");
      PersonaOverride p1o = new PersonaOverride("34765423L");
      PersonaOverride p2o = new PersonaOverride("43764523M");
      PersonaOverride p3o = new PersonaOverride("23765434B");
      PersonaOverride p4o = new PersonaOverride("34765423L");
      List<PersonaOverride> listaPersonaOverride = new ArrayList<>();
      listaPersonaOverride.add(p1o);
      listaPersonaOverride.add(p2o);
      listaPersonaOverride.add(p3o);
      System.out.println(listaPersonaOverride);
      System.out.println(listaPersonaOverride.contains(p1o));
      System.out.println(listaPersonaOverride.contains(p4o));
      System.out.println(p1o.equals(null));
      System.out.println(p1o.equals("34765423L"));
      System.out.println(p1o.equals(new Scanner(System.in)));
      System.out.println(p1o.equals(p1o));
      System.out.println(p1o.equals(p2o));
      System.out.println(p1o.equals(p4o));

      // clase Persona con atributos adicionales y equals
      System.out.println("***PERSONA OVERRIDE CON ATRIBUTOS ADICIONALES***");
      PersonaOverride persona1 = new PersonaOverride("Carlos","Velez","78956421Y");
      PersonaOverride persona2 = new PersonaOverride("Maria","Rodriguez","78956421Y");
      System.out.println(persona1.equals(persona2));
      List<PersonaOverride> listaFinal = new ArrayList<>();
      listaFinal.add(persona1);
      System.out.println(listaFinal.contains(persona2));

      // hashCode por defecto en clase Persona (sin override)
      System.out.println("***HASHCODE EN PERSONA SIN OVERRIDE***");
      Persona p5 = new Persona("65765423L");
      Persona p6 = new Persona("34764523Z");
      Persona p7 = new Persona("02765434M");
      Persona p8 = new Persona("65765423L");
      System.out.println(p5.hashCode());
      System.out.println(p6.hashCode());
      System.out.println(p7.hashCode());
      System.out.println(p8.hashCode());
      System.out.println(p8.hashCode());
      System.out.println(p8.hashCode());
      System.out.println(p8.hashCode());

      // hashCode por defecto en clase Persona (sin override)
      System.out.println("***HASHCODE EN PERSONAOVERRIDE***");
      PersonaOverride p5o = new PersonaOverride("Sara","Diaz","65765423L");
      PersonaOverride p6o = new PersonaOverride("Pepe", "Gomez","34764523Z");
      PersonaOverride p7o = new PersonaOverride("Sandra", "Perez","02765434M");
      PersonaOverride p8o = new PersonaOverride("Lucas", "Vazquez","02765434M");
      PersonaOverride p9o = new PersonaOverride("Lucas", "Vazquez","02765434M");

      System.out.println(p5o.hashCode());
      System.out.println(p6o.hashCode());
      System.out.println(p7o.hashCode());
      System.out.println(p7o.hashCode());
      System.out.println(p7o.hashCode());
      System.out.println(p8o.hashCode());
      System.out.println(p9o.hashCode());
      System.out.println(p8o.equals(p9o));
   }
}
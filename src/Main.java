public class Main {
    public static void main(String[] args) {

      BasicStructure audi= new BasicStructure();
      audi.color="black";
      audi.model="A3";
      audi.power="5000cc";


      Engine x= new Engine();
      x.cylinders="8";
      x.size="123dfd";
      x.weight="6543k";


      color col= new color();
      col.colorLights="True";
      col.colorTyre="false";
      col.colorWindows="true";

      lights neon= new lights();
      neon.color="red";
      neon.size="15cm";
      neon.intensity="132434lumin";

    }
}
public class Pokemon {              //A class describes the structure by acting as a blueprint or template from which objects are created.
   String name;                     //Class Property
   String type;                     //Class Property
   int level;                       //Class Property
   String abilities;                //Class Property

   void attack() {                  //Class Method describes Behavior
       System.out.println(name + " is attacking with " + abilities + "!");
   }
   void evolve() {
       System.out.println(name + " is evolving!" + " Congratulations, your " + name + " has evolved to level " + (level + 1) + "!");
   }
}
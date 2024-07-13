public class Objects {          //Object is an individual instance of a class, embodying the defined structure with specific values.
    public static void main(String[] args) {

        Pokemon p1 = new Pokemon();
        p1.name = "Pikachu";    //Object holds the Specific Property Value.
        p1.type = "Electric";
        p1.level = 5;
        p1.abilities = "Thunderbolt";
        p1.attack();            //Objects also display Behaviors set by the Class with their specific values such as the objects 'Level' and 'Ability'
        p1.evolve();

        Pokemon p2 = new Pokemon();
        p2.name = "Magikarp";
        p2.type = "Water";
        p2.level = 1;
        p2.abilities = "Splash";
        p2.attack();
        p2.evolve();

    }
}

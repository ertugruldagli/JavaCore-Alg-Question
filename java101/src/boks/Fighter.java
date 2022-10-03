package boks;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;

    Fighter(String name, int damage, int health, int weight ){
        this.name=name;
        this.damage=damage;
        this.health=health;
        this.weight=weight;

    }

    int hit(Fighter foe){
        System.out.println(this.name + " => " + foe.name + " " + this.damage + " hasar vurdu " );

        if(foe.health-this.damage<0){
            System.out.println("oyuncu el fatiha");
            return 0;
        }
        return foe.health-this.damage;
    }


}


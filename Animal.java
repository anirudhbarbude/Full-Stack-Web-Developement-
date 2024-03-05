class Animal {
    public void animalSound() {
        System.out.println("Your animal");
    }
}

class Cat extends Animal {
    public void animalSound() {
        System.out.println("Mew");
    }
}

class Dog extends Animal {				
    public void animalSound() {
        System.out.println("Bark");
    }
}

class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Cat myCat = new Cat();
        Dog myDog = new Dog();
        
        myAnimal.animalSound();
        myCat.animalSound();
        myDog.animalSound();
    }
}

class Bicycle extends Vehicle {

        Bicycle(String name) {
        super(name);
            
    }

        @Override
    void move(){
        System.out.println("Bicycle is pedaled manually");
    }
    

}

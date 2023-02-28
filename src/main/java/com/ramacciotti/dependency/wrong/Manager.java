package com.ramacciotti.dependency.wrong;

public class Manager {

    // This class was created considering only Developer
    private Developer developer;

    // Assuming that later the class Architect was created...
    // We would need to change this class to acomodate the new class Architect!

    // We would have to change this constructor
    public Manager(Developer developer) {
        this.developer = developer;
    }

    // We would have to change whis method
    public void manage(){
        developer.work();
    }

}

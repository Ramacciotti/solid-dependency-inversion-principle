package com.ramacciotti.dependency.right;

// High-level Class: Class that executes an action with a tool.
// This class shouldnt know how the tools (Developer, Architect) work.
public class Manager {

    // This class was created considering multiple employees
    // All employees depend now of this interface
    private EmployeeInterface employeeInterface;

    // In future, if other employee would be added, it wouldnt mess with this class

    public Manager(EmployeeInterface employeeInterface) {
        this.employeeInterface = employeeInterface;
    }

    public void manage() {
        employeeInterface.work();
    }

}

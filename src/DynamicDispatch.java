//package com.company;
 class Phone{
    public void showTime(){
        System.out.println("Time is 8 am");
    }
    public void on(){
        System.out.println("Turning on Phone...");
    }
}

class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing music...");
    }
    public void on(){
      //  super.on();
        System.out.println("Turning on SmartPhone...");
    }
}
public class DynamicDispatch {
    public static void main(String[] args) {
        // Phone obj = new Phone(); // Allowed
        // SmartPhone smobj = new SmartPhone(); // Allowed
        // obj.name();

       // Phone obj = new Phone(); // Yes it is allowed
        // SmartPhone obj2 = new Phone(); // Not allowed
       //obj.showTime();
        //obj.on();
        Phone ph=new SmartPhone();
       //  ph.on();
        //ph.music();
        ph.showTime();
        ph.on();
        // obj.music(); Not Allowed

    }
}

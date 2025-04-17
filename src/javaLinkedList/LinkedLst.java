package javaLinkedList;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.awt.*;
import java.util.LinkedList;

public class LinkedLst {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        cars.addFirst("Subaru");
        cars.addLast("Mambaru");
        System.out.println(cars);
    }
}

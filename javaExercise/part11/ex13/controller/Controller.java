//: innerclasses/controller/Controller.java
// The reusable framework for control systems.
package part11.ex13.controller;
import java.util.*;

public class Controller {
  // A class from java.util to hold Event objects:
  private List<Event> eventList = new LinkedList<>();
  public void addEvent(Event c) { eventList.add(c); }
  public void run() {
    while(eventList.size() > 0) {
        // Make a copy so you're not modifying the list
        // while you're selecting the elements in it:
        Iterator<Event> iterator = eventList.iterator();
        while (iterator.hasNext()) {
            Event e = iterator.next();
            if (e.ready()) {
                System.out.println(e);
                e.action();
                eventList.remove(e);
            }
        }
    }
  }
} ///:~

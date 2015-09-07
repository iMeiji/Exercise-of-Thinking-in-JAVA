package part10.ex25;//: innerclasses/GreenhouseController.java
// Configure and execute the greenhouse system.
// {Args: 5000}


import part10.ex25.controller.Event;

public class GreenhouseController {
    public static void main(String[] args) {
        SuperGreenhouseControls gc = new SuperGreenhouseControls();
        // Instead of hard-wiring, you could parse
        // configuration information from a text file here:
        gc.addEvent(gc.new Bell(900));
        Event[] eventList = {
                gc.new ThermostatNight(0),
                gc.new LightOn(200),
                gc.new LightOff(400),
                gc.new WaterOn(600),
                gc.new WaterOff(800),
                gc.new ThermostatDay(1400),
                gc.new OpenFan(100),
                gc.new CloseFan(300),
                gc.new WaterMistOn(1000),
                gc.new WaterMistOff(1290)
        };
        gc.addEvent(gc.new Restart(2000, eventList));
        if (args.length == 1)
            gc.addEvent(
                    new GreenhouseControls.Terminate(
                            new Integer(args[0])));
        gc.run();
    }
} /* Output:
Bing!
Thermostat on night setting
Light is on
Light is off
Greenhouse water is on
Greenhouse water is off
Thermostat on day setting
Restarting system
Terminating
*///:~

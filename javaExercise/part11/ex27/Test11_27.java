package part11.ex27;

import java.util.LinkedList;
import java.util.Queue;

import static Utils.Print.*;

/**
 * Created by yeming on 2015/9/16.
 */
class Command {
    String name;

    public Command(String name) {
        this.name = name;
    }


    public String operation() {
        return name;
    }
}

class CommandQueue {

    Queue<Command> commandQueue = new LinkedList<>();

    public Queue<Command> getCommandQueue(Command command) {
        commandQueue.add(command);
        return commandQueue;
    }

    public Queue<Command> getCommandQueue() {
        return commandQueue;
    }
}

class PollUtil {

    public static void pollQueue(CommandQueue commandQueue) {
        print(commandQueue.getCommandQueue().poll().operation());
    }

}

public class Test11_27 {

    public static void main(String[] args) {
        Command command1 = new Command("start");
        Command command2 = new Command("stop");
        CommandQueue commandQueue = new CommandQueue();
        commandQueue.getCommandQueue(command1);
        commandQueue.getCommandQueue(command2);
        PollUtil.pollQueue(commandQueue);
        PollUtil.pollQueue(commandQueue);
    }

}

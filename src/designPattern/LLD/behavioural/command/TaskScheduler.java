package designPattern.LLD.behavioural.command;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/**
 * <Class Name>: TaskScheduler
 * <p>
 * Description: this is invoker class
 * <p>
 * Created by: neeraj
 * Date: 15/11/24
 */
public class TaskScheduler {

    private List<TaskCommand> taskCommands = new ArrayList<TaskCommand>();

    public void scheduleTask(TaskCommand taskCommand) {
        taskCommands.add(taskCommand);
    }

    public void executeAllTasks(long milisec){
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if(taskCommands.isEmpty()){
                    System.out.println("No more tasks in the queue. Stopping scheduler.");
                    timer.cancel();
                }else {
                    TaskCommand taskCommand = taskCommands.remove(0);
                    taskCommand.execute();
                }
            }
        },0,milisec);

    }
}

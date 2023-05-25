package task_2.status;


import task_2.Quest;

public class Stand implements Quest {

    public void myQuest() {
        System.out.println("Knight стоїть \t" + Stand.class.getName());
    }
}

package task_2.quest;


import task_2.Quest;

public class Stand implements Quest {

    public void myQuest() {
        System.out.println("Knight стоїть myQuest() \t" + Stand.class.getName());
    }
}

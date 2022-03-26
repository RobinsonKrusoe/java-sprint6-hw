package ru.yandex.practicum.TaskManager.Tasks;

import ru.yandex.practicum.TaskManager.Tasks.BaseTask.Task;
import ru.yandex.practicum.TaskManager.Tasks.BaseTask.TaskType;

import java.time.Duration;
import java.time.LocalDateTime;

//Класс подзадачи
public class SubTask extends Task {
    Epic epic;    //Ссылка на родительский Эпик

    //Конструктор
    public SubTask(Integer num, String name, String details, Epic epic) {
        super(num, name, details, TaskType.SUBTASK);

        this.epic = epic;
    }

    //Конструктор
    public SubTask(String name, String details, Epic epic) {
        super(name, details, TaskType.SUBTASK);

        this.epic = epic;
    }

    //Конструктор
    public SubTask(Integer num, String name, String details, Epic epic, LocalDateTime startTime, Duration duration) {
        super(num, name, details, TaskType.SUBTASK, startTime, duration);

        this.epic = epic;
    }

    //Конструктор
    public SubTask(String name, String details, Epic epic, LocalDateTime startTime, Duration duration) {
        super(name, details, TaskType.SUBTASK, startTime, duration);

        this.epic = epic;
    }

    //Получение Эпика
    public Epic getEpic() {
        return epic;
    }

    //Задание Эпика
    public void setEpic(Epic epic) {
        this.epic = epic;
    }

    //Отображение задачи
    @Override
    public String toString() {
        return getNum() + "," +
               getType() + "," +
               getName() + "," +
               getStatus() + "," +
               getDetails() + "," +
               getEpic().getNum() + "," +
               getStartTime() + "," +
               (getDuration() == Duration.ZERO ? "" : getDuration());
    }
}

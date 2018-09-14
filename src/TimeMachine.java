public class TimeMachine {
    void backInTime(Person person) {
        person.age = person.age - 1;
    }

    void timeTravel(Person person, int time) {
        person.age = person.age + time;
    }
}
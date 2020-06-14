package JC1.Homework.Homework6.Task2.Degree;

/**
 * NOTE! Не могу бы ты мне объяснить причину, по которой сделал этот класс
 * абстрактным.
 */
// делаю класс не абстрактным (все-таки в нем есть поля и реализация методов)
// закрываю конструктор модификатором protected
public class Degree {

    protected double degreeValue;
    protected String name;

    protected Degree(double degreeValue) {
        this.degreeValue = degreeValue;
    }

    public String getName() {
        return this.name;
    }

    public double getDegreeValue() {
        return this.degreeValue;
    }

}

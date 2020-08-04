package myClass;

public class HomeWork {

        private static WorkMass workMass;
    public static   void main(String[] args) {

        try {

             workMass = new WorkMass(new String[4][5]);

        }catch (MyArrayDataException e){
            System.out.println("Массив должен быть длинной 4х4");
        }
        // Если массив заполняется не правильно выпадут исключения
        try {

            workMass.arrayСreation();

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Нулевое значение масива");
        }catch(NullPointerException e){
            System.out.println("Неверное использование пустой ссылки");
        }

        // Если массив заполняется не правильно выпадут исключения и не получится првоерить элементы.
        try {

        workMass.stringToNumber();

        }catch (ArrayIndexOutOfBoundsException e){
        System.out.println("Нулевое значение масива");
        }catch(NullPointerException e){
            System.out.println("Неверное использование пустой ссылки");
        }
        System.out.println("\nКонец Программы");

    }
}

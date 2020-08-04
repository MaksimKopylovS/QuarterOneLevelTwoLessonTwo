package myClass;

public class WorkMass {
    private int number = 16;
    private int sum = 0;

    private String massString[][] = new String[4][4];

    //Создание конструктора и проверка его на длинну если длинна не совподает выподет исключение MyArrayDataException
    public WorkMass(String massString[][]) throws MyArrayDataException {
        if(this.massString[0].length >= massString[0].length && this.massString.length >= massString.length ){
                this.massString = massString;
        }else{
            throw new MyArrayDataException("Массив должен быть длинной 4х4");
        }
    }
    // Заполнение массива
    public void arrayСreation() throws MyNullPointerException {
        System.out.println("Вывод массива ");
            for (int i = 0; i < massString.length; i++) {
                for (int j = 0; j < massString.length; j++) {
                    massString[i][j] = String.valueOf(number);
                    number--;
                }
            }
            massString[2][0] = "   3  ";
            massString[1][1] = "w";
            massString[3][0] = "2.4";
            massString[2][1] = "  ";
            massString[0][3] = " Слово ";

            for (int i = 0; i < massString.length; i++) {
                for (int j = 0; j < massString.length; j++) {
                    System.out.print(massString[i][j] + " ");
                }
            }

        }

    // Если не поулчится преобразовать строковые значения в числовые выподет исключение и програма продолжится
    public void stringToNumber(){
        System.out.println("\nПеревод массива на числовые значения с подследующим выводом суммы");
        try {
                    for (int i = 0; i < massString.length; i++) {
                        for (int j = 0; j < massString.length; j++) {
                            try {
                                //Преобразование строки в число, с отбросом пробелов
                                number = Integer.parseInt(massString[i][j].trim());
                                //Получение суммы чисел
                                sum = sum+number;
                                System.out.print(number + " ");

                            } catch (NumberFormatException e) {

                                System.out.print("\n(значение mass["+i+"]["+j+"] = '" + massString[i][j] + "' не верно) \n");

                            }
                        }
                    }
                System.out.println("\nСумма элементов массива = " + sum);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Выход за границы массива");
            }

    }
}

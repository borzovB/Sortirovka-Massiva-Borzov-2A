package massiv;
class ArrayMass {
    /*Объявление класса для сортировки и вывода массива.*/
    private double a[];
    /*Объявление массива*/
    private int el;
    /*Объявление числа элементов массива.*/
    public ArrayMass(int max){    
        el=max;
        /*Ввод в класс числа элементов массива.*/
    }
    public void viv() {
        /*Метод для работы с массивом.*/
        int i;
        double [] a = new double[el];
        /*Выделение памяти под массив.*/
        double d;
        System.out.println("Massiv nomer 1:");
        for(i=0; i<el ;i++){
            a[i] = Math.random()*100;
            /*Генерируем массив из случайных чисел.*/
            System.out.println(a[i]);
            /*Вывод массива на экран.*/
        }
        for (int out = el - 1; out >= 1; out--){
            /*Для сортировки массива мы будем использовать пузырьковый метод сортировки.*/
            for (int in = 0; in < out; in++){
                /*Находим наибольший элемент массива и выводим его в конец массива, после этот наибольший элемент фиксируется
                и программа находит следующий наибольший элемент.*/
                if(a[in] > a[in + 1]) {
                    d = a[in];      
                    a[in] = a[in+1];      
                    a[in+1] = d;
                }                        
            }
        }
        System.out.println("Massiv nomer 2:");
        for(i=0; i<el ;i++){
            System.out.println(a[i]);
            /*Вывод на экран обработанного массива.*/
        }
    }
    public void times() throws InterruptedException {
        /*Метод для подсчета времени выполнения программы.*/
       long start = System.nanoTime();
       /*Начальное значение времени.*/
        Thread.sleep(1000);
        /*Измерение времени идёт в наносекундах.*/
        long finish = System.nanoTime();
        /*Конечный счетчик времени.*/
        float elapsed = finish - start;
        /*Разница между начальным и конечным показателями времени.*/
        System.out.println( + elapsed/1000000000);
        /*Вывод на экран времени в секундах.*/
    }
}
public class Massiv {
    
    public static void main(String[] args) throws InterruptedException {
        ArrayMass array = new ArrayMass(100000);
        /*Выделение памяти под класс и ввод числа элементов массива.*/
        array.viv();
        /*Вызов метода работы с массивом.*/
        System.out.println("Times: ");
        array.times();
        /*Вызов метода для вывода на экран времени выполнения программы.*/
    }
    
}
/*При вводе 5 элементов время работы программы будет 1.0028223 секунд.*/
/*При вводе 100000 элементов время работы программы будет 1.013444 секунд.*/
/*Программа может работать с 100000000 элементами больше программа выдаёт ошибку.*/

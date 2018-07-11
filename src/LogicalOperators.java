//        1. Даны 4 числа типа int. Сравнить их и вывести наименьшее на консоль.
//        2. Вывести на консоль количество максимальных чисел среди этих четырех.
//        3. Даны 5 чисел (тип int). Вывести вначале наименьшее, а затем наибольшее из данных чисел.
//        4. Даны имена 2х человек (тип String). Если имена равны, то вывести сообщение о том, что люди являются тезками.
//        5. Дано число месяца (тип int). Необходимо определить время года (зима, весна, лето, осень) и вывести на консоль.

public class LogicalOperators {
    int a = 1, b = 2, c = 3, d = 4, i = 5, min, qtMax, max;
    String n1 = "Вася";
    String n2 = "Вася";
    int month = 11;
    String nameMonth;

    public void intABCD (){
        System.out.println("Среди чисел: " + a + ", " + b + ", " + c + ", " + d + ".");
    }

    public void logOperatorsMin (){
        if(a<b && a<c && a<d){
            min=a;
        }else if(b<a && b<c && b<d){
            min=b;
        }else if(c<a && c<b && c<d){
            min = c;
        }else if(d<a && d<b && d<c){
            min = d;
        }
        System.out.println("Минимальное число: " + min);
    }
    public void logOperatorsMax(){
        if(a>b && a>c && a>d){
            max = a;
            qtMax = 1;
        }else if(b>a && b>c && b>d){
            max = b;
            qtMax = 1;
        }else if(c>a && c>b && c>d){
            max = c;
            qtMax =1;
        }else if(d>a && d>b && d>c){
            max = c;
            qtMax = 1;
        }else if(a==b && a>c && a>d ){
            qtMax = 2;
            max = a;
        }else if(a>b && a==c && a>d) {
            qtMax = 2;
            max = a;
        }else if(a>b && a>c && a==d){
            qtMax = 2;
            max = a;
        }else if(b==c && b>a && a>d){
            qtMax = 2;
            max =b;
        }else if(b==d && b>a && b>c){
            qtMax = 2;
            max = b;
        }else if(c==d && c>a && c>b){
            qtMax = 2;
            max = c;
        }else if(a==b && a==c && a>d){
            qtMax = 3;
            max = a;
        }else if(a==b && a==d && a>c){
            qtMax = 3;
            max = a;
        }else if(a==c && a==d && a>b){
            qtMax = 3;
            max = a;
        }else if(b==c && b==b && b>a){
            qtMax = 3;
            max = b;
        }else if(a==b && a==c && a==d){
            qtMax = 4;
            max = a;
        }

        System.out.println("Кольчество максимальных чисел: " + qtMax);
        System.out.println("максимальное число: " + max);
        System.out.println();
    }
    public void intABCDI (){
        System.out.println("Среди чисел: " + a + ", " + b + ", " + c + ", " + d + ", " + i + ".");
    }
    public void logOperatorsMinMax (){

        if (a>b && a>c && a>d && a>i){
            max = a;
        }else if(b>a && b>c && b>d && b>i){
            max = b;
        }else if(c>a && c>b && c>d && c>i){
            max = c;
        }else if(d>a && d>b && d>c && d>i){
            max = d;
        }else if(i>a && i>b && i>c && i>d){
            max = i;
        }
        if (a<b && a<c && a<d && a<i){
            min = a;
        }else if(b<a && b<c && b<d && b<i){
            min = b;
        }else if(c<a && c<b && c<d && c<i){
            min = c;
        }else if(d<a && d<b && d<c && d<i){
            min = d;
        }else if(i<a && i<b && i<c && i<d){
            min = i;
        }
        System.out.println("Минимальное число: " + min);
        System.out.println("максимальное число: " + max);
        System.out.println();
    }
    public void logOperatorsName(){
        if (n1 == n2){
            System.out.println(n1 + " и " + n2 + " тезки");
        }else {
            System.out.println(n1 + " и " + n2 + " не тезки");
        }
        System.out.println();
    }
    public void logOperatorsMonth(){
        if (month == 12 || (month >= 1 && month <= 2))
            nameMonth = "Зима";
        else if (month >= 3 && month <=5)
            nameMonth = "Весна";
        else if (month >= 6 && month <=8)
            nameMonth = "Лето";
        else if (month >= 9 && month <=11)
            nameMonth = "Осень";
        System.out.println(month + " месяц года это " + nameMonth);
    }
}

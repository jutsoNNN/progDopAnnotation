import java.lang.annotation.Annotation;

public class Main{
    static int fibonachi(int n){

        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        else{
            return fibonachi(n - 1) + fibonachi(n - 2);
        }
    }
    public static void main(String[] args) {
        Employee sergey = new Employee(324, "Сергей","Программист");
        sergey.getEmployeeDetails();
        Employee ivan = new Employee(3254, "Иван","Тестер");
        ivan.getEmployeeDetails();
        Hii a1f = new Hii();
        a1f.say();
        for(int i = 0; i <= 1000; i++) {
            fibonachi(50);
        }
    }
}

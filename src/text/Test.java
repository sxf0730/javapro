package text;

public class Test {


    public static void main(String[] args) {
        SalariedEmployee salariedEmployee=new SalariedEmployee(3000,"王怀南",5);
        System.out.println(salariedEmployee.getSalary(5));
        HourlyEmployee hourlyEmployee=new HourlyEmployee(180,40,"张三",4);
        System.out.println(hourlyEmployee.getSalary(4));
        SalesEmployee salesEmployee=new SalesEmployee(200000,0.05,"王老五",5);
        System.out.println(salesEmployee.getSalary(5));
        ColaEmployee[] array=new ColaEmployee[]{salesEmployee,salariedEmployee,hourlyEmployee};
        for(int i=0;i<array.length;i++){

        }
    }



}

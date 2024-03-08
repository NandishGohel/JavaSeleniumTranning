package SeleniumDemo;

public class Operators {
    public static void main(String[] args) {
        // less thn 5K - I stay home do nothing
        // 10K-15K = Every weeked i go out for food
        //15K-20K = I will buy watch
        // 20-25K = I will buy cloaths
        // Above 50 -75K : I will buy Mobile
        // More then 100K : I will buy car

        int[] salary = {11111,120000, 89898, 6000092, 10000001, 99999999, 12121, 2999, 12000, 16000, 22000};

        for(int i=0; i<salary.length; i++){
            //System.out.println("My current month salary is : " + salary[i] );
            int currentMonthSalary = salary[i];
            if(currentMonthSalary<5000){
                System.out.println("My salary is " + currentMonthSalary +  " I stay home do nothing");
            }else if (currentMonthSalary>10000 && currentMonthSalary<15000){
                System.out.println("My salary is " + currentMonthSalary +" Every weeked i go out for food");
            } else if (currentMonthSalary >15000 && currentMonthSalary <20000){
                System.out.println("My salary is " + currentMonthSalary +" I will buy watch");
            }else if (currentMonthSalary >20000 && currentMonthSalary <25000){
                System.out.println("My salary is " + currentMonthSalary +" I will buy cloaths");
            }else if (currentMonthSalary >50000 && currentMonthSalary <75000){
                System.out.println("My salary is " + currentMonthSalary +" I will buy Mobile");
            }else if(currentMonthSalary>100000){
                System.out.println("My salary is " + currentMonthSalary +" I will buy Car");
            }





        }
    }
}

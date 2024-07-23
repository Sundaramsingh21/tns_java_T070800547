// Create a class emp with (empno, salary, totalsalary) with following feature.

public class third {
    private static int emp_no;
    private int Salary;
    private  static int totalsalary;

    public third(int s)
    {
        Salary=s;
        totalsalary += Salary;
        emp_no++;
        System.out.println("Emp_no :"+emp_no);
        System.out.println("Salary :"+Salary);
        System.out.println("TotalSalary :"+totalsalary);
    }
    public static void main(String[] args) {
        
        third emp1 = new third(86976);
        third emp2 = new third(50000);
        third emp3 = new third(60000);
        third emp4 = new third(75000);

        
    }
    
}



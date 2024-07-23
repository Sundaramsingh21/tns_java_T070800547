public class second {
    private String name;
    private  int age = 18;
    public void getData(String a)
    {
        name = a;
    }
    public void displayData(){
        System.out.println("Name="+name+ "\nAge="+age);
    }
    public static void main(String[] args) {
        second obj = new second();
        obj.getData("Sundaram");
        obj.displayData();
    }
}

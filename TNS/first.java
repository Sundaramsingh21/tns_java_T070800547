import java.util.*;

public class first{
    private int dd,mm,yy;
    public void initData()
    {
        dd=mm=yy=1;
    }
    public void setData(int d, int m, int y)
    {
        dd=d;
        mm=m;
        yy=y;
    }
    public void displayData()
    {
        System.out.println("Date :"+dd+"/"+mm+"/"+yy);
    }
    public static void main(String[] args) {
        first f =new first();
        f.initData();
        f.setData(3, 7, 2024);
        f.displayData();
    }

}
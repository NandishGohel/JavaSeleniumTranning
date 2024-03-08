package SeleniumDemo;

public class TestThis {
    double value;
    void setValue(double value)
    {
        this.value=value;

    }
    void Show()
    {
        System.out.println(value);
    }
}

class Test2{

    public static void main(String[] args)
    {
        TestThis t= new TestThis();
        t.setValue(10.0);
        t.Show();
    }
        }
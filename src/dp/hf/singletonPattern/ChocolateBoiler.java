package dp.hf.singletonPattern;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private volatile static ChocolateBoiler uniqueInstance;
    // volatile = '메인 메모리에 저장' 할 것을 명시
    // static = 모든 client는 instance 생성 허용

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }
    public static ChocolateBoiler getInstance() {
        if (uniqueInstance == null) { // 변수 초기화 확인
            synchronized(ChocolateBoiler.class) { // lock 획득
                if (uniqueInstance == null) { // 2중 확인
                    System.out.println(
                            "Creating unique instance of Chocolate Boiler");
                    uniqueInstance = new ChocolateBoiler();
                }
            }
        }
        System.out.println("Returning instance of Chocolate Boiler");
        return uniqueInstance;
    }
    public void fill() {
        if (isEmpty()) {
// fill the boiler with a milk/chocolate mixtureempty = false;
            boiled = false;
        }
    }
    public void drain() {
        if (!isEmpty() && isBoiled()) {// drain the boiled milk and chocolateempty = true;
        }
    }
    public void boil() {
        if (!isEmpty() && !isBoiled()) {// bring the contents to a boilboiled = true;
        }
    }
    public void reportBoilerState() {System.out.println("State: empty[" + empty + "] "+ "boiled[" + boiled + "]");}
    public boolean isEmpty() { return empty; }public boolean isBoiled() { return boiled; }} // public class ChocolateBoiler
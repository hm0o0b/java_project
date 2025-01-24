package noname;
public class Example {
    private int num;  // 인스턴스 변수

    public void setNum(int num) {
        this.num = num;  // 매개변수 num을 인스턴스 변수에 저장
    }

    public void printNum(int num) {
        System.out.println("매개변수 num: " + num);
    }

    public static void main(String[] args) {
        Example example = new Example();
        example.setNum(10);
        example.printNum(5);  // 매개변수로 5 전달
    }
}

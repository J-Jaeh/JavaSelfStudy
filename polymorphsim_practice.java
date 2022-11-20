public class Plug{
    public void on(){
        System.out.println("Plug on");
    }
    public void off(){

    }
}
public interface InternetOfThings{
    String stauts();
}

public class SmartPlug extends Plug implements InternetOfThings{
    @Override
    public String stauts() {
        return null;
    }
}

public class Smart냉장고 extends Plug implements InternetOfThings{
    @Override
    public String stauts(){
        return null;
    }
}
/*
다형성이란... 다향한 모습을 갖는것..
한 객체가 다양한 타입을 갖는것
 >한 객체가 여러 타입의 기능을제공
 >타입 상속으로 다형성 구현...
 */
public class polymorphsim_practice {
    public static void main(String[] args){
        SmartPlug smartPlug = new SmartPlug();
        smartPlug.on();
        smartPlug.off();

        Smart냉장고 smart냉장고 = new Smart냉장고();

        Plug plug = smartPlug;
        plug.on();
        plug.off();   //이해가 안가네 첫번째 방법으로 도 할수 있지만 ? 두번째 방법으로도 가능하다는건가?

        InternetOfThings iot = smartPlug;
        iot = smart냉장고;
        //
        //

        //
        //
        //
        // 대충 내용

        iot = smartPlug;
        iot = smart냉장고;

        iot.stauts();//
    }

}

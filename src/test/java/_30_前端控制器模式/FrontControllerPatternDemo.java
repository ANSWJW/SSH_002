package _30_前端控制器模式;

public class FrontControllerPatternDemo {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("Home");
        System.out.println();
        frontController.dispatchRequest("student");
    }
}


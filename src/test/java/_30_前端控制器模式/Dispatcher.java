package _30_前端控制器模式;

import _30_前端控制器模式.view.HomeView;
import _30_前端控制器模式.view.StudentView;

/**
 * 调度器
 */
public class Dispatcher {
    private StudentView studentView;
    private HomeView homeView;

    public Dispatcher() {
        studentView = new StudentView();
        homeView = new HomeView();
    }

    public void dispatch(String request){
        if (request.equalsIgnoreCase("STUDENT")){
            studentView.show();
        }else{
            homeView.show();
        }
    }
}

package ex1.view;

public class MainView implements Runnable{

    private static MainView instance;
    private MainView() {}
    public  static MainView getInstance(){
        if(instance == null)     instance = new MainView();
        return instance;
    }

    @Override
    public void run() {
        System.out.println("==========================");
        System.out.println("1. 등록");
        System.out.println("2. 전체목록");
        System.out.println("3. 검색");
        System.out.println("4. 우등생");
        System.out.println("5. 정렬");
        System.out.println("6. 종료");
        System.out.println("==========================");
    }

    public void AddStudentGuid(){

        System.out.println("==========================");
        System.out.println("학생의 정보를 입력하세요");
        System.out.println("==========================");
    }
}

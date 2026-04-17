package ex2.view;

import java.util.Map;

public interface View {
    void render();
    default void basicLayout(Map<String, String> prop){
        clear();
        String header = String.format("======<< %s >>======", prop.get("title"));
        String body = prop.get("body");
        StringBuilder footer  = new StringBuilder();
        for(int i = 0; i < header.length(); i++){
            footer  .append("=");
        }
        System.out.println(header);
        System.out.print(body);
        System.out.println(footer);
        System.out.println();
    }
    default void clear(){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

}

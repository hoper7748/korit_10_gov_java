package study.ch28;

public class Main {
    public static void main(String[] args) {
        MenuDto menuDto = new MenuDto(1, "김치볶음밥", 8000);
        System.out.println(menuDto);

        CustomerDto customerDto = new CustomerDto(1, "김김김", "010-1234-5678");

        System.out.println(customerDto);
        System.out.println(menuDto.getId());
        System.out.println(menuDto.getName());
        System.out.println(menuDto.getPrice());

        System.out.println(customerDto.id());
        System.out.println(customerDto.name());
        System.out.println(customerDto.phone());



    }
}

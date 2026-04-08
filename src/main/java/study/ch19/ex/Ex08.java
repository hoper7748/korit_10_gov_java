package study.ch19.ex;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@Builder
class Employee{
    private String name;
    private String team;
    private int salary;

    @Override
    public String toString() {
        return  name +
//                ", team='" + team + '\'' +
                "(" + salary + ")"
                ;
    }
}

public class Ex08 {
    public static void main(String[] args) {
        // 직원
        List<Employee> emps = new ArrayList<Employee>(List.of(
                Employee.builder().name("김").team("개발팀").salary(4000).build(),
                Employee.builder().name("이").team("마케팅").salary(3500).build(),
                Employee.builder().name("박").team("개발팀").salary(4500).build(),
                Employee.builder().name("최").team("인사팀").salary(3000).build(),
                Employee.builder().name("정").team("개발팀").salary(3800).build()
        ));
        // 해시 맵 리스트를 만들어야함
        // 부서별
        List<Employee> devTeam = new ArrayList<>();
        List<Employee> markTeam = new ArrayList<>();
        List<Employee> persTeam = new ArrayList<>();

        // 그룹핑
        Map<String, List<Employee>> employeeMap = new HashMap<>(
                Map.of(
                        "개발팀", new ArrayList<Employee>(),
                        "마케팅", new ArrayList<Employee>(),
                        "인사팀", new ArrayList<Employee>()
                )
        );

        for(Employee emp : emps) {
            switch (emp.getTeam())
            {
                case "개발팀":
                    devTeam.add(emp);
                    break;
                case "마케팅":
                    markTeam.add(emp);
//                    employeeMap.get(emp.getTeam()).add(emp);
                    break;
                case "인사팀":
                    persTeam.add(emp);
//                    employeeMap.get(emp.getTeam()).add(emp);
                    break;
            }
            employeeMap.get(emp.getTeam()).add(emp);
        }

        // 개발팀만 출력
        String outputSelect = "개발팀";
        switch (outputSelect)
        {
            case "개발팀":
                System.out.println(devTeam);
                break;
            case "마케팅":
                System.out.println(markTeam);
                break;
            case "인사팀":
                System.out.println(persTeam);
                break;
        }

        System.out.println(employeeMap);

    }
}

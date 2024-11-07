package AssociativeArrays.Ex;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] command = scanner.nextLine().split(" -> ");
        Map<String, List<String>> companies = new LinkedHashMap<>();

        while (!command[0].equals("End")){
            String company = command[0];
            String employee = command[1];

            companies.putIfAbsent(company, new ArrayList<>());
            List<String> companyEmployees = companies.get(company);

            if (!companyEmployees.contains(employee)) {
                companyEmployees.add(employee);
                companies.put(company, companyEmployees);
            }

            command = scanner.nextLine().split(" -> ");
        }

        companies.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            entry.getValue().forEach(employee -> {
                System.out.printf("-- %s%n", employee);
            });
        });
    }
}

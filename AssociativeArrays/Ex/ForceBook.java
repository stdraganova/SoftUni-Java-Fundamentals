package AssociativeArrays.Ex;

import java.util.*;

public class ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        Map<String, List<String>> forces = new LinkedHashMap<>();

        while (!command.equals("Lumpawaroo")){

            if (command.contains("|")){
                //Add to side
                String user = command.split(" \\| ")[1];
                String forceSide = command.split(" \\| ")[0];

                forces.putIfAbsent(forceSide, new ArrayList<>());
                boolean isNotPresent = true;

                for (Map.Entry<String, List<String>> entry : forces.entrySet()){
                    if (entry.getValue().contains(user)){
                        isNotPresent = false;
                    }
                }

                if (isNotPresent){
                    List<String> newUsersList = forces.get(forceSide);
                    newUsersList.add(user);
                    forces.put(forceSide, newUsersList);
                }

            }else {
                //Change force
                String user = command.split(" -> ")[0];
                String forceSide = command.split(" -> ")[1];

                forces.putIfAbsent(forceSide, new ArrayList<>());

                for (Map.Entry<String, List<String>> entry : forces.entrySet()){
                    if (entry.getValue().contains(user)){
                        entry.getValue().remove(user);
                    }
                }

                List<String> newUsersList = forces.get(forceSide);
                newUsersList.add(user);
                forces.put(forceSide,newUsersList);

                System.out.printf("%s joins the %s side!%n",user, forceSide);
            }

            command = scanner.nextLine();
        }

        forces.entrySet().forEach(entry -> {
            if (entry.getValue().size()>0) {
                System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
                entry.getValue().forEach(member -> {
                    System.out.printf("! %s%n", member);
                });
            }
        });
    }
}

class Badge {
    public String print(Integer id, String name, String department) {
        // Initialisation des parties
        String part1;
        String part2;
        String part3;



        // Gestion de part2
        part2 = name;


        // Gestion de part3
        if (department != null) {
            part3 = department.toUpperCase();
        } else {
            part3 = "OWNER";
        }

                // Gestion de part1
        if (id != null) {
            part1 = "[" + id + "]";
            return String.join(" - ", part1, part2, part3);
        } else {
            return String.join(" - ", part2, part3);
        }
        
    }
}



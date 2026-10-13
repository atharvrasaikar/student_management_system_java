class Faculty {
    int id;
    String name;
    String email;

    Faculty(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    void teachCourse(Course c) {
        System.out.println(name + " teaches " + c.name);
    }
}
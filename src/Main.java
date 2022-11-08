public class Main {
    public static void main(String[] args) {
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var summWeight = firstBoxer + secondBoxer;
        System.out.println(summWeight);
        var diffWeight = secondBoxer % firstBoxer;
        System.out.println(diffWeight);

        var sumWorkingHours = 640;
        var employeeWorkload = 8;
        var numberOfEmployees = sumWorkingHours / employeeWorkload;
        System.out.println( "Всего работников в компании " + numberOfEmployees + " человек");

        numberOfEmployees = numberOfEmployees + 94;
        var updatedPowerOfEmployees = numberOfEmployees * employeeWorkload;
        System.out.println( "Теперь сторудников в компании " + numberOfEmployees + " человек");
        System.out.println( "Если в компании работает " + numberOfEmployees + " человек, то всего " + updatedPowerOfEmployees + " часов работы может быть поделено между сотрудниками" );
    }
}
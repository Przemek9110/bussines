package pl.sdacademy.podstawy;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Country poland = new Country(65, "Poland");
        Country germany = new Country(67, "Germany");

        Company terravita = new Company(poland, "Terravita");
        Company volkswagen = new Company(germany, "Volkswagen");

        Employee employee = new Employee("Hans", "M\u00fcller", LocalDate.of(1970, 12, 18));
        Employee employee1 = new Employee("Helga", "Schweinsteiger", LocalDate.of(1985, 05, 13));

        volkswagen.setEmployees(new Employee[]{employee, employee1});

        terravita.setEmployees(null);

        for (Country country : new Country[]{poland, germany}) {
            System.out.println(country);
        }

        for (Company company : new Company[]{terravita, volkswagen}) {
            for (Employee emplyee : company.getEmployees()) {
                System.out.printf("Nazwa firmy: %s, Pracowik : %S\n", company, emplyee);
            }
        }
    }
}

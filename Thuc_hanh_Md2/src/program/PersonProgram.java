package program;

import object.Person;

import java.util.Scanner;

public class PersonProgram {
    Scanner scanner = new Scanner(System.in);

    public Person contactPerson() {
    Person person = new Person();
        System.out.println("Nhập số điện thoại: ");
        String phone = scanner.nextLine();
        person.setPhone(phone);

        System.out.println("Nhập tên nhóm: ");
        String group = scanner.nextLine();
        person.setGroup(group);

        System.out.println("Nhập họ tên: ");
        String name = scanner.nextLine();
        person.setName(name);

        System.out.println("Nhập giới tính: ");
        String gender = scanner.nextLine();
        person.setGender(gender);

        System.out.println("Nhập địa chỉ: ");
        String address = scanner.nextLine();
        person.setAddress(address);

        return person;
    }
}

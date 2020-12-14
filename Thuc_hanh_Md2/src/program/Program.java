package program;

import object.Contact;
import object.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    Scanner scanner = new Scanner(System.in);
    public static ArrayList<Contact> contacts = new ArrayList<>();
    Contact contact = new Contact();


    public void add() {
        Scanner scanner = new Scanner(System.in);
        PersonProgram program = new PersonProgram();
        contact.setPerson(program.contactPerson());

        System.out.println("Nhập ngày sinh: ");
        String date = scanner.nextLine();
        contact.setDate(date);

        System.out.println("Nhập địa chỉ email: ");
        String email = scanner.nextLine();
        contact.setEmail(email);

        Program.contacts.add(contact);
    }

    public void show() {
        for (Contact contact : contacts) {
            System.out.println(contact.toString());
        }
    }

    public void delete() {
        System.out.println("Nhập số điện thoại cần xóa: ");
        String phone = scanner.nextLine();
        int n = 0;
        for (int i = 0; i < Program.contacts.size(); i++) {
            if (phone.equals(Program.contacts.get(i).getPerson().getPhone())) {
                System.out.println(Program.contacts.remove(i));
                i--;
            }
        }
        System.out.println("Không tìm thấy");
    }

    public ArrayList<Contact> search() {
        System.out.println("Nhập tên: ");
        try {
            String namePhone = scanner.nextLine();
            for (Contact contact : contacts) {
                if (namePhone == contact.getPerson().getName()) {
                    System.out.println(contact.toString());
                    return contacts;
                }
            }
        } catch (Exception e) {
            System.out.println("Không tìm thấy");
        }
        return null;
    }

    public void writerFile(ArrayList<Contact> contacts) {
        File file = new File("contact.txt");

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            for (Contact contact : contacts) {
                fileWriter.append(contact.toString());
                fileWriter.append("\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Contact> readerFile() {
        ArrayList<Contact> contactsRead = new ArrayList<>();
        File file = new File("contact.txt");
        FileReader fileReader = null;
        ArrayList<Contact> roomsRead = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            if (!file.exists()) {

                file.createNewFile();
            }
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                String[] split = line.split(",");
                String date = split[0];
                String name = split[1];
                String address = split[2];
                String phone = split[3];
                Person person = new Person();
                person.setName(name);
                person.setPhone(phone);
                person.setAddress(address);

                contactsRead.add(contact);
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return contactsRead;
    }
}
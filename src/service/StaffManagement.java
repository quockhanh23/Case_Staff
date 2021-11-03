package service;

import models.Staff;

import java.util.ArrayList;

public class StaffManagement {
    private ArrayList<Staff> listStaff;

    public ArrayList<Staff> getListStaff() {
        return listStaff;
    }

    public void setListStaff(ArrayList<Staff> listStaff) {
        this.listStaff = listStaff;
    }

    public StaffManagement() {
        listStaff = new ArrayList<>();
    }

    public void add(Staff staff) {
        listStaff.add(staff);
    }

    public void showStaffList() {
        for (int i = 0; i < listStaff.size(); i++) {
            System.out.println(listStaff.get(i));
        }
    }

    public void findByName(String name) {
        for (int i = 0; i < listStaff.size(); i++) {
            if (listStaff.get(i).getName().equals(name)) {
                System.out.println(listStaff.get(i));
            }
        }
    }

    public int findIndexByName(String name) {
        for (int i = 0; i < listStaff.size(); i++) {
            if (listStaff.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public void editByName(String name, Staff staff) {
        int index = findIndexByName(name);
        if (index != -1) {
            listStaff.set(index, staff);
        } else {
            System.out.println("cant found");
        }
    }

    public void deleteByName(String name) {
        int index = findIndexByName(name);
        if (index != -1) {
            listStaff.remove(index);
        } else {
            System.out.println("cant found");
        }
    }

    public void upDateStaffStatus(String name, int status) {
        int index = findIndexByName(name);
        if (index != -1) {
            listStaff.get(index).setStatus(status);
        } else {
            System.out.println("cant found");
        }
    }

    public void filterFullTimeStaff() {
        for (int i = 0; i < listStaff.size(); i++) {
            if (listStaff.get(i).getType().equals("full time")) {
                System.out.println(listStaff.get(i));
            }
        }
    }

    public void filterPartTimeStaff() {
        for (int i = 0; i < listStaff.size(); i++) {
            if (listStaff.get(i).getType().equals("part time")) {
                System.out.println(listStaff.get(i));
            }

        }
    }

    public int calSalaryFullTime() {
        int totalSalary = 0;
        for (int i = 0; i < listStaff.size(); i++) {
            if (listStaff.get(i).getType().equals("full time")) {
                totalSalary += listStaff.get(i).getSalary();
            }
        }
        return totalSalary;
    }
    public int calSalaryPartTime() {
        int totalSalary = 0;
        for (int i = 0; i < listStaff.size(); i++) {
            if (listStaff.get(i).getType().equals("part time")) {
                totalSalary += listStaff.get(i).getSalary();
            }
        }
        return totalSalary;
    }
}



package ex40.base;
import ex39.base.Base39;

import java.util.Scanner;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Federman
John	Johnson	Manager	2016-12-31
Tou	    Xiong	Software Engineer	2016-10-05
Michaela	Michaelson	District Manager	2015-12-19
Jake	Jacobson	Programmer
Jacquelyn	Jackson	DBA
Sally	Webber	Web Developer	2015-12-18

 */
public class Base40 {
    public static final Scanner input = new Scanner(System.in);
    public boolean isZero(int value){
        if(value == 0)
            return true;
        else
            return false;
    }
    public boolean hasString(String key, int i, List<Map<String, String>> list){
        if(list.get(i).get("first name").contains(key) || list.get(i).get("last name").contains(key))
            return true;
        else
            return false;
    }
    public Employee [] getEmployeeData(Employee [] employees){
        employees[0] = new Employee("John", "Johnson", "Manager", "2016-12-31");
        employees[1] = new Employee("Tou", "Xiong", "Software Engineer", "2016-10-05");
        employees[2] = new Employee("Michaela", "Michaelson", "District Manager", "2015-12-19");
        employees[3] = new Employee("Jake", "Jacobson", "Programmer", "");
        employees[4] = new Employee("Jacquelyn", "Jackson", "DBA", "");
        employees[5] = new Employee("Sally", "Webber", "Web Developer", "2015-12-18");

        return employees;
    }
    public void printTable(List<Map<String, String>> list, String key){
        System.out.println("Results: ");
        System.out.println("Name                | Position          | Separation Date");
        System.out.println("--------------------|-------------------|----------------");
        for(int i = 0; i < 6; i++){
            String spaceleftname = list.get(i).get("first name") + " " + list.get(i).get("last name");
            String spaceposition = list.get(i).get("position");
            String spaceseperation = list.get(i).get("separation");
            int sS = 20 - spaceseperation.length();
            int sP = 18 - spaceposition.length();
            int sLN = 20 - spaceleftname.length();
            if(hasString(key, i, list)) {
                System.out.print(list.get(i).get("first name") + " " + list.get(i).get("last name"));
                while (!isZero(sLN)) {
                    System.out.print(" ");
                    sLN--;
                }
                if (isZero(sLN)) {
                    System.out.print("| ");
                }
                System.out.print(list.get(i).get("position"));
                while (!isZero(sP)) {
                    System.out.print(" ");
                    sP--;
                }
                if (isZero(sP)) {
                    System.out.print("| ");
                }
                System.out.print(list.get(i).get("separation"));
                while (!isZero(sS)) {
                    System.out.print(" ");
                    sS--;
                }
                if (isZero(sS)) {
                    System.out.println("");
                }
            }
        }
    }
    public List<Map<String, String>> getEmployeeIntoList(List<Map<String, String>> list){
        Employee [] employees = new Employee[6];
        employees = getEmployeeData(employees);

        Map<String, String> map1 = new HashMap <>();
        Map<String, String> map2 = new HashMap <>();
        Map<String, String> map3 = new HashMap <>();
        Map<String, String> map4 = new HashMap <>();
        Map<String, String> map5 = new HashMap <>();
        Map<String, String> map6 = new HashMap <>();

        map1.put("first name", employees[0].first);
        map1.put("last name", employees[0].last);
        map1.put("position", employees[0].position);
        map1.put("separation", employees[0].separation);

        map2.put("first name", employees[1].first);
        map2.put("last name", employees[1].last);
        map2.put("position", employees[1].position);
        map2.put("separation", employees[1].separation);

        map3.put("first name", employees[2].first);
        map3.put("last name", employees[2].last);
        map3.put("position", employees[2].position);
        map3.put("separation", employees[2].separation);

        map4.put("first name", employees[3].first);
        map4.put("last name", employees[3].last);
        map4.put("position", employees[3].position);
        map4.put("separation", employees[3].separation);

        map5.put("first name", employees[4].first);
        map5.put("last name", employees[4].last);
        map5.put("position", employees[4].position);
        map5.put("separation", employees[4].separation);

        map6.put("first name", employees[5].first);
        map6.put("last name", employees[5].last);
        map6.put("position", employees[5].position);
        map6.put("separation", employees[5].separation);

        list.add(map1);
        list.add(map2);
        list.add(map3);
        list.add(map4);
        list.add(map5);
        list.add(map6);

        return list;
    }
    public String findName(){
        System.out.print("Enter a search string: ");
        return input.nextLine();
    }
    public static void main(String[] args) {
        Base40 program = new Base40();
        List<Map<String, String>> list = new ArrayList<>();

        list = program.getEmployeeIntoList(list);
        String search = program.findName();
        program.printTable(list, search);
    }
}

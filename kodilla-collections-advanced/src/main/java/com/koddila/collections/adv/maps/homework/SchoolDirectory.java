package com.koddila.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> principalSchoolMap = new HashMap<>();
        Principal janush = new Principal("JanuszTrendewicz", "UniwerystetDobrejZabawy");
        Principal dariush = new Principal("DariuszKomar", "AkademiaSztukMagicznych");
        Principal mariush = new Principal("MariuszMucha", "PolitechnikaRadomska");

        School funAcademy = new School("Mark Happy", "Joe Funny", "Patrick Kwapiszewsky");
        School magicSchool = new School("Harry Potter", "Hagrid Big Boy", "Hermiona Leviosa");
        School technicsSchool = new School("Bill Gate", "Michael Jordan", "Andy Duda");

        principalSchoolMap.put(janush, funAcademy);
        principalSchoolMap.put(dariush, magicSchool);
        principalSchoolMap.put(mariush, technicsSchool);

        System.out.println(principalSchoolMap.get(janush));
        for (Map.Entry<Principal, School> principalSchoolEntry : principalSchoolMap.entrySet()) {
            System.out.println(principalSchoolEntry.getKey().getFullName() + " is principal of: " + principalSchoolEntry.getKey().getSchoolName() + " and this school teaches: " + principalSchoolEntry.getValue().getAllStudents() + " students.");
        }
    }
}

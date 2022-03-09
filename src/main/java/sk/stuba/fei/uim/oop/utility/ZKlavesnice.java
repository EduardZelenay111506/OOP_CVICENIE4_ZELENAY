package sk.stuba.fei.uim.oop.utility;

import java.io.*;

public class ZKlavesnice {
    /**
     * funkcia ktora nacita znak od uzivatela z klavesnice
     * @param napis_pre_uzivatela - Vypis ktory sa pred nacitanim vypise uzivatelovi
     * @return vracia nacitany znak
     */

    public static char readChar(String napis_pre_uzivatela) {
        char c = ' ';

        InputStreamReader zklavesnice = new InputStreamReader(System.in);
        try {
            System.out.println(napis_pre_uzivatela);
            c = (char) zklavesnice.read();
        } catch (Exception e) {
            System.out.println("nepodarilo sa");
            c = readChar(napis_pre_uzivatela);
        }

        return c;
    }

    /**
     * funkcia ktora nacita retazec od uzivatela z klavesnice
     * @param napis_pre_uzivatela - Vypis ktory sa pred nacitanim vypise uzivatelovi
     * @return vracia nacitany retazec
     */

    public static String readString(String napis_pre_uzivatela) {
        String s = "";

        BufferedReader zklavesnice = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println(napis_pre_uzivatela);
            s = zklavesnice.readLine();
        } catch (Exception e) {
            System.out.println("nepodarilo sa");
            s = readString(napis_pre_uzivatela);
        }

        return s;
    }

    public static int readInt(String napis_pre_uzivatela) {
        int n = 0;
        String s;

        BufferedReader zklavesnice = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println(napis_pre_uzivatela);
            s = zklavesnice.readLine();
            n = Integer.parseInt(s);
        } catch (Exception e) {
            System.out.println("nepodarilo sa");
            n = readInt(napis_pre_uzivatela);
        }

        return n;
    }

    public static double readDouble(String napis_pre_uzivatela) {
        double x = 0.0;
        String s;

        BufferedReader zklavesnice = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println(napis_pre_uzivatela);
            s = zklavesnice.readLine();
            x = Double.parseDouble(s);
        } catch (Exception e) {
            System.out.println("nepodarilo sa");
            x = readDouble(napis_pre_uzivatela);
        }

        return x;
    }
}

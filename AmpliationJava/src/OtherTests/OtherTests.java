package OtherTests;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class OtherTests{
    public static void main(String[] args) {

        Integer i = null;
        Long l = new Long(i);
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
        hmap.put(1, 1);
        hmap.put(2, 2);
        hmap.put(3, 3);
        hmap.put(null, 4);
        System.out.println(hmap.get(null)); // no peta, devuelve el que tenga el registro null, si no tiene, devuelve null
    }

    private static void returnNullPointer(){
        boolean b = cond();
        System.out.println(b); // devuelve NullPointerException en el -return;
    }

    private static boolean cond(){
        Boolean b = null;
        return b;
    }

    private static void setsIHashs(){
        HashMap<String, Set<Object>> map = new HashMap<>();
        List<Object> lista = new ArrayList<>();
        lista.add("asd");
        lista.add(2);
        lista.add(3);
        lista.add(2);
        lista.add("rfgajir");

        Object i  = 999;
        Object s = "sss";
        System.out.println(i.getClass().getName());
        System.out.println(s.getClass().getName());
        for (Object o: lista) {
            if (o.getClass().getName().equals( "java.lang.Integer")){
                if (map.containsKey("numeros")){
                    map.get("numeros").add(o);
                } else {
                    Set<Object> set = new HashSet<>();
                    set.add(o);
                    map.put("numeros", set);
                }
            } else {
                if (map.containsKey("strings")){
                    map.get("strings").add(o);
                } else {
                    Set<Object> set = new HashSet<>();
                    set.add(o);
                    map.put("strings", set);
                }
            }
        }

        for (String key: map.keySet()){
            for (Object obj: map.get(key)){
                System.out.println(key + " " + obj.toString());
            }
        }
    }

    private static void workWithReplace(){
        String versio1 = "1.5.4.7";
        String versio2 = "1.9.3.4";
        String versio3 = "2.4.5.2";
        if (Integer.parseInt(versio1.replace(".", "")) < Integer.parseInt(versio2.replace(".",""))){
            System.out.println(Integer.parseInt(versio1.replace(".", "")) );
            System.out.println(Integer.parseInt(versio2.replace(".", "")) );
            System.out.println(true);
        }
        System.out.println(versio2.compareTo(versio1));

        String nul = null;
        try {
            if (nul.equals("sda")) {

            }
        } catch (NullPointerException npe){

            System.out.println(npe.getMessage());
        }
    }

    private static void workWithHashmaps(){
        //String s = null;
        //String constante = "ADSF";
        //H h = new H();
        HashMap<Integer, String> map = new HashMap<>();
        map.put(0,"hola");
        map.put(1,"adios");
        System.out.println(map.get(1));
        map.put(1,"alohaleaoce");
        System.out.println(map.get(1));
        //System.out.println(h.toString());

    }

    private static void substrings(){
        StringBuilder titol = new StringBuilder();
        String titolStr = "Notificació del Procediment " + " 9548126 " + " de l'expedient " + "00002/2012/2018" + " per a " + "fdsgfdagfagfagrsfewfedwafedwfedwfewafreagreagreagreagreagreagreagreagreagreagrea";
        if (titolStr.length() > 100) {
            titolStr = titolStr.substring(0, 95) + "...";
        }
        titol.append(titolStr);
        System.out.println(titolStr);
        System.out.println(titol.toString());
/*
        if (constante.equals(s)){
            System.out.println('s');
        }
        if (s.equals(constante)){
            System.out.println('x');
        }
*/
    }

    private static void roundingBigDecimalTest(){

        Object o = null;
        String i = (String) o;
        System.out.println(i);//No peta, imprime Null

        HashMap<String, Integer> hm1 = new HashMap<>();
        HashMap<String, Integer> hm2 = new HashMap<>();

        hm1.put("clave1", 2);
        hm1.put("clave4", 7);
        hm2.put("clave2034", 333);
        hm2.put("clave3", 1);

        hm1.putAll(hm2);
        System.out.println(hm1.values());

        StringBuilder sb = new StringBuilder();
        sb.append("adasf");
        sb.append("\n");
        sb.append("fajfkea");
        sb.append("\t\tasdasd");
        System.out.println(sb);
        String dou = "0";
        BigDecimal bdecimal = new BigDecimal(dou).setScale(2);
        System.out.println(bdecimal);
    }

    private static void hashMapsTest(){
        Integer rn = null;
        if (rn <= 0) System.out.println("Es menor que 0");
        else System.out.println("otro");/*
        HashMap<String, Object> parametres = new HashMap<>();
        Integer i = 97;
        parametres.put("tornarAEstudi", true);
        parametres.put("Objecte", "Strinngg");
        parametres.put("Intet", 345);
        long ti = System.currentTimeMillis();
        for (long l = 0; l < Long.MAX_VALUE/100000000; l++){
            passHashMapsThroughFunctions(i, parametres);
        }
        long tf = System.currentTimeMillis();

        long ti2 = System.currentTimeMillis();
        passHashMapsThroughFunctionsLoop(i, parametres);
        long tf2 = System.currentTimeMillis();
        System.out.println(tf - ti);
        System.out.println(tf2 - ti2);*/
    }

    private static void passHashMapsThroughFunctions(Integer procedimentId, HashMap<String, Object> parametres){

    }

    private static void passHashMapsThroughFunctionsLoop(Integer procedimentId, HashMap<String, Object> parametres){
        for (long l = 0; l < Long.MAX_VALUE/100000000; l++){

        }
    }

    public static void localDateTimeTest(){
        try {
            //LocalDateTime.parse("01/01/2017");
            //LocalDateTime.parse("2017-02-03");
            //LocalDateTime.parse("2017-03-01");
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate.parse("01/01/2017", formatter);
            //TODO: Hemos cambiado el @JSONFormat de la clase DTO que tenga un pattern ("dd/MM/yyyy HH:mm:ss")
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void nullTest(){
        Integer integ = null;
        try {
            switch (integ) { //Trigger exception a pesar de Default
                case 1:
                    System.out.println("this");
                    break;
                case 2:
                    System.out.println("that");
                    break;
                default:
                    System.out.println("Null option included?");
                    break;
            }
        } catch(NullPointerException npe){
            System.out.println(npe.getMessage());
        }

        long ti = System.currentTimeMillis();
        for (long l = 0; l < Long.MAX_VALUE/100000000; l++){

        }
        long tf = System.currentTimeMillis();
        System.out.println(tf - ti);
    }
}

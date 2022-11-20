package Inheritance;

public class InheritanceMain {
    public static void main(String[] args) {
        A a = new A();
        a.setFormulariSolicitudId(1);
        a.setIdentificador("47913742G");
        a.setPersonaId(49);
        a.setTipusidentificadorId(2);
        a.setTipusRepresentacioId(0);


        //b.setIdentificadorPresentador("00000000T");
        //b.setTipusIdentificadorPresentador(3);

        C c = new C();
        c.setNom("Albert");
        c.setPrimerCognom("Ribas");
        c.setSegonCognom("Garcia");
        c.setSobrenom("Asd");
        c.setCorreuElectronic("asd@asd.asd");
        c.setTipusnotificacioId(1);
        c.setIdentificadorPresentador("artiastora");
        System.out.println(c.doSomething(12345566));

        System.out.println(B.serialVersionUID);

        F f = new F();
        f.fi = 3;

        System.out.println(a instanceof A);//true
        //System.out.println(b instanceof A);//true
        System.out.println(c instanceof A);//true

        System.out.println("-----------");
        //System.out.println((C)b instanceof C); //CastException
        System.out.println(c instanceof B);//true
        String boina = null;
        //System.out.println(boina.equals("Boina")); // Salta NullPointerException

        //C c2 = new A(); //Error
        A a2 = new C();
        System.out.println(a2.getClass()); //Inheritance.C
        System.out.println(((C)a2).getNom()); //null porque no tiene
        Object o = new C();
        System.out.println(o.getClass());
        //o = b;
        System.out.println(o.getClass());
        System.out.println(((B)o).getIdentificadorPresentador());
        System.out.println("-->"+ f.doSomething(1));
        try {
            throw new E("BoinaException");
        } catch (E e) {
            e.printStackTrace();
            System.out.println(e.message);
            System.out.println(e.getMessage());
        }
        System.out.println(D.LUNES);
        G g  = new G();

    }
}

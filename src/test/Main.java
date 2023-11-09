package test;

import myProgram.Mahasiswa;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Mahasiswa> dataMahasiswa = new ArrayList<>();

        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.setNama("jeprianto");
        mhs1.setNim("D0222316");
        mhs1.setAlamat("mamasa");
        dataMahasiswa.add(mhs1);

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.setNama("set");
        mhs2.setNim("D011111");
        mhs2.setAlamat("mamasa");
        dataMahasiswa.add(mhs2);

        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.setNama("Tony");
        mhs3.setNim("D011112");
        mhs3.setAlamat("mamasa");
        dataMahasiswa.add(mhs3);

        Mahasiswa mhs4 = new Mahasiswa();
        mhs4.setNama("ryan");
        mhs4.setNim("D01234");
        mhs4.setAlamat("polewali");
        dataMahasiswa.add(mhs4);

        Mahasiswa mhs5 = new Mahasiswa();
        mhs5.setNama("riska");
        mhs5.setNim("D34556");
        mhs5.setAlamat("makassar");
        dataMahasiswa.add(mhs5);

        Mahasiswa mhs6 = new Mahasiswa();
        mhs6.setNama("nur hikmah");
        mhs6.setNim("D03452");
        mhs6.setAlamat("polewali");
        dataMahasiswa.add(mhs6);

        Mahasiswa mhs7 = new Mahasiswa();
        mhs7.setNama("akbar");
        mhs7.setNim("D23123");
        mhs7.setAlamat("wonomulyo");
        dataMahasiswa.add(mhs7);

        Mahasiswa mhs8 = new Mahasiswa();
        mhs8.setNama("baso");
        mhs8.setNim("D054354");
        mhs8.setAlamat("wajo");
        dataMahasiswa.add(mhs8);

        Mahasiswa mhs9 = new Mahasiswa();
        mhs9.setNama("irfan");
        mhs9.setNim("D43432");
        mhs9.setAlamat("kalukku'");
        dataMahasiswa.add(mhs9);

        Mahasiswa mhs10 = new Mahasiswa();
        mhs10.setNama("mahmuddin");
        mhs10.setNim("D076898");
        mhs10.setAlamat("mamuju");
        dataMahasiswa.add(mhs10);

        Mahasiswa mhs11 = new Mahasiswa();
        mhs11.setNama("alfiansyah");
        mhs11.setNim("D87987");
        mhs11.setAlamat("somba");
        dataMahasiswa.add(mhs11);

        Mahasiswa mhs12 = new Mahasiswa();
        mhs12.setNama("ilhan");
        mhs12.setNim("D657487");
        mhs12.setAlamat("balanipa");
        dataMahasiswa.add(mhs12);

        Mahasiswa mhs13 = new Mahasiswa();
        mhs13.setNama("isra");
        mhs13.setNim("D65432");
        mhs13.setAlamat("pasang kayu");
        dataMahasiswa.add(mhs13);

        Mahasiswa mhs14 = new Mahasiswa();
        mhs14.setNama("bayu");
        mhs14.setNim("D08760");
        mhs14.setAlamat("mamasa");
        dataMahasiswa.add(mhs14);

        Mahasiswa mhs15 = new Mahasiswa();
        mhs15.setNama("agus");
        mhs15.setNim("D043200");
        mhs15.setAlamat("majene");
        dataMahasiswa.add(mhs15);

        Mahasiswa mhs16 = new Mahasiswa();
        mhs16.setNama("hajar");
        mhs16.setNim("D0231230");
        mhs16.setAlamat("tinambung");
        dataMahasiswa.add(mhs16);

        Mahasiswa mhs17 = new Mahasiswa();
        mhs17.setNama("azan");
        mhs17.setNim("D065650");
        mhs17.setAlamat("campalagian");
        dataMahasiswa.add(mhs17);

        Mahasiswa mhs18 = new Mahasiswa();
        mhs18.setNama("cudi'");
        mhs18.setNim("D03230");
        mhs18.setAlamat("polewali");
        dataMahasiswa.add(mhs18);

        Mahasiswa mhs19 = new Mahasiswa();
        mhs19.setNama("fauzan");
        mhs19.setNim("D32300");
        mhs19.setAlamat("majene");
        dataMahasiswa.add(mhs19);

        Mahasiswa mhs20 = new Mahasiswa();
        mhs20.setNama("yuni");
        mhs20.setNim("D032340");
        mhs20.setAlamat("mamasa");
        dataMahasiswa.add(mhs20);


        for (Mahasiswa mhs : dataMahasiswa){
            System.out.println(mhs);
        }
    }
}

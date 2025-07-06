package com.xworkz.inheritance.instrument;

public class InstrumentRunner {

        public static void main(String[] args) {
            Instrument instrument = new Instrument();
            instrument.method1();
            instrument.method2();
            instrument.method3();
            instrument.method4();
            instrument.method5();

            Guitar guitar = new Guitar();
            guitar.sub1();
            guitar.sub2();
            guitar.sub3();
            guitar.sub4();
            guitar.sub5();

            Instrument instrument1 = new Guitar();
            instrument1.method1();
            instrument1.method2();
            instrument1.method3();
            instrument1.method4();
            instrument1.method5();
        }

}

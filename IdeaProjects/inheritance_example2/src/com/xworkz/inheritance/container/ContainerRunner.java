package com.xworkz.inheritance.container;

public class ContainerRunner {

        public static void main(String[] args) {
            Container container = new Container();
            container.fill();
            container.empty();
            container.clean();
            container.store();
            container.seal();

            Bottle bottle = new Bottle();
            bottle.fill();
            bottle.empty();
            bottle.clean();
            bottle.store();
            bottle.seal();

            Container container1 = new Bottle();
            container1.fill();
            container1.empty();
            container1.clean();
            container1.store();
            container1.seal();
        }

}

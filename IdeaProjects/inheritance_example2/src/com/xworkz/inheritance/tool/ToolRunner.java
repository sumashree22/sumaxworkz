package com.xworkz.inheritance.tool;

public class ToolRunner {

        public static void main(String[] args) {
            Tool tool = new Tool();
            tool.use();
            tool.store();
            tool.clean();
            tool.fix();
            tool.test();

            Hammer hammer = new Hammer();
            hammer.use();
            hammer.store();
            hammer.clean();
            hammer.fix();
            hammer.test();

            Tool tool1 = new Hammer();
            tool1.use();
            tool1.store();
            tool1.clean();
            tool1.fix();
            tool1.test();
        }

}

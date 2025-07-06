package com.xworkz.inheritance.bridge;

public class BridgeRunner {
    public static void main(String[] args) {
        Bridge bridge = new Bridge();
        bridge.construct();
        bridge.supportWeight();
        bridge.spanRiver();
        bridge.allowTraffic();
        bridge.maintain();

        SuspensionBridge sb = new SuspensionBridge();
        sb.construct();
        sb.supportWeight();
        sb.spanRiver();
        sb.allowTraffic();
        sb.maintain();

        Bridge bridge1 = new SuspensionBridge();
        bridge1.construct();
        bridge1.supportWeight();
        bridge1.spanRiver();
        bridge1.allowTraffic();
        bridge1.maintain();
    }
}